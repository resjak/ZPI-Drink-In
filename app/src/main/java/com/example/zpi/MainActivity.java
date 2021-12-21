package com.example.zpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static SQLiteDatabase database;

    TextView txView;
    Button btnDrinkChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txView = findViewById(R.id.txView);
        btnDrinkChoose = findViewById(R.id.btnDrinkChoose);

        database = openOrCreateDatabase("DRINKSDB",MODE_PRIVATE,null);


      Database.createTablesAndAddValues(database);
      //deleteDatabase("DRINKSDB");

    }





    public void drinkChoosePage(View view)
    {
        Intent myIntent = new Intent(view.getContext(), ExpertSystem.class);
        startActivity(myIntent);
    }

    public void exitApp(View view)
    {
        System.exit(1);
    }

    public void FavsPage(View view)
    {
        Intent myIntent = new Intent(view.getContext(), FavsDrinks.class);
        startActivity(myIntent);
    }

    public void ListPage(View view)
    {
        Intent myIntent = new Intent(view.getContext(), DrinksList.class);
        startActivity(myIntent);
    }


}