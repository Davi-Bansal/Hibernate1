package com.example;

public class Student {

    private Course course;

    // Constructor injection
    public Student(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student enrolled in: " + course.getCourseName());
    }
}
