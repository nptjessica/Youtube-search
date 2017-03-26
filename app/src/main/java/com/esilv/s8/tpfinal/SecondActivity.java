package com.esilv.s8.tpfinal;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView listvideos;
    //Bundle bundle = getIntent().getExtras();
    //private String dataSearch = bundle.getString("text");

    private static final String VIDEOS_URL = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=eminem&type=video&key=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Bundle bundle = getIntent().getExtras();
        //dataSearch = bundle.getString("text");
        //String str = (String) getIntent().getSerializableExtra("string");
        RecyclerView listvideos = (RecyclerView) findViewById(R.id.listvideos);
        listvideos.setLayoutManager(new LinearLayoutManager(this));
        getVideos();
    }

    private void getVideos() {
        StringRequest videosRequest = new StringRequest(VIDEOS_URL+ "&key=" + Constants.API_KEY, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //parse data from webservice to get Contracts as Java object
                Videos videos = new Gson().fromJson(response, Videos.class);
                
                setAdapter(videos);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Videos", "Error");
            }
        });

        Volley.newRequestQueue(this).add(videosRequest);
    }

    private void setAdapter(Videos videos) {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(videos);
        adapter.setOnContractSelectedListener(this);
        listvideos.setAdapter(adapter);
    }

}
