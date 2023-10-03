package com.example.academicaffairssystemdemo.Do;

import java.math.BigInteger;

public class StudentDo {
    private BigInteger studentId;
    private String name;
    private char gender;
    private Integer gpa;
    private String major;
    private String identityId;

    public BigInteger getStudentId() {
        return studentId;
    }

    public void setStudentId(BigInteger studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    @Override
    public String toString() {
        return "StudentDo{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                ", identityId='" + identityId + '\'' +
                '}';
    }
}
