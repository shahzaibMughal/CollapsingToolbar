package com.example.shahzaib.collapsingtoolbar;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CollapsingToolbar extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);
        collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("CollapsingToolbar");


    }

    public void startAppbarLayoutActivity(View view) {
        startActivity(new Intent(this,AppBarLayout.class));
    }
}
