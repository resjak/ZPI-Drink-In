package com.example.zpi;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Drinks extends AppCompatActivity {



    public static void insertToDatabase(SQLiteDatabase database)
    {
        //MISSISSIPPI SCHNAPPER
        database.execSQL("INSERT INTO Drinks VALUES( 'Mississippi Schnapper', ' \n \n Ten elegancki drink jest idealny \n do spotkań biznesowych. \n Będzie doskonały podczas ważnych \n uroczystości.\n',"+
                "'🍹 40 ml Whiskey\n"+
                " 🍹 10 ml Cointreau\n"+
                " 🍹 10 ml syrop cukrowy \n"+
                " 🍹 10 ml soku z limonki\n"+
                " 🍹 20 ml likier brzoskwiniowy\n')");//OK

//NORTH POLE
        database.execSQL("INSERT INTO Drinks VALUES( 'North Pole', ' \n \n Ten rozpływający się w ustach napój \n zawiera kilka naprawdę bogatych \n smaków i ładnie je równoważy w tym \n dekadenckim \n czekoladowym koktajlu.\n',"+
                "'🍹 lód\n"+
                " 🍹 1 Porcja Gin\n"+
                " 🍹 1 Porcja Swedish Punsch\n')"); //OK

//TRIP
        database.execSQL("INSERT INTO Drinks VALUES('Trip', ' \n \n Ziołowy koktajl z winem podawany \n jako aperitif.\n',"+
                "' 🍹 40 ml Southern Comfort\n "+
                "  🍹 wytrawne wino musujące\n "+
                "  🍹 kawałek skórki pomarańczowej\n ')");//OK

//VODKATINI
        database.execSQL("INSERT INTO Drinks VALUES('Vodkatini', ' \n \n Bardzo popularna wariacja na temat \n Martini, czyli Martini z wódką \n (Vodkatini).\n ',"+
                "'🍹 50 ml wódki\n"+
                " 🍹 15 ml białego wytrawnego wermutu\n"+
                " 🍹 kostki lodu\n"+
                " 🍹 skórka cytryny\n')");//OK

//WÓDKA GIBSON
        database.execSQL("INSERT INTO Drinks VALUES('Wódka Gibson', ' \n \n Gibson to mieszany napój z ginem i \n wytrawnym wermutem, często \n przyozdobiony marynowaną cebulą. \n W swoim współczesnym wcieleniu \n uważany jest za kuzyna \n wszechobecnego  martini. Wyróżnia się \n przede wszystkim przybraniem oliwki\n zamiast cebuli.\n ',"+
                "'🍹 50 ml Wódka \n"+
                " 🍹 10 ml Wermut \n"+
                " 🍹 lód  \n"+
                " 🍹 20 ml Gin \n"+
                " 🍹 3 cebulki koktajlowe  \n"+
                " 🍹 1 Pasek skórki z cytryny  \n ')");//OK



//ANTINES OLD TWIST
        database.execSQL("INSERT INTO Drinks VALUES('Ballantines Old Twist' , ' \n \n Słodki, łagodny, orzeźwiający drink.\n Doskonały na gorące letnie wieczory.\n Świetnie się sprawdzi podczas domówek oraz\n na bankietach. \n',"+
                "'🍹 40 ml Whisky Ballantines \n"+
                " 🍹 20 ml soku jabłkowego \n"+
                " 🍹 5 ml syropu cukrowego \n"+
                " 🍹 kostki lodu \n"+
                " 🍹 2 skórki pomarańczy \n')");//OK

//MITHERING BASTARD
        database.execSQL("INSERT INTO Drinks VALUES('Mitherning Bastard', ' \n \n Koktajl zdecydowanie przeznaczony dla wielbicieli \n pomarańczy i Whiskey. Doskonały na imprezę w letni wieczór.\n ',"+
                "' 🍹  50 ml Szkocka Whisky \n "+
                " 🍹 15 ml likier Triple Sec \n"+
                " 🍹 30 ml sok pomarańczowy \n"+
                " 🍹 kostki lodu \n')");//OK

//CHERRY VODKA SOUR
        database.execSQL("INSERT INTO Drinks VALUES( 'Cherry vodka sour',  '\n \n Doskonały drink dla wielbicieli mocnych alkoholi. \n  Kombinacja wódki wiśniowej z syropem \n waniliowym oraz nutą soku pomarańczowego \n z pewnością uraczy niejednego \n smakosza.\n',"+
                "' 🍹 40 ml wiśniówki \n"+
                "  🍹 20 ml soku z cytryny \n"+
                "  🍹 10 ml syropu waniliowego \n"+
                "  🍹 białko jajka \n"+
                "  🍹 3 krople bittera pomarańczowego ')");//OK











//CAIPOROSKA
        database.execSQL("INSERT INTO Drinks VALUES( 'Caipiroska', ' \n \n Caipiroska,  to rodzaj drinka, \n  bardzo słynnego brazylijskiego \n napoju o nazwie Caipirinha. \n Jego głównym składnikiem jest \n wódka czysta. Natomiast wódkę \n Cachaça produkuje się z trzciny \n cukrowej. Doskonały drink dla \n poszukiwaczy brazylijskich smaków .\n',"+
                "'🍹 60 ml wódki czystej \n"+
                " 🍹 ½  Limonki pociętej w łódeczki \n"+
                " 🍹 15 g cukru trzcinowego \n"+
                " 🍹 kruszony lód\n')");//OK

//ROYAL MOJITO
        database.execSQL("INSERT INTO Drinks VALUES('Royal Mojito',' \n \n Klasyczne Mojito dla każdego \n miłośnika rumu, mięty i świeżej \n limonki. Idealny na wiosenną pogodę.\n'," +
                "'🍹 40 ml jasnego rumu\n " +
                " 🍹 1/2 limonki \n" +
                " 🍹 10 liści mięty \n" +
                " 🍹 5 g trzcinowego cukru\n " +
                " 🍹 wino musujące\n " +
                " 🍹 lód')"); //działa



//WHISKY AND COLA DRINK AW
        database.execSQL("INSERT INTO Drinks VALUES('Whisky and Cola drink',' \n \n Najpopularniejszy sposób podania \n oraz picia Whisky polega na \n delikatnym  rozcieńczeniu jej wodą \n lub lodem.\n', " +
                "'  🍹 40 ml Whisky \n " +
                "   🍹 cola\n" +
                "   🍹 kostki lodu')"); //działa

//GRZANE PIWO Z POMARAŃCZĄ
        database.execSQL("INSERT INTO Drinks VALUES('Grzane piwo z pomarańczą', ' \n \n Idealne połączenie na zimowe wieczory. \n Kwaśny smak pomarańczy dodaje \n świeżość, natomiast słodki smak \n nadaje miód. \n Najlepszym dodatkiem będzie \n cynamon.\n', " +
                "'🍹 0,5 l piwa \n" +
                " 🍹 1 pomarańcza \n" +
                " 🍹 2 łyżki miodu \n" +
                " 🍹 5 g cynamonu\n" +
                " 🍹 5 g cukru \n')"); //działa








        //ROYAL TEA
        database.execSQL("INSERT INTO Drinks VALUES('Royal Tea','\n \n Mrożona herbata o intensywnym smaku z dodatkiem rumu\n da nam pyszny, słodki i orzeźwiający smak.\n Idealny drink na lato.\n', " +
                "'🍹 30 ml ginu\n" +
                " 🍹 60 ml herbaty Earl Grey\n" +
                " 🍹 10 ml soku z limonki\n"+
                " 🍹 15 ml syropu cukrowego')"); //działa



//IRISH COFFEE AW
        database.execSQL("INSERT INTO Drinks VALUES('Irish Coffee',' \n \n Idealny drink dla wielbicieli kawy, \n słodyczy oraz Whiskey. Ten gorący \n drink z pewnością rozgrzeje w \n zimowe wieczory. \n', " +
                "'🍹 150 ml mocnej kawy\n" +
                " 🍹 50 ml Irlandzkiej Whiskey\n" +
                " 🍹 2 łyżeczki brązowego cukru\n" +
                " 🍹 schłodzona śmietanka 30%\n" +
                " 🍹 opcjonalnie kakao')");//działa


//JAMESON SPRITE AND LIME
        database.execSQL("INSERT INTO Drinks VALUES('Jameson Sprite and lime',' \n \n Ten bardzo orzeźwiający drink \n sprawdzi się idealnie na imprezę. \n Doskonały dla smakoszy Whiskey. \n'," +
                "'🍹 50 ml Jameson Irish Whiskey\n" +
                " 🍹 Sprite\n" +
                " 🍹 Duża cząstka limonki')");//działa


//APEROL SPRITZ AW
        database.execSQL("INSERT INTO Drinks VALUES('Aperol Spritz'," +
                "'\n \n Drink zawierający obecnie bardzo \n popularny Aperol z dodatkiem Prosecco \n  będzie idealny do obiadu w upalny \n dzień nad morzem.\n', " +
                "\n" +
                " '🍹 3 porcje Prosecco\n" +
                " 🍹 2 porcje Aperola\n" +
                " 🍹 1 porcja wody gazowanej\n" +
                " 🍹 kostki lodu\n" +
                " 🍹 plaster pomarańczy.')");//działa

//THE SWEDISH PALOMA
        database.execSQL("INSERT INTO Drinks VALUES('The Swedish Paloma',' \n \n Dla miłośników kwaśnych smaków,\n drink ten będzie idealny  na ciepły,\n letni wieczór. \n ', " +
                "'🍹 50 ml Absolut Grapefruit \n"+
                " 🍹 50 ml soku z grejpfruta \n"+
                " 🍹 10 ml soku z limonki \n"+
                " 🍹 woda gazowana \n"+
                " 🍹 1 cząstka grejpfruta \n"+
                " 🍹 kostki lodu')");//działa


//TRUCIZNA WDOWY
        database.execSQL("INSERT INTO Drinks VALUES('Trucizna Wdowy','\n \n Słodko-kwaśny drink z prostych składników,\n którym najważniejszy jest Frugo. \n', " +
                "'🍹 40 ml wódki cytrynowej \n"+
                " 🍹 40 ml soku grejpfrutowego \n"+
                " 🍹 20 ml grenadiny \n"+
                " 🍹 150 ml czarnego Frugo\n"+
                " 🍹 kostki lodu')");//działa

        //VODKA MOJITO
        database.execSQL("INSERT INTO Drinks VALUES('Vodka Mojito',' \n \n Klasyczny i jeden z najpopularniejszych \n drinków. Idealny dla smakoszy \n mocnego alkoholu i kwaśnego smaku. \n', "+
                "'🍹 40 ml wódki \n"+
                " 🍹 limonka \n"+
                " 🍹 10 g trzcinowego cukru \n"+
                " 🍹 woda gazowana \n"+
                " 🍹 10 liści mięty\n"+
                " 🍹 lód')");//działa

//ORANGE COSMO
        database.execSQL("INSERT INTO Drinks VALUES('Orange Cosmo',' \n \n Orange Cosmo to jeden z najpopularniejszych \n drinków,  który z pewnością będzie \n idealny na domówkę.\n', " +
                "'🍹 40 ml wódki pomarańczowej \n"+
                " 🍹 15 ml Cointreau \n"+
                " 🍹 15 ml soku z cytryny \n"+
                " 🍹 30 ml soku żurawinowego \n"+
                " 🍹 kostki lodu')"); //działa









        //CALIMACHO
        database.execSQL("INSERT INTO Drinks VALUES('Calimacho','" +
                " \n \n Idealnie orzeźwiający drink na \n ciepłe letnie wieczory.\n', " +
                "'🍹 30 ml ginu\n" +
                " 🍹 60 ml herbaty Earl Grey\n" +
                " 🍹 10 ml soku z limonki\n"+
                " 🍹 15 ml syropu cukrowego')"); //działa




//SZPRYCER
        database.execSQL("INSERT INTO Drinks VALUES('Szprycer','\n \n W gorący letni dzień najlepiej \n wypić szprycera. Ten orzeźwiający napój, schładza \n organizm i gasi pragnienie.\n', " +
                "'🍹 białe wino\n" +
                " 🍹 woda gazowana\n" +
                " 🍹 kostki lodu\n"+
                " 🍹 cytryna')"); //działa




        //FRENCH 75
        database.execSQL("INSERT INTO Drinks VALUES('French 75', ' \n \n Moc tego prostego drinka z ginem i szampanem \n potrafi dać solidnego kopa, zupełnie jak pocisk artyleryjski.\n'," +
                "'🍹 40 ml ginu\n" +
                " 🍹 80 ml szampana lub wina musującego\n" +
                " 🍹 20 ml soku z cytryny\n"+
                " 🍹 20 ml syropu cukrowego')"); //działa








//PROSECCO SPRITE
        database.execSQL("INSERT INTO Drinks VALUES('Prosecco & Sprite',' \n \n To świetny sposób na letnie orzeźwienie,\n szczególnie dla fanów \n cytrusowego smaku. \n', " +
                "'🍹 70 ml Prosecco\n" +
                " 🍹 200 ml Sprite’a\n" +
                " 🍹 100 ml wody gazowanej\n"+
                " 🍹 5 g cukru\n"+
                " 🍹 kostki lodu\n"+
                " 🍹 liście mięty')"); //działa

//PROSECCO Z MARTINI FIERO
        database.execSQL("INSERT INTO Drinks VALUES('Prosecco z Martini Fierro',' \n \n To świetny wybór na letnie orzeźwienie.\n', " +
                "'🍹 80 ml Martini Fiero\n" +
                " 🍹 80 ml schłodzonego Prosecco\n" +
                " 🍹 40 ml woda gazowana\n"+
                " 🍹 kostki lodu\n"+
                " 🍹 plasterek pomarańczy')"); //działa

//DRINK Z SZAMPANEM I SOKIEM
        database.execSQL("INSERT INTO Drinks VALUES('Drink z szampanem i sokiem',' \n \n To świetny sposób na prostego, lekkiego \n oraz orzeźwiającego drinka.\n ', " +
                "'🍹 100 ml Prosecco\n" +
                " 🍹 sok z brzoskwini')"); //działa





//SZAMPAN Z TRUSKAWKAMI
        database.execSQL("INSERT INTO Drinks VALUES('Szampan z truskawkami',' \n \n Słodki,truskawkowy i orzeźwiający \n napój z dodatkiem szampana.\n', " +
                "'🍹 500 g truskawek \n" +
                " 🍹 50 g cukru\n" +
                " 🍹 10 ml soku z cytryny\n"+
                " 🍹 250 ml Szampana')"); //działa


//SZAMPAN Z RUMEM
        database.execSQL("INSERT INTO Drinks VALUES('Szampan z rumem','\n \n Orzeźwiający drink, który będzie \n idealny na letnie wieczory.\n', " +
                "'🍹 40 ml Szampana\n" +
                " 🍹 40 ml Rumu\n" +
                " 🍹 20 ml soku pomarańczowego\n" +
                " 🍹 20 ml soku z limonki')"); //działa



//SZAMPAN Z GINEM
        database.execSQL("INSERT INTO Drinks VALUES('Szampan z ginem','\n \n Orzeźwiający drink, który będzie idealny \n na letnie piątkowe wieczory.\n', " +
                "'🍹 30 ml ginu\n" +
                " 🍹 15 ml soku z cytryny\n" +
                " 🍹 10 ml syropu z cukru trzcinowego\n" +
                " 🍹 lód.')");  //działa

//SZAMPAN Z WÓDKĄ
        database.execSQL("INSERT INTO Drinks VALUES('Szampan z wódką',' \n \n Idealny drink dla tych, którzy chcą \n szybko osiągnąć pożądany stan.\n ', " +
                "'🍹 50 ml wódki\n" +
                " 🍹 50 ml soku z cytryny\n" +
                " 🍹 100 ml Szampana słodkiego \n" +
                " 🍹 lód.')");  //działa



//CZARNY ROSJANIN
        database.execSQL("INSERT INTO Drinks VALUES('Czarny Rosjanin',' \n \n Ten drink będzie idealny dla \n smakoszy kawy. Doskonały w zimowy \n wieczór.\n', "+
                "'🍹 50 ml wódki\n" +
                " 🍹 20 ml likieru kawowego\n" +
                " 🍹 lód')"); //działa






//HAIRLESS DUCK
        database.execSQL("INSERT INTO Drinks VALUES('Hairless Duck','\n \n Idealny drink dla smakoszy \n ajerkoniaków. Zdecydowanie \n sprawdzi się zimą \n przy kominku.\n', " +
                "'🍹 50 ml Wódki\n" +
                " 🍹 15 ml Rumu\n" +
                " 🍹 30 ml Ajerkoniaku \n" +
                " 🍹 sok pomarańczowy')");//OK

//MALIBU SUNRISE
        database.execSQL("INSERT INTO Drinks VALUES('Malibu Sunrise',' \n \n Prosty i szybki drink, idealny na imprezę.\n Doskonały dla fanów kokosa. \n', " +
                "' 🍹 40 ml wódki\n" +
                "  🍹 30 ml Malibu\n" +
                "  🍹 15 ml grenadiny \n" +
                "  🍹 Kilka kostek lodu.')");//OK



//BANANABALL
        database.execSQL("INSERT INTO Drinks VALUES('Bananaball',' \n \n Drink, którego smak może zaskoczyć \n swoją słodyczą i orzeźwieniem. \n', " +
                "' 🍹 40 ml likieru bananowego\n" +
                "  🍹 30 ml wódka\n" +
                "  🍹 80 ml soku pomarańczowego \n" +
                "  🍹 lód.')");//OK



//RED CHERRY
        database.execSQL("INSERT INTO Drinks VALUES('Red Cherry','\n \n Idealny drink dla wielbicieli wiśniowego smaku.\n ', " +
                "' 🍹 50 ml Wódki\n" +
                "  🍹 15 ml likieru Maraschino\n" +
                "  🍹 5 ml Grenadiny \n" +
                "  🍹 75 ml soku ananasowego')");//OK


//EL DIABLO
        database.execSQL("INSERT INTO Drinks VALUES('El Diablo','\n \n Drink dla osób, które zdecydowanie \n wolą pikantne smaki.\n', "+
                "' 🍹 40 ml Tequili\n" +
                "  🍹 15 ml likieru porzeczkowego \n" +
                "  🍹 30 ml soku z limonki\n" +
                "  🍹 15 ml syropu z agawy\n" +
                "  🍹 10 ml Ancho Reyes Verde\n" +
                "  🍹 100 ml piwa imbirowego')");//OK

//CERVEZA PREPARADA
        database.execSQL("INSERT INTO Drinks VALUES('Cerveza Preparada',' \n \n Cerveza preparada to meksykański \n napój piwny o pikantnym smaku.\n', " +
                "'🍹 30 ml piwa \n" +
                " 🍹 50 ml soku pomidorowego\n" +
                " 🍹 10 ml soku z limonki\n" +
                " 🍹 15 ml soku z cytryny\n" +
                " 🍹 kropla ostrego sosu ')");//OK

//RUSS GREJPFRUTOWY
        database.execSQL("INSERT INTO Drinks VALUES('Russ Grejpfrutowy','\n \n Doskonały drink na gorące dni.\n Fantastyczny dla fanów kwaśnych \n  i cierpkich smaków.\n', " +
                "'🍹 250 ml piwa \n" +
                " 🍹 sok grejpfrutowy')");//OK





//PIWO Z SOKIEM Z CZARNEJ PORZECZKI
        database.execSQL("INSERT INTO Drinks VALUES('Piwo z sokiem z czarnej porzeczki','\n \n Drink idealny dla osób, które lubią smak czarnej porzeczki.\n', " +
                "'🍹 250 ml piwa \n" +
                " 🍹 125 ml soku porzeczkowego\n" +
                " 🍹 Odrobina likieru porzeczkowego\n" +
                " 🍹 15 ml soku z cytryny\n" +
                " 🍹 Kilka kostek lodu')");//OK

//CHERRY KISS
        database.execSQL("INSERT INTO Drinks VALUES('Cherry Kiss','\n \n Bardzo słodki, orzeźwiający drink \n z wiśniówką.Idealny i banalny napój imprezowy \n z dodatkiem cytryny oraz coli. \n', " +
                "'🍹 100 ml cola \n"+
                " 🍹 10 ml sok z cytryny \n"+
                " 🍹 40 ml wódka wiśniowa 40\n"+
                " 🍹 Kostki lodu')");//OK


//SAPODILL FIZZ
        database.execSQL("INSERT INTO Drinks VALUES('Sapodill Fizz',' \n \nDrink z intensywnym smakiem  brzoskwini,\n gruszki i nutką cytryny. Idealny na sezon grillowy.\n', " +
                "' 🍹 1½ porcje Absolut Apeach \n"+
                "  🍹 ⅓ porcja Sok Z cytryny \n"+
                "  🍹 1 porcja Puree Z gruszek \n"+
                "  🍹 ⅓ porcja Syropu Cukrowego \n"+
                "  🍹 Woda gazowana \n"+
                "  🍹 15 ml soku z cytryny \n"+
                "  🍹 Gruszka \n"+
                "  🍹 Kostki lodu')");//OK




//FINLANDIA CRANBERRY BRISK
        database.execSQL("INSERT INTO Drinks VALUES('Finlandia Cranberry Brisk','\n \n Drink o bardzo wyrazistym cytrusowym smaku\n doskonały na upalne dni.\n', " +
                "'🍹 1½ wódkę finlandia cranberry\n"+
                "🍹 ⅓ porcja Sok Z cytryny\n"+
                "🍹 ⅓ porcja Sok Z grejpfruta\n"+
                "🍹 Woda gazowana')");//OK












//MALINOWA ROZKOSZ
        database.execSQL("INSERT INTO Drinks VALUES('Malinowa Rozkosz','\n \n Malinowa Rozkosz to prosty drink z \n wódką malinową, \n sokiem z cytryny i spritem.\n Idealny drink na imprezę.\n', " +
                "' 🍹 100 ml Sprite \n"+
                "  🍹 20 ml sok z cytryny \n"+
                "  🍹 40 ml wódka malinowa  \n"+
                "  🍹 Kostki lodu')");//OK


//BLACKCURRANT SEA BREEZE
        database.execSQL("INSERT INTO Drinks VALUES('Blackcurrant Sea Breeze',' \n \n Blackcurrant Sea Breeze to wariacja klasycznego drinku \n Sea Breeze. Bardzo orzeźwiający, \n idealny na lato drink z \n wódką porzeczkową, \n sokiem żurawinowym i dodatkiem \n soku z grejpfruta.\n', " +
                "' 🍹 60 ml sok grejpfrutowy \n"+
                "  🍹 60 ml sok żurawinowy \n"+
                "  🍹 40 ml wódka porzeczkowa  \n"+
                "  🍹 Kostki lodu')");//OK

//SOK Z GUMIJAGÓD
        database.execSQL("INSERT INTO Drinks VALUES('Sok z Gumijagód',' \n \n Składa się on z dwóch składników:\n wódka pigwowa z sokiem porzeczkowym.\n Ten drink znany jest też pod nazwą Kociołek Panoramixa,\n który ma dodać dużo energii\n i sponiewierać tanim kosztem.\n', "+
                "'🍹 0,5 l wódki \n"+
                " 🍹 1 litr soku porzeczkowego \n"+
                " 🍹 Sok z cytryny  \n"+
                " 🍹 Kostki lodu')");//OK

//ABSOLUT SPICED APPLE SOUR
        database.execSQL("INSERT INTO Drinks VALUES('Absolut Spiced Apple sour',' \n \n Wykwintny i lekki drink o smaku jabłkowym,\n z nutą cytryny oraz dodatkiem żółtka jajka.\n', "+
                "' 🍹 1½ porcje Absolut Äpple \n"+
                "  🍹 ¾ porcja Sok Jabłkowy \n"+
                "  🍹 ¾ porcja Sok Z cytryny  \n"+
                "  🍹 ½ porcja Syrop Cukrowy  \n"+
                "  🍹 ⅙ porcja Białko Jajka  \n"+
                "  🍹 Kostki lodu')");//OK








//ABSOLUT PEARS LEMONADE
        database.execSQL("INSERT INTO Drinks VALUES('Absolut Pears Lemonade',' \n \n Drink na podstawie wódki gruszkowej z dodatkiem \n własnej lemoniady.\n Słodki i orzeźwiający idealny na \n upalne dni.\n', " +
                "' 🍹 1½ Porcje Absolut Pears\n"+
                "  🍹 5 ml sok Z cytryny\n"+
                "  🍹 soda Cytrynowa \n"+
                "  🍹 1 Cząstka Cytryna \n"+
                "  🍹 1 Całość Rurka \n"+
                "  🍹 Kostki lodu')");//OK


//GRZANIEC
        database.execSQL("INSERT INTO Drinks VALUES('Grzaniec','\n \n Bardzo rozgrzewający napój alkoholowy \n wraz z przyprawami korzennymi i \n innymi (np. goździkami, cynamonem \n lub miodem).\n', "+
                "'🍹 2 butelki wytrawnego wina \n" +
                " 🍹 2 pomarańcze \n" +
                " 🍹 1 cytryna \n" +
                " 🍹 parę goździków \n" +
                " 🍹 4 łyżki stołowe miodu \n" +
                " 🍹 1 laska cynamonu \n" +
                " 🍹 kawałek imbiru \n" +
                " 🍹 50 g rodzynek\"')");//OK

//BUSINESS TIME
        database.execSQL("INSERT INTO Drinks VALUES('Business Time',' \n \n Idealny drink na wieczory ze znajomymi \n po pracy. Smak bananów oraz syropu miodowego \n idealnie się komponują z gorzkim \n kardamonem.\n ', " +
                "'🍹 15 ml syropy miodowego \n" +
                " 🍹 100 ml likieru bananowego \n" +
                " 🍹 2 kardamonu \n" +
                " 🍹 50 ml Absolut Vodka \n" +
                " 🍹 80 ml soku z limonki \n" +
                " 🍹 tonik \n" +
                " 🍹 1 skórka cytryny')");//OK







        //PONCZ LISTOPADOWY
        database.execSQL("INSERT INTO Drinks VALUES('Poncz listopadowy','\n \n  Idealny, rozgrzewający drink na jesień. \n Będzie doskonały do wieczornego \n oglądania seriali pod kocykiem. \n', " +
                "'🍹 sok z połówki pomarańczy \n" +
                " 🍹 15 g czarnej liściastej herbaty \n" +
                " 🍹 15 g łyżeczki cukru \n" +
                " 🍹 50 ml wiśniówki')");//OK

        //HOT TODDY
        database.execSQL("INSERT INTO Drinks VALUES('Hot Toddy','\n \n Jest to popularny i prosty  drink, który \n idealnie się sprawdzi podczas \n wieczornych seansów.\n ', "+
                "'🍹 50 ml whiskey\n" +
                " 🍹 10 g miodu \n" +
                " 🍹 herbata \n" +
                " 🍹 cytryna \n" +
                " 🍹 woda ')");//OK





        database.execSQL("INSERT INTO Drinks VALUES('Monte z orzechem laskowym',' \n \n Mleczno-orzechowy deserowy drink,\n który poprawi każdemu nastrój  \n swoim smakiem i niebywałym \n wyglądem. Wersja z wódką o smaku \n orzechów laskowych.\n '," +
                "'🍹 200 ml wódki o smaku orzecha laskowego \n"+
                " 🍹 300 ml mleka 3,2% \n"+
                " 🍹 Kostki lodu')");//OK



        database.execSQL("INSERT INTO Drinks VALUES('Monte z orzechem włoskim',' \n \n Mleczno-orzechowy deserowy drink, \n który poprawi każdemu nastrój  swoim \n smakiem i niebywałym wyglądem.\n Wersja z wódką o smaku orzechów \n włoskich. \n'," +
                "' 🍹 200 ml wódki o smaku orzecha \n włoskiego \n"+
                "  🍹 300 ml mleka 3,2% \n"+
                "  🍹 Kostki lodu')");//OK


        database.execSQL("INSERT INTO Drinks VALUES('Heves',' \n \n Prosty Drink z wódką śliwkową oraz z sokiem pomarańczowym. \n Słodko-kwaśny smak umili ci każdy \n wieczór.\n '," +
                "' 🍹 50 ml wódki śliwkowej \n"+
                "  🍹 100 ml soku pomarańczowego \n"+
                "  🍹 50 ml soku żurawinowego \n"+
                "  🍹 15 ml soku z cytryny \n"+
                "  🍹 Kostki lodu')");//OK


        database.execSQL("INSERT INTO Drinks VALUES('Vodka Sunrise',' \n \n Wariacja drinku Tequila Sunrise,\n lecz zamiast Tequili jest wódka.\n Idealne dla osób,\n  które chcą poczuć meksykański klimat. \n '," +
                "'🍹 50 ml wódki \n"+
                " 🍹 150 ml soku pomarańczowego \n"+
                " 🍹 25 ml grenadiny \n"+
                " 🍹 25 ml soku malinowego \n"+
                " 🍹 Kostki lodu')");//OK


        database.execSQL("INSERT INTO Drinks VALUES('Paradise Bay',' \n \n Prosty bardzo smaczny i niesamowicie wyglądający egzotyczny drink. \n Idealny na wypoczynek przy basenie. \n '," +
                "' 🍹  80 ml wódki \n"+
                "  🍹  150 ml soku pomarańczowego \n"+
                "  🍹  25 ml  grenadyny \n"+
                "  🍹  40 ml likieru Blue Curacao \n"+
                "  🍹  Kostki lodu')");//OK



        database.execSQL("INSERT INTO Drinks VALUES('White Russian',' \n \n Mleczno-kawowy drink z wódką i likierem.\n Słodki oraz  bardzo mocny.\nIdealny dla osób, które  lubią \n słodkie i intensywne drinki. \n'," +
                "'  🍹  50 ml wódki \n"+
                "   🍹  20 ml likieru kawowego \n"+
                "   🍹  50 ml mleka skondensowanego \n"+
                "   🍹  Kostki lodu')");//OK



        database.execSQL("INSERT INTO Drinks VALUES('Pijany Kaktus',' \n \n Prosty, ciekawy i smaczny drink.\n Doskonały dla osób szukających nietypowych\n oraz egzotycznych smaków.\n'," +
                "' 🍹  50 ml wódki \n"+
                "  🍹  200 ml soku z kaktusa \n"+
                "  🍹  plasterek cytryny \n"+
                "  🍹  kostki lodu')");//OK




        database.execSQL("INSERT INTO Drinks VALUES('Blue Lagoon','\n\n Krystaliczno-błękitny drink z wódką i spritem. Swój kolor zawdzięcza likierowi Blue Curacao.\n Idealny do wypoczynku na Karaibach.\n'," +
                "' 🍹  50 ml wódki\n"+
                "  🍹  40 ml likieru Blue Curacao\n"+
                "  🍹  lemoniadą wypełniamy do pełna\n"+
                "  🍹  10 ml sok z cytryny\n"+
                "  🍹  Kostki lodu')");//OK


        database.execSQL("INSERT INTO Drinks VALUES('Szampan z arbuzem',' \n \n Idealny drink do spotkań towarzyskich \n w letnie, gorące popołudnie.\n Orzeźwiający smak arbuza \n zdecydowanie ugasi pragnienie. \n'," +
                "' 🍹 250 ml zimnego szampana \n"+
                "  🍹 arbuz bez pestek')");//OK








        database.execSQL("INSERT INTO Drinks VALUES( 'Mosscow Mule', ' \n \n Ten drink zdecydowanie dobrze \n sprawdzi się  podczas zimowych \n wieczorów.  Doskonały dla  osób, które \n lubią  korzenne smaki.\n',"+
                "' 🍹 50 ml wódki\n"+
                "  🍹 150 ml piwa imbirowego, \n"+
                "  🍹 25 ml soku z limonki \n"+
                "  🍹 lód \n"+
                "  🍹 kawałki cytryny\n')");//OK



        database.execSQL("INSERT INTO Drinks VALUES( 'Piwne Mojito', ' \n \n Klasyczny drink, który cieszy się \n sporą popularnością. Doskonały podczas piątkowych \n wieczorów na mieście.\n',"+
                "' 🍹 5 listków mięty\n"+
                "  🍹 ½ limonki\n"+
                "  🍹 50 ml Rumu\n"+
                "  🍹 250 ml piwa \n "+
                "  🍹 50 ml Sprite\n')");//OK



        //COTOGNAS APEROL FIZZ
        database.execSQL("INSERT INTO Drinks VALUES('Cotogna`s Aperol Fizz',' \n \n Jeden z najciekawszych drinków \n z aperolem, który zachwyci Cię \n swoim wyglądem i smakiem. \n'," +
                "' 🍹 50 ml Aperol\n" +
                "  🍹 20 ml sok z cytryny \n" +
                "  🍹 10 ml syrop cukrowy\n" +
                "  🍹 50 ml woda gazowana \n" +
                "  🍹 ubite białko jajka')");//OK


        database.execSQL("INSERT INTO Drinks VALUES('Pomarańczowe orzeźwienie',' \n \n Idealny drink na letnie, upalne dni. \n Prosty w wykonaniu, sprawdzi się \n dla miłośników drinków \n bezalkoholowych. \n'," +
                "' 🍹 100 ml soku pomarańczowego.\n" +
                "  🍹 100 ml soku ananasowego.\n" +
                "  🍹 10 ml grenadiny.\n" +
                "  🍹 lód.')");//OK

        database.execSQL("INSERT INTO Drinks VALUES( 'Mojito', ' \n \n Idealne połączenie limonki i mięty.\n Bezalkoholowa wersja popularnego\n oraz orzeźwiającego drinka.\n',"+
                "' 🍹 limonka \n"+
                "  🍹 lód\n"+
                "  🍹 mięta\n"+
                "  🍹 5 g miodu\n"+
                "  🍹 sprite\n"+
                "  🍹 woda gazowana')");//OK

        //DRINK Z CURACAO
        database.execSQL("INSERT INTO Drinks VALUES ('Drink z Curacao',' \n \n Drink z Curacao to prosty w \n przygotowaniu i jeden z bardziej \n orzeźwiających drinków. W parze \n z jego wyśmienitym smakiem  idzie \n jego wygląd. \n'," +
                "'🍹 30 ml blue curacao \n" +
                " 🍹 250 ml Sprite \n" +
                " 🍹 5 g  cukru \n" +
                " 🍹 lód \n" +
                " 🍹 cytryna.')");//OK



        //SŁODKA SHIRLEY TEMPLE
        database.execSQL("INSERT INTO Drinks VALUES('Słodka Shirley Temple',' \n \n Słodki drink zawdzięczający swoją \n nazwę dzięki słynnej, \n amerykańskiej aktorce.\n'," +
                "' 🍹 80 ml Ginger Ale\n" +
                "  🍹 80 ml Sprite\n" +
                "  🍹 5 ml Grenadyna\n" +
                "  🍹 lód')");//OK


        //PINACOLADA
        database.execSQL("INSERT INTO Drinks VALUES('Pinacolada',' \n \nTo bezalkoholowa modyfikacja słynnego, klasycznego drinka,\n " +
                "  który przywędrował do nas prosto z karaibów. \n'," +
                "'🍹 50 ml mleczka kokosowego\n" +
                " 🍹 40 ml soku ananasowego\n" +
                " 🍹 Odrobina cukru\n" +
                " 🍹 Kruszony lód')");//OK



        //ARBUZOWA PYSZNOŚĆ
        database.execSQL("INSERT INTO Drinks VALUES('Arbuzowa pyszność','\n \n Idealna forma wakacyjnego relaksu i orzeźwienia.\n'," +
                "' 🍹 20 ml soku z limonki\n" +
                "  🍹 15 ml syropu cukrowego\n" +
                "  🍹 2 łyżki soczystego arbuza')");//OK

        //DWUKOLOROWY BANAN
        database.execSQL("INSERT INTO Drinks VALUES('Dwukolorowy banan',' \n \n Słodki, kolorowy drink. \n Najlepiej sprawdza się w okresie letnim. \n'," +
                "' 🍹 100 ml soku bananowego\n" +
                "  🍹 lód\n" +
                "  🍹 50 ml soku porzeczkowego')");//OK

//BEZKRWAWA MARY
        database.execSQL("INSERT INTO Drinks VALUES('Bezkrwawa Mary',' \n \n Ciekawa, bezalkoholowa propozycja \n klasycznego drinka. Idealna dla gości, którzy przyjadą \n na imprezę samochodem. \n'," +

                "'🍹 200 ml świeżo wyciśniętego soku pomidorowego\n" +
                " 🍹 2 posiekane dymki\n" +
                " 🍹 sok z 1 cytryny\n" +
                " 🍹 3 g Tabasco\n" +
                " 🍹 3 g sosu Worcestershire\n" +
                " 🍹 lód')");//OK


        database.execSQL("INSERT INTO Drinks VALUES( 'Czerwona siła', '\n \n Pyszny koktajl, który zdecydowanie \n doda Ci wiele energii na cały dzień.\n Idealny napój na lunch. \n',"+
                "'🍹 100 ml Zakwas z buraka\n"+
                " 🍹 100 ml sok pomidorowy \n"+
                " 🍹 Tabasco 15 ml\n"+
                " 🍹 korzeń chrzanu \n')");//OK





    }


}
