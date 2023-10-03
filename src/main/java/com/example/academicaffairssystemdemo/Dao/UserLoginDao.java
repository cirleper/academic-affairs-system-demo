package com.example.academicaffairssystemdemo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserLoginDao {
    @Select("""
            SELECT password 
            FROM user 
            WHERE user_id=#{userId}
            """)
    String login(@Param("userId") String userId);
}
