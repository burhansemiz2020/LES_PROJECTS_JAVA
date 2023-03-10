package ProjetdEntrainement;

public class Idman {
    private int burpeeSayisi;
    private int pushUpSayisi;
    private int sitUpSayisi;
    private int squatSayisi;

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushUpSayisi() {
        return pushUpSayisi;
    }

    public void setPushUpSayisi(int pushUpSayisi) {
        this.pushUpSayisi = pushUpSayisi;
    }

    public int getSitUpSayisi() {
        return sitUpSayisi;
    }

    public void setSitUpSayisi(int sitUpSayisi) {
        this.sitUpSayisi = sitUpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }

    public Idman(int burpeeSayisi, int pushUpSayisi, int sitUpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushUpSayisi = pushUpSayisi;
        this.sitUpSayisi = sitUpSayisi;
        this.squatSayisi = squatSayisi;


    }

    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equals("Pushup")) {
            pushUpYap(sayi);
        } else if (hareketTuru.equals("Situp")) {
            sitUpYap(sayi);
        } else if (hareketTuru.equals("Squat")) {
            squatYap(sayi);
        } else {
            System.out.println("Gecersiz Hareket...");
        }
    }
    public void burpeeYap(int sayi) {
        if (burpeeSayisi == 0) {
            System.out.println("Yapacak burpee kalmadi");
        }
        if (burpeeSayisi - sayi < 0) {
            System.out.println("Hedefledigin burpee sayisini gectin");
            burpeeSayisi = 0;
            System.out.println("Burpee kalmadi: " + burpeeSayisi);
        } else {
            burpeeSayisi -= sayi;
            System.out.println("Kalan burpeeSayisi: " + burpeeSayisi);
        }
    }
    public void pushUpYap(int sayi) {
        if (pushUpSayisi == 0) {
            System.out.println("Yapacak pushup kalmadi");
        }
        if (pushUpSayisi - sayi < 0) {
            System.out.println("Hedefledigin pushup sayisini gectin");
            pushUpSayisi = 0;
            System.out.println("Pushup kalmadi: " + pushUpSayisi);
        } else {
            pushUpSayisi -= sayi;
            System.out.println("Kalan pushUpSayisi: " + pushUpSayisi);
        }
    }
    public void sitUpYap(int sayi) {
        if (sitUpSayisi == 0) {
            System.out.println("Yapacak situp kalmadi");
        }
        if (sitUpSayisi - sayi < 0) {
            System.out.println("Hedefledigin situp sayisini gectin");
            sitUpSayisi = 0;
            System.out.println("situp kalmadi: " + sitUpSayisi);
        } else {
            sitUpSayisi -= sayi;
            System.out.println("Kalan sitUpSayisi: " + sitUpSayisi);
        }
    }
    public void squatYap(int sayi) {
        if (squatSayisi == 0) {
            System.out.println("Yapacak squat kalmadi");
        }
        if (squatSayisi - sayi < 0) {
            System.out.println("Hedefledigin squat sayisini gectin");
            squatSayisi = 0;
            System.out.println("squat kalmadi: " + squatSayisi);
        } else {
            squatSayisi -= sayi;
            System.out.println("Kalan squatSayisi: " + squatSayisi);
        }
    }
    public boolean idmanBittiMi(){
        return (burpeeSayisi == 0) && (pushUpSayisi == 0) && (sitUpSayisi == 0) && (squatSayisi == 0);

    }
}