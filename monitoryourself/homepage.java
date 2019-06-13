package com.example.vidisha.monitoryourself;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class homepage extends AppCompatActivity {

    private ScrollView mscroll;
    private ImageButton mb1;
    private ImageButton mb2;

    private ImageButton mb3;
    private ImageButton mb4;
    private ImageButton mb5;
    private TextView t1,t2,t3,t4,t5;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        mb1=(ImageButton)findViewById(R.id.button1);
        mb2=(ImageButton)findViewById(R.id.button2);
        mb3=(ImageButton)findViewById(R.id.button3);
        mb4=(ImageButton)findViewById(R.id.button4);
        mb5=(ImageButton)findViewById(R.id.button5);
        t1=(TextView)findViewById(R.id.textView11) ;
        t2=(TextView)findViewById(R.id.textView12) ;
        t3=(TextView)findViewById(R.id.textView13) ;
        t4=(TextView)findViewById(R.id.textView14) ;
        t5=(TextView)findViewById(R.id.textView15) ;











        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,MainActivity.class));
            }
        });

        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,borderline.class));
            }
        });

        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,anxiety.class));
            }
        });

        mb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,adhd.class));
            }
        });

        mb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(homepage.this,depression.class));
            }
        });





    }
}
