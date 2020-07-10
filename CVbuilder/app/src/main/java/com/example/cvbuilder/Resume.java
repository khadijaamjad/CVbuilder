package com.example.cvbuilder;

import java.io.Serializable;

public class Resume implements Serializable {
    int age;
    String name,phone,uni,posi,degree,email;
    float cgpa;
    boolean experience;

    public Resume(int age, String name, String phone, String uni, String posi, float cgpa, boolean experience,String degree,String email) {
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.uni = uni;
        this.posi = posi;
        this.cgpa = cgpa;
        this.experience = experience;
        this.degree=degree;
        this.email=email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public String getUni() {
        return uni;
    }


    public String getPosi() {
        return posi;
    }

    public float getCgpa() {
        return cgpa;
    }

    public boolean isExperience() {
        return experience;
    }


    public String getDegree() {
        return degree;
    }

    public String getEmail() {
        return email;
    }
}
