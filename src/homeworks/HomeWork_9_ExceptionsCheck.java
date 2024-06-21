package homeworks;

import Package1.InvalidAgeException;
import Package1.User;

public class HomeWork_9_ExceptionsCheck {

    // pobierz wiek od użytkownika, jeżeli będzie mniejszy od zera to wyrzuć wyjątek InvalidAgeException
    // Jeżeli mamy >= 18 to możemy wypisać, że użytkownik jest pełnoletni


    public static void main(String[] args) throws InvalidAgeException {
        User user1 = new User("name", "pass", -1);
        int age = user1.age;

        if(age<0) {
            //System.out.println("age not valid");
            throw new InvalidAgeException("age not valid");
        }
        if (age>=18) {
            System.out.println("Użytkownik pełnoletni");
        }
        else {
            System.out.println("age definition not set");
        }

    }




}