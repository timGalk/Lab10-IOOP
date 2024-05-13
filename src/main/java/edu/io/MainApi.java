package edu.io;



import java.io.IOException;
import com.google.gson.Gson;

public class MainApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        JokeApiClient client = new JokeApiClient();
        String jokeData = client.jokeApiRequest();

        Gson gson = new Gson(); // Assuming JSON response
        Joke joke = gson.fromJson(jokeData, Joke.class);

        System.out.println(joke);
    }
}
