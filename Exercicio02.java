package lista123;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.println("_______________________________");
                System.out.print("Informe um valor: ");
                float valor = scanner.nextFloat();
            System.out.println("_______________________________");

            Boolean valorÉPositivo = (valor >= 0 );
            if (valorÉPositivo){
                System.out.println("O valor é positivo ");
                System.out.println("_______________________________");
            }

            Boolean valorÉNegativo = (valor < 0);
            if (valorÉNegativo){
                System.out.println("O valor é negativo ");
                System.out.println("_______________________________");
            }

        scanner.close();
    }
}


