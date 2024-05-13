package edu.io;

import java.util.List;

public class Student {

    private String name;
    private String major;
    private List<Course> courses;

    public Student(String name, String major, List<Course> courses) {
        this.name = name;
        this.major = major;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    public static double calculateAverageGrade(Student student) {
        double totalGrade = 0;
        for (Course course : student.getCourses()) {
            totalGrade += course.getCourseGrade();
        }
        return totalGrade / student.getCourses().size();
    }
}
