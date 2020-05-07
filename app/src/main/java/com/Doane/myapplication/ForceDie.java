package com.Doane.myapplication;

public class ForceDie extends StoryDice {
    private int resultRoll;
    private int numSides = 12;
    private String name = "Force";
    Face resultFace;

    ForceDie(){}

    void setResultFace(int numSides){
        numSides = 12;

        resultRoll = rollSingleDice(numSides);

        switch(resultRoll){
            case 1:
               resultFace = Face.faces[12];
            case 2:
                resultFace = Face.faces[12];
            case 3:
                resultFace = Face.faces[12];
            case 4:
                resultFace = Face.faces[12];
            case 5:
               resultFace = Face.faces[12];
            case 6:
                resultFace = Face.faces[12];
            case 7:
                resultFace = Face.faces[14];
            case 8:
                resultFace = Face.faces[13];
            case 9:
                resultFace = Face.faces[13];
            case 10:
                resultFace = Face.faces[15];
            case 11:
                resultFace = Face.faces[15];
            case 12:
                resultFace = Face.faces[15];
        }
    }
}
