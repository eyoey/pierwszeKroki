package identifiers.first;

public class Parent {

    public String first = "public"; //ogólnodostępny
    String second = "default";  // (bez identyfikatora) dostepny w obrębie paczki
    protected String third = "protected"; // niedostępny dla klasy z innej paczki
    private String fourth = "private"; // private - dostep w ramach klasy

    public void firstMethod() {
        System.out.println("public");
    }
    void secondMethod() {
        System.out.println("default");
    }
    protected void thirdMethod() {
        System.out.println("protected");
    }
    private void fourthMethod() {
        System.out.println("private");
    }



    // w ramach klasy jest dostep do wszystkich identyfikatorów
    public void testIdentifiers() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }

}
