import java.util.Scanner;

public class Lista01_09 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int[] num = new int [2];
        int cont_par = 0;
        int cont_impar = 0;
        int soma=0;
        int i;
        for (i=0; i<2; i++) {
            System.out.println("Digite o número " + (i + 1)+":");
            num[i] = input.nextInt();
            soma += num[i];
            if (num[i] % 2 == 0) {
                cont_par += 1;
            } else {
                cont_impar += 1;
            }
        }
        System.out.println("Temos "+ cont_par + " número(s) par(es).");
        System.out.println("Temos "+ cont_impar + " número(s) ímpar(es).");
        System.out.println("A soma dos números 1 e 2 é: "+ soma+".");
    }
}