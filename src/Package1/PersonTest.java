package Package1;

public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("clark", 12, "Academy X");
        teacher.teachMath();
        teacher.eat();
        teacher.walk();

        /*teacher.name = "Joe";
        teacher.age = 55;
        teacher.schollname = "academy";*/
/*      teacher.walk();
        */


        System.out.println("");

        Footballer footballer = new Footballer("rob", 21,"klub2");
        footballer.playFootball();
        footballer.eat();

        /*footballer.name = "Mike";
        footballer.age = 33;
        footballer.footballClub = "KLUB 1";
        footballer.playFootball();*/
    }


}
