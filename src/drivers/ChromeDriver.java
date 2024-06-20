package drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Browser open by Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("element found by Chrome browser");
    }
}
