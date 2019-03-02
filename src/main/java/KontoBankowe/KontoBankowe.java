package KontoBankowe;

public class KontoBankowe {
    private Double stanKonta;
    private String numerKonta;

    public KontoBankowe(Double stanKonta, String numerKonta) {
        this.stanKonta = stanKonta;
        this.numerKonta = numerKonta;
    }

    /**
     * Metoda do przelewania pieniedzy na konto.
     *
     * @param kwota - ile pieniedzy chcemy przelac na konto. kwota musi mieć wartość dodatnią.
     * @throws Exception - wyjątek który występuje jeśli kwota przelewu jest ujemna.
     */
    public void przelejPieniadzeNaKonto(double kwota) throws NiepoprawnaKwotaException {
        // przelew na konto, kwota ujemna
        if (kwota < 0) {
            throw new NiepoprawnaKwotaException("Niepoprawna kwota!");
        }
        stanKonta += kwota;
    }

    public double wyplacPieniadze(double kwota) throws NiepoprawnaKwotaException {
        if (kwota < 0) {
            // spora szansa na wystąpienie
            throw new NiepoprawnaKwotaException("Niepoprawna kwota!");
        }
        if (stanKonta < kwota) {
            // ten wyjątek ma małą szansę wystąpienia
            throw new BrakHajsuException("Brak wystarczających środków na koncie");
        }
        if (stanKonta >= kwota) { // mamy dużo pieniazkow i starczy na wyplate pieniedzy
            stanKonta -= kwota;
            return kwota;
        } // nie mamy wystarczających środków
        double pomocnicza = stanKonta;
        stanKonta = 0.0;

        return pomocnicza;
    }
}