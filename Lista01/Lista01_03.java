import java.util.Scanner;

public class Lista01_03 {
    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);
        double[] notas = new double[3];
        double peso_n0 = 0.2;
        double peso_n1 = 0.3;
        double peso_n2 = 0.5;
        double media;
        int i;
        for(i=0; i<3; i++){
            System.out.println("Digite a nota "+ (i+1) +" do aluno:");
            notas[i] = input.nextDouble();
        }

        media = notas[0] * peso_n0 + notas[1] * peso_n1 + notas[2] * peso_n2;
        System.out.println("A média do aluno é igual a: "+media);
    }
}