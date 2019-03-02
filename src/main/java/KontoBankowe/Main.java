package KontoBankowe;

public class Main {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(0.0, "123");

        try {
            kontoBankowe.przelejPieniadzeNaKonto(100.0);
        } catch (NiepoprawnaKwotaException e) {
            System.err.println("Błąd przelewu");
            // tutaj nie wystąpi, kwota przelewu jest dodatnia.
        }

        try {
            kontoBankowe.przelejPieniadzeNaKonto(-100.0);
        } catch (NiepoprawnaKwotaException e) {
            System.err.println("Przelano ujemne pieniądze. " + e.getMessage());
        }

        try {
            kontoBankowe.wyplacPieniadze(-200);
        } catch (BrakHajsuException re) {
            System.out.println("Brak pieniedzy");
        } catch (NiepoprawnaKwotaException e) {
            System.out.println("kwota jest ujemna");
        }
    }
}