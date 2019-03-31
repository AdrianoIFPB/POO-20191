import java.util.Scanner;

public class Lista01_04 {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double media;
        double soma_notas = 0;
        int i;
        for (i = 0; i < 4; i++) {
            System.out.println("Informe a nota " + (i + 1) + " do aluno:");
            notas[i] = input.nextDouble();
            soma_notas += notas[i];

        }
        media = soma_notas / 4;
        if (media >= 7) {
            System.out.println("Aluno aprovado com média " + media + "!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno fará final. Média = " + media + "!");
        } else if (media >= 0 && media < 5) {
            System.out.println("Aluno reprovado. Média = " + media + "!");
        }
    }
}