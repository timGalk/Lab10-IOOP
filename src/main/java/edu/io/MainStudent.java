package edu.io;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {

    }
    private static List<Student> readFromList(String jsonFile){
        Gson gson = new Gson();
        List<Student>students = new ArrayList<>();
        JsonObject jsonObject = new JsonObject();


        return students;







//        try(FileReader reader = new FileReader (jsonFile)) {
//
//
//        }
    }
}
