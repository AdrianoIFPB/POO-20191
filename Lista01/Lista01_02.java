import java.util.Scanner;

public class Lista01_02{
    public static void main(String [] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu ano de nascimento?");
        int ano;
        int idade;
        ano = input.nextInt();
        idade = 2019 - ano;
        System.out.println("Você tem " + idade + " anos.");

    }
}