package AdultClub;

public class Main {

    public static void main(String[] args) {

        Club club = new Club();

        Person osoba = new Person("Adam", "Kowalski", 26);

        try {
            club.enter(osoba);
        }catch (NoAdultException nae) {
            System.out.println(nae.getMessage());
        }
        System.out.println("Koniec programu");

    }

}
