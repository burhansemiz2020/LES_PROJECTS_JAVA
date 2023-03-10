import java.util.Scanner;

public class BodyMassIndex_BMI {
    public static void main(String[] args) {
        /*
        Kullanicidan aldiginiz boy ve kilo degerlerine
        gore kullanicinin beden kitle indeksini bulun.
        Beden kitle indeksi:Kilo/Boy(m)*Boy(cm);
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz: ");
        double kilo=scan.nextDouble();
        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        double boy=scan.nextDouble();//metre cinsinden

        double BKI=kilo/(boy*boy);


        System.out.println("Beden Kitle indeksiniz: " +BKI);


    }
}
