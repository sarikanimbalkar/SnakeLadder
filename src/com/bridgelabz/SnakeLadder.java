package com.bridgelabz;
public class SnakeLadder {
    static int player1Position=0;
    static int rollDie()
    {
        int dice=((int)Math.random()*10)+1;
        return dice;
    }
    public static void main(String[] args) {
        int dice=rollDie();
        System.out.println(dice);
    }
}
