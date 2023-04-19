import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Digite qual foi a nota do aluno de 0 a 10: ");
            numero = scanner.nextInt();

            if (numero > 10) {

                System.out.println("\nNúmero Inválido !");
            }

            else if (numero < 0) {

                System.out.println("\nNúmero inválido! ");
            }

            else {

                System.out.println("\nNúmero Registrado!");
            }

        } while (false);

    }

}