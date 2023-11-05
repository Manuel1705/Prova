package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick (View view){

        EditText editName = findViewById(R.id.editName);


        TextView txtLabel = findViewById(R.id.txtLabel);
        txtLabel.setText("Welcome to Bottom " + editName.getText().toString() );
    }
}