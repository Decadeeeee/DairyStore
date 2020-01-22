package com.example.dairystoresystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button startDButton,addCButton,renewCButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startDButton=findViewById(R.id.startDeliver);
        addCButton=findViewById(R.id.addCustomer);
        renewCButton=findViewById(R.id.renewCustomer);
        startDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,StartDeliver.class);
                startActivity(intent);
            }
        });
    }
}
