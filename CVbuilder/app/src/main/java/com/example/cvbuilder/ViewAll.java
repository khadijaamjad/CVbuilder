package com.example.cvbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ViewAll extends AppCompatActivity {
    ListView listRes;
    ResumeArrayAdapter adapter;
    int selectedIndex=-1;
    Resume resume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);

        listRes = findViewById(R.id.lstRes);
        adapter = new ResumeArrayAdapter(this, R.layout.list_item_layout, MainActivity.resumes);
        listRes.setAdapter(adapter);

        listRes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                resume = adapter.getItem(position);
                selectedIndex = position;
            }
        });
    }
    public void bbtnDelClick(View view) {
        if(selectedIndex!=-1){
            boolean removed=MainActivity.resumes.remove(resume);
            if(removed)
            {
                Toast.makeText(this,"Resume removed",Toast.LENGTH_LONG).show();
                Intent i = new Intent(ViewAll.this, ViewAll.class);
                finish();
                overridePendingTransition(0, 0);
                startActivity(i);
                overridePendingTransition(0, 0);
            }
            else
            {
                Toast.makeText(this,"Error occured",Toast.LENGTH_LONG).show();
            }
        }
        else
            Toast.makeText(this, "Please select a resume first", Toast.LENGTH_SHORT).show();

    }
    public void btnViewClick(View view) {
        if(selectedIndex!=-1){
            Intent i=new Intent(this,ViewResume.class);
            i.putExtra("resu",resume);
            startActivity(i);
        }
        else
            Toast.makeText(this, "Please select a resume first", Toast.LENGTH_SHORT).show();

    }
}