package com.example.soretras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class isims extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isims);

        Button isa1= findViewById(R.id.button);

        isa1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims_ac.class);
                startActivity(fac);
            }
        });
        Button isa2= findViewById(R.id.button2);

        isa2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims_ac.class);
                startActivity(fac);
            }
        });
        Button isa3= findViewById(R.id.button3);

        isa3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims_ac.class);
                startActivity(fac);
            }
        });
        Button isa4= findViewById(R.id.button4);

        isa4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims_ac.class);
                startActivity(fac);
            }
        });

    }


}