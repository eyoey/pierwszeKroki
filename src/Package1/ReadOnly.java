package Package1;

// getter dostęp do pola private z danej klasy mozna uzyskac poprzed utworzenie w tej klasie metode zwracajaca wartosc - wartosc tylko do odczytu
// setter umozliwiamy dzialanie na danym polu ale nie bedzie mozna go pobrac i na nim dzialac (?)

public class ReadOnly {

    private String name = "IMIE";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
