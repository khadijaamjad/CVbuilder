package com.example.cvbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Resume> resumes=new ArrayList<Resume>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnAddClick(View view) {
        Intent i=new Intent(this,AddResume.class);
        startActivity(i);
    }
    public void btnViewAllClick(View view) {
        Intent j=new Intent(this,ViewAll.class);
        startActivity(j);
    }
}