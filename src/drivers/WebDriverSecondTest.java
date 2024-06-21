package drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver chrome2 = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefox2 = new FirefoxDriver();
        WebDriver firefox3 = new FirefoxDriver();


        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening on Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("found by Safari");
            }
        };

        WebDriver safari2 = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening on Safari 2");
            }

            @Override
            public void findElementBy() {
                System.out.println("found on Safari 2");
            }
        };

        safari.get();
        safari2.findElementBy();

    }
}
