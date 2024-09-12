package com.academico.cesde.Domain;

public class Course {

    private int  courseId;
    private String CourseName;
    private String  schedule;
    private Teacher teacher;
    private  String classRoom;
    private String  program;

    public Course(){

    }

    public Course(int courseId, String courseName, String schedule, Teacher teacher, String classRoom, String program) {
        this.courseId = courseId;
        CourseName = courseName;
        this.schedule = schedule;
        this.teacher = teacher;
        this.classRoom = classRoom;
        this.program = program;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
