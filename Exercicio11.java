package lista123;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("_______________________________");

                System.out.print("Digite seu primeiro número: ");
                double primeiroNumero = scanner.nextDouble();

            System.out.println("_______________________________");

                System.out.print("Digite seu segundo número: ");
                double segundoNumero = scanner.nextDouble();

            System.out.println("_______________________________");

                System.out.print("Digite seu terceiro número: ");
                double terceiroNumero = scanner.nextDouble();

            System.out.println("_______________________________");


            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            byte dois = 2;
            byte tres = 3;

            double dobroDoPrimeiro = primeiroNumero * dois;
            double metadeDoSegundo = segundoNumero / dois;
            double produtoDoDobroDoPrimeiroComMetadeDoSegundo = dobroDoPrimeiro * metadeDoSegundo;
            double primeiroVezesTres = primeiroNumero * tres;
            double aSomaDoTriploDoPrimeiroComOTerceiro = primeiroVezesTres + terceiroNumero;
            double terceiroElevadoAoCubo = terceiroNumero * terceiroNumero * terceiroNumero;

                System.out.println("O produto do dobro do primeiro com metade do segundo: " + produtoDoDobroDoPrimeiroComMetadeDoSegundo);

            System.out.println("_______________________________");

                System.out.println(("A soma do triplo do primeiro com o terceiro.   ") + aSomaDoTriploDoPrimeiroComOTerceiro);

            System.out.println("_______________________________");

                System.out.println("O terceiro elevado ao cubo: " + terceiroElevadoAoCubo);

            System.out.println("_______________________________");
        scanner.close();
    }
}

