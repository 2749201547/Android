package com.example.tong.exp3;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout loginForm = (LinearLayout) getLayoutInflater().inflate(R.layout.login, null);

        Button bnt1 = (Button) findViewById(R.id.dialog);
        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setView(loginForm)
                        .setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //此处可执行登录处
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //取消登录，不做任何事情
                            }
                        })
                        .create().show();
            }
        });
    }

    public void jump1 (View view){
        //Do something in response to button
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }

    public void jump2 (View view){
        //Do something in response to button
        Intent intent = new Intent(this, MenuTestActivity.class);
        startActivity(intent);
    }

    public void jump3 (View view){
        //Do something in response to button
        Intent intent = new Intent(this, ActionModeActivity.class);
        startActivity(intent);
    }




}
