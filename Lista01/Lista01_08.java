import java.util.Scanner;

public class Lista01_08 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int[] lista_num = new int[10];
        int i;

        for(i=0; i<10; i++){
            System.out.println("Digite o nº "+(i+1)+" de 10:");
            lista_num[i] = input.nextInt();


        }
        System.out.println("A média da sequência de números é: "+(media(lista_num)));
        System.out.println("O maior valor da sequência de números é: "+(maior(lista_num)));
        System.out.println("O menor valor da sequência de números é: "+(menor(lista_num)));
    }

    static double media(int[] lista){
        double m;
        int soma=0;
        int i;
        for(i=0; i<10; i++){
            soma += lista[i];
        }
        m = soma/10;
        return m;
    }

    static int maior(int[] lista) {
        int m = -100000000;
        int i;
        for (i = 0; i < 10; i++) {
            if (lista[i] > m){
                m = lista[i];
            }
        }
        return m;
    }

    static int menor(int[] lista){
        int m = 100000000;
        int i;
        for (i = 0; i < 10; i++) {
            if (lista[i] < m) {
                m = lista[i];
            }
        }
        return m;
    }
}