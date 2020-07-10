package com.example.cvbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ViewResume extends AppCompatActivity {
    TextView eUni,eAge,eName,eName2,ePhone,eCGPA,ePosi,eExp,eMail,eDegree;
    Resume resume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_resume);
        Intent i=getIntent();
        resume=(Resume)i.getSerializableExtra("resu");
        eUni=findViewById(R.id.txtUni);
        eAge=findViewById(R.id.txtAge);
        eName=findViewById(R.id.tvName);
        eName2=findViewById(R.id.tvName2);
        ePhone=findViewById(R.id.tvPhone);
        eCGPA=findViewById(R.id.txtCGPA);
        ePosi=findViewById(R.id.tvPosition);
        eExp=findViewById(R.id.txtExp);
        eMail=findViewById(R.id.txtEmail);
        eDegree=findViewById(R.id.txtDegree);
        displayResumeData();
    }
    public void displayResumeData(){
        if(resume!=null){
            eAge.setText(""+resume.getAge());
            eName.setText(resume.getName());
            eName2.setText(resume.getName());
            eUni.setText(resume.getUni());
            ePhone.setText(resume.getPhone());
            ePosi.setText(resume.getPosi());
            eCGPA.setText(""+resume.getCgpa());
            eMail.setText(resume.getEmail());
            eDegree.setText(resume.getEmail());
            if(resume.isExperience()){
                eExp.setText("Experienced");
            }
            else if(!resume.isExperience()){
                eExp.setText("No Experience");
            }
        }
        else{
            Toast.makeText(this,"Resume not found",Toast.LENGTH_LONG).show();
        }
    }
}