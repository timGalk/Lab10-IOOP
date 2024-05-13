package edu.io;

public class Joke {
    private String setup;
    private String punchline;

    public Joke(String setup, String punchline) {
        this.setup = setup;
        this.punchline = punchline;
    }

    // Getters and setters omitted for brevity

    @Override
    public String toString() {
        return "Joke: \nSetup: " + setup + "\nPunchline: " + punchline;
    }
}

