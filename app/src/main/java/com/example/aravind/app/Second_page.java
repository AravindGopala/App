package com.example.aravind.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Second_page extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        String[] myStringArray = new String[]{"First Item", "Second Item", "Third Item"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, myStringArray);
        listView = (ListView) findViewById(R.id.mylist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(mMessageClickedHandler);

    }


    private AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            if( position == 1) {
                Intent k = new Intent(getApplicationContext(), Info_Page.class);
                startActivity(k);
            }
        }
    };
}
