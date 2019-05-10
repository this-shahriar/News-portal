package com.example.shp.rssfeed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void dailyStar(View view)
    {
        Intent intent = new Intent(first.this, MainActivity.class);
        startActivity(intent);
    }

}
