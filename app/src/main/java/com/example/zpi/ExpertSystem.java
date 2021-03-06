package com.example.zpi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.ActionBar;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class ExpertSystem extends AppCompatActivity {

    SQLiteDatabase database;
    TextView txQuestion;
    Button btnAnsw1,btnAnsw2,btnAnsw3,btnAnsw4,
            btnAnsw5,btnAnsw6,btnAnsw7,btnAnsw8,btnBack,btnFavs;
    boolean b1Clicked=false, b2Clicked=false,b3Clicked=false,b4Clicked=false,
            b5Clicked=false,b6Clicked=false,b7Clicked=false,b8Clicked=false,btnBackClicked=false,btnFavsClicked=false;
    String question, whichDrink="none";

    //Zmienne kontrolne - dla if'ów
    int A=0,B=0,C=0,D=0,zCzym=0,Smak=0,KSW=0,GCP=0,WTR=0,BKBW=0,
            Barwa=0,Klimat=0,Kolor=0,SmakAdd=0,Ziarenkowe=0,Likier=0,
                Ozdoba=0,Napoj=0,Sok=0,Gaz=0,GSW=0,DOM=0, Inne=0, AT=0,AS=0,RGW=0,
                    Gatunek=0, Jagodowe=0, Pestkowe=0,Cytrus=0, SokPros=0, Orzech=0, Skladnik=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_expert_system);

        txQuestion = findViewById(R.id.txtQuestion);
        btnAnsw1 = findViewById(R.id.btnAnswer1);
        btnAnsw2 = findViewById(R.id.btnAnswer2);
        btnAnsw3 = findViewById(R.id.btnAnswer3);
        btnAnsw4 = findViewById(R.id.btnAnswer4);
        btnAnsw5 = findViewById(R.id.btnAnswer5);
        btnAnsw6 = findViewById(R.id.btnAnswer6);
        btnAnsw7 = findViewById(R.id.btnAnswer7);
        btnAnsw8 = findViewById(R.id.btnAnswer8);
        btnBack = findViewById(R.id.btnBack);
        btnFavs = findViewById(R.id.btnFavs);

        database = openOrCreateDatabase("DRINKSDB",MODE_PRIVATE,null);

       // drinkSelection();

        showQuestions();
        btnBack.setVisibility(View.VISIBLE);
        btnFavs.setVisibility(View.INVISIBLE);

}


public void buttonsCheck() //ustawianie zmiennych kontrolnych adekwatnie do wciśniętych przycisków
{
    if(question=="Drink z alkoholem czy bez?" && b1Clicked==true)
    {
        A=1; //z alkoholem
        b1Clicked=false;
        goBack();
        showQuestions();
        drinkSelection();

    }

    if(question=="Drink z alkoholem czy bez?" && b2Clicked==true)
    {
        A=2; //bezalkoholowy
        b2Clicked=false;
        goBack();
        showQuestions();
        drinkSelection();

    }

    if(question=="Drink ciepły czy zimny?" && b1Clicked==true)
    {
        B=1; //ciepły
        b1Clicked=false;
        goBack();
        showQuestions();
        drinkSelection();

    }


    if(question=="Drink ciepły czy zimny?" && b2Clicked==true)
    {
        B=2; //zimny
        b2Clicked=false;
        showQuestions();
        drinkSelection();
        goBack();
    }

    if(question=="Jaki ma być główny składnik drinka?" && b1Clicked==true)
    {
        zCzym=1; //wódka
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki ma być główny składnik drinka?" && b2Clicked==true)
    {
        zCzym=2; //whisky
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki ma być główny składnik drinka?" && b3Clicked==true)
    {
        zCzym=3; //aperol
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki ma być główny składnik drinka?" && b4Clicked==true)
    {
        zCzym=4; //wino
        b4Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki ma być główny składnik drinka?" && b5Clicked==true)
    {
        zCzym=5; //prosecco
        b5Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki ma być główny składnik drinka?" && b6Clicked==true)
    {
        zCzym=6; //szampan
        b6Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki ma być główny składnik drinka?" && b7Clicked==true)
    {
        zCzym=7; //likier
        b7Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki ma być główny składnik drinka?" && b8Clicked==true)
    {
        zCzym=8; //piwo
        b8Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Wolisz drinka z wódką czystą czy smakową?" && b1Clicked==true)
    {
        Smak=1; //wódka smakowa
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Wolisz drinka z wódką czystą czy smakową?" && b2Clicked==true)
    {
        Smak=2; //wódka czysta
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Preferujesz smak słodki, kwaśny czy wytrawny?" && b1Clicked==true)
    {
        KSW=1; //kwaśny
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Preferujesz smak słodki, kwaśny czy wytrawny?" && b2Clicked==true)
    {
        KSW=2; //słodki
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Preferujesz smak słodki, kwaśny czy wytrawny?" && b3Clicked==true)
    {
        KSW=3; //wytrawny
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Drink ma być kolorowy czy jednolity?" && b1Clicked==true)
    {
        Barwa=1; //kolorowy
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Drink ma być kolorowy czy jednolity?" && b2Clicked==true)
    {
        Barwa=2; //jednolity
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki klimat chcesz poczuć?" && b1Clicked==true)
    {
        Klimat=1; //plaża
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki klimat chcesz poczuć?" && b2Clicked==true)
    {
        Klimat=2; //Rosja
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki klimat chcesz poczuć?" && b3Clicked==true)
    {
        Klimat=3; //rajska zatoka
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Który kolor wolisz?" && b1Clicked==true)
    {
        Kolor=2; //niebieski
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Który kolor wolisz?" && b2Clicked==true)
    {
        Kolor=1; //zielony
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Który owoc ziarenkowy wolisz?" && b1Clicked==true)
    {
        //pigwa
        Ziarenkowe=1;
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Który owoc ziarenkowy wolisz?" && b2Clicked==true)
    {
        //jabłko
        Ziarenkowe=2;
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question=="Który owoc ziarenkowy wolisz?" && b3Clicked==true)
    {
        //gruszka
        Ziarenkowe=3;
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaką ozdobę wolisz?" && b1Clicked==true)
    {
        //oliwka
        Ozdoba=1;
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaką ozdobę wolisz?" && b2Clicked==true)
    {
        //cebulka koktajlowa
        Ozdoba=2;
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaką ozdobę wolisz?" && b3Clicked==true)
    {
        //limeta
        Ozdoba=3;
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaką ozdobę wolisz?" && b4Clicked==true)
    {
        //Inne
        Ozdoba=4;
        b4Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Wolisz sok czy napój gazowany?" && b1Clicked)
    {
        Napoj=1; //sok
        b1Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Wolisz sok czy napój gazowany?" && b2Clicked)
    {
        Napoj=2; //napój gazowany
        b2Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Wolisz sok jabłkowy czy pomarańczowy?" && b1Clicked)
    {
        Sok=1; //jabłkowy
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Wolisz sok jabłkowy czy pomarańczowy?" && b2Clicked)
    {
        Sok=2; //pomarańczowy
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question=="Cola czy Sprite?" && b1Clicked==true)
    {
        Gaz=2; //Cola
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Cola czy Sprite?" && b2Clicked==true)
    {
        Gaz=1; //Sprite
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Wolisz sok z cytryny czy Prosecco?" && b1Clicked==true)
    {
        SokPros=1; //sok z cytryny
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Wolisz sok z cytryny czy Prosecco?" && b2Clicked==true)
    {
        SokPros=2; //Prosecco
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Które wino wolisz?" && b1Clicked==true)
    {
        Gatunek=1; //wino czerwone
        b1Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Które wino wolisz?" && b2Clicked==true)
    {
        Gatunek=2; //wino różowe
        b2Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Które wino wolisz?" && b3Clicked==true)
    {
        Gatunek=3; //wino białe
        b3Clicked=false;
        showQuestions();
        drinkSelection();

    }


    if(question=="Z dodatkiem ginu, Sprite'a czy wina?" && b1Clicked==true)
    {
        GSW=1; //Gin
        b1Clicked=false;
        showQuestions();
        drinkSelection();

    }


    if(question=="Z dodatkiem ginu, Sprite'a czy wina?" && b2Clicked==true)
    {
        GSW=2; //Sprite
        b2Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Z dodatkiem ginu, Sprite'a czy wina?" && b3Clicked==true)
    {
        GSW=3; //Wino
        b3Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Smak którego dodatku ma dominować?" && b1Clicked==true)
    {
        DOM=1; //Sok
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Smak którego dodatku ma dominować?" && b2Clicked==true)
    {
        DOM=2; //Owoc
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Smak którego dodatku ma dominować?" && b3Clicked==true)
    {
        DOM=3; //Inny olkohol
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki likier wolisz?" && b1Clicked==true)
    {
        Likier=1; //jajeczny
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki likier wolisz?" && b2Clicked==true)
    {
        Likier=2; //kawowy
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki likier wolisz?" && b3Clicked==true)
    {
        Likier=3; //owocowy
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Wolisz arbuza czy truskawkę?" && b1Clicked==true)
    {
        AT=1; //truskawka
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Wolisz arbuza czy truskawkę?" && b2Clicked==true)
    {
        AT=2; //arbuz
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Na bazie kawy, herbaty, piwa czy wina?" && b1Clicked==true)
    {
        C=1; //kawa
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Na bazie kawy, herbaty, piwa czy wina?" && b2Clicked==true)
    {
        C=2; //herbata
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question=="Na bazie kawy, herbaty, piwa czy wina?" && b3Clicked==true)
    {
        C=3; //piwo
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question=="Na bazie kawy, herbaty, piwa czy wina?" && b4Clicked==true)
    {
        C=4; //wino
        b4Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Z dodatkiem wódki, whisky czy ginu?" && b1Clicked==true)
    {
        D=1; //wódka
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Z dodatkiem wódki, whisky czy ginu?" && b2Clicked==true)
    {
        D=2; //whisky
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Z dodatkiem wódki, whisky czy ginu?" && b3Clicked==true)
    {
        D=3; //gin
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Smak cytrusów, orzechów czy innych owoców?" && b1Clicked==true)
    {
        SmakAdd=1; //cytrusy
        b1Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Smak cytrusów, orzechów czy innych owoców?" && b2Clicked==true)
    {
        SmakAdd=2; //orzech
        b2Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Smak cytrusów, orzechów czy innych owoców?" && b3Clicked==true)
    {
        SmakAdd=3; //inny owoc
        b3Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Jaki cytrus lubisz najbardziej?" && b1Clicked==true)
    {
        Cytrus=1; //grejpfrut
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki cytrus lubisz najbardziej?" && b2Clicked==true)
    {
        Cytrus=2; //limonka
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question=="Jaki cytrus lubisz najbardziej?" && b3Clicked==true)
    {
        Cytrus=3; //cytryna
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jaki cytrus lubisz najbardziej?" && b4Clicked==true)
    {
        Cytrus=4; //pomarańcza
        b4Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jakie orzechy wolisz?" && b1Clicked==true)
    {
        Orzech=1; //laskowy
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Jakie orzechy wolisz?" && b2Clicked==true)
    {
        Orzech=2; //włoski
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if (question == "Jakie owoce lubisz?" && b1Clicked == true) {
            Inne = 1;//pestkowe
            b1Clicked = false;
            showQuestions();
            drinkSelection();

    }


    if(question=="Jakie owoce lubisz?" && b2Clicked==true)
    {
        Inne=2;//jagodowe
        b2Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question=="Jakie owoce lubisz?" && b3Clicked==true)
    {
        Inne=3;//ziarenkowe
        b3Clicked=false;
        showQuestions();
        drinkSelection();

    }



    if(question=="Który owoc Ci odpowiada?" && b1Clicked==true)
    {
        Pestkowe=1; //śliwka
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Który owoc Ci odpowiada?" && b2Clicked==true)
    {
        Pestkowe=2; //wiśnia
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question=="Który owoc Ci odpowiada?" && b3Clicked==true)
    {
        Pestkowe=3; //brzoskwinia
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który z owoców wolisz?" && b1Clicked==true)
    {
        Jagodowe=1; //malina
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który z owoców wolisz?" && b2Clicked==true)
    {
        Jagodowe=2; //żurawina xD
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który z owoców wolisz?" && b3Clicked==true)
    {
        Jagodowe=3; //porzeczka
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który z wymienionych składników lubisz najbardziej?" && b1Clicked==true)
    {
        Skladnik=1; //miód
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który z wymienionych składników lubisz najbardziej?" && b2Clicked==true)
    {
        Skladnik=2; //wiśnia
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który z wymienionych składników lubisz najbardziej?" && b3Clicked==true)
    {
        Skladnik=3; //limonka
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki drink wolisz?" && b1Clicked==true)
    {
        B=1; //orzeźwiający
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki drink wolisz?" && b2Clicked==true)
    {
        B=2; //słodki
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki drink wolisz?" && b3Clicked==true)
    {
        B=3; //owocowy
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki drink wolisz?" && b4Clicked==true)
    {
        B=4; //warzywny
        b4Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Czy drink ma być egzotyczny?" && b1Clicked==true)
    {
        C=7; //Tak
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Czy drink ma być egzotyczny?" && b2Clicked==true)
    {
        C=8; //Nie
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Arbuz czy banan?" && b1Clicked==true)
    {
        C=9; //arbuz
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Arbuz czy banan?" && b2Clicked==true)
    {
        C=10; //banan
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Co wolisz bardziej?" && b1Clicked==true)
    {
        C=11; //pomidor
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Co wolisz bardziej?" && b2Clicked==true)
    {
        C=12; //burak
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który cytrus Ci odpowiada?" && b1Clicked==true)
    {
        C=4; //pomarańcza
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który cytrus Ci odpowiada?" && b2Clicked==true)
    {
        C=50; //limonka
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Który cytrus Ci odpowiada?" && b3Clicked==true)
    {
        C=6; //cytryna
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki dodatek wolisz?" && b1Clicked==true)
    {
        AS=1; //sok
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki dodatek wolisz?" && b2Clicked==true)
    {
        AS=2; //alkohol
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki smak soku wolisz?" && b1Clicked==true)
    {
        GCP=1; //pomidor
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki smak soku wolisz?" && b2Clicked==true)
    {
        GCP=2; //czarna porzeczka
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki smak soku wolisz?" && b3Clicked==true)
    {
        GCP=3; //grejpfrut
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question == "Co preferujesz?" && b1Clicked==true)
    {
        WTR=1;//wódka
        b1Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question == "Co preferujesz?" && b2Clicked==true)
    {
        WTR=2;//tequilla
        b2Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question == "Co preferujesz?" && b3Clicked==true)
    {
        WTR=3;//rum
        b3Clicked=false;
        showQuestions();
        drinkSelection();

    }

    if(question == "Jaki smak likieru owocowego wolisz?" && b1Clicked==true)
    {
        BKBW=1; //Brzoskwinia
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question == "Jaki smak likieru owocowego wolisz?" && b2Clicked==true)
    {
        BKBW=2; //kokos
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki smak likieru owocowego wolisz?" && b3Clicked==true)
    {
        BKBW=3; //banan
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki smak likieru owocowego wolisz?" && b4Clicked==true)
    {
        BKBW=4; //wiśnia
        b4Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki alkohol ma być dodatkiem dominującym?" && b1Clicked==true)
    {
        RGW=1; //rum
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki alkohol ma być dodatkiem dominującym?" && b2Clicked==true)
    {
        RGW=2; //gin
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question == "Jaki alkohol ma być dodatkiem dominującym?" && b3Clicked==true)
    {
        RGW=3; //wódka
        b3Clicked=false;
        showQuestions();
        drinkSelection();
    }





}


public void b1Click(View view)
{
    b1Clicked = true;
    buttonsCheck();
}

public void b2Click(View view)
{
    b2Clicked = true;
    buttonsCheck();
}

public void b3Click(View view)
{
    b3Clicked = true;
    buttonsCheck();
}


public void b4Click(View view)
{
    b4Clicked = true;
    buttonsCheck();
}

public void b5Click(View view)
{
    b5Clicked = true;
    buttonsCheck();
}

public void b6Click(View view)
{
    b6Clicked = true;
    buttonsCheck();
}


public void b7Click(View view)
{
    b7Clicked = true;
    buttonsCheck();
}


public  void b8Click(View view)
{
    b8Clicked = true;
    buttonsCheck();
}

public void bBackClicked(View view)
{
    btnBackClicked = true;
    goBack();
}

public  void bFavsClicked(View view)
{
    if(whichDrink!="none")
    {
        checkAndAddFavourites(whichDrink);
        checkFavourites(whichDrink);
    }
}

public void checkFavourites(String drinkName)
{

        Cursor cursor = database.rawQuery("SELECT * FROM Favourites WHERE drink_name=" + drinkName, null);

        if (cursor.moveToFirst()) {
            btnFavs.setVisibility(View.INVISIBLE);
        } else {
            btnFavs.setVisibility(View.VISIBLE);
        }
}


public void checkAndAddFavourites(String drinkName)
    {

        Cursor cursor = database.rawQuery("SELECT * FROM Favourites WHERE drink_name=" + drinkName, null);

        if (cursor.moveToFirst()) {
            btnFavs.setVisibility(View.INVISIBLE);
        } else {
            btnFavs.setVisibility(View.VISIBLE);

            database.execSQL("INSERT INTO  Favourites  Values ("+drinkName+")");
        }
    }


public void hideButtons()
{
    btnAnsw1.setVisibility(View.INVISIBLE);
    btnAnsw2.setVisibility(View.INVISIBLE);
    btnAnsw3.setVisibility(View.INVISIBLE);
    btnAnsw4.setVisibility(View.INVISIBLE);
    btnAnsw5.setVisibility(View.INVISIBLE);
    btnAnsw6.setVisibility(View.INVISIBLE);
    btnAnsw7.setVisibility(View.INVISIBLE);
    btnAnsw8.setVisibility(View.INVISIBLE);
}




    public void drinkSelection() //ostateczne wyniki
    {

        if (A==1 & B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==1 && Klimat==2)
        {
            //WHITE RUSSIAN
            whichDrink="'White Russian'";
            checkFavourites("'White Russian'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'White Russian'"));
            btnBack.setVisibility(View.INVISIBLE);

        }


        else if (A==1 && B==2 && Smak==2 && KSW==2 && Barwa==1 && Klimat==3)
        {
            //Paradise Bay
            whichDrink="'Paradise Bay'";
            checkFavourites("'Paradise Bay'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Paradise Bay'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==2 && Kolor==1)
        {
            //Pijany Kaktus
            whichDrink="'Pijany Kaktus'";
            checkFavourites("'Pijany Kaktus'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Pijany Kaktus'"));
            btnBack.setVisibility(View.INVISIBLE);
        }



        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==2 && Kolor==2)
        {
            //Blue Lagoon
            whichDrink="'Blue Lagoon'";
            checkFavourites("'Blue Lagoon'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Blue Lagoon'"));
            btnBack.setVisibility(View.INVISIBLE);
        }



        else  if (A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==3 && Ziarenkowe==2)
        {
            //Absolute Spiced Apple Sour
            whichDrink="'Absolut Spiced Apple Sour'";
            checkFavourites("'Absolut Spiced Apple Sour'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Absolut Spiced Apple sour'"));
            btnBack.setVisibility(View.INVISIBLE);
        }




        else if (A==1  && B==2 &&  zCzym==1 && Smak==1 && SmakAdd==3 && Inne==3 && Ziarenkowe==3)
        {
            //Absolute pears
            whichDrink="'Absolut Pears Lemonade'";
            checkFavourites("'Absolut Pears Lemonade'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Absolut Pears Lemonade'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==3 && Ozdoba==1)
        {
            //Vodkatini
            whichDrink="'Vodkatini'";
            checkFavourites("'Vodkatini'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Vodkatini'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==3 && Ozdoba==2)
        {
            //Wodka Gibson
            whichDrink="'Wódka Gibson'";
            checkFavourites("'Wódka Gibson'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Wódka Gibson'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==3 && Ozdoba==3)
        {
            //Trip
            whichDrink="'Trip'";
            checkFavourites("'Trip'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Trip'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && Smak==2 && KSW==3 && Ozdoba==4)
        {
            //North Pole
            whichDrink="'North Pole'";
            checkFavourites("'North Pole'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'North Pole'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if (A==1 && B==2 && zCzym==2 && Napoj==1 && Sok==1)
        {
            //Ballantines Old Twist
            whichDrink="'Ballantines Old Twist'";
            checkFavourites("'Ballantines Old Twist'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Ballantines Old Twist'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 &&  zCzym==2 && Napoj==1 && Sok==2)
        {
            //Mitherning Bastard
            whichDrink="'Mithering Bastard'";
            checkFavourites("'Mithering Bastard'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Mitherning Bastard'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if (A==1 && B==2 && zCzym==2 && Napoj==2 && Gaz==1)
        {
            //Jameson Sprite and Lime
            whichDrink="'Jameson Sprite and Lime'";
            checkFavourites("'Jameson Sprite and Lime'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Jameson Sprite and lime'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && zCzym==2 && Napoj==2 && Gaz==2)
        {
            //Whiskey & Cola Drink
            whichDrink="'Whisky and Cola drink'";
            checkFavourites("'Whisky and Cola drink'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Whisky and Cola drink'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if (A==1 && B==2 && zCzym==5 && GSW==1)
        {
            //French 75
            whichDrink="'French 75'";
            checkFavourites("'French 75'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'French 75'"));
            btnBack.setVisibility(View.INVISIBLE);

        }


        else  if (A==1  && B==2 && zCzym==5 && GSW==2)
        {
            //Prosecco & Sprite
            whichDrink="'Prosecco & Sprite'";
            checkFavourites("'Prosecco & Sprite'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Prosecco & Sprite'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if (A==1  && B==2 && zCzym==5 && GSW==3)
        {
            //Prosecco z Martini Fierro
            whichDrink="'Prosecco z Martini Fierro'";
            checkFavourites("'Prosecco z Martini Fierro'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Prosecco z Martini Fierro'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if (A==1 && B==2 && zCzym==6 && DOM==1)
        {
            //Drink z szampanem i sokiem
            whichDrink="'Drink z szampanem i sokiem'";
            checkFavourites("'Drink z szampanem i sokiem'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Drink z szampanem i sokiem'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && zCzym==6 && DOM==2 && AT==1)
        {
            //Szampan z Truskawkami
            whichDrink="'Szampan z truskawkami'";
            checkFavourites("'Szampan z truskawkami'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z truskawkami'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && zCzym==6 && DOM==2 && AT==2)
        {
            //Szampan z arbuzem
            whichDrink="'Szampan z arbuzem'";
            checkFavourites("'Szampan z arbuzem'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z arbuzem'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && zCzym==3 && SokPros==1)
        {
            //Cotogna's Aperol Fizz
            whichDrink="'Cotogna`s Aperol Fizz'";
            checkFavourites("'Cotogna`s Aperol Fizz'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cotogna`s Aperol Fizz'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else  if (A==1 && B==2 && zCzym==3 && SokPros==2)
        {
            //Aperol Spritz
            whichDrink="'Aperol Spritz'";
            checkFavourites("'Aperol Spritz'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Aperol Spritz'"));
            btnBack.setVisibility(View.INVISIBLE);
        }



        else if (A==1 && B==2 && zCzym==4 && Gatunek==1)
        {
            //Calimacho
            whichDrink="'Calimacho'";
            checkFavourites("'Calimacho'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Calimacho'"));
            btnBack.setVisibility(View.INVISIBLE);

        }


        else if (A==1 && B==2 && zCzym==4 && Gatunek==2)
        {
            //Royal Mojito
            whichDrink="'Royal Mojito'";
            checkFavourites("'Royal Mojito'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Royal Mojito'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if (A==1 && B==2 && zCzym==4 && Gatunek==3)
        {
            //Szprycer
            whichDrink="'Szprycer'";
            checkFavourites("'Szprycer'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szprycer'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==1 && C==1)
        {

            //Irish Coffee
            whichDrink="'Irish Coffee'";
            checkFavourites("'Irish Coffee'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Irish Coffee'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==1 && C==3)
        {
            //Grzane piwo z pomarańc
            whichDrink="'Grzane piwo z pomarańczą'";
            checkFavourites("'Grzane piwo z pomarańczą'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Grzane piwo z pomarańczą'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==1 && C==4)
        {

            //Grzaniec
            whichDrink="'Grzaniec'";
            checkFavourites("'Grzaniec'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Grzaniec'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==1 && C==2 && D==1)
        {
            //Poncz listopadowy
            whichDrink="'Poncz listopadowy'";
            checkFavourites("'Poncz listopadowy'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Poncz listopadowy'"));
            btnBack.setVisibility(View.INVISIBLE);

        }


        else if(A==1 && B==1 && C==2 && D==2)
        {
            //Hot Toddy
            whichDrink="'Hot Toddy'";
            checkFavourites("'Hot Toddy'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Hot Toddy'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==1 && C==2 && D==3)
        {
            //Royal Tea
            whichDrink="'Royal Tea'";
            checkFavourites("'Royal Tea'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Royal Tea'"));
            btnBack.setVisibility(View.INVISIBLE);

        }




        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==1 && Cytrus==1)
        {
            //The Swedish Paloma
            whichDrink="'The Swedish Paloma'";
            checkFavourites("'The Swedish Paloma'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'The Swedish Paloma'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else  if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==1 && Cytrus==2)
        {
            //Vodka Mojito
            whichDrink="'Vodka Mojito'";
            checkFavourites("'Vodka Mojito'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Vodka Mojito'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==1 && Cytrus==3)
        {
            //Trucizna Wdowy
            whichDrink="'Trucizna Wdowy'";
            checkFavourites("'Trucizna Wdowy'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Trucizna Wdowy'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==1 && Cytrus==4)
        {
            //Orange Cosmo
            whichDrink="'Orange Cosmo'";
            checkFavourites("'Orange Cosmo'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Orange Cosmo'"));
            btnBack.setVisibility(View.INVISIBLE);
        }



        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==2 && Orzech==1)
        {
            //Monte z orzechem  Laskowym
            whichDrink="'Monte z orzechem laskowym'";
            checkFavourites("'Monte z orzechem laskowym'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Monte z orzechem laskowym'"));
            btnBack.setVisibility(View.INVISIBLE);
        }



        else  if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==2 && Orzech==2)
        {
            //Monte z orzechem  Włoskim
            whichDrink="'Monte z orzechem włoskim'";
            checkFavourites("'Monte z orzechem włoskim'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Monte z orzechem włoskim'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==1 && Pestkowe==1)
        {
            //Halves
            whichDrink="'Heves'";
            checkFavourites("'Heves'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Heves'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==1 && Pestkowe==2)
        {
            //Cherry Kiss
            whichDrink="'Cherry Kiss'";
            checkFavourites("'Cherry Kiss'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cherry Kiss'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==1 && Pestkowe==3)
        {
            //Sapodill Fizz
            whichDrink="'Sapodill Fizz'";
            checkFavourites("'Sapodill Fizz'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Sapodill Fizz'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==1 && Skladnik==1)
        {
            //Busines Time
            whichDrink="'Business Time'";
            checkFavourites("'Business Time'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Business Time'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==1 && Skladnik==2)
        {
            //Cherry vodka sour
            whichDrink="'Cherry vodka sour'";
            checkFavourites("'Cherry vodka sour'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cherry vodka sour'"));
            btnBack.setVisibility(View.INVISIBLE);
        }



        else if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==1 && Skladnik==3)
        {
            //Caipiroska
            whichDrink="'Caipiroska'";
            checkFavourites("'Caipiroska'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Caipiroska'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==1 && Klimat==1)
        {
            //Vodka Sunrise
            whichDrink="'Vodka Sunrise'";
            checkFavourites("'Vodka Sunrise'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Vodka Sunrise'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==2 && Jagodowe==1)
        {
            //Malinowa Rozkosz
            whichDrink="'Malinowa Rozkosz'";
            checkFavourites("'Malinowa Rozkosz'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Malinowa Rozkosz'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==2 && Jagodowe==2)
        {
            //Finlandia cranberry brisk
            whichDrink="'Finlandia Cranberry Brisk'";
            checkFavourites("'Finlandia Cranberry Brisk'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Finlandia Cranberry Brisk'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==2 && Jagodowe==3)
        {
            //Blackcurrant Sea Breeze
            whichDrink="'Blackcurrant Sea Breeze'";
            checkFavourites("'Blackcurrant Sea Breeze'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Blackcurrant Sea Breeze'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==3 && Ziarenkowe==1)
        {
            //Sok z gumijagód
            whichDrink="'Sok z Gumijagód'";
            checkFavourites("'Sok z Gumijagód'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Sok z Gumijagód'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==4 && C==12)
        {
            //Czerwona siła
            whichDrink="'Czerwona siła'";
            checkFavourites("'Czerwona siła'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Czerwona siła'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==4 && C==11)
        {
            //Bezkrwawa Mary
            whichDrink="'Bezkrwawa Mary'";
            checkFavourites("'Bezkrwawa Mary'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Bezkrwawa Mary'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==3 && C==10)
        {
            //Dwukolorowy banan
            whichDrink="'Dwukolorowy banan'";
            checkFavourites("'Dwukolorowy banan'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Dwukolorowy banan'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==3 && C==9)
        {
            //arbuzowa pszność
            whichDrink="'Arbuzowa pyszność'";
            checkFavourites("'Arbuzowa pyszność'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Arbuzowa pyszność'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==2 && C==8)
        {
            //Pinacolada
            whichDrink="'Pinacolada'";
            checkFavourites("'Pinacolada'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Pinacolada'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==2 && C==7)
        {
            //Słodka Shirley Temple
            whichDrink="'Słodka Shirley Temple'";
            checkFavourites("'Słodka Shirley Temple'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Słodka Shirley Temple'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==1 && C==6)
        {
            //Drink z Curacao
            whichDrink="'Drink z Curacao'";
            checkFavourites("'Drink z Curacao'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Drink z Curacao'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==1 && C==5)
        {
            //Drink Mojito
            whichDrink="'Drink z Mojito'";
            checkFavourites("'Drink z Mojito'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Drink z Mojito'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==8 && AS==2 && WTR==3)
        {
            //Piwne Mojito
            whichDrink="'Piwne Mojito'";
            checkFavourites("'Piwne Mojito'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Piwne Mojito'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==8 && AS==2 && WTR==2)
        {
            //El Diablo
            whichDrink="'El Diablo'";
            checkFavourites("'El Diablo'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'El Diablo'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==8 && AS==2 && WTR==1)
        {
            //Moscow Mule
            whichDrink="'Mosscow Mule'";
            checkFavourites("'Mosscow Mule'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Mosscow Mule'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==8 && AS==1 && GCP==3)
        {
            //Russ Grejpfrutowy
            whichDrink="'Russ Grejpfrutowy'";
            checkFavourites("'Russ Grejpfrutowy'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Russ Grejpfrutowy'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==8 && AS==1 && GCP==1)
        {
            //Cerveza Preparada
            whichDrink="'Cerveza Preparada'";
            checkFavourites("'Cerveza Preparada'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cerveza Preparada'"));
            btnBack.setVisibility(View.INVISIBLE);
        }



        else if(A==1 && B==2 && zCzym==8 && AS==1 && GCP==2)
        {
            //Piwo z sokiem z czarnej porzeczki
            whichDrink="'Piwo z sokiem z czarnej porzeczki'";
            checkFavourites("'Piwo z sokiem z czarnej porzeczki'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Piwo z sokiem z czarnej porzeczki'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==2)
        {
            //Czarny Rosjanin
            whichDrink="'Czarny Rosjanin'";
            checkFavourites("'Czarny Rosjanin'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Czarny Rosjanin'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==1)
        {
            //Hairless Duck
            whichDrink="'Hairless Duck'";
            checkFavourites("'Hairless Duck'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Hairless Duck'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


        else if(A==1 && B==2 && zCzym==7 && Likier==3 && BKBW==4)
        {
            //Red Cherry
            whichDrink="'Red Cherry'";
            checkFavourites("'Red Cherry'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Red Cherry'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==3 && BKBW==3)
        {
            //Bananaball
            whichDrink="'Bananaball'";
            checkFavourites("'Bananaball'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Bananaball'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==3 && BKBW==2)
        {
            //Malibu Sunrise
            whichDrink="'Malibu Sunrise'";
            checkFavourites("'Malibu Sunrise'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Malibu Sunrise'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==3 && BKBW==1)
        {
            //Mississippi Schnaper
            whichDrink="'Mississippi Schnapper'";
            checkFavourites("'Mississippi Schnapper'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Mississippi Schnapper'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==6 && DOM==3 && RGW==3)
        {
            //Szampan z wódką
            whichDrink="'Szampan z wódką'";
            checkFavourites("'Szampan z wódką'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z wódką'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==6 && DOM==3 && RGW==2)
        {
            //Szampan z ginem
            whichDrink="'Szampan z ginem'";
            checkFavourites("'Szampan z ginem'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z ginem'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==1 && B==2 && zCzym==6 && DOM==3 && RGW==1)
        {
            //Szampan z rumem
            whichDrink="'Szampan z rumem'";
            checkFavourites("'Szampan z rumem'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z rumem'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==1 && C==50)
        {
            //Mojito
            whichDrink="'Mojito'";
            checkFavourites("'Mojito'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Mojito'"));
            btnBack.setVisibility(View.INVISIBLE);
        }

        else if(A==2 && B==1 && C==4)
        {
            //Pomarańczowe orzezwienie
            whichDrink="'Pomarańczowe orzeźwienie'";
            checkFavourites("'Pomarańczowe orzeźwienie'");
            hideButtons();
            txQuestion.setText(Database.show(database,"'Pomarańczowe orzeźwienie'"));
            btnBack.setVisibility(View.INVISIBLE);
        }


    }


    public void showQuestions()
    {
        if(A==0)
        {
            question="Drink z alkoholem czy bez?";
            txQuestion.setText("Drink z alkoholem czy bez?");

            btnAnsw1.setText("Z alkoholem");
            btnAnsw2.setText("Bezalkoholowy");
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);
        }

        if(A==1)
        {
            question="Drink ciepły czy zimny?";
            txQuestion.setText("Drink ciepły czy zimny?");

            btnAnsw1.setText("Ciepły");
            btnAnsw2.setText("Zimny");
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);
        }

        if(A==1 && B==2)
        {
            question="Jaki ma być główny składnik drinka?";
            txQuestion.setText("Jaki ma być główny składnik drinka?");

            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.VISIBLE);
            btnAnsw5.setVisibility(View.VISIBLE);
            btnAnsw6.setVisibility(View.VISIBLE);
            btnAnsw7.setVisibility(View.VISIBLE);
            btnAnsw8.setVisibility(View.VISIBLE);

            btnAnsw8.setText("Piwo");
            btnAnsw7.setText("Likier");
            btnAnsw6.setText("Szampan");
            btnAnsw5.setText("Prosecco");
            btnAnsw4.setText("Wino");
            btnAnsw3.setText("Aperol");
            btnAnsw2.setText("Whiskey");
            btnAnsw1.setText("Wódka");

        }

        if(A==1 && B==2 && zCzym==1)
        {
            question="Wolisz drinka z wódką czystą czy smakową?";
            txQuestion.setText("Wolisz drinka z wódką czystą czy smakową?");

            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Smakowa");
            btnAnsw2.setText("Czysta");

        }

        if(A==1 && B==2 && zCzym==1 && Smak==2)
        {
            question="Preferujesz smak słodki, kwaśny czy wytrawny?";
            txQuestion.setText("Preferujesz smak słodki, kwaśny czy wytrawny?");

            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Kwaśny");
            btnAnsw2.setText("Słodki");
            btnAnsw3.setText("Wytrawny");


        }

        if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2)
        {
            question="Drink ma być kolorowy czy jednolity?";
            txQuestion.setText("Drink ma być kolorowy czy jednolity?");

            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Kolorowy");
            btnAnsw2.setText("Jednolity");

        }

        if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==1)
        {
            question="Jaki klimat chcesz poczuć?";
            txQuestion.setText("Jaki klimat chcesz poczuć?");

            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Plaża");
            btnAnsw2.setText("Rosja");
            btnAnsw3.setText("Rajska zatoka");
        }

        if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==2)
        {
            question="Który kolor wolisz?";
            txQuestion.setText("Który kolor wolisz?");

            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Niebieski");
            btnAnsw2.setText("Zielony");

        }



        if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==3)
        {
            question="Jaką ozdobę wolisz?";
            txQuestion.setText("Jaką ozdobę wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.VISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Oliwka");
            btnAnsw2.setText("Cebulka koktajlowa");
            btnAnsw3.setText("Limeta");
            btnAnsw4.setText("Inne");

        }

        if(A==1 && B==2 && zCzym==2)
        {
            question="Wolisz sok czy napój gazowany?";
            txQuestion.setText("Wolisz sok czy napój gazowany?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Sok");
            btnAnsw2.setText("Napój gazowany");

        }

        if(A==1 && B==2 && zCzym==2 && Napoj==1)
        {
            question="Wolisz sok jabłkowy czy pomarańczowy?";
            txQuestion.setText("Wolisz sok jabłkowy czy pomarańczowy?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Sok jabłkowy");
            btnAnsw2.setText("Sok pomarańczowy");
        }

        if(A==1 && B==2 && zCzym==2 && Napoj==2)
        {
            question="Cola czy Sprite?";
            txQuestion.setText("Cola czy Sprite?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Cola");
            btnAnsw2.setText("Sprite");
        }

        if(A==1 && B==2 && zCzym==3)
        {
            question="Wolisz sok z cytryny czy Prosecco?";
            txQuestion.setText("Wolisz sok z cytryny czy Prosecco?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Sok z cytryny");
            btnAnsw2.setText("Prosecco");
        }

        if(A==1 && B==2 && zCzym==4)
        {
            question="Które wino wolisz?";
            txQuestion.setText("Które wino wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Czerwone");
            btnAnsw2.setText("Różowe");
            btnAnsw3.setText("Białe");
        }

        if(A==1 && B==2 && zCzym==5)
        {
            question="Z dodatkiem ginu, Sprite'a czy wina?";
            txQuestion.setText("Z dodatkiem ginu, Sprite'a czy wina?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Gin");
            btnAnsw2.setText("Sprite");
            btnAnsw3.setText("Wino");
        }

        if(A==1 && B==2 && zCzym==6)
        {
            question="Smak którego dodatku ma dominować?";
            txQuestion.setText("Smak którego dodatku ma dominować?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Sok");
            btnAnsw2.setText("Owoc");
            btnAnsw3.setText("Inny alkohol");

        }

        if(A==1 && B==2 && zCzym==7)
        {
            question="Jaki likier wolisz?";
            txQuestion.setText("Jaki likier wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Jajeczny");
            btnAnsw2.setText("Kawowy");
            btnAnsw3.setText("Owocowy");
        }

        if(A==1 && B==2 && zCzym==6 && DOM==2)
        {
            question="Wolisz arbuza czy truskawkę?";
            txQuestion.setText("Wolisz arbuza czy truskawkę?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Truskawka");
            btnAnsw2.setText("Arbuz");

        }

        if(A==1 && B==1)
        {
            question="Na bazie kawy, herbaty, piwa czy wina?";
            txQuestion.setText("Na bazie kawy, herbaty, piwa czy wina?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.VISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Kawa");
            btnAnsw2.setText("Herbata");
            btnAnsw3.setText("Piwo");
            btnAnsw4.setText("Wino");

        }

        if(A==1 && B==1 && C==2)
        {
            question="Z dodatkiem wódki, whisky czy ginu?";
            txQuestion.setText("Z dodatkiem wódki, whisky czy ginu?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Wódka");
            btnAnsw2.setText("Whisky");
            btnAnsw3.setText("Gin");

        }

        if(A==1 && B==2 && Smak==1)
        {
            question="Smak cytrusów, orzechów czy innych owoców?";
            txQuestion.setText("Smak cytrusów, orzechów czy innych owoców?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Cytrus");
            btnAnsw2.setText("Orzech");
            btnAnsw3.setText("Inny owoc");
        }

        if(A==1 && B==2 && Smak==1 && SmakAdd==1)
        {
            question="Jaki cytrus lubisz najbardziej?";
            txQuestion.setText("Jaki cytrus lubisz najbardziej?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.VISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Grejpfrut");
            btnAnsw2.setText("Limonka");
            btnAnsw3.setText("Cytryna");
            btnAnsw4.setText("Pomarańcza");
        }

        if(A==1 && B==2 && Smak==1 && SmakAdd==2)
        {
            question="Jakie orzechy wolisz?";
            txQuestion.setText("Jakie orzechy wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Laskowe");
            btnAnsw2.setText("Włoskie");

        }

        if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3)
        {
            question="Jakie owoce lubisz?";
            txQuestion.setText("Jakie owoce lubisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Pestkowe");
            btnAnsw2.setText("Jagodowe");
            btnAnsw3.setText("Ziarenkowe");
        }

        if(A==1 && B==2 && Smak==1 && zCzym==1 && SmakAdd==3 && Inne==1)
        {
            question="Który owoc Ci odpowiada?";
            txQuestion.setText("Który owoc Ci odpowiada?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Śliwka");
            btnAnsw2.setText("Wiśnia");
            btnAnsw3.setText("Brzoskwinia");
        }

        if(A==1 && B==2 && Smak==1 && zCzym==1 && SmakAdd==3 && Inne==2)
        {
            question = "Który z owoców wolisz?";
            txQuestion.setText("Który z owoców wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Malina");
            btnAnsw2.setText("Żurawina");
            btnAnsw3.setText("Porzeczka");
        }



        if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==3)
        {
            question="Który owoc ziarenkowy wolisz?";
            txQuestion.setText("Który owoc ziarenkowy wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Pigwa");
            btnAnsw2.setText("Jabłko");
            btnAnsw3.setText("Gruszka");
        }

        if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==1) {
            question = "Który z wymienionych składników lubisz najbardziej?";
            txQuestion.setText("Który z wymienionych składników lubisz najbardziej?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Miód");
            btnAnsw2.setText("Wiśnia");
            btnAnsw3.setText("Limonka");
        }

        if(A==2)
        {
            question = "Jaki drink wolisz?";
            txQuestion.setText("Jaki drink wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.VISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Orzeźwiający");
            btnAnsw2.setText("Słodki");
            btnAnsw3.setText("Owocowy");
            btnAnsw4.setText("Warzywny");
        }

        if(A==2 && B==2)
        {
            question = "Czy drink ma być egzotyczny?";
            txQuestion.setText("Czy drink ma być egzotyczny?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Tak");
            btnAnsw2.setText("Nie");
        }

        if(A==2 && B==3)
        {
            question = "Arbuz czy banan?";
            txQuestion.setText("Arbuz czy banan?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Arbuz");
            btnAnsw2.setText("Banan");
        }

        if(A==2 && B==4) {
            question = "Co wolisz bardziej?";
            txQuestion.setText("Co wolisz bardziej?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Pomidor");
            btnAnsw2.setText("Burak");
        }

        if(A==2 && B==1) {
            question = "Który cytrus Ci odpowiada?";
            txQuestion.setText("Który cytrus Ci odpowiada?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Pomarańcza");
            btnAnsw2.setText("Limonka");
            btnAnsw3.setText("Cytryna");
        }


        if(A==1 && B==2 && zCzym==8) {
            question = "Jaki dodatek wolisz?";
            txQuestion.setText("Jaki dodatek wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.INVISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Sok");
            btnAnsw2.setText("Alkohol");

        }

        if(A==1 && B==2 && zCzym==8 && AS==1) {
            question = "Jaki smak soku wolisz?";
            txQuestion.setText("Jaki smak soku wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Pomidor");
            btnAnsw2.setText("Czarna porzeczka");
            btnAnsw3.setText("Grejpfruit");
        }

        if(A==1 && B==2 && zCzym==8 && AS==2) {
            question = "Co preferujesz?";
            txQuestion.setText("Co preferujesz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Wódka");
            btnAnsw2.setText("Tequlia");
            btnAnsw3.setText("Rum");
        }

        if(A==1 && B==2 && zCzym==7 && Likier==3) {
            question = "Jaki smak likieru owocowego wolisz?";
            txQuestion.setText("Jaki smak likieru owocowego wolisz?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.VISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Brzoskwinia");
            btnAnsw2.setText("Kokos");
            btnAnsw3.setText("Banan");
            btnAnsw4.setText("Wiśnia");
        }

        if(A==1 && B==2 && zCzym==6 && DOM==3) {
            question = "Jaki alkohol ma być dodatkiem dominującym?";
            txQuestion.setText("Jaki alkohol ma być dodatkiem dominującym?");


            btnAnsw1.setVisibility(View.VISIBLE);
            btnAnsw2.setVisibility(View.VISIBLE);
            btnAnsw3.setVisibility(View.VISIBLE);
            btnAnsw4.setVisibility(View.INVISIBLE);
            btnAnsw5.setVisibility(View.INVISIBLE);
            btnAnsw6.setVisibility(View.INVISIBLE);
            btnAnsw7.setVisibility(View.INVISIBLE);
            btnAnsw8.setVisibility(View.INVISIBLE);

            btnAnsw1.setText("Rum");
            btnAnsw2.setText("Gin");
            btnAnsw3.setText("Wódka");

        }
    }




    public void goBack()
    {
        if(question=="Drink z alkoholem czy bez?" && btnBackClicked==true)
        {
            startActivity(new Intent(ExpertSystem.this, MainActivity.class));
            btnBackClicked=false;
        }


        if(question=="Drink ciepły czy zimny?" && btnBackClicked==true)
        {
            A=0;
            B=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Który owoc ziarenkowy wolisz?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=1; SmakAdd=3; Inne=0;
            showQuestions();
        }

        if(question=="Jaki ma być główny składnik drinka?" && btnBackClicked==true)
        {
            A=1;
            B=0;
            zCzym=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Wolisz drinka z wódką czystą czy smakową?" && btnBackClicked==true)
        {
            A=1;
            B=0;
            zCzym=1;
            Smak=0; //wódka czysta
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Preferujesz smak słodki, kwaśny czy wytrawny?" && btnBackClicked==true)
        {
            A=1;  B=2; zCzym=1; Smak=2;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Drink ma być kolorowy czy jednolity?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=2; KSW=2;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Jaki klimat chcesz poczuć?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=2; KSW=2; Barwa=1;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Który kolor wolisz?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=2; KSW=2; Barwa=2;
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Jaką ozdobę wolisz?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=2; KSW=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Wolisz sok czy napój gazowany?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=2;
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Wolisz sok jabłkowy czy pomarańczowy?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=2; Napoj=1;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Cola czy Sprite?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=2; Napoj=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Wolisz sok z cytryny czy Prosecco?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=0;
            btnBackClicked=false;
            showQuestions();
       }

        if(question=="Które wino wolisz?" && btnBackClicked==true)
        {
            A=1;  B=2;  zCzym=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Z dodatkiem ginu, Sprite'a czy wina?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Smak którego dodatku ma dominować?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Jaki likier wolisz?" && btnBackClicked==true)
        {
            A=1;  B=2; zCzym=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Wolisz arbuza czy truskawkę?" && btnBackClicked==true)
        {
            A=1; B=2;  zCzym=6;  DOM=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Na bazie kawy, herbaty, piwa czy wina?" && btnBackClicked==true)
        {
            A=1;
            B=0;
            showQuestions();
            btnBackClicked=false;

        }

        if(question=="Z dodatkiem wódki, whisky czy ginu?" && btnBackClicked==true)
        {
            A=1; B=1;  C=0;
            D=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Smak cytrusów, orzechów czy innych owoców?" && btnBackClicked==true)
        {
            A=1;
            B=2;
            Smak=0;
            SmakAdd=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Jaki cytrus lubisz najbardziej?" && btnBackClicked==true)
        {
            A=1;
            B=2;
            Smak=1;
            SmakAdd=1;
            Cytrus=0; //pomarańcza
            btnBackClicked=false;
            showQuestions();
        }


        if(question=="Jakie orzechy wolisz?" && btnBackClicked==true)
        {
            A=1;  B=2;  Smak=1;  SmakAdd=0;
            Orzech=0;
            btnBackClicked=false;
            showQuestions();
        }



        if(question=="Jakie owoce lubisz?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=1; SmakAdd=0;
            Inne=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question=="Który owoc Ci odpowiada?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=1; SmakAdd=3; Inne=0;
            Pestkowe=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question == "Który z owoców wolisz?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=1; SmakAdd=3;  Inne=0;
            Jagodowe=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question == "Który z wymienionych składników lubisz najbardziej?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=1; Smak=2; KSW=1;
            Skladnik=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question == "Jaki drink wolisz?" && btnBackClicked==true)
        {
            A=0;
            B=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question == "Czy drink ma być egzotyczny?" && btnBackClicked==true)
        {
            A=2; B=0;
            C=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question == "Arbuz czy banan?" && btnBackClicked==true)
        {
            A=2; B=0;
            C=0;
            btnBackClicked=false;
            showQuestions();
        }

        if(question == "Co wolisz bardziej?" && btnBackClicked==true)
        {
            A=2; B=0;
            C=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question == "Który cytrus Ci odpowiada?" && btnBackClicked==true)
        {
            A=2; B=0;
            C=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question == "Jaki dodatek wolisz?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=0;
            AS=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question == "Jaki smak soku wolisz?" && btnBackClicked==true)
        {
            A=1;B=2; zCzym=8; AS=0;
            GCP=0;
            btnBackClicked=false;
            showQuestions();
        }



        if(question == "Co preferujesz?" && btnBackClicked==true)
        {
            A=1;B=2; zCzym=8; AS=0;
            WTR=0;
            btnBackClicked=false;
            showQuestions();

        }

        if(question == "Jaki smak likieru owocowego wolisz?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=7; Likier=0;
            BKBW=0;
            btnBackClicked=false;
            showQuestions();
        }


        if(question == "Jaki alkohol ma być dodatkiem dominującym?" && btnBackClicked==true)
        {
            A=1; B=2; zCzym=6; DOM=0;
            RGW=0; //wódka
            btnBackClicked=false;
            showQuestions();
        }
    }

    public void mainMenu(View view)
    {
        startActivity(new Intent(ExpertSystem.this, MainActivity.class));
    }
}