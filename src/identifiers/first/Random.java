package identifiers.first;

public class Random {

    // w ramach klasy z tej samej paczki i niepowiązanej z klasą rodzica, brak dostepu do pól metod private
    // (odwołanie do pól metod poprzez uprzednie stworzenie obiektu klasy i wskazanie pól/metod z klasy parent.)


    public void testIdentifier() {
        Parent parent = new Parent ();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
    //    System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
    //    parent.fourthMethod();
    }

}
