package edu.io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class MainMovie {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        // Task 1
        CastMember participant1 = new CastMember("Mark Hamil", "Luke Skywalker");
        CastMember participant2 = new CastMember("Harrison Ford", "Han Solo");
        ArrayList<CastMember> castSW = new ArrayList<>();
        castSW.add(participant1);
        castSW.add(participant2);


        Movie movie1 = new Movie("Star Wars", "George Lukas", 121, castSW);
        String movie1Json = gson.toJson(movie1);
        System.out.println(movie1Json);
        System.out.println();

        CastMember participant3 = new CastMember("Johnny Depp", "Captain Jack Sparrow");
        CastMember participant4 = new CastMember("Orlando Bloom", "Will Turner");
        ArrayList<CastMember> castPOTC = new ArrayList<>();
        castPOTC.add(participant3);
        castPOTC.add(participant4);

        Movie moviePOTC = new Movie("Pirates of the Caribbean", "Gore Verbinski", 143, castPOTC);
        String moviePOTCJson = gson.toJson(moviePOTC);
        System.out.println(moviePOTCJson);



    }
}