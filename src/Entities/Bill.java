package Entities;

public class Bill {

    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

   
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

   
    public double feeding() {
        double valorCervejas = beer * 5.0;
        double valorRefrigerantes = softDrink * 3.0;
        double valorEspetinhos = barbecue * 7.0;
        return valorCervejas + valorRefrigerantes + valorEspetinhos;
    }

    public double cover() {
        double consumo = feeding();
        return consumo > 30.0 ? 0.0 : 4.0;
    }

    public double ticket() {
        return (gender == 'M' || gender == 'm') ? 10.0 : 8.0;
    }

    public double total() {
        return feeding() + cover() + ticket();
    }
}
