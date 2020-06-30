package com.ghyy2.service;

import com.ghyy2.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {
    //查询所有用户
    public List<User> findAll();

    //注册，插入用户
    public void insertUser(User user);

    //根据手机号码查找用户
    User findByUserTel(String userTel);

    //更新密码
    void updateUserpwd(String userTel,String userPwd);

}
