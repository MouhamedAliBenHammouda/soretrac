package com.example.soretras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ism= findViewById(R.id.b1);

        ism.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isims.class);
                startActivity(fac);
            }
        });

        Button fs = findViewById(R.id.b2);
        fs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),fsegs.class);
                startActivity(fac);
            }
        });
        Button isa= findViewById(R.id.b3);

        isa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),isams.class);
                startActivity(fac);
            }
        });
        Button isb= findViewById(R.id.b4);

        isb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fac=new Intent(getApplicationContext(),ISBS.class);
                startActivity(fac);
            }
        });

        ImageView imfc = findViewById(R.id.imageView3);

        imfc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" ));
                startActivity(intent);
            }
        });
        ImageView imst = findViewById(R.id.imageView5);

        imst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/" ));
                startActivity(intent);
            }
        });
        ImageView imwt = findViewById(R.id.imageView6);

        imwt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.whatsapp.com/" ));
                startActivity(intent);
            }
        });



    }
}