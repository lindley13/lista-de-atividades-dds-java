package lista123;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("_______________________________");

                System.out.print("Informe o primeiro numero: ");
                float primeiroNumero = scanner.nextFloat();

            System.out.println("_______________________________");

            System.out.println("_______________________________");

                System.out.print("Informe o segundo numero : ");
                float segundoNumero = scanner.nextFloat();

            System.out.println("_______________________________");

                Boolean oPrimeiroNumeroEOmaior = (primeiroNumero > segundoNumero);
                if (oPrimeiroNumeroEOmaior) {
                    System.out.println("o maior numero é :" + primeiroNumero);
                }

                Boolean oSegundoNumeroEOMaior = (segundoNumero > primeiroNumero);
                if (oSegundoNumeroEOMaior){
                    System.out.println("o maior numero é :" + segundoNumero);
                }
        scanner.close();
    }
}
