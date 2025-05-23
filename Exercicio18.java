import java.util.Scanner;

public class Exercicio18 {
    
    public static void L3_09() {

        Scanner grava = new Scanner(System.in);
        float num_1, calc;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número, fazer um calculo e realizar uma comparação");

        System.out.print("Digite o número: ");
        num_1 = grava.nextFloat();

        calc = num_1 / 2;

        if (calc > 20){
            System.out.println("O resultado do calculo é " + calc + " que é maior que 20");
        }

        else if (calc == 20) {
            System.out.println("O resultado do calculo é " + calc + " que é igual 20");
        }
        
        else {
            System.out.println("O resultado do calculo é " + calc + " que é menor que 20");
        }
    }
}