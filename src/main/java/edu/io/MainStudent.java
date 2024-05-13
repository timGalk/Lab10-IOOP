package edu.io;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class MainStudent{

    public static void main(String[] args) throws IOException {

        String filename = "src/main/java/edu/io/students.json";

        List<Student> students = parserofinfo(filename);
        for (Student student : students) {
            System.out.println(student.getName() + " Average grade" + student.calculateAverageGrade());
        }

        //Sorting
        Student theBest = theBestStudent(students);

        System.out.println("The best student: " + theBest.getName());



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
    public static Student theBestStudent(List<Student> students) {
        Collections.sort(students);
        return students.get(0);

        }
    }







