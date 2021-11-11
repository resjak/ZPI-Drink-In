package com.example.zpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExpertSystem extends AppCompatActivity {

    SQLiteDatabase database;
    TextView txQuestion;
    Button btnAnsw1,btnAnsw2,btnAnsw3,btnAnsw4,
            btnAnsw5,btnAnsw6,btnAnsw7,btnAnsw8;
    boolean b1Clicked=false, b2Clicked=false,b3Clicked=false,b4Clicked=false,
            b5Clicked=false,b6Clicked=false,b7Clicked=false,b8Clicked=false;
    String question;

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

        database = openOrCreateDatabase("DRINKSDB",MODE_PRIVATE,null);

       // drinkSelection();

        showQuestions();

}


public void buttonsCheck() //ustawianie zmiennych kontrolnych adekwatnie do wciśniętych przycisków
{
    if(question=="Drink z alkoholem czy bez?" && b1Clicked==true)
    {
        A=1; //z alkoholem
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Drink z alkoholem czy bez?" && b2Clicked==true)
    {
        A=2; //bezalkoholowy
        b2Clicked=false;
        showQuestions();
        drinkSelection();
    }

    if(question=="Drink ciepły czy zimny?" && b1Clicked==true)
    {
        B=1; //ciepły
        b1Clicked=false;
        showQuestions();
        drinkSelection();
    }


    if(question=="Drink ciepły czy zimny?" && b2Clicked==true)
    {
        B=2; //zimny
        b2Clicked=false;
        showQuestions();
        drinkSelection();
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

    if(question=="Jakie owoce lubisz?" && b1Clicked==true)
    {
        Inne=1;//pestkowe
        b1Clicked=false;
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
        C=5; //limonka
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
            hideButtons();
            txQuestion.setText(Database.show(database,"'White Russian'"));
        }


        else if (A==1 && B==2 && Smak==2 && KSW==2 && Barwa==1 && Klimat==3)
        {
            //Paradise Bay
            hideButtons();
            txQuestion.setText(Database.show(database,"'Paradise Bay'"));

        }


        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==2 && Kolor==1)
        {
            //Pijany Kaktus
            hideButtons();
            txQuestion.setText(Database.show(database,"'Pijany Kaktus'"));
        }



        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==2 && Kolor==2)
        {
            //Blue Lagoon
            hideButtons();
            txQuestion.setText(Database.show(database,"'Blue Lagoon'"));
        }



        else  if (A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==3 && Ziarenkowe==2)
        {
            //Absolute Spiced Apple Sour
            hideButtons();
            txQuestion.setText(Database.show(database,"'Absolute Spiced Apple Sour'"));
        }




        else if (A==1  && B==2 &&  zCzym==1 && Smak==1 && SmakAdd==3 && Inne==3 && Ziarenkowe==3)
        {
            //Absolute pears
            hideButtons();
            txQuestion.setText(Database.show(database,"'Absolute pears'"));
        }

        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==3 && Ozdoba==1)
        {
            //Vodkatini
            hideButtons();
            txQuestion.setText(Database.show(database,"'Vodkatini'"));
        }


        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==3 && Ozdoba==2)
        {
            //Wodka Gibson
            hideButtons();
            txQuestion.setText(Database.show(database,"'Wódka Gibson'"));
        }


        else  if (A==1 && B==2 && zCzym==1 && Smak==2 && KSW==3 && Ozdoba==3)
        {
            //Trip
            hideButtons();
            txQuestion.setText(Database.show(database,"'Trip'"));
        }


        else  if (A==1 && B==2 && Smak==2 && KSW==3 && Ozdoba==4)
        {
            //North Pole
            hideButtons();
            txQuestion.setText(Database.show(database,"'North Pole'"));
        }


        else if (A==1 && B==2 && zCzym==2 && Napoj==1 && Sok==1)
        {
            //Ballantines Old Twist
            hideButtons();
            txQuestion.setText(Database.show(database,"'Ballantines Old Twist'"));
        }


        else  if (A==1 && B==2 &&  zCzym==2 && Napoj==1 && Sok==2)
        {
            //Mitherning Bastard
            hideButtons();
            txQuestion.setText(Database.show(database,"'Mitherning Bastard'"));
        }


        else if (A==1 && B==2 && zCzym==2 && Napoj==2 && Gaz==1)
        {
            //Jameson Sprite and Lime
            hideButtons();
            txQuestion.setText(Database.show(database,"'Jameson Sprite and lime'"));
        }


        else  if (A==1 && B==2 && zCzym==2 && Napoj==2 && Gaz==2)
        {
            //Whiskey & Cola Drink
            hideButtons();
            txQuestion.setText(Database.show(database,"'Whisky and Cola drink'"));
        }

        else if (A==1 && B==2 && zCzym==5 && GSW==1)
        {
            //French 75
            hideButtons();
            txQuestion.setText(Database.show(database,"'French 75'"));

        }


        else  if (A==1  && B==2 && zCzym==5 && GSW==2)
        {
            //Prosecco & Sprite
            hideButtons();
            txQuestion.setText(Database.show(database,"'Prosecco & Sprite'"));
        }


        else if (A==1  && B==2 && zCzym==5 && GSW==3)
        {
            //Prosecco z Martini Fierro
            hideButtons();
            txQuestion.setText(Database.show(database,"'Prosecco z Martini Fierro'"));
        }


        else if (A==1 && B==2 && zCzym==6 && DOM==1)
        {
            //Drink z szampanem i sokiem
            hideButtons();
            txQuestion.setText(Database.show(database,"'Drink z szampanem i sokiem'"));
        }


        else  if (A==1 && B==2 && zCzym==6 && DOM==2 && AT==1)
        {
            //Szampan z Truskawkami
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z truskawkami'"));
        }


        else  if (A==1 && B==2 && zCzym==6 && DOM==2 && AT==2)
        {
            //Szampan z arbuzem //brakuje INSERT
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z arbuzem'"));
        }


        else  if (A==1 && B==2 && zCzym==3 && SokPros==1)
        {
            //Cotogna's Aperol Fizz
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cotogna's Aperol Fizz'"));
        }


        else  if (A==1 && B==2 && zCzym==3 && SokPros==2)
        {
            //Aperol Spritz
            hideButtons();
            txQuestion.setText(Database.show(database,"'Aperol Spritz'"));
        }



        else if (A==1 && B==2 && zCzym==4 && Gatunek==1)
        {
            //Calimacho
            hideButtons();
            txQuestion.setText(Database.show(database,"'Calimacho'"));

        }


        else if (A==1 && B==2 && zCzym==4 && Gatunek==2)
        {
            //Royal Mojito
            hideButtons();
            txQuestion.setText(Database.show(database,"'Royal Mojito'"));
        }


        else if (A==1 && B==2 && zCzym==4 && Gatunek==3)
        {
            //Szprycer
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szprycer'"));
        }


        else if(A==1 && B==1 && C==1)
        {

            //Irish Coffee
            hideButtons();
            txQuestion.setText(Database.show(database,"'Irish Coffee'"));
        }


        else if(A==1 && B==1 && C==3)
        {
            //Grzane piwo z pomarańc
            hideButtons();
            txQuestion.setText(Database.show(database,"'Grzane piwo z pomarańczą'"));
        }


        else if(A==1 && B==1 && C==4)
        {

            //Grzaniec
            hideButtons();
            txQuestion.setText(Database.show(database,"'Grzaniec'"));
        }


        else if(A==1 && B==1 && C==2 && D==1)
        {
            //Poncz listopadowy
            hideButtons();
            txQuestion.setText(Database.show(database,"'Poncz listopadowy'"));

        }


        else if(A==1 && B==1 && C==2 && D==2)
        {
            //Hot Toddy
            hideButtons();
            txQuestion.setText(Database.show(database,"'Hot Toddy'"));
        }


        else if(A==1 && B==1 && C==2 && D==3)
        {
            //Royal Tea
            hideButtons();
            txQuestion.setText(Database.show(database,"'Royal Tea'"));

        }




        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==1 && Cytrus==1)
        {
            //The Swedish Paloma
            hideButtons();
            txQuestion.setText(Database.show(database,"'The Swedish Paloma'"));
        }

        else  if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==1 && Cytrus==2)
        {
            //Vodka Mojito
            hideButtons();
            txQuestion.setText(Database.show(database,"'Vodka Mojito'"));
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==1 && Cytrus==3)
        {
            //Trucizna Wdowy
            hideButtons();
            txQuestion.setText(Database.show(database,"'Trucizna Wdowy'"));
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==1 && Cytrus==4)
        {
            //Orange Cosmo
            hideButtons();
            txQuestion.setText(Database.show(database,"'Orange Cosmo'"));
        }



        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==2 && Orzech==1)
        {
            //Monte z orzechem  Laskowym
            hideButtons();
            txQuestion.setText(Database.show(database,"'Monte z orzechem laskowym'"));
        }



        else  if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==2 && Orzech==2)
        {
            //Monte z orzechem  Włoskim
            hideButtons();
            txQuestion.setText(Database.show(database,"'Monte z orzechem Włoskim'"));
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==1 && Pestkowe==1)
        {
            //Halves
            hideButtons();
            txQuestion.setText(Database.show(database,"'Halves'"));
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==1 && Pestkowe==1)
        {
            //Cherry Kiss
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cherry Kiss'"));
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==1 && Pestkowe==1)
        {
            //Sapodill Fizz
            hideButtons();
            txQuestion.setText(Database.show(database,"'Sapodill Fizz'"));
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==1 && Skladnik==1)
        {
            //Busines Time
            hideButtons();
            txQuestion.setText(Database.show(database,"'Business Time'"));
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==1 && Skladnik==2)
        {
            //Cherry vodka sour
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cherry vodka sour'"));
        }



        else if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==1 && Skladnik==3)
        {
            //Caipiroska
            hideButtons();
            txQuestion.setText(Database.show(database,"'Caipiroska'"));
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==2 && KSW==2 && Barwa==1 && Klimat==1)
        {
            //Vodka Sunrise
            hideButtons();
            txQuestion.setText(Database.show(database,"'Vodka Sunrise'"));
        }

        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==2 && Jagodowe==1)
        {
            //Malinowa Rozkosz
            hideButtons();
            txQuestion.setText(Database.show(database,"'Malinowa Rozkosz'"));
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==2 && Jagodowe==2)
        {
            //Finlandia cranberry brisk
            hideButtons();
            txQuestion.setText(Database.show(database,"'Finlandia cranberry brisk'"));
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==2 && Jagodowe==3)
        {
            //Blackcurrant Sea Breeze
            hideButtons();
            txQuestion.setText(Database.show(database,"'Blackcurrant Sea Breeze'"));
        }


        else if(A==1 && B==2 && zCzym==1 && Smak==1 && SmakAdd==3 && Inne==3 && Ziarenkowe==1)
        {
            //Sok z gumijagód
            hideButtons();
            txQuestion.setText(Database.show(database,"'Sok z gumijagód'"));
        }

        else if(A==2 && B==4 && C==12)
        {
                //Czerwona siła
            hideButtons();
            txQuestion.setText(Database.show(database,"'Czerwona siła'"));
        }

        else if(A==2 && B==4 && C==11)
        {
            //Bezkrwawa Marry
            hideButtons();
            txQuestion.setText(Database.show(database,"'Bezkrwawa Marry'"));
        }

        else if(A==2 && B==3 && C==10)
        {
            //Dwukolorowy banan
            hideButtons();
            txQuestion.setText(Database.show(database,"'Dwukolorowy banan'"));
        }

        else if(A==2 && B==3 && C==9)
        {
            //arbuzowa pszność
            hideButtons();
            txQuestion.setText(Database.show(database,"'Arbuzowa pyszność'"));
        }

        else if(A==2 && B==2 && C==8)
        {
            //Pinacolada
            hideButtons();
            txQuestion.setText(Database.show(database,"'Pinacolada'"));
        }

        else if(A==2 && B==2 && C==7)
        {
            //Słodka Shirley Temple
            hideButtons();
            txQuestion.setText(Database.show(database,"'Słodka Shirley Temple'"));
        }

        else if(A==2 && B==1 && C==6)
        {
            //Drink z Curacao
            hideButtons();
            txQuestion.setText(Database.show(database,"'Drink z Curacao'"));
        }

        else if(A==2 && B==1 && C==5)
        {
            //Drink Mojito
            hideButtons();
            txQuestion.setText(Database.show(database,"'Drink z Mojito'"));
        }

        else if(A==1 && B==2 && zCzym==8 && AS==2 && WTR==3)
        {
            //Piwne Mojito
            hideButtons();
            txQuestion.setText(Database.show(database,"'Piwne Mojito'"));
        }

        else if(A==1 && B==2 && zCzym==8 && AS==2 && WTR==2)
        {
            //El Diablo
            hideButtons();
            txQuestion.setText(Database.show(database,"'El Diablo'"));
        }

        else if(A==1 && B==2 && zCzym==8 && AS==2 && WTR==1)
        {
            //Moscow Mule
            hideButtons();
            txQuestion.setText(Database.show(database,"'Moscow Mule'"));
        }

        else if(A==1 && B==2 && zCzym==8 && AS==1 && GCP==3)
        {
            //Russ Grejpfrutowy
            hideButtons();
            txQuestion.setText(Database.show(database,"'Russ Grejpfrutowy'"));
        }

        else if(A==1 && B==2 && zCzym==8 && AS==1 && GCP==1)
        {
            //Cerveza Preparada
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cerveza Preparada'"));
        }

        else if(A==1 && B==2 && zCzym==8 && AS==1 && GCP==1)
        {
            //Cerveza Preparada
            hideButtons();
            txQuestion.setText(Database.show(database,"'Cerveza Preparada'"));
        }

        else if(A==1 && B==2 && zCzym==8 && AS==1 && GCP==2)
        {
            //Piwo z sokiem z czarnej porzeczki
            hideButtons();
            txQuestion.setText(Database.show(database,"'Piwo z sokiem z czarnej porzeczki'"));
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==2)
        {
            //Czarny Rosjanin
            hideButtons();
            txQuestion.setText(Database.show(database,"'Czarny Rosjanin'"));
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==1)
        {
            //Hairless Duck
            hideButtons();
            txQuestion.setText(Database.show(database,"'Hairless Duck'"));
        }


        else if(A==1 && B==2 && zCzym==7 && Likier==3 && BKBW==4)
        {
            //Red Cherry
            hideButtons();
            txQuestion.setText(Database.show(database,"'Red Cherry'"));
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==3 && BKBW==3)
        {
            //Bananaball
            hideButtons();
            txQuestion.setText(Database.show(database,"'Bananaball'"));
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==3 && BKBW==2)
        {
            //Malibu Sunrise
            hideButtons();
            txQuestion.setText(Database.show(database,"'Malibu Sunrise'"));
        }

        else if(A==1 && B==2 && zCzym==7 && Likier==3 && BKBW==1)
        {
            //Mississippi Schnaper
            hideButtons();
            txQuestion.setText(Database.show(database,"'Mississippi Schnaper'"));
        }

        else if(A==1 && B==2 && zCzym==6 && DOM==3 && RGW==3)
        {
            //Szampan z wódką
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z wódką'"));
        }

        else if(A==1 && B==2 && zCzym==6 && DOM==3 && RGW==2)
        {
            //Szampan z ginem
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z ginem'"));
        }

        else if(A==1 && B==2 && zCzym==6 && DOM==3 && RGW==1)
        {
            //Szampan z rumem
            hideButtons();
            txQuestion.setText(Database.show(database,"'Szampan z rumem'"));
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
            btnAnsw2.setText("Rajska zatoka");
            btnAnsw3.setText("Rosja");
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

            btnAnsw1.setText("Włoskie");
            btnAnsw2.setText("Laskowe");

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

        if(A==1 && B==2 && Smak==1 && SmakAdd==3 && Inne==1)
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

        if(A==1 && B==2 && Smak==1 && SmakAdd==3 && Inne==2)
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


    public void goBack(View view)
    {
        A=0;B=0;C=0;D=0;zCzym=0;Smak=0;KSW=0;GCP=0;WTR=0;BKBW=0;
                Barwa=0;Klimat=0;Kolor=0;SmakAdd=0;Ziarenkowe=0;Likier=0;
                Ozdoba=0;Napoj=0;Sok=0;Gaz=0;GSW=0;DOM=0; Inne=0; AT=0;AS=0;RGW=0;
                Gatunek=0; Jagodowe=0; Pestkowe=0;Cytrus=0; SokPros=0; Orzech=0; Skladnik=0;

        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivity(myIntent);
    }
}