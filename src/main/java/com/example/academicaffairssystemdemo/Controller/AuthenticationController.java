package com.example.academicaffairssystemdemo.Controller;

import com.example.academicaffairssystemdemo.Service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {
    @Autowired
    private UserLoginService userLoginService;
    @GetMapping("/login")
    public String login(String userId, String password){

        if (userLoginService.loginStudent(userId,password)) {
            return "success";
        }
        else {
            return "";
        }
    }
    @GetMapping("/resetPassword")
    public int resetPassword(String userId,String newPassword){
        return userLoginService.resetPassword(userId,newPassword);
    }

}
