// Stworz 3 obiekty klasy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow do tablicy.
// Przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody


public class PracaDomowa4_StudentChecker {

    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.imie = "S1_imie";
        Student1.nazwisko = "S1_nazwisko";
        Student1.email = "S1_email";
        Student1.numerIndeksu = 1;
        Student1.login = "S1_login";

        Student Student2 = new Student();
        Student2.imie = "S2_imie";
        Student2.nazwisko = "S2_nazwisko";
        Student2.email = "S2_email";
        Student2.numerIndeksu = 2;
        Student2.login = "S2_login";

        Student Student3 = new Student();
        Student3.imie = "S3_imie";
        Student3.nazwisko = "S3_nazwisko";
        Student3.email = "S3_email";
        Student3.numerIndeksu = 3;
        Student3.login = "S3_login";

/*        Student1.daneStudenta();
        Student2.daneStudenta();
        Student3.daneStudenta();*/

        String [] Studenci = new String[3];
        Studenci[0] = Student1;
        Studenci[1] = Student2;
        Studenci[2] = Student3;

        System.out.println(Studenci[1]);
    }


}
