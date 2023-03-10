import java.util.Scanner;

public class HesapMakinasiProjesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Switch case ile 4 islem yapan basit bir hesap makinasi yapin.
        System.out.println("===Islemler===");
        String islemler = " 1. Toplama Islemi \n" + " 2. Cikarma Islemi \n"
                          + " 3. Carpma Islemi \n" + " 4. Bolme Islemi";
        System.out.println(islemler);
        System.out.println("\nYukaridaki islemlerden birini seciniz: ");
        double islemSec = scan.nextDouble();

        switch ((int) islemSec) {
            case 1:
                System.out.print("Birinci sayi: ");
                double a= scan.nextInt();
                System.out.print("Ikinci sayi: ");
                double b=scan.nextInt();
                System.out.println("Toplama islemi icin sonuc: " + (a+b));
                break;
            case 2:
                System.out.print("Birinci sayi: ");
                a= scan.nextInt();
                System.out.print("Ikinci sayi: ");
                b=scan.nextInt();
                System.out.println("Cikarma islemi icin sonuc: " + (a-b));
                break;
            case 3:
                System.out.print("Birinci sayi: ");
                a= scan.nextInt();
                System.out.print("Ikinci sayi: ");
                b=scan.nextInt();
                System.out.println("Carpma islemi icin sonuc: " + (a*b));
                break;
            case 4:
                System.out.print("Birinci sayi: ");
                a= scan.nextInt();
                System.out.print("Ikinci sayi: ");
                b=scan.nextInt();
                System.out.println("Bolme islemi icin sonuc: " + (a/b));
                break;
            default:
                System.out.println("Gecersiz Islem");
                break;

        }

    }
}
