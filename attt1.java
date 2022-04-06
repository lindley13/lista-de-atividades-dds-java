package lista123;

import java.util.Scanner;

public class attt1 {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);

            System.out.println("_______________________________________");

                System.out.print("Valor do produto : ");
                double valorDoPruduto = scanner.nextDouble();

            System.out.println("_______________________________________");

                System.out.println("Qual o tipo de pagamento? \n[1]a vista  \n[2]a prazo ");
                Integer tipoDePagamneto = scanner.nextInt();

            System.out.println("_______________________________________");

                boolean pagamentoAVista = tipoDePagamneto.equals (1);
                Double juros = 0.0;

                if(!pagamentoAVista)
                {
                    juros = 10.0;
                }

                double acrescimo = tipoDePagamneto + juros / 100;

                double valorTotal = acrescimo + valorDoPruduto;

            System.out.println("\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("Valor total: " + valorTotal);

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        scanner.close();
    }
}


