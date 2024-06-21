package lambda;

public class ItStudent implements Student{

    @Override
    public void sayHello(String name, int age) {
        System.out.println("IT Student");
        System.out.println("my name is " + name + ", my age is: " + age);
    }
}
