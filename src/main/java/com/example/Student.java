package com.example;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        // TODO: Initialize the attributes
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public List<String> getCourses(){
        return courses;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
}
