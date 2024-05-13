package edu.io;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = readStudentsFromFile("students.json");
        printAverageGrades(students);
        Student highestAverageStudent = findHighestAverage(students);
        System.out.println("\nStudent with the highest average grade:");
        System.out.println(highestAverageStudent);
    }

    public static List<Student> readStudentsFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            Gson gson = new Gson();
            List<Student> students = gson.fromJson(reader, new ArrayList<Student>().getClass());
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void printAverageGrades(List<Student> students) {
        for (Student student : students) {
            double averageGrade = calculateAverageGrade(student);
            System.out.println(student.getName() + " - Average Grade: " + averageGrade);
        }
    }

    public static double calculateAverageGrade(Student student) {
        double totalGrade = 0;
        for (Course course : student.getCourses()) {
            totalGrade += course.getCourseGrade();
        }
        return totalGrade / student.getCourses().size();
    }

    public static Student findHighestAverage(List<Student> students) {
        return students.stream().max(Comparator.comparingDouble(Student::)).orElse(null);
    }
}





}
