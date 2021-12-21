package com.example.zpi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FavsDrinks extends AppCompatActivity {

    Button btnBack,btnShowRecipe,btnShowFavs;
    TextView txDrink;
    SQLiteDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favs_drinks);
        btnBack = findViewById(R.id.btnBackFavs);
        btnShowRecipe = findViewById(R.id.btnBackFavs);
        btnShowFavs = findViewById(R.id.btnShowFavs);
        txDrink = findViewById(R.id.txtDrink);

        database = openOrCreateDatabase("DRINKSDB",MODE_PRIVATE,null);

        shFavs();
       // showAlert();

    }



    public void ShowRecipe(View view)
    {
        showAlert();
    }

    public void ShowFavs(View view)
    {
        shFavs();
    }


    private void showAlert(){
        final EditText txtUrl = new EditText(this);
        new AlertDialog.Builder(this)
                .setTitle("Sprawdź przepis")
                .setMessage("Wpisz nazwę ulubionego drinka, żeby sprawdzić przepis")
                .setView(txtUrl)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        String drinkName = "'"+txtUrl.getText().toString()+"'";

                       // Cursor cursor = database.rawQuery("SELECT drink_name FROM Favourites WHERE drink_name=" + drinkName, null);
                        txDrink.setText(Database.show(database,drinkName));
                        drinkName="";

                    }
                })
                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                })
                .show();
    }



    public void btnBack(View view)
    {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivity(myIntent);
    }

    private void shFavs()
    {
        StringBuffer buffer = new StringBuffer();
        Cursor cursor = database.rawQuery("SELECT * from Favourites",null);

        while (cursor.moveToNext()) {

            String name = cursor.getString(0);
            buffer.append(name+"\n");

        }

        txDrink.setText(buffer);
    }
}