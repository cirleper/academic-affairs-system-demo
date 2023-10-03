package com.example.academicaffairssystemdemo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ModifyUserPermissions {
    @Update("""
            UPDATE FROM user
            set role=#{newRole}
            WHERE user_id=#{userId}
            """)
    int ModifyUserDao(@Param("newRole")String newRole);
}
