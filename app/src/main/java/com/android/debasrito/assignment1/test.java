package com.android.debasrito.assignment1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class test extends AppCompatActivity {
    Intent i;
    RadioGroup rg1,rg2;
    RadioButton q7a,q8a;
    int score,flag1,flag2,flag3,flag4,flag5,flag6,flag7,flag8,flagtruea,flagfalsea,flagtrueb,flagfalseb,check;
    Switch q3a,q4a;
    CheckBox q1a,q1b,q1c,q1d,q2a,q2b,q2c,q2d;
    Spinner q5a,q6a;
    String name;
    Button b;
    Boolean clicked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        i=getIntent();
        name=i.getStringExtra("NAME");
        q1a= (CheckBox) findViewById(R.id.q1a);
        q1b= (CheckBox) findViewById(R.id.q1b);
        q1c= (CheckBox) findViewById(R.id.q1c);
        q1d= (CheckBox) findViewById(R.id.q1d);
        /*For Question 1*/
        q1a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    flagtruea++;
                else
                    flagtruea--;
            }
        });
        q1d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    flagtruea++;
                else
                    flagtruea--;
            }});
        q1c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    flagfalsea++;
                else
                    flagfalsea--;
            }});
        q1b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    flagfalsea++;
                else
                    flagfalsea--;
            }
        });
        /*End of question 1*/
        q2a= (CheckBox) findViewById(R.id.q2a);
        q2b= (CheckBox) findViewById(R.id.q2b);
        q2c= (CheckBox) findViewById(R.id.q2c);
        q2d= (CheckBox) findViewById(R.id.q2d);
        /*For Question 2*/
        q2a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    flagtrueb++;
                else
                    flagtrueb--;
            }
        });
        q2b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    flagtrueb++;
                else
                    flagtrueb--;
            }});
        q2c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    flagtrueb++;
                else
                    flagtrueb--;
            }});
        q2d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    flagfalseb++;
                else
                    flagfalseb--;
            }
        });
        /*End of question 2*/
        q3a=(Switch)findViewById(R.id.q3a);
        q4a=(Switch)findViewById(R.id.q4a);
        /*Question 3*/
        q3a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    flag3++;
                else
                    flag3--;
            }
        });
        /*End of question 3*/
        /*Question 4*/
        q4a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    flag4++;
                else
                    flag4--;
            }
        });
        /*End of question 4*/
        q5a=(Spinner)findViewById(R.id.q5a);
        q6a=(Spinner)findViewById(R.id.q6a);
        List<String> list=new ArrayList<>();
        list.add(".exe");list.add(".apk");list.add(".java");list.add(".jar");list.add(".html");list.add(".xml");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q5a.setAdapter(arrayAdapter);
        List<String> list1=new ArrayList<>();
        list1.add(".html");list1.add(".java");list1.add(".c");list1.add(".xml");list1.add(".jar");list1.add(".css");
        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        q6a.setAdapter(arrayAdapter1);
        /*Question 5*/
        q5a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==1)
                    flag5=1;
                else
                    flag5=0;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        /*End of question 5*/
        /*Question 6*/
        q6a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==5)
                    flag6=1;
                else
                    flag6=0;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        /*End of question 6*/
        rg1=(RadioGroup)findViewById(R.id.rg1);
        rg2=(RadioGroup)findViewById(R.id.rg2);
        q7a=(RadioButton)findViewById(R.id.q7a);
        q8a=(RadioButton)findViewById(R.id.q8a);
        b=(Button)findViewById(R.id.submit);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(test.this,result.class);
                /*Subpart of question 1*/
                if(flagfalsea==0&&flagtruea==2)
                    flag1=1;
                /*Subpart ends*/
                /*Subpart of question 2*/
                if(flagfalseb==0&&flagtrueb==3)
                    flag2=1;
                /*Subpart ends*/
                /*Question 7*/
                int rba_id=rg1.getCheckedRadioButtonId();
                if(q7a.isChecked())
                    flag7++;
                /*End of question 7*/
                /*Question 8*/
                int rbb_id=rg2.getCheckedRadioButtonId();
                if(q8a.isChecked())
                    flag8++;
                /*End of question 8*/
                score=flag1+flag2+flag3+flag4+flag5+flag6+flag7+flag8;
                clicked=true;
                i.putExtra("NAME",name);
                i.putExtra("SCORE",score);
                startActivity(i);
                finish();
            }
        });
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                if(clicked!=true)
                    b.performClick();
            }

        }, 30000L);
    }
}
