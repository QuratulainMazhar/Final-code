package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class drinks extends AppCompatActivity {
ListView listView;
int img[]={R.drawable.cocktail,R.drawable.juice,R.drawable.milkshake,R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
 String dis[]={"cocktail","mint juice","milkshake","cocumber juice","lemon juice","blue cocktail","banana shake"," red cocktail"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(new customAdapter(drinks.this,img,dis));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               String e=dis[i];

               // Toast.makeText(drinks.this, "item one+ "+e, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(drinks.this,fullrecipe.class);
                intent.putExtra("Tital",e);
                startActivity(intent);

            }
        });
    }
}