package com.shop.zycshop.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.zycshop.entity.User;
import com.shop.zycshop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    @Autowired
    private UserMapper userMapper;

    public String checkAccount(String userAccount){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_account" ,userAccount);
        User user =userMapper.selectOne(queryWrapper);
        if(user==null)
            return "101";
        else
            return "102";
    }
    public String checkName(String userName){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_name" ,userName);
        User user =userMapper.selectOne(queryWrapper);
        if(user==null)
            return "101";
        else
            return "102";
    }
    public String loginCheck(User loginUser, HttpSession session){
        QueryWrapper<User> queryWrapper =new QueryWrapper<>();
        queryWrapper.eq("user_account",loginUser.getUserAccount());
        User user =userMapper.selectOne(queryWrapper);
        if(user ==null){
            return "101";
        }else
        if(loginUser.getUserPassword().equals(user.getUserPassword())){
            session.setAttribute( "user",user);
            return "102";
        }else{
            return "103";
        }
    }

}
