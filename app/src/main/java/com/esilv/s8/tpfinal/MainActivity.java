package com.esilv.s8.tpfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private EditText editSearch;
    private Button buttonSearch;
    private String search;

    private static final String VIDEOS_URL = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=eminem&type=video&key=";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind the XML ListView to the Java RecyclerView
        Button buttonSearch = (Button) findViewById(R.id.buttonSearch);

        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.list);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        //when user clicks on the button "Ok", he will be redirect to the list of videos
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editSearch = (EditText) findViewById(R.id.editSearch);
                //retrieve text in the EditText
                String valueSearch = editSearch.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("text",search);
                startActivity(intent);
            }
        });
    }
}