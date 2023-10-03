package com.example.academicaffairssystemdemo.Dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DelUserDao {
    @Delete("""
            DELETE FROM user
            WHERE user_id=#{userId}
            """)
    int DelUser(@Param("userId")String userId);
}
