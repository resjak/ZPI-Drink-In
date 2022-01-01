package com.example.zpi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DrinksList extends AppCompatActivity {

    Button btnBack,btnListShow;
    TextView txList;
    private static SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_list);


        database = openOrCreateDatabase("DRINKSDB",MODE_PRIVATE,null);
        btnBack = findViewById(R.id.btnListBack);
        btnListShow = findViewById(R.id.btnListShow);
        txList = findViewById(R.id.txDrinksList);


        txList.setText(showAll(database));
        txList.setMovementMethod(new ScrollingMovementMethod());



    }



    private String showAll(SQLiteDatabase database)
    {
        StringBuffer buffer = new StringBuffer();
        Cursor cursor = database.rawQuery("SELECT drink_name from Drinks",null);


        while (cursor.moveToNext()) {

            String name = cursor.getString(0);
            buffer.append(name +"\n"+"\n");

        }
        return buffer.toString();
    }


    public void showRecipe(View view)
    {
        final EditText txtUrl = new EditText(this);
        new AlertDialog.Builder(this)
                .setTitle("Sprawdź przepis")
                .setMessage("Wpisz nazwę drinka, żeby sprawdzić przepis")
                .setView(txtUrl)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String drinkName = "'"+txtUrl.getText().toString()+"'";

                        txList.setText(Database.show(database,drinkName));
                    }
                })
                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                })
                .show();
    }


    public void showList(View view)
    {
        txList.setText(showAll(database));
    }

    public void btnBack(View view)
    {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivity(myIntent);
    }
}