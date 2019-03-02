package Rower;

public class Rower {

    private int iloscPrzerzutek;
    private TypRoweru typRoweru;
    private String nazwaRoweru;

    public Rower(int iloscPrzerzutek, TypRoweru typRoweru, String nazwaRoweru) {
        this.iloscPrzerzutek = iloscPrzerzutek;
        this.typRoweru = typRoweru;
        this.nazwaRoweru = nazwaRoweru;
    }

    public void wypiszInformacjeORowerze () {
        System.out.println("Rower " + nazwaRoweru + " ma ilosc przerzutek " + iloscPrzerzutek + " przerzutek i " + typRoweru.getIloscMiejsc() + " miejsc.");
    }

}
