package com.android.debasrito.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class instructions extends AppCompatActivity {
    TextView e;
    String s;
    Button b2;
    Intent i,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        e=(TextView)findViewById(R.id.name);
        i=getIntent();
        b2=(Button)findViewById(R.id.start);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(e.getText()))
                {
                    e.setError("Name Required");
                }
                else {
                    s=e.getText().toString();
                    i2 = new Intent(instructions.this, test.class);
                    i2.putExtra("NAME", s);
                    startActivity(i2);
                    finish();
                }
            }
        });
    }
}
