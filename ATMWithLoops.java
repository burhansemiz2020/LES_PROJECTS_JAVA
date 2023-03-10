import java.util.Scanner;

public class ATMWithLoops {
    public static void main(String[] args) {
        /*
        While dongusu yardimiyla bir tane ATM programi yazin
        Islemler
        1. Islem: Bakiye Ogrenme
        2. Islem: Para Cekme
        3. Islem: Para Yatirma
        Cikis:q
         */
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int bakiye = 1000;
        String islemler = " 1. Islem: Bakiye Ogrenme\n" +
                " 2. Islem: Para Cekme\n" +
                " 3. Islem: Para Yatirma\n" +
                " Cikis icin q'ya basiniz";
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");
        while (true) {
            System.out.println("Islemi Seciniz: ");
            String islem = scan.nextLine();
            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Uyari: Islemden Cikiliyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            } else if (islem.equals("2")) {
                System.out.println("Cekmek istediginiz Tutar: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli bakiyeniz yok. Lutfen para yatiriniz ");
                } else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
            } else if (islem.equals("3")) {
                System.out.println("Yatirmak istediginiz tutar: ");
                int eklenecekTutar = scan.nextInt();
                scan.nextLine();
                bakiye += eklenecekTutar;
                System.out.println("Yeni bakiyeniz " + bakiye);
            } else {
                System.out.println("Gecersiz Islem");
            }
        }
                /*
                **************************
                 1. Islem: Bakiye Ogrenme
                 2. Islem: Para Cekme
                 3. Islem: Para Yatirma
                 Cikis icin q'ya basiniz
                **************************
                Islemi Seciniz:
                1
                Bakiyeniz: 1000
                Islemi Seciniz:
                1
                Bakiyeniz: 1000
                Islemi Seciniz:
                2
                Cekmek istediginiz Tutar:
                1500
                Yeterli bakiyeniz yok. Lutfen para yatiriniz
                Islemi Seciniz:
                2
                Cekmek istediginiz Tutar:
                500
                Yeni bakiyeniz: 500
                Islemi Seciniz:
                3
                Yatirmak istediginiz tutar:
                1500
                Yeni bakiyeniz 2000
                Islemi Seciniz:
                q
                Uyari: Islemden Cikiliyor

                Process finished with exit code 0
                 */


    }
}
