package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoursesService {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Islam", new String[]{"MD1", "PRM", "DLD"}, 2020),
            new Student("Amr", new String[]{"MD1", "NUA", "DLD"}, 2019),
            new Student("Salah", new String[]{"NUA", "PRM", "MD1"}, 2020)
    ));

    private List<Course> courses = new ArrayList<>(Arrays.asList(
            new Course("DLD", "Digital Logic Design"),
            new Course("NUA", "Numerical Analysis")
    ));

    //studentsRegisteredToCourse method can take input either the course code as a String
    //or the course as an object
    public void studentsRegisteredToCourse(String courseName) {
        students.stream()
                .filter(s -> Arrays.asList(s.getCourses()).contains(courseName))
                .forEach(s -> System.out.println(s.getName()));
    }

    public void studentsRegisteredToCourse(Course course) {
        students.stream()
                .filter(s -> Arrays.asList(s.getCourses()).contains(course.getCode()))
                .forEach(s -> System.out.println(s.getName()));
    }
}