import java.util.Scanner;

public class Lista01_01 {

    public static void main(String [] Args){
        Scanner input = new Scanner(System.in);
        double vel_ms;
        double vel_km;
        System.out.println("Informe a velocidade em metros/segundos:");
        vel_ms = input.nextDouble();
        vel_km = vel_ms * 3.6;
        System.out.println(vel_ms + " m/s corresponde a "+ vel_km + " Km/h");
    }
}