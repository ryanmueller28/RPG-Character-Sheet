package com.Doane.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ImageView;

import static android.provider.Contacts.SettingsColumns.KEY;

public class RPGCharacterSheetDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "CHARACTER_SHEET_DATABASE";
    private static final int DB_VERSION = 2;
    private static final String NAME_COLUMN = "NAME";
    private static final String SPECIES_COLUMN ="SPECIES";
    private static final String CAREER_COLUMN = "CAREER";
    private static final String BRAWN_COLUMN = "BRAWN";
    private static final String AGILITY_COLUMN = "AGILITY";
    private static final String INTELLECT_COLUMN = "INTELLECT";
    private static final String CUNNING_COLUMN = "CUNNING";
    private static final String WILLPOWER_COLUMN = "WILLPOWER";
    private static final String PRESENCE_COLUMN = "PRESENCE";

    RPGCharacterSheetDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }


    private static void insertCharacterVal(SQLiteDatabase db, String characterName, String species, String career,
                                           int brawnValue, int agilityValue, int intellectValue,
                                           int cunningValue, int willpowerValue, int presenceValue){
        ContentValues characterValues = new ContentValues();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    public void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            if (oldVersion < 1) {
                db.execSQL("CREATE TABLE CHARACTER (" +
                        "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        NAME_COLUMN + "TEXT," +
                        SPECIES_COLUMN + "TEXT," +
                        CAREER_COLUMN + "TEXT," +
                        BRAWN_COLUMN + "INTEGER," +
                        AGILITY_COLUMN +"INTEGER," +
                        INTELLECT_COLUMN + "INTEGER," +
                        CUNNING_COLUMN +"INTEGER," +
                        WILLPOWER_COLUMN + "INTEGER," +
                        PRESENCE_COLUMN + "INTEGER);");
            }
            if (oldVersion < 2) {

            }
        }
    }

    public boolean addCharacter(String name){
        SQLiteDatabase charDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME_COLUMN, name);

        long result = charDatabase.insert(DB_NAME, null, contentValues);

        if (result == -1){
            return false;
        }else{
            return true;
        }
    }
}
