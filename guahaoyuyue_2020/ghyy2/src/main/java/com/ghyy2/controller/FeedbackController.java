package com.ghyy2.controller;

import com.ghyy2.bean.Feedback;
import com.ghyy2.bean.Msg;
import com.ghyy2.service.FeedbackService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class FeedbackController {


    @Resource
    FeedbackService feedbackService;
    //插入用户反馈
    @RequestMapping(value = "/insertFeedback", method = RequestMethod.POST)
    public Msg insertFeedback(@RequestBody Feedback feedback){
        feedbackService.insertFeedback(feedback);
        return Msg.success();
    }
}
