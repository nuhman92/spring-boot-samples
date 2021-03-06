package com.wxs.isolation.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxs.isolation.entity.User;
import com.wxs.isolation.mapper.UserMapper;
import com.wxs.isolation.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public void addUser(User user) {
        baseMapper.insert(user);
    }

    @Override
    public User selectById(Integer id) {
        return baseMapper.selectById(id);
    }
}
