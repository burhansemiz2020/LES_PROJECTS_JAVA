package ATMPRojectWithOOP;

import java.util.Scanner;

public class ATM {
    public void ExecuteATM(Hesap hesap) {
        Login login = new Login();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenue a Notre Banque");

        System.out.println("======================");
        System.out.println("Kullanici Girisi");
        System.out.println("======================");
        int girisHakki = 3;
        while (true) {
            if (login.Login(hesap)) {
                System.out.println("Giris basarili....");
                break;
            } else {
                System.out.println("Giris Basarisiz");
                girisHakki--;
                System.out.println("Kalan giris hakki : " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz bitti");
                return;
            }
        }
        System.out.println("========================");
        String islemler = "1. Bakiye Goruntule\n"
                        + "2. Para Yatirma\n"
                        + "3. Para Cekme\n"
                        + "Cikis icin Q ya basiniz";
        System.out.println(islemler);
        System.out.println("========================");

        while (true) {
            System.out.println("Islemi seciniz : ");
            String islem = scan.nextLine();
            if (islem.equals("Q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("yatirmak istediginiz tutar : ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Cekmek istediginiz tutar : ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            } else {
                System.out.println("Gecersiz Islem...");
            }
        }
    }
}
