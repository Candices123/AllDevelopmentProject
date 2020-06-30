package com.ghyy2.service;

import com.ghyy2.bean.Feedback;
import com.ghyy2.dao.FeedbackMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService{

    @Resource
//    @Autowired
    FeedbackMapper feedbackMapper;
    public void insertFeedback(Feedback feedback){
        feedbackMapper.insert(feedback);
    }
}
