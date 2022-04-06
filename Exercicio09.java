package lista123;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________________________");
        System.out.print("Informe a temperatura em °F:");
        double temperatura = scanner.nextDouble();
        System.out.println("_______________________________");
        double formula = 5 * ((temperatura - 32) / 9);
        System.out.println("A comverção para graus °C é: " + formula + " °C");
        System.out.println("_______________________________");
        scanner.close();
    }
}
