package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class desserts extends AppCompatActivity {
    ListView listView;
    int img[]={R.drawable.jelly,R.drawable.jam,R.drawable.cottoncandy,R.drawable.candy,R.drawable.cherrydonut,R.drawable.belgianwaffle,R.drawable.macaron,R.drawable.bananasplit};
    String dis[]={"Jelly","Mango jam","Cottoncandy","Candy","cherrydonut","belgianwaffle","macaron","bananasplit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(new customAdapter(desserts.this,img,dis));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String e=dis[i];

                //Toast.makeText(desserts.this, "item one+ "+e, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(desserts.this,fullrecipe.class);
                intent.putExtra("Tital",e);
                startActivity(intent);

            }
        });
    }
}