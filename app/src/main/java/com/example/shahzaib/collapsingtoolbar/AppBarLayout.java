package com.example.shahzaib.collapsingtoolbar;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AppBarLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar);
    }

    public void startCollapsingToolbarActivity(View view) {
        startActivity(new Intent(this, CollapsingToolbar.class));
    }
}
