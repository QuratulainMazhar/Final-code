package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class main extends AppCompatActivity {

    ListView listView;
    int img[]={R.drawable.ca,R.drawable.cak,R.drawable.cake,R.drawable.cakee,R.drawable.wedding,R.drawable.pie,R.drawable.birthday,R.drawable.birthdaycake,R.drawable.cakelice};
    String dis[]={"red charry cack","lemon cack","pie","apple cack","wedding cack","apple pie","apple cack","choco chack","red cack","creem cack"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(new customAdapter(main.this,img,dis));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String e=dis[i];

                //Toast.makeText(main.this, "item one+ "+e, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(main.this,fullrecipe.class);
                intent.putExtra("Tital",e);
                startActivity(intent);

            }
        });
    }
}