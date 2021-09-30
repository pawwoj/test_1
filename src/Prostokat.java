public class Prostokat extends Figura {

    double bokA;
    double bokB;

    Prostokat(String nazwa, String kolor) {
        super(nazwa, kolor);
    }

    Prostokat(String nazwa, String kolor, double bokA, double bokB) {
        super(nazwa, kolor);
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }
}
