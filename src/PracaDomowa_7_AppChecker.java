// stworz klase bazowa App - zawiera pole name i metode appInfo, dodaj konstruktor ktorego przekazesz wartosc name
// stworz klasy potomne AndroidApp o IphoneApp - zawiera metode runAndroidApp / run IphoneApp

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
