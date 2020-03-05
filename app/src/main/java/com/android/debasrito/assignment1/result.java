package com.android.debasrito.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    Intent i;
    TextView name;
    TextView score;
    Button b;
    int res;
    String res2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        i=getIntent();
        res=i.getIntExtra("SCORE",0);
        res2=i.getStringExtra("NAME");
        name=(TextView)findViewById(R.id.name);
        score=(TextView)findViewById(R.id.score);
        b=(Button)findViewById(R.id.exit);
        name.setText("NAME:"+res2);
        score.setText("SCORE:"+res);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
