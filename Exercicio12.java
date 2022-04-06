package lista123;

import java.util.Scanner;
public class Exercicio12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________________________");

            System.out.print("Digite sua altura: ");
            Double altura = scanner.nextDouble();

        System.out.println("_______________________________");

            double formula = ( 72.2 * altura) - 58;
            System.out.println("Seu peso ideal é: " + formula);

        System.out.println("_______________________________");
    }
}
