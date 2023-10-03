package com.example.academicaffairssystemdemo.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddUserDao {
    @Insert("""
            INSERT INTO user
            VALUES(#{userId},#{password})
            """)
    int addUser(@Param ("userId")String userId,
                @Param("password")String password);
}

