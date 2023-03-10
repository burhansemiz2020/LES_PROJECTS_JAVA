package ProjetdEntrainement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bienvenue le programme d'entrainement");
        String idmanlar="Gecerli Hareketler...\n"+
                "Burpee\n"+
                "Pushup\n"+
                "Situp\n"+
                "Squat";
        System.out.println(idmanlar);
        System.out.println("Bir idman olusturun: ");
        System.out.print("Burpee sayisi: ");
        int burpee=scan.nextInt();
        System.out.print("Pushup sayisi: ");
        int pushup=scan.nextInt();
        System.out.print("Situp sayisi: ");
        int situp=scan.nextInt();
        System.out.print("Squat sayisi: ");
        int squat=scan.nextInt();
        scan.nextLine();

        Idman idman=new Idman(burpee,pushup,situp,squat);
        System.out.println("===Idmaniniz basliyor===");
        while (idman.idmanBittiMi()==false){
            System.out.print("Hareket turu (Burpee, Pushup, Situp, Squat) : ");
            String tur=scan.nextLine();
            System.out.print("Bu hareketten kac tane yapacaksiniz ? : ");
            int sayi= scan.nextInt();
            scan.nextLine();
            idman.hareketYap(tur,sayi);
        }
        System.out.println("====Idmanini basatiyla bitirdin====");


    }
}
