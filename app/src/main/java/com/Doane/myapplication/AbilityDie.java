package com.Doane.myapplication;

public class AbilityDie extends StoryDice{
    private int resultRoll;
    private int numSides = 8;
    private String name = "Ability";
    Face resultFace;

    //Constructor class
    AbilityDie(){}

    void setResultFace(){
        resultRoll = rollSingleDice(numSides);

        switch(resultRoll){
            case 1:
                //set result face to blank
                //resultFace = Face.faces[11]; //will be changed to index 11
            case 2:
                //success
                resultFace = Face.faces[8];
            case 3:
                resultFace = Face.faces[8];
            case 4:
                //advantage
                resultFace = Face.faces[1];
            case 5:
                resultFace = Face.faces[3];
            case 6:
                resultFace = Face.faces[3];
            case 7:
                resultFace = Face.faces[2];
            case 8:
                resultFace = Face.faces[0];
        }
    }

}
