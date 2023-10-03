package com.example.academicaffairssystemdemo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserResetPasswordDao {
    @Update("""
            UPDATE user
            SET password=#{newPassword}
            WHERE user_id=#{userId}
            """)
    int resetPassword(@Param("userId")String userId,
                      @Param("newPassword")String newPassword);
}
