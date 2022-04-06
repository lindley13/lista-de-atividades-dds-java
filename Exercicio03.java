package lista123;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);

            System.out.println("_______________________________");
                System.out.print("Informe seu sexo [F]feminino ou [M]masculino: ");
                String sexo = scanner.next();
            System.out.println("_______________________________");

            Boolean masculino = sexo.equals("M") || sexo.equals("m");
            if (masculino){
                System.out.println("Masculino");
            }

            Boolean feminino = sexo.equals("F") || sexo.equals("f");
            if (feminino){
                System.out.println("Feminino");
            } else {
                System.out.println("sexo invalido");
            }

        scanner.close();
    }
}
