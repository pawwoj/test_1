public abstract class Figura {
    public String getNazwa() {
        return nazwa;
    }

    public String getKolor() {
        return kolor;
    }

    String nazwa;
    String kolor;
    Figura(String nazwa, String kolor){
        this.nazwa = nazwa;
        this.kolor = kolor;
    }

    public abstract double obliczObwod();


}
