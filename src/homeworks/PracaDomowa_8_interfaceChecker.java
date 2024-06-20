package homeworks;
// stwórz interface WebDriver, ktory bedzie mial dwie metody get() i findElementBy()
// Dodaj dwie klasy ChromeDriver i FirefoxDriver, które beda implementowaly ten interface

import drivers.ChromeDriver;
import drivers.FirefoxDriver;

public class PracaDomowa_8_interfaceChecker {

    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();
        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();


            }
        }
