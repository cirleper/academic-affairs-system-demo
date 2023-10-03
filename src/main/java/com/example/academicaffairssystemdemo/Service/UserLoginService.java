package com.example.academicaffairssystemdemo.Service;

import com.example.academicaffairssystemdemo.Dao.UserLoginDao;
import com.example.academicaffairssystemdemo.Dao.UserResetPasswordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    @Autowired
    private UserLoginDao userLoginDao;
    @Autowired
    private UserResetPasswordDao userResetPasswordDao;
    public boolean loginStudent(String userId, String password){

        System.out.println(userLoginDao.login(userId));
        return password.equals(userLoginDao.login(userId));
    }
    public int resetPassword(String userId,String newPassword){
        System.out.println(userResetPasswordDao.resetPassword(userId,newPassword));
        return userResetPasswordDao.resetPassword(userId,newPassword);
    }
}
