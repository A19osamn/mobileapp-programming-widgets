package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Mountain> mountainArrayList= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mountainArrayList.add(new Mountain("Qalamun","Damascus",2466));
        mountainArrayList.add(new Mountain("Hermun","Damascus",2814));
        mountainArrayList.add(new Mountain("Qasioun","Sham",1151));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.myNewBtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Log.d("==>","We clicked on Tomten!");
            }
        });
        ArrayAdapter<Mountain> adapter=new ArrayAdapter<Mountain>(this,R.layout.list_item_textview,R.id.list_item_textview_xml,mountainArrayList);
        ListView my_listview=(ListView) findViewById(R.id.my_listview);
        my_listview.setAdapter(adapter);
        my_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), mountainArrayList.get(position).info(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
