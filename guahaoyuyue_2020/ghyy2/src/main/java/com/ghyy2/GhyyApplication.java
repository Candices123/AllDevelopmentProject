package com.ghyy2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@MapperScan("com.ghyy2.dao")
@SpringBootApplication
@ServletComponentScan
@Controller
public class GhyyApplication {
    @RequestMapping("/index")
    @ResponseBody
    public String index()
    {
        return "redirect:index.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(GhyyApplication.class, args);
    }

}
