package Package1;

import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCastingRef {

    public static void main(String[] args) {
        int a = 2;
        double b = 3.3d;
        double c = b/a;   // zmienna a zostaje automatycznie przekonwertowana na double

        int d = (int) b/a;  // rzutowanie typu na int

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
    }
}
