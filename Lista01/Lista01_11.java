import java.util.Scanner;

public class Lista01_11 {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        boolean pedido;
        double conta = 0;
        int qtde = 0;
        int código = 0;


        while (true) {
            System.out.println("Deseja fazer um pedido(True ou False)?");
            pedido = input.nextBoolean();
            if (pedido == false) {
                break;
            } else {
                System.out.println("Digite o código do produto desejado");
                System.out.println("Código      Produto         Preço unitário(R$)");
                System.out.println("  10     Pastel de carne           1,50");
                System.out.println("  11     Coxinha de frango         1,80");
                System.out.println("  12     Empada de frango          1,90");
                System.out.println("  20     Hamburguer                10,00");
                System.out.println("  30     Pizza                     8,00");
                System.out.println("  50     Suco                      2,50");


                código = input.nextInt();

                System.out.println("Qual a quantidade?");
                qtde = input.nextInt();

                if (código == 10) {
                    conta += 1.5 * qtde;
                } else if (código == 11) {
                    conta += 1.8 * qtde;
                } else if (código == 12) {
                    conta += 1.9 * qtde;
                } else if (código == 20) {
                    conta += 10 * qtde;
                } else if (código == 30) {
                    conta += 8 * qtde;
                } else if (código == 50) {
                    conta += 2.5 * qtde;
                }
            }
        }
        if (conta > 50) {
            conta = conta - (conta * 0.05);
        }
        System.out.printf("A conta do cliente foi R$ %.2f", conta);
    }
}