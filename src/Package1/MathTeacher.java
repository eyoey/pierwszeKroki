package Package1;

public class MathTeacher extends Person {

    public String scholname;

    public MathTeacher(String name, int age, String schoolname) {
        super(name, age);
        System.out.println("treść z konstruktora MatchTeacher");
        this.scholname = schoolname;
    }

/*    public void eat() {
        System.out.println("eat nadpisane");;
    }*/

    public void walk() {
        super.eat();
        System.out.println("metoda walk z klasy mathteacher" );
    }

    public void teachMath() {
        System.out.println("math teacher called: " + name + " " + "aged " + age + " from school " + scholname);

    }




}
