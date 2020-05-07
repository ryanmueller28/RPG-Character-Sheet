package com.Doane.myapplication;

public class BoostDie extends StoryDice {
    private int resultRoll;
    private int numSides = 6;
    private String name = "Boost";
    Face resultFace;

    BoostDie(){}

    void setResultFace(int numSides){
        numSides = 6;

        resultRoll = rollSingleDice(numSides);

        switch(resultRoll){
            case 1:
                resultFace = Face.faces[11]; // will be changed to blank
            case 2:
                resultFace = Face.faces[11]; // will be changed to blank
            case 3:
                resultFace = Face.faces[8];
            case 4:
                resultFace = Face.faces[2];
            case 5:
                resultFace = Face.faces[0];
            case 6:
                resultFace = Face.faces[3];
        }
    }
}
