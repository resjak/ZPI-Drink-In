package com.example.zpi;

import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class Database {



    public static  void createTablesAndAddValues(SQLiteDatabase database) //Tworzenie tabel do bazy i wpisywanie wartości
            //pierwsze uruchomienie apki
    {//

        database.execSQL("CREATE TABLE IF NOT EXISTS Drinks(drink_name VARCHAR, recipe VARCHAR,ingredients VARCHAR);");

        Cursor cursor = database.rawQuery("SELECT * FROM Drinks",null);

        //sprawdzenie czy w tabeli są dane
        if(cursor.moveToFirst())
        {
            //w tabeli są dane, program nie wykonuje żadnych działań
        }
        else {
            Drinks.insertToDatabase(database);
            //w tabeli nie ma danych dodajemy je poprzez wywołanie metody z klasy Drinks
        }
        //To sprawdzenie jest potrzebne po to, żeby insert nie wykonywał się z każdym uruchomieniem (wszystko by się duplikowało)
        //np nazwy wyglądałyby tak: "Mojito Mojito Mojito Mojito" - apka uruchomiona 4 razy


     }


    public static String show(SQLiteDatabase database,String drinkName)
    {

        StringBuffer buffer = new StringBuffer();
        Cursor cursor = database.rawQuery("SELECT drink_name, recipe, ingredients from Drinks WHERE drink_name ="+ drinkName,null);


        while (cursor.moveToNext()) {

            String name = cursor.getString(0);
            String recipe = cursor.getString(1);
            String ingredients = cursor.getString(2);

            buffer.append(name +"\n"+recipe+"\n "+ingredients);

        }
        return buffer.toString();

    }

}
