package com.Doane.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class RPGCharacterSheetDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "CHARACTER_SHEET_DATABASE";
    private static final int DB_VERSION = 1;

    RPGCharacterSheetDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void setCreate(SQLiteDatabase db) { updateMyDatabase(db, 0, DB_VERSION); }

    private static void insertCharacterVal(SQLiteDatabase db, String name, String description,
                                    int scoreValue){
        ContentValues characterValues = new ContentValues();
        characterValues.put("NAME", name);
        characterValues.put("DESCRIPTION", description);
        characterValues.put("SCORE_VALUE", scoreValue);
        db.insert("CHARACTERISTIC", null, characterValues);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    public void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE DRINK (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "NAME TEXT," +
                    "DESCRIPTION TEXT," +
                    "ATTRIBUTE_SCORE INTEGER);");

            insertCharacterVal(db, "Brawn", "Strength", 2);
        }
        if(oldVersion < 2){

        }
    }

}
