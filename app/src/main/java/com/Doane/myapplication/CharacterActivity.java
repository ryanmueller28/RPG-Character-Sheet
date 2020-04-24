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
    private Button btnAdd, btnViewCharacters;
    private EditText editText;

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_character);

        editText = (EditText) findViewById(R.id.editText);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        databaseHelper = new RPGCharacterSheetDatabaseHelper(this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = editText.getText().toString();
                if (editText.length() != 0){
                    AddData(newEntry);
                    editText.setText("");
                }else{
                    ToastMessage("You must enter a valid entry");
                }
            }
        });
    }

    void AddData(String newEntry){
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
