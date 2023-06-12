package com.example.soretras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class isams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isams);
        Button isa1= findViewById(R.id.button13);

        isa1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims_ac.class);
                startActivity(fac);
            }
        });
        Button isa2= findViewById(R.id.button14);

        isa2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims_ac.class);
                startActivity(fac);
            }
        });
        Button isa3= findViewById(R.id.button15);

        isa3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims_ac.class);
                startActivity(fac);
            }
        });
        Button isa4= findViewById(R.id.button16);

        isa4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims_ac.class);
                startActivity(fac);
            }
        });
    }
}