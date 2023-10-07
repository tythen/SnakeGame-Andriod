package com.tythen.tysnake;

public class Score {
    private int score;
    private String date;

    Score(int s, String d) {
        score = s;
        date = d;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
