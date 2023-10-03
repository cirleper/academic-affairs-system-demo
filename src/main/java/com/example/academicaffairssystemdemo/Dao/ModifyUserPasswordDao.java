package com.example.academicaffairssystemdemo.Dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface ModifyUserPasswordDao {
    @Update("""
            UPDATE FROM user
            set password=#{newPassword}
            WHERE user_id=#{userId}
            """)
    int ModifyUserDao(@Param("userId")String userId,
                      @Param("newPassword")String newPassword);
}
