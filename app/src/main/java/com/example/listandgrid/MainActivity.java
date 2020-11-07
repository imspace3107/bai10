package com.example.listandgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String ten[] ={
            "Giày Thể Thao ",
            "Giày Thể Thao ",
            "Giày Thể Thao ",
            "Giày Thể Thao ",
    };
    int hinh[] ={R.drawable.h1,R.drawable.h2,R.drawable.h3,R.drawable.h4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.gridView);

        GridviewAdapter gridviewAdapter = new GridviewAdapter(this,ten,hinh);
        gridView.setAdapter(gridviewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,ten[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}