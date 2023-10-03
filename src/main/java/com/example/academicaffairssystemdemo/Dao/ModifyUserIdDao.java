package com.example.academicaffairssystemdemo.Dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface ModifyUserIdDao {
    @Update("""
            UPDATE FROM user
            set user_id=#{newUserId}
            WHERE user_id=#{userId}
            """)
    int ModifyUserDao(@Param("userId")String userId,
                      @Param("newUserId")String newUserId);
}
