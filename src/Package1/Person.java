package Package1;

public class Person {

    public String name;
    public int age;


    public Person(String name, int age) {
        System.out.println("Zawartość z konstruktora Package1.Person");
        this.name = name;
        this.age = age;
    }

        public final void eat () {
            System.out.println("i like eat (nie nadpisane)");
        }

        public void walk () {
            System.out.println("Walk Walk Walk");
        }
    }
