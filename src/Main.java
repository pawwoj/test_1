public class Main {

    public static void main(String[] args) {

        Prostokat prostokat1 = new Prostokat("prostokąt 1", "zielony", 2, 3.5);
        System.out.println(prostokat1.getNazwa() + " / " + prostokat1.getKolor() + " / ma obwód = " + prostokat1.obliczObwod());
    }
}

