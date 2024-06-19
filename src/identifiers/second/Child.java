package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    // w ramach innej paczki brak dostępu do private i bez identyfikatora (default)

    public void testIdentifier() {
        System.out.println(first);
     //   System.out.println(second);
        System.out.println(third);
     //   System.out.println(fourth);
        firstMethod();
     //   secondMethod();
        thirdMethod();
     //   fourthMethod();
    }
}
