import java.util.Scanner;

public class Exercicio4 {
   
    public static void L1_05() {
        int num_1, num_2, calc_1, calc_2;
        Scanner grava = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler dois número e realizar operações matemáticas e mostrar os resultados");
        System.out.println("Digite o primeiro número: ");
        num_1 = grava.nextInt();
        System.out.println("Digite o segundo número: ");
        num_2 = grava.nextInt();
        calc_1 = num_1 + 10;
        calc_2 = num_2 / 2;            
        System.out.println("O resultado da primeira operação é " + calc_1);
        System.out.println("O resultado da segunda operação é " + calc_2);
    }
}