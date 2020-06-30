package com.ghyy2.controller;

import com.ghyy2.bean.Msg;
import com.ghyy2.bean.User;
import com.ghyy2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //获取用户所有信息
    @RequestMapping(value = "/GetUserListAll", method = RequestMethod.GET)
    public Msg findUser() {
        List<User> list = userService.findAll();
        return Msg.success().add("userlist", list);
    }

    //注册
    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
        public boolean loginIn(User user){
        //如果手机号码已存在，返回false；如果不存在，则添加该用户
//        System.out.println(user);
        if (userService.findByUserTel(user.getUserTel()) != null){
            return false;
        }else{
            userService.insertUser(user);
            return true;
        }
    }

    //登录 修改密码 ，返回用户密码
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    public String getUserInfo(String userTel) {
//        System.out.println(userTel);
        if (userService.findByUserTel(userTel) != null) {
            return userService.findByUserTel(userTel).getUserPwd(); //返回密码
        }
        else{
            return "该用户不存在";
        }


    }

    //更新用户密码
//    private static  String userPwd = "12345";
//    private static  String userTel = "13202223111";
    @RequestMapping(value = "/updateUserInfo",method = RequestMethod.POST)
    public boolean  updateUserInfo(String userTel,String userPwd){
        //如果密码和原密码相同，则更新失败，密码和原密码不同，则更新成功
        System.out.println(userTel);
        System.out.println(userPwd);
        if (userPwd.equals(userService.findByUserTel(userTel).getUserPwd() )){
            System.out.println("1");
            return false;
        }else {
            userService.updateUserpwd(userTel,userPwd);
            return true;
        }
    }
}