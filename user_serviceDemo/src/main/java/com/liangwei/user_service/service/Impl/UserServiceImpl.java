package com.liangwei.user_service.service.Impl;

import com.liangwei.user_service.mapper.UserMapper;
import com.liangwei.user_service.model.User;
import com.liangwei.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void AddUser(User user) {
        userMapper.AddUser(user);
    }

    @Override
    public void delUserById(int no) {
        userMapper.delUserById(no);
    }

    @Override
    public void updateUserByNo(User user) {
        userMapper.updateUserByNo(user.getName(),user.getEmail(),user.getNo());
    }

    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }
}
