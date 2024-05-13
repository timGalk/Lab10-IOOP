package edu.io;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainStudent{

    public static void main(String[] args) throws IOException {

        String filename = "src/main/java/edu/io/students.json";
        // parser
        List<Student> students = parserofinfo(filename);
        for (Student student : students) {
            System.out.println(student.getName());
        }


    }
    public static List<Student> parserofinfo(String fileName) throws IOException {
        File theFile = new File(fileName);
        try {
            FileReader fr = new FileReader(theFile);

            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Student>>() {
            }.getType();
            List<Student> students = gson.fromJson(fr, listType);
            fr.close();
            return students;


        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

//    public static List<Student> readStudentsFromFile(String fileName) {
//        try (FileReader reader = new FileReader(fileName)) {
//            Gson gson = new Gson();
//            List<Student> students = gson.fromJson(reader, new ArrayList<Student>().getClass());
//            return students;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

//    public static void printAverageGrades(List<Student> students) {
//        for (Student student : students) {
//            double averageGrade = student.calculateAverageGrade(student);
//            System.out.println(student.getName() + " - Average Grade: " + averageGrade);
//        }
//    }

//    public static double calculateAverageGrade(Student student) {
//        double totalGrade = 0;
//        for (Course course : student.getCourses()) {
//            totalGrade += course.getCourseGrade();
//        }
//        return totalGrade / student.getCourses().size();
//    }

//    public static Student findHighestAverage(List<Student> students) {
//        return students.stream().max(Comparator.comparingDouble(Student::calculateAverageGrade));
//    }
}




