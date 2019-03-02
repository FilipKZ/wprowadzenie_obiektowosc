package Robot;

public enum RuchRobota {
    KROK_LEWA(10),
    KROK_PRAWA(10),
    RUCH_REKA_PRAWA(5),
    RUCH_REKA_LEWA(5),
    SKOK(20);

    private int potrzebnaMoc;

    RuchRobota(int potrzebnaMoc) {
        this.potrzebnaMoc = potrzebnaMoc;
    }

    public int getPotrzebnaMoc() {
        return potrzebnaMoc;
    }
}
