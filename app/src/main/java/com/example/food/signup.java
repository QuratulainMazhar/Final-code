package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import static com.example.food.DatabaseContract.Users.TABLE_NAME;

public class signup extends AppCompatActivity {

    EditText editText1, editText2,editText3;
    Button button1;
    DatabaseHelper dbHelper;
    SQLiteDatabase db;
    AlertDialog.Builder builder;
    String name,confirmpassword,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        builder = new AlertDialog.Builder(this);
        getSupportActionBar().setTitle("Signup");
        dbHelper = new DatabaseHelper(signup.this);
        button1 = (Button) findViewById(R.id.back);
        editText1 = (EditText) findViewById(R.id.ed1);
        editText2 = (EditText) findViewById(R.id.confirm);
        editText3 = (EditText) findViewById(R.id.ed3);
    }
    public void Back(View v)

    {
        Intent intent = new Intent(signup.this, MainActivity.class);
        startActivity(intent);

    }

    public void save(View v)

    {


        name=editText1.getText().toString().trim();
        confirmpassword=editText2.getText().toString();
        password=editText3.getText().toString();
        if (!name.isEmpty()
                && !confirmpassword.isEmpty()
                && !password.isEmpty()) {
            if(confirmpassword.equalsIgnoreCase(password))

            {
                db = dbHelper.getWritableDatabase();

              //  Toast.makeText(signup.this,name+password+confirmpassword,Toast.LENGTH_SHORT).show();
               ContentValues values = new ContentValues();
                values.put(DatabaseContract.Users.COL_NAME, name);
                values.put(DatabaseContract.Users.COL_PASSWORD, password);
                values.put(DatabaseContract.Users.COL_CONFIRMPASSWORD, confirmpassword);
               long newRowId = db.insert(TABLE_NAME, null, values);
                Toast.makeText(this, "New Record Inserted: " + newRowId, Toast.LENGTH_SHORT).show();
                if (newRowId > 0) {
                    Toast.makeText(this, "New Record Inserted: " + newRowId, Toast.LENGTH_SHORT).show();
                }

                db.close();


               // Toast.makeText(signup.this, "same ", Toast.LENGTH_SHORT).show();*/
            }
             else

                Toast.makeText(this, "both confirm password  and  password should be same", Toast.LENGTH_SHORT).show();

        } else {
            builder.setMessage(" Please, fill  all fields first ! ");
            builder.setCancelable(false);
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {


                }
            });


            AlertDialog alert = builder.create();

            alert.setTitle("Alert Message");
            alert.show();
        }

    }

}