public class Person {

    public String name;
    public int age;


    public Person(String name, int age) {
        System.out.println("Zawartość z konstruktora Person");
        this.name = name;
        this.age = age;
    }

        public void eat () {
            System.out.println("i like eat (nie nadpisane)");
        }

        public void walk () {
            System.out.println("Walk Walk Walk");
        }
    }
