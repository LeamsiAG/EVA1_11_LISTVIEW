package com.example.eva1_11_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener  {
ListView LstVwDatos;
String[] aDatos = {
  "Iron man",
        "Capitan america",
        "Capitana marvel",
        "Dr. Strange",
        "Spiderman",
        "Pantera negra",
        "Wolverine",
        "Viuda negra",
        "Hawkeye",
        "Bruja escarlata",
        "Vision",
        "White Vision",
        "Tormenta",
        "Dr. Xavier",
        "Hulk",
        "Thor",
        "Wong",
        "AntMan"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LstVwDatos = findViewById(R.id.LstVwDatos);
        LstVwDatos.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, aDatos));

        LstVwDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,aDatos[position],Toast.LENGTH_SHORT).show();
    }
}