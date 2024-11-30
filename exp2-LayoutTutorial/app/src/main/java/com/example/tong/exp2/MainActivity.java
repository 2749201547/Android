package com.example.tong.exp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump1 (View view){
        //Do something in response to button
        Intent intent = new Intent(this, linearActivity.class);
        startActivity(intent);
    }

    public void jump2 (View view){
        //Do something in response to button
        Intent intent = new Intent(this, ConstraintActivity.class);
        startActivity(intent);
    }

    public void jump3 (View view){
        //Do something in response to button
        Intent intent = new Intent(this, TableActivity.class);
        startActivity(intent);
    }

}
