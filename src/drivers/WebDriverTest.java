package drivers;



public class WebDriverTest {

    public static void main(String[] args) {

        WebDriver driver = getDriver("Firefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    private static WebDriver getDriver(String name) {
    if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("Firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
}
