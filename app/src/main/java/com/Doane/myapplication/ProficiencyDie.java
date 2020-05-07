package com.Doane.myapplication;

public class ProficiencyDie extends StoryDice {
    private int resultRoll;
    private int numSides = 12;
    private String name = "Proficiency";
    Face resultFace;

    ProficiencyDie(){}

    void setResultFace(int numSides){
        numSides = 12;

        resultRoll = rollSingleDice(numSides);

        switch(resultRoll){
            case 1:
                resultFace = Face.faces[11]; // will be changed to blank
            case 2:
                resultFace = Face.faces[8];
            case 3:
                resultFace = Face.faces[8];
            case 4:
                resultFace = Face.faces[1];
            case 5:
                resultFace = Face.faces[1];
            case 6:
                resultFace = Face.faces[3];
            case 7:
                resultFace = Face.faces[2];
            case 8:
                resultFace = Face.faces[2];
            case 9:
                resultFace = Face.faces[2];
            case 10:
                resultFace = Face.faces[0];
            case 11:
                resultFace = Face.faces[0];
            case 12:
                resultFace = Face.faces[9];
        }
    }
}
