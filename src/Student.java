public class Student {

    public String imie;
    public String nazwisko;
    public String login;
    public String email;
    public int numerIndeksu;


    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje się za pomocą" + login);
    }

    public void podajNrIndeksu() {
        System.out.println("Mój nr indeksu: " + numerIndeksu);
    }

    public void podajEmail() {
        System.out.println("Mój e-mail: " + email);
    }
}
