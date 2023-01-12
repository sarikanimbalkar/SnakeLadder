package com.bridgelabz;

public class SnakeLadder {
    static final int WINNING_POSITION = 100;
    static int player1Position = 0;

    static int rollDie() {
        int dice = ((int) Math.random() * 10) % 6 + 1;
        return dice;
    }
    static int getOption() {
        int option = ((int) Math.random() * 10) % 3;
        return option;
    }
    public static void main(String[] args) {
        int dice = rollDie();
        System.out.println(dice);
        int option = getOption();
        System.out.println(option);
        while (player1Position != WINNING_POSITION) {
            switch (option) {
                case 0:
                    player1Position -= dice;
                    System.out.println("SNAKE");
                    if (player1Position < 0)
                        player1Position = 0;
                    break;
                case 1:
                    player1Position += dice;
                    System.out.println("LADDER");
                    break;
                case 2:
                    System.out.println("No Play");
                    break;
            }
            dice++;
        }
        //dice++;
    }
}
