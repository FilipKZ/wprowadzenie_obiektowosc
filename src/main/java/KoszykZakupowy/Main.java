package KoszykZakupowy;

public class Main {

    public static void main(String[] args) {

        Produkt produkt1 = new Produkt("Nazwa1", 15.00, PodatekProduktu.VAT5);
        Produkt produkt2 = new Produkt("Nazwa2", 7.00, PodatekProduktu.VAT23);
        Produkt[] produkts = new Produkt[2];
        produkts[0] = produkt1;
        produkts[1] = produkt2;

        Rachunek rachunek = new Rachunek(produkts);

        System.out.println(rachunek.podsumujRachunekBrutto());

    }
}
