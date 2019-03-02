package AdultClub;

public class Club {

    public void enter(Person person) throws NoAdultException {
        if (person.getWiek() < 18) {
            throw new NoAdultException("Ponizej 18");
        }
        System.out.println("Witaj w klubie");
    }

    public Club() {
    }
}
