package ATMPRojectWithOOP;

public class Hesap {
    private String kullaniciadi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciadi, String parola, int bakiye) {
        this.kullaniciadi = kullaniciadi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int tutar){
        bakiye+=tutar;
        System.out.println("Yeni Bakiyeniz: "+bakiye);
    }
    public void paraCek(int tutar){
        if (bakiye-tutar<0){
            System.out.println("Yeterli Bakiyeniz Yoktur...");
        }
        else{
            bakiye-=tutar;
            System.out.println("Yeni Bakiyeniz: "+bakiye);
        }
    }
}
