package com.Doane.myapplication;

public class DifficultyDie extends StoryDice{
    private int resultRoll;
    private int numSides = 8;
    private String name = "Difficulty";
    Face resultFace;

    //Constructor class
    DifficultyDie(){}

    void setResultFace(){
        resultRoll = rollSingleDice(numSides);

        switch(resultRoll){
            case 1:
                //set result face to blank
                //resultFace = Face.faces[11]; //will be changed to index 11
            case 2:
                //success
                resultFace = Face.faces[5];
            case 3:
                resultFace = Face.faces[7];
            case 4:
                //advantage
                resultFace = Face.faces[4];
            case 5:
                resultFace = Face.faces[4];
            case 6:
                resultFace = Face.faces[4];
            case 7:
                //resultFace = Face.faces[16];
            case 8:
                resultFace = Face.faces[6];
        }
    }
}
