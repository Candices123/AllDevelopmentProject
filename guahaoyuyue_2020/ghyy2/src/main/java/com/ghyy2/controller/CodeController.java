package com.ghyy2.controller;

import com.ghyy2.demo.SMSUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//发送验证码
@RestController
public class CodeController {

    @RequestMapping(value = "/getCode", method = RequestMethod.POST)
//    @RequestBody String userTel
    @SuppressWarnings("resource")
    public String getCode(String userTel) throws Exception{
//        System.out.println("电话号码:"+userTel);
        if(SMSUtils.isMobile(userTel)){
            String smsCode = SMSUtils.sendCode(userTel,"14889135");//发送验证码
            return smsCode;
        }
        return "无验证码";
    }
}
