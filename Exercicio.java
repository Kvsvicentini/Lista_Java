import java.util.Scanner;

public class Exercicio {
    /**
     * @param args
     * @throws Exception
     */
    public static void L1_01() {
        int num_1, result;
        Scanner grava = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número e realizar uma operação matemática e mostrar o resultado");
        System.out.println("Digite um número: ");
        num_1 = grava.nextInt();
        result = num_1 + 5;            
        System.out.println("O resultado é " + result);
    }
}