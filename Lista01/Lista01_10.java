import java.util.Scanner;

public class Lista01_10 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        double num = input.nextDouble();
        int cont = 0;
        double res=0;
        while (num >= 1){
            cont += 1;
            num = num/2;
        }

        System.out.printf("A última divisão foi igual a %.2f, depois de %d divisões(ão) por 2.", num, cont);
    }

}