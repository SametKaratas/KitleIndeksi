import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double kg,m;
        Scanner input = new Scanner(System.in); 
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg = input.nextDouble();
        double sonuc = kg/(m*m);
        System.out.print("Vücut Kitle indeksiniz :" + sonuc);
        
    }
}
