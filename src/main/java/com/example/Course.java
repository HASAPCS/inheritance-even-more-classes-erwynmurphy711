package com.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseID;
    private List<Student> students;

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.students = new ArrayList<Student>();
        // TODO: Initialize the attributes
    }
    public void enrollStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public List<Student> getStudents(){
        return this.students;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public String getCourseID(){
        return this.courseID;
    }
    // TODO: Implement methods to enroll a student and drop a student
}
