package PrzykladEnum;

public class Komputer {
    private int moc;
    private String producent;
    private TypProcesora typ;


    public Komputer(int moc, String producent, TypProcesora typ) {
        this.moc = moc;
        this.producent = producent;
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "potrzebnaMoc=" + moc +
                ", producent='" + producent + '\'' +
                ", typ=" + typ +
                '}';
    }
}
