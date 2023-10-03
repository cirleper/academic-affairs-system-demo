package com.example.academicaffairssystemdemo.Do;

import java.math.BigInteger;

public class EnrollmentDo {
    private BigInteger studentId;
    private Integer teacherId;
    private Integer courseId;
    private Integer grade;

    public BigInteger getStudentId() {
        return studentId;
    }

    public void setStudentId(BigInteger studentId) {
        this.studentId = studentId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "EnrollmentDo{" +
                "studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", courseId=" + courseId +
                ", grade=" + grade +
                '}';
    }
}
