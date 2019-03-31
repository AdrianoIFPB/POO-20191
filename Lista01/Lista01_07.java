import java.util.Scanner;

public class Lista01_07 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int nota;
        System.out.println("Digite a nota do aluno:");
        nota = input.nextInt();
        Conceito(nota);
    }

    static void Conceito(int n){
        if ( n>=0 && n<=49){
            System.out.println("O conceito do aluno é Insuficiente!");
        }
        else if ( n>=50 && n<=64){
            System.out.println("O conceito do aluno é Regular!");
        }
        else if ( n>=65 && n<=84){
            System.out.println("O conceito do aluno é Bom!");
        }
        else if ( n>=85 && n<=100){
            System.out.println("O conceito do aluno é Ótimo!");
        }
    }

}