package com.example.zpi;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Drinks extends AppCompatActivity {



    public static void insertToDatabase(SQLiteDatabase database)
    {
        //ROYAL MOJITO
        database.execSQL("INSERT INTO Drinks VALUES('Royal Mojito','Klasyczne Mojito dla każdego miłośnika rumu, mięty i świeżej limonki. Idealny na wiosenną pogodę.'," +
                "'40 ml jasnego rumu\n " +
                "1/2 limonki \n" +
                "10 liści mięty \n" +
                "łyżeczka trzcinowego cukru\n " +
                "wino musujące\n " +
                "kruszony lód')"); //działa



//WHISKY AND COLA DRINK
        database.execSQL("INSERT INTO Drinks VALUES('Whisky and Cola drink'," +
                "'Najpopularniejszy sposób podania i picia whisky polega na delikatnym rozcieńczeniu jej wodą lub lodem.', " +
                "'whisky – 40 ml\n" +
                "cola\n" +
                "kostki lodu')"); //działa

//GRZANE PIWO Z POMARAŃCZA
        database.execSQL("INSERT INTO Drinks VALUES('Grzane piwo z pomarańczą', ' Idealne połączenie na zimowe wieczory. Kwaśny smak pomarańczy dodaje świeżość, natomiast słodki smak nadaje miód. Najlepszym dodatkiem będzie cynamon.', " +
                "'\"0,5 l piwa\n" +
                "\"1 pomarańcza\n" +
                "\"2 łyżki miodu\n" +
                "\"1 łyżeczka cynamonu\n" +
                "\"1 łyżeczka cukru')"); //działa

        //ROYAL TEA
        database.execSQL("INSERT INTO Drinks VALUES('Royal Tea','Mrożona herbata o intensywnym smaku z dodatkiem rumu da nam pyszny, słodki i orzeźwiający smak. Idealny drink na lato.', " +
                "'30 ml ginu np. Portobello Gin\n" +
                "60 ml herbaty Earl Grey\n" +
                "10 ml soku z limonki\n"+
                "15 ml syropu cukrowego')"); //działa




//IRISH COFFEE
        database.execSQL("INSERT INTO Drinks VALUES('Irish Coffee',' Idealny drink dla wielbicieli kawy, słodyczy oraz Whiskey. Ten gorący drink z pewnością rozgrzeje w zimowe wieczory.', " +
                "'150 ml mocnej kawy\n" +
                "50 ml irlandzkiej whiskey\n" +
                "2 łyżeczki brązowego cukru\n" +
                "schłodzona śmietanka 30% lub 36%\n" +
                "opcjonalnie kakao')");//działa


//JAMESON SPRITE AND LIME
        database.execSQL("INSERT INTO Drinks VALUES('Jameson Sprite and lime'," +
                "'Ten letni koktajl to najprostsza rzecz pod słońcem. Ten przepis na bazie whiskey sprawdzi się idealnie," +
                " gdy szukasz szybkich koktajli na imprezę lub po prostu chcesz ugasić pragnienie — wszystko, czego potrzebujesz, " +
                "to Jameson Irish Whiskey, pyszny Sprite i cząstka limonki. " +
                "A więc usiądź wygodnie i ciesz się smakiem trzech orzeźwiających składników, podkreślających nawzajem swoje zalety.'," +
                "'50 ml Jameson Irish Whiskey\n" +
                "Sprite\n" +
                "Duża cząstka limonki')");//działa


//APEROL SPRITZ
        database.execSQL("INSERT INTO Drinks VALUES('Aperol Spritz'," +
                "'Drink zawierający obecnie bardzo popularny Aperol z dodatkiem Prosecco będzie idealny do obiadu w upalny dzień nad morzem.', " +
                "\n" +
                "'Składniki:\n" +
                "3 porcje Prosecco\n" +
                "2 porcje Aperola\n" +
                "1 porcja wody gazowanej\n" +
                "kostki lodu\n" +
                "plaster pomarańczy.')");//działa

//THE SWEDISH PALOMA
        database.execSQL("INSERT INTO Drinks VALUES('The Swedish Paloma','Dla miłośników kwaśnych smaków, drink ten będzie idealny na ciepły, letni wieczór.', " +
                "'50 ml Absolut Grapefruit \n"+
                "50 ml soku z czerwonych grejpfrutów \n"+
                "10 ml soku z limonki \n"+
                "Woda gazowana \n"+
                "1 cząstka grejpfruta \n"+
                "Kostki lodu')");//działa


//TRUCIZNA WDOWY
        database.execSQL("INSERT INTO Drinks VALUES('Trucizna Wdowy','Trucizna wdowy to słodko-kwaśny drink z prostych składników, którym najważniejszy jest Frugo.', " +
                "'40 ml wódki cytrynowej \n"+
                "40 ml soku grejpfrutowego \n"+
                "20 ml grenadiny \n"+
                "150 ml czarnego Frugo\n"+
                "Kostki lodu')");//działa

        //VODKA MOJITO
        database.execSQL("INSERT INTO Drinks VALUES('Vodka Mojito','Klasyczny i jeden z najpopularniejszych drinków. Idealny dla smakoszy mocnego alkoholu i kwaśnego smaku.', "+
                "'40 ml wódki \n"+
                "połowa limonki \n"+
                "2 łyżeczki trzcinowego cukru \n"+
                "woda gazowana \n"+
                "10 liści mięty\n"+
                "Kostki lodu')");//działa

//ORANGE COSMO
        database.execSQL("INSERT INTO Drinks VALUES('Orange Cosmo','Cosmopolitan to jeden z najpopularniejszych drinków, który z pewnością będzie idealny na domówkę.', " +
                "'40 ml wódki pomarańczowej \n"+
                "15 ml Cointreau lub likieru typu Triple Sec innej marki \n"+
                "15 ml soku z cytryny \n"+
                "30 ml soku żurawinowego \n"+
                "Kostki lodu')"); //działa

//Halves
        database.execSQL("INSERT INTO Drinks VALUES('Halves','Drink z wódki śliwkowej do zrobienia w kilka chwil.', " +
                "'50 ml wódki śliwkowej \n"+
                "100 ml soku pomarańczowego \n"+
                "15 ml soku z cytryny \n"+
                "50 ml soku żurawinowego \n"+
                "opcjonalnie 15 ml soku z cytryny\n"+
                "Kostki lodu')"); //działa
        //CALIMACHO
        database.execSQL("INSERT INTO Drinks VALUES('Calimacho','" +
                " Idealnie orzeźwiający drink na ciepłe letnie wieczory.', " +
                "'30 ml ginu np. Portobello Gin\n" +
                "60 ml herbaty Earl Grey\n" +
                "10 ml soku z limonki\n"+
                "15 ml syropu cukrowego')"); //działa




//SZPRYCER
        database.execSQL("INSERT INTO Drinks VALUES('Szprycer','W gorący letni dzień najlepiej wypić szprycera. Ten orzeźwiający napój, schładza organizm i gasi pragnienie.', " +
                "'białe wino 1 butelka\n" +
                "woda gazowana (sodowa) 1 butelka\n" +
                "kostki lodu\n"+
                "cytryna')"); //działa


        //FRENCH 75
        database.execSQL("INSERT INTO Drinks VALUES('French 75', ' Moc tego prostego drinka z ginem i szampanem potrafi dać solidnego kopa,  zupełnie jak pocisk artyleryjski.'," +
                "'40 ml ginu\n" +
                "80 ml szampana lub wina musującego\n" +
                "20 ml soku z cytryny\n"+
                "20 ml syropu cukrowego')"); //działa

//PROSECCO, SPRITE
        database.execSQL("INSERT INTO Drinks VALUES('Prosecco & Sprite',' To świetny sposób na letnie orzeźwienie, szczególnie dla fanów cytrusowego smaku.', " +
                "'70 ml Prosecco\n" +
                "200 ml Sprite’a\n" +
                "100 ml wody gazowanej\n"+
                "Łyżeczka cukru rozpuszczonego w łyżeczce gorącej wody\n"+
                "Kilka kostek lodu\n"+
                "Liście mięty')"); //działa

//PROSECCO Z MARTINI FIERO
        database.execSQL("INSERT INTO Drinks VALUES('Prosecco z Martini Fierro',' To świetny wybór na letnie orzeźwienie.', " +
                "'80 ml Martini Fiero\n" +
                "80 ml schłodzonego Prosecco\n" +
                "40 ml woda gazowana\n"+
                "kostki lodu\n"+
                "plasterek pomarańczy')"); //działa

//DRINK Z SZAMPANEM I SOKIEM
        database.execSQL("INSERT INTO Drinks VALUES('Drink z szampanem i sokiem',' To świetny sposób na prostego, lekkiego i orzeźwiającego drinka.', " +
                "'Prosecco (lub inne wino musujące) - 2/3 kieliszka\n" +
                "Jedna, zblendowana brzoskwinia')"); //działa



//SZAMPAN Z TRUSKAWKAMI
        database.execSQL("INSERT INTO Drinks VALUES('Szampan z truskawkami',' Słodki,truskawkowy i orzeźwiający napój z dodatkiem szampana.', " +
                "'Truskawki 500 g\n" +
                "Cukier - 1/2 szkl.\n" +
                "Sok z cytryny - 1/2 szt.\n"+
                "Szampan - 1 szkl.')"); //działa


//SZAMPAN Z RUMEM
        database.execSQL("INSERT INTO Drinks VALUES('Szampan z rumem','Orzeźwiający drink, który będzie idealny na letnie wieczory.', " +
                "' 40 ml Szampana\n" +
                "40 ml Rumu\n" +
                "20 ml soku pomarańczowego\n" +
                "20 ml soku z limonki')"); //działa



//SZAMPAN Z GINEM
        database.execSQL("INSERT INTO Drinks VALUES('Szampan z ginem','Orzeźwiający drink, który będzie idealny na letnie piątkowe wieczory.', " +
                "' 30 ml ginu\n" +
                "15 ml soku z cytryny\n" +
                "10 ml syropu z cukru trzcinowego\n" +
                "Kilka kostek lodu.')");  //działa

//SZAMPAN Z WÓDKĄ
        database.execSQL("INSERT INTO Drinks VALUES('Szampan z wódką','Idealny drink dla tych,którzy chcą szybko osiągnąć pożądany stan.', " +
                "'50 ml wódki\n" +
                "50 ml soku z cytryny\n" +
                "100 ml Szampana słodkiego lub półsłodkiego\n" +
                "Kilka kostek lodu.')");  //działa

//CZARNY ROSJANIN
        database.execSQL("INSERT INTO Drinks VALUES('Czarny Rosjanin','Ten drink będzie idealny dla smakoszy kawy.', "+
                "'50 ml wódki\n" +
                "20 ml likieru kawowego\n" +
                "Kilka kostek lodu')"); //działa


//HAIRLESS DUCK
        database.execSQL("INSERT INTO Drinks VALUES('Hairless Duck','Idealny drink dla smakoszy ajerkoniaku.', " +
                "'50 ml wódki\n" +
                "15 ml rumu\n" +
                "30 ml ajerkoniaku \n" +
                "Sok pomarańczowy')");

//MALIBU SUNRISE
        database.execSQL("INSERT INTO Drinks VALUES('Malibu Sunrise','Prosty i szybki drink, idealny na imprezę.', " +
                "'40 ml wódki\n" +
                "30 ml Malibu\n" +
                "ok. 15 ml grenadiny \n" +
                "Kilka kostek lodu.')");



//BANANABALL
        database.execSQL("INSERT INTO Drinks VALUES('Bananaball','Drink, którego smak może zaskoczyć swoją słodyczą i orzeźwieniem.', " +
                "'40 ml likieru bananowego\n" +
                "30 ml wódka\n" +
                "80 ml soku pomarańczowego \n" +
                "Kilka kostek lodu.')");



//RED CHERRY
        database.execSQL("INSERT INTO Drinks VALUES('Red Cherry','Idealny drink dla wielbicieli wiśniowego smaku.', " +
                "'50 ml wódki\n" +
                "15 ml likieru Maraschino\n" +
                "5 ml grenadiny \n" +
                "75 ml soku ananasowego')");


//EL DIABLO
        database.execSQL("INSERT INTO Drinks VALUES('El Diablo','Drink dla osób, które zdecydowanie wolą pikantne smaki.', "+
                "'40 ml tequili\n" +
                "15 ml likieru porzeczkowego Crème de Cassis\n" +
                "30 ml soku z limonki\n" +
                "15 ml syropu z agawy\n" +
                "10 ml Ancho Reyes Verde" +
                "100-120 ml piwa imbirowego')");

//CERVEZA PREPARADA
        database.execSQL("INSERT INTO Drinks VALUES('Cerveza preparada',' Cerveza preparada to meksykański napój piwny o pikantnym smaku.', " +
                "'30 ml piwa \n" +
                "50 ml soku pomidorowego\n" +
                "10 ml soku z limonki\n" +
                "15 ml soku z cytryny\n" +
                "kropla ostrego sosu (najlepiej salsa)')");

//RUSS GREJPFRUTOWY
        database.execSQL("INSERT INTO Drinks VALUES('Russ Grejpfrutowy','Doskonały drink na gorące dni.', " +
                "'250 ml soku grejpfrutowego\n" +
                "250 ml piwa')");

//PIWO Z SOKIEM Z CZARNEJ PORZECZKI
        database.execSQL("INSERT INTO Drinks VALUES('Piwo z sokiem z czarnej porzeczki','Drink idealny dla osób, które lubią smak czarnej porzeczki.', " +
                "'250 ml piwa \n" +
                "Pół szklanki soku porzeczkowego\n" +
                "Odrobina likieru porzeczkowego\n" +
                "15 ml soku z cytryny\n" +
                "Kilka kostek lodu')");

//CHERRY KISS
        database.execSQL("INSERT INTO Drinks VALUES('Cherry Kiss','Bardzo słodki, orzeźwiający drink z wiśniówką. Idealny i banalny drink imprezowy z dodatkiem cytryny i coli.', " +
                "'Cola lub Pepsi 100.00 ml \n"+
                "Sok z cytryny 10.00 ml \n"+
                "Wódka wiśniowa 40.00 ml \n"+
                "Kostki lodu')");
//SAPODILL FIZZ
        database.execSQL("INSERT INTO Drinks VALUES('Sapodill Fizz','Drink z intensywnym smakiem brzoskwini, gruszki i nutką cytryny. Idealny na sezon grilowy.', " +
                "'1½ Porcje Absolut Apeach \n"+
                "⅓ Porcja Sok Z cytryny \n"+
                "1 Porcja Puree Z gruszek \n"+
                "⅓ Porcja Syrop Cukrowy \n"+
                "Woda Gazowana \n"+
                "opcjonalnie 15 ml soku z cytryny \n"+
                "Gruszka \n"+
                "Kostki lodu')");

        //FINLANDIA CRANBERRY BRISK
        database.execSQL("INSERT INTO Drinks VALUES('Finlandia Cranberry Brisk','Drink o bardzo wyrazistym cytrusowym smaku doskonały na upalne dni.', " +
                "'1½ Wódkę finlandia cranberry \n"+
                "⅓ Porcja Sok Z cytryny \n"+
                "⅓ Porcja Sok Z grejpfruta \n"+
                "Woda Gazowana ')");

//MALINOWA ROZKOSZ
        database.execSQL("INSERT INTO Drinks VALUES('Malinowa Rozkosz','Malinowa Rozkosz to prosty drink z wódką malinową, sokiem z cytryny i spritem. Idealny drink na imprezę.', " +
                "'100.00 ml Sprite \n"+
                "20.00 ml Sok z cytryny \n"+
                "40.00 ml Wódka malinowa  \n"+
                "Kostki lodu')");

        //BLACKCURRANT SEA BREEZE
        database.execSQL("INSERT INTO Drinks VALUES('Blackcurrant Sea Breeze','Blackcurrant Sea Breeze to wariacja klasycznego drinku Sea Breeze. Bardzo orzeźwiający, idealny na lato drink z wódką porzeczkową, sokiem żurawinowym i dodatkiem soku z grejpfruta.', " +
                "'60.00 ml Sok grejpfrutowy \n"+
                "60.00 ml Sok żurawinowy \n"+
                "40.00 ml Wódka porzeczkowa  \n"+
                "Kostki lodu')");

//SOK Z GUMIJAGÓD
        database.execSQL("INSERT INTO Drinks VALUES('Sok z Gumijagód',' Sok z Gumijagód. Składa się on z dwóch składników: wódka pigwowa z sokiem porzeczkowym. Ten drink znany jest też pod nazwą Kociołek  Panoramixa, który – ma dodać dużo energii i sponiewierać tanim kosztem.', "+
                "'0,5 l wódki \n"+
                "1 litr soku porzeczkowego \n"+
                "świeżo wyciśnięty sok z cytryny  \n"+
                "Kostki lodu')");

//ABSOLUT SPICED APPLE SOUR
        database.execSQL("INSERT INTO Drinks VALUES('Absolut Spiced Apple sour',' Wykwintny i lekki drink o smaku jabłkowym z nutom cytryny i z dodatkiem żółtka jajka.', "+
                "'1½ Porcje Absolut Äpple \n"+
                "¾ Porcja Sok Jabłkowy \n"+
                "¾ Porcja Sok Z cytryny  \n"+
                "½ Porcja Syrop Cukrowy  \n"+
                "⅙ Porcja Białko Jajka  \n"+
                "Kostki lodu')");


        //ABSOLUT PEARS LEMONADE AW
        database.execSQL("INSERT INTO Drinks VALUES('Absolute Pears Lemonade',' Drink na podstawie wódki gruszkowej z dodatkiem własnej lemoniady. Słodki i orzeźwiający idealny na upalne dni.', " +
                "'1½ Porcje Absolut Pears\n"+
                "1 Kilka kropli Sok Z cytryny\n"+
                "Soda Cytrynowo-limonkowa \n"+
                "1 Cząstka Cytryna \n"+
                "1 Całość Rurka \n"+
                "Kostki lodu')");

//GRZANIEC
        database.execSQL("INSERT INTO Drinks VALUES('Grzaniec','Grzane wino – bardzo rozgrzewający napój alkoholowy , wraz z przyprawami korzennymi i innymi (np. goździkami, cynamonem lub miodem).', "+
                "'”2 butelki wytrawnego wina\\n”+\n" +
                "       \"2 pomarańcze\\n\"+\n" +
                "      \"1 cytryna\\n\"+\n" +
                "      \"kilkanaście sztuk goździków\\n\"+\n" +
                "      \"4 łyżki stołowe miodu lub cukru (najlepszy będzie brązowy)\\n\"+\n" +
                "      \"1 laska cynamonu\\n\"+\n" +
                "      \"3-4 cm kawałek imbiru\\n\"+\n" +
                "      \"50 g rodzynek\"')");

//BUSINESS TIME
        database.execSQL("INSERT INTO Drinks VALUES('Business Time',' Idealny drink na wieczory ze znajomymi po pracy. Słodki smak bananów oraz syropu miodowego idealnie się komponują z gorzkim kardamonem.', " +

                "'Uzupełnić wodą z tonikiem. Udekorować cytryną. " +
                "”15 ml syropy miodowego\\n”+\n" +
                "”½ litra likieru bananowego\\n”+\n" +
                "”2 szczypty gorzkiego kardamonu\\n”+\n" +
                "”1½ Pts Absolut Vodka\\n”+\n" +
                "”¾ szklanki soku z limonki\\n”+\n" +
                "”Woda tonizująca\\n”+\n" +
                "”1 skórka cytryny')");


        //HOT TODDY
        database.execSQL("INSERT INTO Drinks VALUES('Hot Toddy','Jest to popularny i prosty  drink, który idealnie się sprawdzi podczas wieczornych seansów.', "+
                "'”whiskey (około 50 ml)\\n”" +
                "      ”miód (1-2 łyżeczki)\\n”" +
                "      ”herbata (1 torebka)\\n”" +
                "      ”cytryna (1 plaster)\\n”" +
                "      ”woda (3/4 kubka')");


//PONCZ LISTOPADOWY
        database.execSQL("INSERT INTO Drinks VALUES('Poncz listopadowy',' Idealny, rozgrzewający drink na jesień. Będzie doskonały do wieczornego oglądania seriali pod kocykiem.', " +
                "'sok z połówki pomarańczy\\n" +
                "      ”3 łyżeczki czarnej liściastej herbaty\\n”" +
                "      ”3 łyżeczki cukru\\n”" +
                "      ”2 kieliszki (czyli ok. 50 ml) wiśniówki”')");

        //COTOGNAS APEROL FIZZ
        database.execSQL("INSERT INTO Drinks VALUES('Cotogna`s Aperol Fizz','Jeden z najciekawszych drinków z aperolem, który zachwyci Cię swoim wyglądem i smakiem'," +
                "'Aperol - 50 ml\n" +
                "sok z cytryny - 20 ml\n" +
                "syrop cukrowy - 10 ml\n" +
                "woda gazowana - 40 - 50 ml\n" +
                "połowa ubitego białka jajka na jeden drink')");

        //POMARAŃCZOWE ORZEŹWIENIE
        database.execSQL("INSERT INTO Drinks VALUES('Pomarańczowe orzeźwienie','Idealny drink na letnie, upalne dni. Prosty w wykonaniu, sprawdzi się dla miłośników drinków bezalkoholowych'," +
                "'100 ml soku pomarańczowego.\n" +
                "100 ml soku ananasowego.\n" +
                "10 ml grenadiny.\n" +
                "kilka kostek kodu.')");

        //MOJITO
        database.execSQL("INSERT INTO Drinks VALUES ('Mojito','Idealne połączenie limonki i mięty. Bezalkoholowa wersja popularnego, orzeźwiającego drinka'," +
                "'pół limonki – pokrojonej w plastry\n" +
                "kilka kostek lodu\n" +
                "6-7 listków świeżej mięty\n" +
                "1 łyżeczka miodu\n" +
                "sprite\n" +
                "woda gazowana')");

        //DRINK Z CURACAO
        database.execSQL("INSERT INTO Drinks VALUES ('Drink z Curacao','Drink z Curacao to prosty w przygotowaniu i jeden z " +
                "bardziej orzeźwiających drinków. W parze z jego wyśmienitym smakiem idzie jego wygląd'," +
                "'30 ml bezalkoholowego likieru blue curacao,\n" +
                "1 szklanka napoju typu tonic / Sprite,\n" +
                "1 łyżka cukru,\n" +
                "kilka kostek lodu,\n" +
                "kilka plasterków cytryny.')");

        //SŁODKA SHIRLEY TEMPLE
        database.execSQL("INSERT INTO Drinks VALUES('Słodka Shirley Temple','Słodki drink zawdzięczający swoją nazwę dzięki słynnej, słynnej amerykańskiej aktorce.'," +
                "'Ginger ale  – 80ml\n" +
                "Sprite – 80ml\n" +
                "Grenadyna – 5ml\n" +
                "Lód')");

        //PINACOLADA
        database.execSQL("INSERT INTO Drinks VALUES('Pinacolada','To bezalkoholowa modyfikacja słynnego, klasycznego drinka, " +
                "który przywędrował do nas prosto z karaibów'," +
                "'50 ml mleczka kokosowego\n" +
                "40 ml soku ananasowego\n" +
                "Odrobina cukru\n" +
                "Kruszony lód')");

        //ARBUZOWA PYSZNOŚĆ
        database.execSQL("INSERT INTO Drinks VALUES('Arbuzowa pyszność','Idealna forma wakacyjego relaksu i orzeźwienia.'," +
                "'20 ml soku z limonki\n" +
                "15 ml syropu cukrowego\n" +
                "2 łyżki soczystego arbuza')");

        //DWUKOLOROWY BANAN
        database.execSQL("INSERT INTO Drinks VALUES('Dwukolorowy banan','Słodki, kolorowy drink. Najlepiej sprawdza się w okresie letnim'," +
                "'100ml soku/nektaru bananowego\n" +
                "3 kostki lodu\n" +
                "50ml soku/nektaru z czarnej porzeczki')");

        //BEZKRWAWA MARY
        database.execSQL("INSERT INTO Drinks VALUES('Bezkrwawa Mary','Fajna, bezalkoholowa propozycja klasycznego drinka idealna dla gości," +
                "którzy przyjadą na imprezę samochodem'+" +
                "'200 ml świeżo wyciśniętego soku pomidorowego\n" +
                "2 posiekane dymki\n" +
                "sok z 1 cytryny\n" +
                "po pół łyżeczki tabasco i sosu Worcestershire\n" +
                "kilka kostek lodu')");

        //CZERWONA SIŁA
        database.execSQL("INSERT INTO Drinks VALUES('Czerwona siła','Pyszny koktail, który doda Ci wiele energii.'," +
                "'Zakwas z buraka - 100 ml\n" +
                "sok pomidorowy - 100 ml\n" +
                "tabasco -\n" +
                "korzeń chrzanu')");






    }
}
