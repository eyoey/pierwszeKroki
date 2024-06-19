package identifiers.first;


public class Child extends Parent{

   //w ramach paczki brak dostępu do pól z identyfikatorem private

    public void testIdentifier() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    //    System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
     //   fourthMethod();
    }
}
