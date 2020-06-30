package com.ghyy2.service;

import com.ghyy2.bean.User;
import com.ghyy2.bean.UserExample;
import com.ghyy2.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> findAll(){
        UserExample userExample = new UserExample();

        return userMapper.selectByExample(userExample);
    }

    public void insertUser(User user){
        userMapper.insert(user);
    }


    @Override
    public User findByUserTel(String userTel) {
        return userMapper.selectByUserTel(userTel);
    }

    @Override
    public void updateUserpwd(String userTel,String userPwd){
        userMapper.updateUserPwd(userTel,userPwd);
    }
}
