public class Student {

    public String imie;
    public String nazwisko;
    public String login;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";



    public void przedstawSie() {
        System.out.println("Nazywam sie: " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje się za pomocą: " + login);
    }

    public void podajNrIndeksu() {
        System.out.println("Mój nr indeksu: " + numerIndeksu);
    }

    public void podajEmail() {
        System.out.println("Mój e-mail: " + email);
    }

    public void daneStudenta() {
        System.out.println("Imie: " + imie);
        System.out.println("nazwisko: " + nazwisko);
        System.out.println("email: " + email);
        System.out.println("Nr indeksu: " + numerIndeksu);
        System.out.println("Login: " + login);
      //  return imie + " " + nazwisko + " " + email + " " + numerIndeksu + " " + login;
    }

    public String daneStudenta2() {

        return imie + " " + nazwisko + " " + email + " " + numerIndeksu + " " + login + " " + nazwaUczelni;
    }

    public static void  infoUczelnia() {
        System.out.println("Uczelnia studenta to: AHG");
    }

}
