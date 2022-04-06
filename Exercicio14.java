package lista123;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________________________");

            System.out.print("Informe o peso do peixe: ");
            double pesoDoPeixe = scanner.nextDouble();

        System.out.println("_______________________________");

        byte limiteDeKilos = 50;
        byte taxaDaMulta = 4;
        double valorExedente = (pesoDoPeixe - limiteDeKilos);
        double valorDaMulta = (valorExedente * taxaDaMulta);

        if(valorDaMulta < 0)
        {
            valorDaMulta = 0;
        }

        System.out.println("\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("O peso do peixe é: " + pesoDoPeixe);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("O valor da multa é: " + valorDaMulta);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
