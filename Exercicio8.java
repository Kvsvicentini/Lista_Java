import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {
        int num_1, num_2, num_3, calc_1, calc_2, calc_3;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler três números e realizar operações matemáticas");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextInt();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextInt();
        System.out.print("Digite o terceiro número: ");
        num_3 = grava.nextInt();

        calc_1 = num_1 + 10;
        calc_2 = num_2 - 5;
        calc_3 = num_3 * 3;

        System.out.println("O resultado do primeiro calculo é " + calc_1);
        System.out.println("O resultado do segundo calculo é " + calc_2);
        System.out.println("O resultado do terceiro calculo é " + calc_3);
    }
}
