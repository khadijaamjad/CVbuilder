package com.example.cvbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AddResume extends AppCompatActivity {
    int age;
    String name,phone,uni,posi,degree,email;
    float cgpa;
    boolean experience;
    EditText eUni,eAge,eName,ePhone,eCGPA,ePosi,eDegree,eMail;
    RadioGroup rgExp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_resume);

        eUni=findViewById(R.id.etUni);
        eAge=findViewById(R.id.etAge);
        eName=findViewById(R.id.etName);
        ePhone=findViewById(R.id.etPhone);
        eCGPA=findViewById(R.id.etgpa);
        ePosi=findViewById(R.id.etPosition);
        rgExp=findViewById(R.id.expOpt);
        eDegree=findViewById(R.id.etDegree);
        eMail=findViewById(R.id.etMail);
    }

    public void btnAddClicked(View view) {
        int m=rgExp.getCheckedRadioButtonId();
        if(m==R.id.rbNo){
            experience=false;
        }
        if(m==R.id.rbYes){
            experience=true;
        }
        uni=eUni.getText().toString();
        age=Integer.parseInt(eAge.getText().toString());
        name=eName.getText().toString();
        phone=ePhone.getText().toString();
        cgpa=Float.parseFloat(eCGPA.getText().toString());
        posi=ePosi.getText().toString();
        degree=eDegree.getText().toString();
        email=eMail.getText().toString();
        Resume resume=new Resume(age,name,phone,uni,posi,cgpa,experience,degree,email);
        boolean added=MainActivity.resumes.add(resume);
        if(added)
        {
            Toast.makeText(this,"Resume added",Toast.LENGTH_LONG).show();
            eUni.setText("");
            eAge.setText("");
            eName.setText("");
            eCGPA.setText("");
            ePhone.setText("");
            ePosi.setText("");
            eDegree.setText("");
            eMail.setText("");
            rgExp.clearCheck();
        }
        else
        {
            Toast.makeText(this,"Resume could not be added",Toast.LENGTH_LONG).show();
        }
    }
}