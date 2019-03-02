package KontoBankowe;

public class BrakHajsuException extends RuntimeException{
    public BrakHajsuException(String opis) {
        super(opis);
    }
}