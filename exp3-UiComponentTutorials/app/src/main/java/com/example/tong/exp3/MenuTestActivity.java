package com.example.tong.exp3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MenuTestActivity extends AppCompatActivity {

    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_test);

        edit = (EditText) findViewById(R.id.edit_txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = new MenuInflater(this);
        inflator.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.size_small:
                edit.setTextSize(10 * 2);
                break;
            case R.id.size_medium:
                edit.setTextSize(16 * 2);
                break;
            case R.id.size_large:
                edit.setTextSize(20 * 2);
                break;
            case R.id.color_black:
                edit.setTextColor(Color.BLACK);
                break;
            case R.id.color_red:
                edit.setTextColor(Color.RED);
                break;
            case R.id.plain_item:
                Toast toast = Toast.makeText(MenuTestActivity.this, "你点击了普通菜单项", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
