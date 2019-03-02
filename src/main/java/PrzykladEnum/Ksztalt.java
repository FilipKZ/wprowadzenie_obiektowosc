package PrzykladEnum;

public enum Ksztalt {

    TROJKAT(3),
    CZWOROKAT(4),
    PIECIOKAT(5);

    private int iloscWierzcholkow;

    Ksztalt(int iloscWierzcholkow) {
        this.iloscWierzcholkow = iloscWierzcholkow;
    }

}
