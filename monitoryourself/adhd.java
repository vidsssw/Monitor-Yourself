package com.example.vidisha.monitoryourself;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class adhd extends AppCompatActivity {

    private TextView mdes;
    private ImageView mimage;
    private TextView mhead;
    private Button mstart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        mdes=findViewById(R.id.textView);
        mimage=findViewById(R.id.imageView);
        mhead=findViewById(R.id.textView2);
        mstart=findViewById(R.id.button);




        mstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(adhd.this, quizadhd.class));
            }
        });

    }



}
