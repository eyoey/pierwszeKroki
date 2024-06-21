package Package1;

import drivers.NoValidBrowserName;
import drivers.WebDriver;
import drivers.ChromeDriver;
import drivers.FirefoxDriver;

public class ExceptionsExample {

    public static void main(String[] args) {
      /*  int [] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for(int i=0; i<=numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/


        WebDriver driver = getDriver("firefox");
        driver.get();
/*        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();*/

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        try {
            throw new NoValidBrowserName("bad browser name");
        } catch (NoValidBrowserName noValidBrowserName) {
            noValidBrowserName.printStackTrace();
        }
        return null;
    }
}