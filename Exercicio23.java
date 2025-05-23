//import java.util.ArrayList; 
//import java.util.List;
import java.util.Scanner;

public class Exercicio23 {
    
    public static void L4_04() {

        Scanner grava = new Scanner(System.in);
        float num_1, num_2, num_3;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler três números e compara-los para mostrar o maior");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextFloat();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextFloat();
        System.out.print("Digite o terceiro número: ");
        num_3 = grava.nextFloat();

        if (num_1 > num_2) {
            if (num_1 > num_3) {
                System.err.println("O maior número é " + num_1);
            }

            else{
                System.out.println("O maior número é " + num_3);
            }
        }

        else {
            if (num_2 > num_3) {
                System.out.println("O maior número é " + num_2);
            }

            else {
                System.out.println("O maior número é " + num_3);
            }
        }

        /*Outra maneira de realizar o exercício
        Leitura dos números
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = grava.nextInt();
        }

        // Encontrar o maior número
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        */
    }
}