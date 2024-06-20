package Package1;

import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b;  // konwersja niejawna, "a" zostaje przekonwertowana na double (bo po dodaniu do inta przecinka nie ma utraty danych)

    //    int d = a/b;  // nie można przekonwertowac niejawnie bo ścięłoby .23 z doubla "b" robiąc int wiec byłaby utrata

        int d = (int) b/ a;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();
    }
}