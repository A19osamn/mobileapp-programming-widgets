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
    private String[] mountainNames = {"Qalamun","Hermun","Qasioun"};
    private String[] mountainLocations = {"Damascus","Damascus","Sham"};
    private int[] mountainsHeights= {2466,2814,1151};
    private ArrayList<Mountain> mountainArrayList= new ArrayList<>();
    private ArrayList<String> ListData=new ArrayList<>(Arrays.asList(mountainNames));

    @Override


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.myNewBtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","We clicked on Tomten!");
            }
        });
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_item_textview,R.id.list_item_textview_xml,ListData);
        ListView my_listview=(ListView) findViewById(R.id.my_listview);
        my_listview.setAdapter(adapter);
        my_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "A Mountain In Syria , Damascus", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
