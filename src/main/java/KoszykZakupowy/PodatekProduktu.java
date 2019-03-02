package KoszykZakupowy;

public enum PodatekProduktu {
    VAT8(8),
    VAT23(23),
    VAT5(5),
    NO_VAT(0);

    private double wysokoscPodatku;

    PodatekProduktu(double wysokoscPodatku) {
        this.wysokoscPodatku = wysokoscPodatku;
    }

    public double getWysokoscPodatku() {
        return wysokoscPodatku;
    }
}
