package com.example.storeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private ArrayList<String> prod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.list);
        prod = new ArrayList<String>();
    }
    public void button(View view){
        Toast.makeText(this, "You have add to the cart", Toast.LENGTH_SHORT).show();



        EditText  p = (EditText) findViewById(R.id.editText);
        EditText  p2 = (EditText) findViewById(R.id.editText2);



        prod.add(p.getText().toString()+" = "+p2.getText().toString());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prod);
        listview.setAdapter(adapter);


    }
    public void button3(View view){
        Toast.makeText(this, "Thanks for your purchase", Toast.LENGTH_SHORT).show();

        EditText  p = (EditText) findViewById(R.id.editText);
        EditText  p2 = (EditText) findViewById(R.id.editText2);

        prod.clear();
        listview.setAdapter(null);

        p.setText("");
        p2.setText("");

    }
}
