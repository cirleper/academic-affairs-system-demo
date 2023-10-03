package com.example.academicaffairssystemdemo.Do;

import java.util.Date;

public class CourseDo {
    private int courseId;
    private int courseName;
    private int teacherId;
    private Date startTime;
    private Date endTime;
    private String location;
    private String ment;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseName() {
        return courseName;
    }

    public void setCourseName(int courseName) {
        this.courseName = courseName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMent() {
        return ment;
    }

    public void setMent(String ment) {
        this.ment = ment;
    }

    @Override
    public String toString() {
        return "CourseDo{" +
                "courseId=" + courseId +
                ", courseName=" + courseName +
                ", teacherId=" + teacherId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                ", ment='" + ment + '\'' +
                '}';
    }
}
