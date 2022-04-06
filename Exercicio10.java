package lista123;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("_______________________________");
                System.out.print("Informe o valor da temperatura em °C: ");
                double temperatura = scanner.nextDouble();
            System.out.println("_______________________________");

            double formula =  temperatura * 9 / 5 + 32;
                System.out.println("A comverção para graus °F é: " + formula + "°F");
            System.out.println("_______________________________");
        scanner.close();
    }
}
