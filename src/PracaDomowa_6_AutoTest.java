public class PracaDomowa_6_AutoTest {
    public class Auto {


        public String marka;
        public String model;
        public int rok;
        public int przebieg;

        public Auto() {

        }

        public Auto(String marka, String model, int rok, int przebieg) {
            this.marka = marka;
            this.model = model;
            this.rok = rok;
            this.przebieg = przebieg;
        }

//  public void jedz() {
//        System.out.println("jade!");
//   }

        //    public void hamuj() {
//        System.out.println("Hamuj!");
//    }



        public void info() {
            System.out.println("Marka: " + marka);
            System.out.println("Model: " + model);
            System.out.println("Rok produkcji: " + rok);
            System.out.println("Przebieg: " + przebieg);
        }
    }

}
