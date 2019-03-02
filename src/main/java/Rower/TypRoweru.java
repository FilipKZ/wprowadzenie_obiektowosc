package Rower;

public enum TypRoweru {

    ROWER(1),
    TANDEM(2);

    private int iloscMiejsc;

    TypRoweru(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }
}
