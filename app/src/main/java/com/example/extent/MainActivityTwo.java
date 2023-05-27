package com.example.extent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity {

    Button btn2;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtytwo_main);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callFirstActivity();
            }
        });
//        Bundle extras = getIntent().getExtras();
//        String value1 = extras.getString("Value1");
//        String value2 = extras.getString("Value2");
//        Toast.makeText(getApplicationContext(),"Values are:\n First value" + value1 + "\n Second Value: " + value2, Toast.LENGTH_LONG).show();
    }

    public void callFirstActivity(){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
