package com.softserve.edu10.hw.task03;

import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        var it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (courseNumber == 0 || student.getCourse() == courseNumber) {
                System.out.println("Name: " + student.getName() + " Course: " + student.getCourse());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    public static Comparator<Student> compareByCourse() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getCourse(), o2.getCourse());
            }
        };
    }
}
