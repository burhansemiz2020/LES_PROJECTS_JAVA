package ATMPRojectWithOOP;

public class Main {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap=new Hesap("Burhan Semiz", "19802000", 5000);
        atm.ExecuteATM(hesap);
        System.out.println("<<ATM den cikiliyor>>");
    }
}
