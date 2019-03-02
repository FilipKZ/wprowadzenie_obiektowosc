package KoszykZakupowy;

import java.util.Arrays;

public class Rachunek {

    Produkt[] produkts;

    public Rachunek(Produkt[] produkts) {
        this.produkts = produkts;
    }

    public Produkt[] getProdukts() {
        return produkts;
    }

    public void wypiszRachunek() {
        for (Produkt produkt: produkts){
            System.out.println(produkt);
        }
    }

    @Override
    public String toString() {
        return "Rachunek{" +
                "produkts=" + Arrays.toString(produkts) +
                '}';
    }

    public double podsumujRachunekNetto() {
        double sumaNetto = 0.0;
        for (Produkt produkt: produkts) {
            sumaNetto += produkt.getCenaNetto();
        }
        return sumaNetto;
    }

    public double podsumujRachunekBrutto() {
        double sumaBrutto = 0.0;
        for (Produkt produkt: produkts) {
            sumaBrutto += produkt.podajCeneBrutto();
        }
        return sumaBrutto;
    }

    public double zwrocWartoscPodatku() {
        return podsumujRachunekBrutto() - podsumujRachunekNetto();
    }


}
