package com.Doane.myapplication;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CharacterActivity extends Activity {

    public static final String EXTRA_CHARACTER_ID = "characterID";

    RPGCharacterSheetDatabaseHelper databaseHelper;
    private Button btnAdd;
    private EditText editText;
    private EditText charSpecies;
    private EditText charCareer;
    private EditText brawn;
    private EditText agility;
    private EditText intellect;
    private EditText cunning;
    private EditText willpower;
    private EditText presence;

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_character);

        editText = (EditText) findViewById(R.id.editText);
        charSpecies = (EditText) findViewById(R.id.editSpecies);
        charCareer = (EditText) findViewById(R.id.editCareer);
        brawn = (EditText) findViewById(R.id.editBrawn);
        agility = (EditText) findViewById(R.id.editAgility);
        intellect = (EditText) findViewById(R.id.editIntellect);
        cunning = (EditText) findViewById(R.id.editCunning);
        willpower = (EditText) findViewById(R.id.editWillpower);
        presence = (EditText) findViewById(R.id.editPresence);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        databaseHelper = new RPGCharacterSheetDatabaseHelper(this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = editText.getText().toString();
                String Species = charSpecies.getText().toString();
                String Career = charCareer.getText().toString();
                int charBrawn = Integer.parseInt(brawn.toString());
                int charAgility = Integer.parseInt(agility.toString());
                int charIntellect = Integer.parseInt(intellect.toString());
                int charCunning = Integer.parseInt(cunning.toString());
                int charWillpower = Integer.parseInt(willpower.toString());
                int charPresence = Integer.parseInt(presence.toString());

                if (editText.length() != 0){
                    AddData(newEntry, Species, Career, charBrawn,
                            charAgility, charIntellect,
                            charCunning, charWillpower, charPresence);
                    editText.setText("");
                }else{
                    ToastMessage("You must enter a valid entry");
                }
            }
        });
    }

    void AddData(String newEntry, String species, String career, int brawn, int agility,
                 int intellect, int cunning, int willpower, int presence){
        boolean insertData = databaseHelper.addCharacter(newEntry);

        if (insertData){
            ToastMessage("Inserted Successfully");
        }else{
            ToastMessage("Something is wrong");
        }
    }


    public void ToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
