package KoszykZakupowy;

public class Produkt {

    private String nazwaProduktu;
    private double cenaNetto;
    private PodatekProduktu podatekProduktu;



    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public PodatekProduktu getPodatekProduktu() {
        return podatekProduktu;
    }

    public void setPodatekProduktu(PodatekProduktu podatekProduktu) {
        this.podatekProduktu = podatekProduktu;
    }

    public double podajCeneBrutto() {
        return cenaNetto + (cenaNetto * (podatekProduktu.getWysokoscPodatku()/100.0));
    }

    public Produkt(String nazwaProduktu, double cenaNetto, PodatekProduktu podatekProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaNetto = cenaNetto;
        this.podatekProduktu = podatekProduktu;
    }
}
