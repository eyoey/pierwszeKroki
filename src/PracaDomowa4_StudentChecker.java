// Stworz 3 obiekty klasy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow do tablicy.
// Przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody


public class PracaDomowa4_StudentChecker {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;

        Student student1 = new Student();
        student1.imie = "S1_imie";
        student1.nazwisko = "S1_nazwisko";
        student1.email = "S1_email";
        student1.numerIndeksu = 1;
        student1.login = "S1_login";
        String uczelniaStud1 = student1.nazwaUczelni;
        Student.infoUczelnia();


        Student student2 = new Student();
        student2.imie = "S2_imie";
        student2.nazwisko = "S2_nazwisko";
        student2.email = "S2_email";
        student2.numerIndeksu = 2;
        student2.login = "S2_login";

        Student student3 = new Student();
        student3.imie = "S3_imie";
        student3.nazwisko = "S3_nazwisko";
        student3.email = "S3_email";
        student3.numerIndeksu = 3;
        student3.login = "S3_login";

        /*Student[] studenci = new Student[3];
        studenci[0] = student1;
        studenci[1] = student2;
        studenci[2] = student3;*/

        /*for (int i = 0; i < studenci.length; i++) {
            studenci[i].przedstawSie();
            studenci[i].podajEmail();
            studenci[i].podajNrIndeksu();
            studenci[i].zalogujSie();
        }*/

        /*student1.daneStudenta2();
        student2.daneStudenta2();
        student3.daneStudenta2();*/

        String [] studenci = new String[3];
        studenci[0] = student1.daneStudenta2();
        studenci[1] = student2.daneStudenta2();
        studenci[2] = student3.daneStudenta2();

        /* studenci[0] = stud1;
         studenci[1] = stud2;
         studenci[2] = stud3;*/

        for (int i = 0; i < studenci.length; i++) {
          //  studenci[i].daneStudenta();

            System.out.println(studenci[i]);

        }

    }


}
