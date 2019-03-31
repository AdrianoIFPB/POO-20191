import java.util.Scanner;

public class Lista01_06 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        String nome;
        int diarias;
        System.out.println("Informe o nome do hóspede:");
        nome = input.next();
        System.out.println("Informe a quantidade de diárias para "+nome+":");
        diarias = input.nextInt();
        System.out.println("A conta de "+nome+" é: R$ "+Conta(diarias));
    }

    static double Conta(int num_diaria){
        double tx_serv = 0;
        double total;
        if(num_diaria<15){
            tx_serv = 8;
        }
        else if (num_diaria == 15){
            tx_serv = 6;
        }
        else if (num_diaria>15){
            tx_serv = 5.5;
        }

        total = tx_serv * num_diaria + 60*num_diaria;
        return total;
    }
}