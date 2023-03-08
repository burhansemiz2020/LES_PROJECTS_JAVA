package ATMPRojectWithOOP;

import java.util.Scanner;

public class Login {
    public boolean Login(Hesap hesap) {
        Scanner scan = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.println("Lütfen kullanıcı adını giriniz:");
        kullaniciAdi = scan.nextLine();

        System.out.println("Lütfen parola giriniz:");
        parola = scan.nextLine();
        if (hesap.getKullaniciadi().equals(kullaniciAdi) && hesap.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }


    }
}
