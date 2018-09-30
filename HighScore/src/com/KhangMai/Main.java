package com.KhangMai;

public class Main {

    public static void main(String[] args) {
        int positionHighScore = calculateHighScorePosition(1000);
        displayHighScorePosition("khang", positionHighScore);

        positionHighScore = calculateHighScorePosition(900);
        displayHighScorePosition("khai", positionHighScore);

        positionHighScore = calculateHighScorePosition(400);
        displayHighScorePosition("Chau", positionHighScore);

        positionHighScore = calculateHighScorePosition(50);
        displayHighScorePosition("Tu", positionHighScore);
    }

    public static void displayHighScorePosition(String player, int positionHighScore) {
        System.out.println(player + " managed to get into position " + positionHighScore);
    }

    public static int calculateHighScorePosition(int score) {
        int position = 0;

        if (score >= 1000)
            position = 1;
        else if (score >= 500 && score < 1000)
            position = 2;
        else if (score >= 100 && score < 500)
            position = 3;
        else
            position = 4;

        return position;
    }
}
