package com.Doane.myapplication;

public class SetbackDie extends StoryDice {
    private int resultRoll;
    private int numSides = 6;
    private String name = "Setback";
    Face resultFace;

    SetbackDie(){}

    void setResultFace(int numSides){
        numSides = 6;

        resultRoll = rollSingleDice(numSides);

        switch(resultRoll){
            case 1:
                resultFace = Face.faces[11]; // will be changed to blank
            case 2:
                resultFace = Face.faces[11]; // will be changed to blank
            case 3:
                resultFace = Face.faces[5];
            case 4:
                resultFace = Face.faces[5];
            case 5:
                resultFace = Face.faces[4];
            case 6:
                resultFace = Face.faces[4];
        }
    }
}
