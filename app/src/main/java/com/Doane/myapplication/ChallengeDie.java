package com.Doane.myapplication;

public class ChallengeDie extends StoryDice {
    private int resultRoll;
    private int numSides = 12;
    private String name = "Challenge";
    Face resultFace;

    ChallengeDie(){}

    void setResultFace(int numSides){
        numSides = 12;

        resultRoll = rollSingleDice(numSides);

        switch(resultRoll){
            case 1:
                resultFace = Face.faces[11]; // will be changed to blank
            case 2:
                resultFace = Face.faces[5]; // will be changed to blank
            case 3:
                resultFace = Face.faces[5];
            case 4:
                resultFace = Face.faces[7];
            case 5:
                resultFace = Face.faces[7];
            case 6:
                resultFace = Face.faces[4];
            case 7:
                resultFace = Face.faces[4];
            case 8:
                resultFace = Face.faces[6];
            case 9:
                resultFace = Face.faces[6];
            case 10:
                resultFace = Face.faces[16];
            case 11:
                resultFace = Face.faces[16];
            case 12:
                resultFace = Face.faces[10];
        }
    }
}
