package Rower;

//Zadanie: Stwórz enum TypRoweru i daj mu dwie wartości: ROWER, TANDEM.
//        Dodatkowo enum posiada pole o nazwie ilośćMiejsc. Dla enuma ROWER pole ma wartość 1, dla TANDEM’u ma wartość 2.
//        a. Stwórz metodę ‘pobierzIlośćMiejsc():int’.
//
//        b. Stwórz klasę Rower która posiada pola:
//        ilośćPrzerzutek, typRoweru, nazwaRoweru
//
//        c. Stwórz metodę ‘wypiszInformacjeORowerze():void” która wypisuje informacje oraz podaje/wypisuje ilość miejsc (w postaci liczby).
//        d. Stwórz main’a, w metodzie main stwórz 3 rowery, przechowaj je w tablicy i wypisz je pętlą for.

public class Main {

    public static void main(String[] args) {

        Rower[] rowers = new Rower[3];

        rowers[0] = new Rower(5, TypRoweru.TANDEM, "Tandem mk1");
        rowers[1] = new Rower(4, TypRoweru.ROWER, "Rower mk1");
        rowers[2] = new Rower(6, TypRoweru.ROWER, "Rower mk2");

        for (Rower rower: rowers) {
            rower.wypiszInformacjeORowerze();
        }

    }

}
