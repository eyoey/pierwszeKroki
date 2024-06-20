package drivers;

import drivers.WebDriver;

public class FirefoxDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Browser open by Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("element found by Firefox browser");
    }
}
