package lambda;

// jeżeli interface jest funkcjonalny, czyli ma tylko 1 metodę, to można z niej skorzystać wyrażeniem lambda 'Klasa obiektKlasy = (parametr1,parametr2) -> działanie

public class StudentTest {

    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it, 21);


        Student med = new Student() {
            @Override
            public void sayHello(String name,int age) {
                System.out.println("med student");
                System.out.println("my name is: " + name + ", my age is: " + age);
            }
        };
            sayHello("kate", med, 22);

        // (parametr) -> System.out.println("not a student, my name is: " + name);
        Student notStudent = (name,age) -> {
            System.out.println("not a student, my name is: " + name);
            System.out.println("my age is " + age);
        };


        sayHello("Bart", notStudent, 23);

    }
        public static void sayHello (String name, Student student, int age){
            student.sayHello(name, age);
        }
    }
