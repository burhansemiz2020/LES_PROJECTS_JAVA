import java.util.Scanner;

public class DikUcgeninHipotenusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dik ucgenin birinci dik kenarini gir: ");
        int a=scan.nextInt();
        System.out.println("Dik ucgenin ikinci dik kenarini gir: ");
        int b= scan.nextInt();
        double hip=Math.sqrt(a*a+b*b);
        System.out.println("Ucgenin hipotenusu: " +hip);

    }
}
