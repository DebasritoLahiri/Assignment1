package com.android.debasrito.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class start extends AppCompatActivity {
    Button b;
    TextView t;
    Intent i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        i1=getIntent();
        t=(TextView)findViewById(R.id.welcome);
        b=(Button)findViewById(R.id.begins);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(start.this,instructions.class);
                startActivity(i);
                finish();
            }

        });
    }
}
