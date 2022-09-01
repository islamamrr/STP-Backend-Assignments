package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputCourse = sc.next();

        CoursesService coursesService = new CoursesService();

        coursesService.studentsRegisteredToCourse(inputCourse);
    }
}