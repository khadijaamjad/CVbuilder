package com.example.cvbuilder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ResumeArrayAdapter extends ArrayAdapter<Resume> {
    Context con;
    int res;
    ArrayList<Resume> resumes;
    LayoutInflater layoutInflater;
    public ResumeArrayAdapter(@NonNull Context context, int resource, @NonNull List<Resume> objects) {
        super(context, resource, objects);
        con=context;
        res=resource;
        resumes= (ArrayList<Resume>) objects;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView=layoutInflater.inflate(R.layout.list_item_layout,parent,false);
        TextView eName=(TextView)convertView.findViewById(R.id.txtName);
        TextView ePosition=(TextView)convertView.findViewById(R.id.txtID);
        Resume emp=resumes.get(position);
        eName.setText(emp.getName());
        ePosition.setText(emp.getPosi());
        return convertView;
    }
}
