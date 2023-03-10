import java.util.Scanner;

public class TCKimlikNoSorusu {
    /*
    == TC kimlik numarasının son rakamı çift olmak zorundadır.
    == 0 rakamı ile başlayamaz.
    == ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir. Ayrıca;
    == 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının
    == 9 katının toplamının birler basamağı 10. rakamı;
    1, 3, 5, 7 ve 9. rakamın toplamının
    == 8 katının birler basamağı 11. rakamı vermektedir.
     */


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("TC kimlik numaranızı giriniz: ");
            String tcKimlikNo = input.nextLine();
            boolean gecerliMi = tcKimlikNoGecerliMi(tcKimlikNo);
            if (gecerliMi) {
                System.out.println("TC kimlik numarası geçerlidir.");
            } else {
                System.out.println("TC kimlik numarası geçersizdir.");
            }
        }

        public static boolean tcKimlikNoGecerliMi(String tcKimlikNo) {
            if (tcKimlikNo.length() != 11) {
                return false;
            }
            char[] tcKimlikNoDizi = tcKimlikNo.toCharArray();
            int[] tcKimlikNoSayiDizisi = new int[11];
            for (int i = 0; i < 11; i++) {
                tcKimlikNoSayiDizisi[i] = Character.getNumericValue(tcKimlikNoDizi[i]);
            }
            if (tcKimlikNoSayiDizisi[0] == 0) {
                return false;
            }
            int toplam1 = 0;
            for (int i = 0; i < 9; i++) {
                toplam1 += tcKimlikNoSayiDizisi[i];
            }
            int birlerBasamagi = toplam1 % 10;
            if (birlerBasamagi != tcKimlikNoSayiDizisi[9]) {
                return false;
            }
            int toplam2 = 0;
            for (int i = 0; i < 5; i++) {
                toplam2 += tcKimlikNoSayiDizisi[i * 2];
            }
            int toplam3 = 0;
            for (int i = 0; i < 4; i++) {
                toplam3 += tcKimlikNoSayiDizisi[i * 2 + 1];
            }
            int toplam4 = toplam2 * 7 + toplam3 * 9;
            int birlerBasamagi2 = toplam4 % 10;
            if (birlerBasamagi2 != tcKimlikNoSayiDizisi[10]) {
                return false;
            }
            int toplam5 = 0;
            for (int i = 0; i < 9; i++) {
                toplam5 += tcKimlikNoSayiDizisi[i];
            }
            int birlerBasamagi3 = toplam5 * 8 % 10;
            if (birlerBasamagi3 != tcKimlikNoSayiDizisi[10]) {
                return false;
            }
            if (tcKimlikNoSayiDizisi[10] % 2 != 0) {
                return false;
            }
            return true;
        }

    }

