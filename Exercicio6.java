import java.util.Scanner;

public class Exercicio6 {
    public static void L1_07() {
        int num_1, num_2, calc_1, calc_2, calc_3, calc_4, calc_5, calc_6;
        Scanner grava = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler dois números, vamos subtrair 3 do primeiro número, no segundo número vamos somar 2, somar os resultados com os números lidos, subtrair o número 1 e mostrar o resultado");
        System.out.println("Digite o primeiro número: ");
        num_1 = grava.nextInt();
        System.out.println("Digite o segundo número: ");
        num_2 = grava.nextInt();
        calc_1 = num_1 - 3;
        calc_2 = num_2 + 2;
        calc_3 = num_1 + num_2;
        calc_4 = calc_1 + calc_2;
        calc_5 = calc_3 + calc_4;
        calc_6 = calc_5 - 1;          
        System.out.println("O resultado das operações é " + calc_6);
    }
}
