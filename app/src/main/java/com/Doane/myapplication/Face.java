package com.Doane.myapplication;
/**
 * The class to load in the faces for the story dice for the
 * FFG Genesys and Star Wars character sheet side
 */

public class Face{
    private String name;
    private int imageResourceId;

    public static final Face[] faces = {
            new Face("DoubleAdvantage", R.drawable.doubleadvantage),
            new Face("DoubleSuccess", R.drawable.doublesuccess),
            new Face("SuccessAdvantage", R.drawable.successadvantage),
            new Face("advantage", R.drawable.advantage),
            new Face("disadvantage", R.drawable.disadvantage),
            new Face("failure", R.drawable.failure),
            new Face("failureDisadvantage", R.drawable.failuredisadvantage),
            new Face("doubleFailure", R.drawable.doublefailure),
            new Face("success", R.drawable.success),
            new Face("triumph", R.drawable.triumph),
            new Face("despair", R.drawable.despair),
            new Face("blank", R.drawable.blank),
            new Face("singledarkside", R.drawable.singledarkside),
            new Face("singlelightside", R.drawable.singlelightside),
            new Face("doubledarkside", R.drawable.doubledarkside),
            new Face("doublelightside", R.drawable.doublelightside),
            new Face("doubledsiadvantage", R.drawable.doubledisadvantage)
    };
    private Face(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() { return name; }
    public int getImageResourceId() { return imageResourceId; }
}