package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // w ramach klasy z innej paczki i niepowiązanej z klasą rodzica, brak dostepu do pól/metod private, default i protected
    // (odwołanie do pól metod poprzez uprzednie stworzenie obiektu klasy i wskazanie pól/metod z klasy parent.)


    public void testIdentifier() {
        Parent parent = new Parent ();
        System.out.println(parent.first);
        parent.firstMethod();
    //  System.out.println(parent.second);
    //  System.out.println(parent.third);
    //  System.out.println(parent.fourth);

   //    parent.secondMethod();
     //  parent.thirdMethod();
     //   parent.fourthMethod();
    }
}
