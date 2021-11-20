package com.example.zpi;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Drinks extends AppCompatActivity {



    public static void insertToDatabase(SQLiteDatabase database)
    {
        //ROYAL MOJITO
        database.execSQL("INSERT INTO Drinks VALUES('Royal Mojito','Wiosenny orzeźwiający drink.'," +
                "'40 ml jasnego rumu\n " +
                "1/2 limonki \n" +
                "10 liści mięty \n" +
                "łyżeczka trzcinowego cukru\n " +
                "wino musujące\n " +
                "kruszony lód')"); //działa


        //JAMESON SPRITE AND LIME
        database.execSQL("INSERT INTO Drinks VALUES('Jameson Sprite and lime'," +
                "'Ten letni koktajl to najprostsza rzecz pod słońcem. Ten przepis na bazie whiskey sprawdzi się idealnie," +
                " gdy szukasz szybkich koktajli na imprezę lub po prostu chcesz ugasić pragnienie — wszystko, czego potrzebujesz, " +
                "to Jameson Irish Whiskey, pyszny Sprite i cząstka limonki. " +
                "A więc usiądź wygodnie i ciesz się smakiem trzech orzeźwiających składników, podkreślających nawzajem swoje zalety.'," +
                "'50 ml Jameson Irish Whiskey\n" +
                "Sprite\n" +
                "Duża cząstka limonki')");//działa

        //WHISKY AND COLA DRINK
        database.execSQL("INSERT INTO Drinks VALUES('Whisky and Cola drink'," +
                "'Najpopularniejszy sposób podania i picia whisky polega na delikatnym rozcieńczeniu jej wodą lub lodem." +
                " Alkohol ten może być jednak doskonałą bazą do naprawdę smacznych drinków. " +
                "Ten klasyczny i wyszukany trunek można w ten sposób podawać gościom, którzy nie do końca preferują picie alkoholu w „czystej” postaci. " +
                "Na temat picia whisky z colą powstało wiele mitów i legend. Nieprawdą jest, że mieszanie whisky z colą to zniewaga dla tego szlachetnego trunku. " +
                "Wręcz przeciwnie – pamiętajmy, że alkohol ma być przede wszystkim przyjemny w smaku. " +
                "Z tego artykułu dowiesz się, jakiego rodzaju whisky można śmiało podawać z colą.'," +
                "'whisky – 40 ml\n" +
                "cola\n" +
                "kostki lodu')"); //działa

        database.execSQL("INSERT INTO Drinks VALUES('Grzane piwo z pomarańczą', 'Rozgrzewające, nie za słodkie, o niesamowitym aromacie pomarańczy i cynamonu. " +
                "Takie, które ogrzeje nawet w mroźny dzień, gdy śnieg za oknem sztywny, a w oknach niesamowite sople lodu.'," +
                "'\"0,5 l piwa\"+\n" +
                "\"1 pomarańcza\\n\"+\n" +
                "\"2 łyżki miodu\\n\"+\n" +
                "\"1 łyżeczka cynamonu\\n\"+\n" +
                "\"1 łzyżeczka cukru\\n')"); //działa

      //ROYAL TEA
        database.execSQL("INSERT INTO Drinks VALUES('Royal Tea','Witajcie! Czy w upalne dni marzycie o szklance gorącej herbaty prosto z filiżanki? " +
                "Raczej nie!. A co jeśli zrobilibyśmy sobie koktajl na bazie herbaty i ginu?'," +
                "'30 ml ginu np. Portobello Gin\n" +
                "60 ml herbaty Earl Grey\n" +
                "10 ml soku z limonki\n"+
                "15 ml syropu cukrowego')"); //działa

        //IRISH COFFEE
        database.execSQL("INSERT INTO Drinks VALUES('Irish Coffee','Przede wszystkim Irish Coffee nie mogłoby istnieć bez porządnej, " +
                "aromatycznej kawy. W tym przypadku przypadku z średnio lub ciemno palonych ziaren o niskiej kwasowości," +
                " zaparzonej za pomocą ekspresu ciśnieniowego lub klasycznej kawiarki'," +
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
                "'Nie ma nic lepszego i bardziej orzeźwiającego na stoku niż słynny Aperol Spritz (lokalnie w Val di Sole i Val di Fiemme nazywany Veneziano)." +
                " Historię tego trunku zapoczątkowali austriaccy żołnierze, którzy przebywając na włoskiej ziemi, " +
                "nie mając swojego ukochanego piwa pod ręką, zaczęli „pryskać” (z niem. spritzen) białe wino wodą gazowaną. " +
                "Później w Padwie do Spritza zaczęto dodawać Aperol, czyli likier o aromacie gorzkich pomarańczy. Tak powstał Aperol Spritz.'," +
                "\n" +
                "'Składniki:\n" +
                "3 porcje Prosecco\n" +
                "2 porcje Aperola\n" +
                "1 porcja wody gazowanej\n" +
                "kostki lodu\n" +
                "plaster pomarańczy.')");//działa

        //THE SWEDISH PALOMA
        database.execSQL("INSERT INTO Drinks VALUES('The Swedish Paloma','Na sobotni wieczór idealnie sprawdzi się drink Swedish Paloma bardzo cytrysowa.'," +
                "'50 ml Absolut Grapefruit \n"+
                "50 ml soku z czerwonych grejpfrutów \n"+
                "10 ml soku z limonki \n"+
                "Woda gazowana \n"+
                "1 cząstka grejpfruta \n"+
                "Kostki lodu')");//działa

        //TRUCIZNA WDOWY
        database.execSQL("INSERT INTO Drinks VALUES('Trucizna Wdowy','Trucizna wdowy to kwaskowo-słodki drink z prostych składników, wśród których najważniejsze jest oczywiście Frugo.'," +
                "'40 ml wódki cytrynowej \n"+
                "40 ml soku grejpfrutowego \n"+
                "20 ml grenadiny \n"+
                "150 ml czarnego Frugo\n"+
                "Kostki lodu')");//działa

        //VODKA MOJITO
        database.execSQL("INSERT INTO Drinks VALUES('Vodka Mojito','Pewne jest, że ulubionym alkoholem polaków jest wódka. Dlatego tym razem wspólnie przygotujemy pyszne polskie Mojito z wódką, które będzie idealną alternatywą dla osób, które nie lubią rumu, lub zwyczajnie nie mają go pod ręką.'," +
                "'40 ml wódki \n"+
                "2 łyżeczki trzcinowego cukru \n"+
                "woda gazowana \n"+
                "10 liści mięty\n"+
                "Kostki lodu')");//działa

        //ORANGE COSMO
        database.execSQL("INSERT INTO Drinks VALUES('Orange Cosmo','Cosmopolitan to jeden z tych drinków, które można zamówić w barach pewnie na całym świecie.'," +
                "'40 ml wódki pomarańczowej \n"+
                "15 ml Cointreau lub likieru typy Triple Sec innej marki \n"+
                "15 ml soku z cytryny \n"+
                "30 ml soku żurawinowego \n"+
                "Kostki lodu')"); //działa

        //Halves
        database.execSQL("INSERT INTO Drinks VALUES('Halves','Drink z wódki śliwkowej do zrobienia w kilka chwil. '," +
                "'50 ml wódki śliwkowej \n"+
                "100 ml soku pomarańczowego \n"+
                "15 ml soku z cytryny \n"+
                "50 ml soku żurawinowego \n"+
                "opcjonalnie 15 ml soku z cytryny\n"+
                "Kostki lodu')"); //działa

        //CALIMACHO
        database.execSQL("INSERT INTO Drinks VALUES('Calimacho','" +
                " Idealny drink orzeźwiający na letnie upalne wieczory'," +
                "'30 ml ginu np. Portobello Gin\n" +
                "60 ml herbaty Earl Grey\n" +
                "10 ml soku z limonki\n"+
                "15 ml syropu cukrowego')"); //działa




        //SZPRYCER
        database.execSQL("INSERT INTO Drinks VALUES('Szprycer','Na ciepłe lato zamiast zimnego piwa lepiej wypić szprycera, orzeźwiający napój, schładzający organizm i gaszący pragnienie.'," +
                "'białe wino 1 butelka\n" +
                "woda gazowana (sodowa) 1 butelka\n" +
                "kostki lodu\n"+
                "cytryna')"); //działa



        //FRENCH 75
        database.execSQL("INSERT INTO Drinks VALUES('French 75', ' Moc tego prostego drinka z ginem i szampanem miała dawać kopa, jakby trafił w nas pocisk artylerysjki - mawiano. Stąd też nazwa French 75.'," +
                "'40 ml ginu\n" +
                "80 ml szampana lub wina musującego\n" +
                "20 ml soku z cytryny\n"+
                "20 ml syropu cukrowego')"); //działa


    //PROSECCO, SPRITE
        database.execSQL("INSERT INTO Drinks VALUES('Prosecco & Sprite',' To świetny sposób na letnie orzeźwienie dla fanów cytrusowego smaku.', " +
                "'70 ml Prosecco\n" +
                "200 ml Sprite’a\n" +
                "100 ml wody gazowanej\n"+
                "Łyżeczka cukru rozpuszczonego w łyżeczce gorącej wody\n"+
                "Kilka kostek lodu\n"+
                "Liście mięty')"); //działa


        database.execSQL("INSERT INTO Drinks VALUES('Prosecco z Martini Fierro',' To świetny sposób na letnie orzeźwienie. '," +
                "'80 ml Martini Fiero\n" +
                "80 ml schłodzonego Prosecco\n" +
                "40 ml woda gazowana\n"+
                "kostki lodu\n"+
                "plasterek pomarańczy')"); //działa



        database.execSQL("INSERT INTO Drinks VALUES('Drink z szampanem i sokiem',' To świetny sposób na prostego, lekkiego i orzeźwiającego drinka. '," +
                "'Prosecco (lub inne wino musujące) - 2/3 kieliszka\n" +
                "Jedna brzoskwinia')"); //działa



        database.execSQL("INSERT INTO Drinks VALUES('Szampan z truskawkami',' Słodki,truskawkowy i orzeźwiający napój z dodatkiem szampana'," +
                "'Truskawki 500 g\n" +
                "Cukier - 1/2 szkl.\n" +
                "Sok z cytryny - 1/2 szt.\n"+
                "Szampan - 1 szkl.')"); //działa



        database.execSQL("INSERT INTO Drinks VALUES('Szampan z rumem','Orzeźwiający drink, który będzie idealny na letnie wieczory. '," +
                "' 40 ml Szampana\n" +
                "40 ml Rumu\n" +
                "20 ml soku pomarańczowego\n" +
                "20 ml soku z limonki')"); //działa




        database.execSQL("INSERT INTO Drinks VALUES('Szampan z ginem','Orzeźwiający drink, który będzie idealny na letnie piątkowe wieczory. '," +
                "' 30 ml ginu\n" +
                "15 ml soku z cytryny\n" +
                "10 ml syropu z cukru trzcinowego\n" +
                "Kilka kostek lodu.')");  //działa


        database.execSQL("INSERT INTO Drinks VALUES('Szampan z wódką','Idealny drink dla tych,którzy chcą szybko osiągnąć pożądany stan '," +
                "'50 ml wódki\n" +
                "50 ml soku z cytryny\n" +
                "100 ml Szampana słodkiego lub pół-słodkiego\n" +
                "Kilka kostek lodu.')");  //działa




        database.execSQL("INSERT INTO Drinks VALUES('Czarny Rosjanin','Ten drink będzie idealny dla smakoszy kawy.'," +
                "'50 ml wódki\n" +
                "20 ml likieru kawowego\n" +
                "Kilka kostek lodu')"); //działa





        database.execSQL("INSERT INTO Drinks VALUES('Hairless Duck','Idealny drink dla smakoszy ajerkoniaku.'," +
                "'50 ml wódki\n" +
                "15 ml rumu\n" +
                "30 ml ajerkoniaku \n" +
                "Sok pomarańczowy')"); //działa


        database.execSQL("INSERT INTO Drinks VALUES('Malibu Sunrise','Prosty i szybki drink, idealny na imprezę '," +
                "'40 ml wódki\n" +
                "30 ml Malibu\n" +
                "ok. 15 ml grenadiny \n" +
                "Kilka kostek lodu.')"); //działa




        database.execSQL("INSERT INTO Drinks VALUES('Bananaball','Drink, którego smak może zaskoczyć swoją słodyczą i orzeźwieniem'," +
                "'40 ml likieru bananowego\n" +
                "30 ml wódka\n" +
                "80 ml soku pomarańczowego \n" +
                "Kilka kostek lodu.')"); //działa




        database.execSQL("INSERT INTO Drinks VALUES('Red Cherry','Idealny drink dla wielbicieli wiśniowego smaku.'," +
                "'50 ml wódki\n" +
                "15 ml likieru Maraschino\n" +
                "5 ml grenadiny \n" +
                "75 ml soku ananasowego')"); //działa



        database.execSQL("INSERT INTO Drinks VALUES('El Diablo','Drink dla osób, które zdecydowanie wolą pikantne smaki'," +
                "'40 ml tequili\n" +
                "15 ml likieru porzeczkowego Crème de Cassis\n" +
                "30 ml soku z limonki\n" +
                "15 ml syropu z agawy\n" +
                "10 ml Ancho Reyes Verde" +
                "100-120 ml piwa imbirowego')"); //działa


        database.execSQL("INSERT INTO Drinks VALUES('Cerveza preparada',' Cerveza preparada to meksykański napój piwny o pikantnym smaku'," +
                "'30 ml piwa \n" +
                "50 ml soku pomidorowego\n" +
                "10 ml soku z limonki\n" +
                "15 ml soku z cytryny\n" +
                "kropla ostrego sosu (najlepiej salsa)')"); //działa




        database.execSQL("INSERT INTO Drinks VALUES('Russ Grejpfrutowy','Doskonały drink na gorące dni'," +
                "'250 ml soku grejpfutowego\n" +
                "250 ml piwa')"); //działa


        database.execSQL("INSERT INTO Drinks VALUES('Piwo z sokiem z czarnej porzeczki','Drink idealny dla osób, które lubią smak czarnej porzeczki'," +
                "'250 ml piwa \n" +
                "Pół szklanki soku porzeczkowego\n" +
                "Odrobina likieru porzeczkowego\n" +
                "15 ml soku z cytryny\n" +
                "Kilka kostek lodu')"); //działa


        database.execSQL("INSERT INTO Drinks VALUES('Cherry Kiss','Bardzo słodki, orzeźwijący drink z wódką wisniową czyli wiśniówką. Ja do swojego przepisu użyłem Soplicy Wiśniowej. Ideapny, prosty drink imprezowy z dodatkiem cytryny i coli. Jeżeli lubicie słodkie drinki to tego nie możecie pominąć.  '," +
                "'Cola lub Pepsi 100.00 ml \n"+
                "Sok z cytryny 10.00 ml \n"+
                "Wódka wiśniowa 40.00 ml \n"+
                "Kostki lodu')"); //działa

        database.execSQL("INSERT INTO Drinks VALUES('Sapodill Fizz','bardzo brzoskwniowy drink. '," +
                "'1½ Porcje Absolut Apeach \n"+
                "⅓ Porcja Sok Z cytryny \n"+
                "1 Porcja Puree Z gruszek \n"+
                "⅓ Porcja Syrop Cukrowy \n"+
                "Woda Gazowana \n"+
                "opcjonalnie 15 ml soku z cytryny \n"+
                "Gruszka \n"+
                "Kostki lodu')"); //działa

        database.execSQL("INSERT INTO Drinks VALUES('Finlandia Cranberry Brisk','bardzo gruszkowy drink. '," +
                "'1½ Porcje Absolut Apeach \n"+
                "⅓ Porcja Sok Z cytryny \n"+
                "1 Porcja Puree Z gruszek \n"+
                "⅓ Porcja Syrop Cukrowy \n"+
                "Woda Gazowana \n"+
                "opcjonalnie 15 ml soku z cytryny \n"+
                "Gruszka \n"+
                "Kostki lodu')"); //działa

        database.execSQL("INSERT INTO Drinks VALUES('Malinowa Rozkosz','Malinowa Rozkosz to prosty drink z wódką malinową, sokiem z cytryny i spritem. Idealny drink na imprezę, który przygotujecie bez problemu w 2 minuty. '," +
                "'100.00 ml Sprite \n"+
                "20.00 ml Sok z cytryny \n"+
                "40.00 ml Wódka malinowa  \n"+
                "Kostki lodu')"); //działa

        database.execSQL("INSERT INTO Drinks VALUES('Blackcurrant Sea Breeze','Blackcurrant Sea Breeze to wariacja na klasycznym drinku Sea Breeze (sprawdź przepis). Bardzo orzeźwiajacy, idealny na lato drink z wódką pożeczkową, sokiem żurawinowym o specyficznym smaku i dodatkiem soku z grejpfruta. '," +
                "'60.00 ml Sok grejpfrutowy \n"+
                "60.00 ml Sok żurawinowy \n"+
                "40.00 ml Wódka porzeczkowa  \n"+
                "Kostki lodu')"); //działa

        database.execSQL("INSERT INTO Drinks VALUES('Sok z Gumijagód',' Sok z Gumijagód  to shot podawany w jednej krakowskiej knajpce. Składa się on z dwóch składników: wódka pigwowa z sokiem porzeczkowym. '," +
                "'0,5 l wódki \n"+
                "1 litr soku porzeczkowego \n"+
                "świeżo wyciśnięty sok z cytryny  \n"+
                "Kostki lodu')"); //działa




       database.execSQL("INSERT INTO Drinks VALUES('Grzaniec','Grzane wino – rozgrzewający napój alkoholowy, rodzaj grzańca (grzanki), " +
               "sporządzony przez podgrzanie (bez zagotowania) wina czerwonego lub białego wraz z przyprawami korzennymi i innymi (np. goździkami, cynamonem lub miodem).', " +
               "'”2 butelki wytrawnego wina\\n”+\n" +
               "       \"2 pomarańcze\\n\"+\n" +
               "      \"1 cytryna\\n\"+\n" +
               "      \"kilkanaście sztuk goździków\\n\"+\n" +
               "      \"4 łyżki stołowe miodu lub cukru (najlepszy będzie brązowy)\\n\"+\n" +
               "      \"1 laska cynamonu\\n\"+\n" +
               "      \"3-4 cm kawałek imbiru\\n\"+\n" +
               "      \"50 g rodzynek\"')"); //działa

        database.execSQL("INSERT INTO Drinks VALUES('Buisness Time','Napełnić shaker koktajlowy kostkami lodu. Dodaj melasę, likier bananowy, bitters kardamonowy," +
                " Absolut Vodka i sok z limonki. Wstrząsnąć i przecedzić do wysokiej szklanki wypełnionej kostkami lodu. " +
                "Uzupełnić wodą z tonikiem. Udekorować cytryną.', " +
                "'”½ części melasy\\n”+\n" +
                "”½ litra likieru bananowego\\n”+\n" +
                "”2 szczypty gorzkiego kardamonu\\n”+\n" +
                "”1½ Pts Absolut Vodka\\n”+\n" +
                "”¾ szklanki soku z limonki\\n”+\n" +
                "”Woda tonizująca\\n”+\n" +
                "”1 skórka cytryny')"); //działa


        database.execSQL("INSERT INTO Drinks VALUES('Hot Toddy','Hot toddy lub hot to trot totty, hot tottie jak również hot whiskey. " +
                "Popularny w Irlandii i Szkocji drink alkoholowy spożywany na ciepło. ', " +
                "'”whiskey (około 50 ml)\\n”+\n" +
                "      ”miód (1-2 łyżeczki)\\n”+\n" +
                "      ”herbata (1 torebka)\\n”+\n" +
                "      ”cytryna (1 plaster)\\n”+\n" +
                "      ”woda (3/4 kubka')"); //działa


        database.execSQL("INSERT INTO Drinks VALUES('Poncz Listopadowy','Smaki mieszają się tak dobrze, że z początku trudno rozpoznać, co właściwie w sobie zawiera ten napój. " +
                "Ale rozgrzewa wspaniale – i o to chodzi! No i jest ciekawą, owocową alternatywą dla Zimowej herbaty z przyprawami. ', " +
                "'”sok z połówki pomarańczy\\n”+\n" +
                "      ”3 łyżeczki czarnej liściastej herbaty\\n”+\n" +
                "      ”3 łyżeczki cukru\\n”+\n" +
                "      ”2 kieliszki (czyli ok. 50 ml) wiśniówki”')"); //działa


        database.execSQL("INSERT INTO Drinks VALUES('Absolut Spiced Apple sour',' Bardzo jabłkowy '," +
                "'1,2 Porcje Absolut Äpple \n"+
                "3/4 Porcja Sok Jabłkowy \n"+
                "3/4 Porcja Sok Z cytryny  \n"+
                "3/4 Porcja Syrop Cukrowy  \n"+
                "3/4 Porcja Białko Jajka  \n"+
                "Kostki lodu')");

        database.execSQL("INSERT INTO Drinks VALUES('Absolut pears',' Bardzo ananasowy '," +
                "'1,5 Parts Absolut Vodka \n"+
                "1,5 Parts Pineapple Juice \n"+
                "Soda Water  \n"+
                "1 Sprig Mint Leaf  \n"+
                "Kostki lodu')");

    }
}
