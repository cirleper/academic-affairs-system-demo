package com.example.academicaffairssystemdemo.Do;

public class TeacherDo {
    private Integer teacherId;
    private String name;
    private char gender;
    private String title;
    private String department;
    private String identityId;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    @Override
    public String toString() {
        return "TeacherDo{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", identityId='" + identityId + '\'' +
                '}';
    }
}
