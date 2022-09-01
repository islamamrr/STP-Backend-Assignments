package org.example;

import java.util.Arrays;

public class Student {
    private String name;
    private String[] courses;
    private int gradYear;

    public Student(String name, String[] courses, int gradYear) {
        this.name = name;
        this.courses = courses;
        this.gradYear = gradYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}