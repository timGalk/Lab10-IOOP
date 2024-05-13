package edu.io;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {

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


    public double calculateAverageGrade(){
        List<Course> courses = getCourses();
        double totalGrade = 0;
        for (Course course : getCourses()) {
            totalGrade += course.getCourseGrade();
        }
        return totalGrade /courses.size();
    }

    @Override
    public int compareTo(Student o) {
        if (this.calculateAverageGrade() < o.calculateAverageGrade()) {
            return 1;
        } else if (this.calculateAverageGrade() > o.calculateAverageGrade()) {
            return -1;
        } else {
            return 0;
        }
    }
}
