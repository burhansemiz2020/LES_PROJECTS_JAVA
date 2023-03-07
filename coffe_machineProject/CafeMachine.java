package coffe_machineProject;

import java.util.Scanner;

public class CafeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kahve kahve = new Kahve();
        System.out.println("Kahve makinesine hoşgeldiniz!");

        do {
            System.out.println("\nKahve seçenekleri:");
            System.out.println("1. Americano");
            System.out.println("2. Cappuccino");
            System.out.println("3. Espresso");
            System.out.println("4. Latte");
            System.out.println("5. Mocha");
            System.out.println("6. Macchiato");
            System.out.println("7. Decaf");

            System.out.print("\nLütfen kahve seçeneği numarasını girin: ");
            int kahveSecimi = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nŞeker seçenekleri:");
            System.out.println("1. Az şekerli");
            System.out.println("2. Orta şekerli");
            System.out.println("3. Çok şekerli");
            System.out.println("4. Şekersiz");

            System.out.print("\nLütfen şeker seçeneği numarasını girin: ");
            int sekerSecimi = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nBardak boyutu seçenekleri:");
            System.out.println("1. Küçük boy bardak");
            System.out.println("2. Orta boy bardak");
            System.out.println("3. Büyük boy bardak");

            System.out.print("\nLütfen bardak boyutu seçeneği numarasını girin: ");
            int bardakSecimi = scanner.nextInt();
            scanner.nextLine();

            kahve.hazirla(kahveSecimi, sekerSecimi, bardakSecimi);

            System.out.print("\nLütfen ödeme tutarını girin (euro cinsinden): ");
            double odemeTutari = scanner.nextDouble();
            scanner.nextLine();

            double kahveFiyati = kahve.getFiyat();
            if (odemeTutari < kahveFiyati) {
                System.out.println("\nGirdiğiniz ödeme tutarı yeterli değil.");
                continue;
            }

            double paraUstu = odemeTutari - kahveFiyati;
            System.out.printf("\nKahve hazır! Para üstünüz %.2f euro.", paraUstu);

            System.out.print("\nBaşka bir kahve almak istiyor musunuz? (evet/hayır): ");
        } while (scanner.nextLine().equalsIgnoreCase("evet"));

        System.out.println("\nKahve makinesini kullandığınız için teşekkürler!");
    }
}
class Kahve {
    private String isim;
    private int seker;
    private int bardak;
    private double fiyat;

    public void hazirla(int kahveSecimi, int sekerSecimi, int bardakSecimi) {
        switch (kahveSecimi) {
            case 1:
                isim = "Americano";
                fiyat = 1.0;
                break;
            case 2:
                isim = "Cappuccino";
                fiyat = 1.0;
                break;
            case 3:
                isim = "Espresso";
                fiyat = 2.0;
                break;
            case 4:
                isim = "Latte";
                fiyat = 2.0;
                break;
            case 5:
                isim = "Mocha";
                fiyat = 2.0;
                break;
            case 6:
                isim = "Macchiato";
                fiyat = 2.0;
                break;
            case 7:
                isim = "Decaf";
                fiyat = 1.0;
                break;
            default:
                System.out.println("Geçersiz kahve seçeneği numarası!");
                break;
        }
        switch (sekerSecimi) {
            case 1:
                seker = 1;
                break;
            case 2:
                seker = 2;
                break;
            case 3:
                seker = 3;
                break;
            case 4:
                seker = 0;
                break;
            default:
                System.out.println("Geçersiz şeker seçeneği numarası!");
                break;
        }

        switch (bardakSecimi) {
            case 1:
                bardak = 1;
                break;
            case 2:
                bardak = 2;
                break;
            case 3:
                bardak = 3;
                break;
            default:
                System.out.println("Geçersiz bardak boyutu seçeneği numarası!");
                break;
        }
    }

    public String getIsim() {
        return isim;
    }

    public int getSeker() {
        return seker;
    }

    public int getBardak() {
        return bardak;
    }

    public double getFiyat() {
        return fiyat;
    }


    }

