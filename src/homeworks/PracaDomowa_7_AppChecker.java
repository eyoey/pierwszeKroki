package homeworks;// stworz klase bazowa Package1.App - zawiera pole name i metode appInfo, dodaj konstruktor ktorego przekazesz wartosc name
// stworz klasy potomne Package1.AndroidApp o Package1.IphoneApp - zawiera metode runAndroidApp / run Package1.IphoneApp

import Package1.AndroidApp;
import Package1.IphoneApp;


public class PracaDomowa_7_AppChecker {

    public static void main(String[] args) {

        AndroidApp android = new AndroidApp("Androjd");
        android.appInfo();
        android.runAndroidApp();

        System.out.println("");

        IphoneApp iphone = new IphoneApp("iphoid");
        iphone.appInfo();
        iphone.runIphoneApp();


    }
}
