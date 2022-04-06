package lista123;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner ( System.in);

         System.out.println("_______________________________");

            System.out.println("Digite sua altura: ");
            Double altura = scanner.nextDouble();

         System.out.println("_______________________________");

            Double seuPesoIdealMasculino = ((72.2 * altura) - 58);
            System.out.println(("Seu peso ideal masculino é:   ") + seuPesoIdealMasculino);

         System.out.println("_______________________________");

            Double seuPesoIdealFeminino = ((62.1 * altura) - 44.7);
            System.out.println(("Seu peso ideal feminino é:   ") + seuPesoIdealFeminino);

         System.out.println("_______________________________");

}
}

