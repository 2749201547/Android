package com.example.tong.exp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity extends AppCompatActivity {

    private String[] names=new String[]{"cat","dog","elephant","lion","monkey","tiger"};
    private int[] imageIds=new int[]{
            R.drawable.cat,
            R.drawable.dog,
            R.drawable.elephant,
            R.drawable.lion,
            R.drawable.monkey,
            R.drawable.tiger
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        List<Map<String,Object>> listItems=new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String,Object> listItem=new HashMap<String, Object>();
            listItem.put("Name",names[i]);
            listItem.put("Picture",imageIds[i]);
            listItems.add(listItem);
        }
//-------------------重点使用方法
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,
                listItems,
                R.layout.simple_item,
                new String[]{"Name","Picture"},
                new int[] {R.id.Name,R.id.Picture});
        ListView list=(ListView)findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast=Toast.makeText(ListViewActivity.this,names[position],Toast.LENGTH_LONG);
                toast.show();
            }
        } );
    }
}
