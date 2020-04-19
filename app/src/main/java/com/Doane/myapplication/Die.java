package com.Doane.myapplication;


import java.util.Random;

/**
 * A class that creates dice for the character to roll
 */
public class Die {

    /**
     * diceType and numSides
     * are what gets passed in to roll the dice
     */


    private String diceType;
    private int numSides;

    private int result;
    public int numDice;

    public static final Die[] dice ={
            new Die(),
            new Die(),
            new Die(),
            new Die(),
            new Die(),
            new Die()
    };

    Die(){
        this.diceType = diceType;
        this.numSides = numSides;
    }

    public int getType(){
        return numSides;
    }

    public String toString(){
        return "d" + getType();
    }

    public int rollNumDice(int numDice, int numSides){
        numDice = GetNumDice();
        numSides = getDiceType();

        int temp_result = 0;

        for (int i = 0; i < numDice; i++) {
            temp_result += rollSingleDice(numSides);
        }

        result = temp_result;

        return result;

    }

    public int rollSingleDice(int numSides){
        numSides = getDiceType();

        Random random = new Random();

        return random.nextInt(numSides + 1);
    }


    public int GetNumDice(){
        return this.numDice;
    }

    public int getDiceType(){
        return this.numSides;
    }

}