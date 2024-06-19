package Package1;

public class StudentRef {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }


    public void zalogujSie() {
        System.out.println("Loguje się za pomocą" + nick);
    }
}
