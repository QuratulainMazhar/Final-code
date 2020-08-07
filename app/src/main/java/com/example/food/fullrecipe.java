package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class fullrecipe extends AppCompatActivity {
    String tital;
    EditText editText;
    DatabaseHelper dbHelper;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullrecipe);
        Intent intent=getIntent();
       tital=intent.getStringExtra("Tital");
        //Toast.makeText(fullrecipe.this,""+tital ,Toast.LENGTH_SHORT).show();
        dbHelper = new DatabaseHelper(this);
        db = dbHelper.getReadableDatabase();
          editText=(EditText)findViewById(R.id.fullrecipe);
          editText.setText(tital);
        final Cursor p =dbHelper.receive();
        while (p.moveToNext()) {

            Long id= p.getLong(0) ;
            String T= p.getString(1) ;
            String D= p.getString(2) ;


            if(tital.equalsIgnoreCase(T))
            {

                editText.setText(D);
            }

        }

        p.close();

    }
}