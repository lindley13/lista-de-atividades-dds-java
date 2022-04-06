package lista123;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("_______________________________");
        System.out.print("Digite uma letra: ");
        String letraDigitada = scanner.next();
        System.out.println("_______________________________");

        boolean vogal = letraDigitada.equals("A") || letraDigitada.equals("a") || letraDigitada.equals("E") || letraDigitada.equals("e")
                || letraDigitada.equals("I") || letraDigitada.equals("i") || letraDigitada.equals("O") || letraDigitada.equals("o")
                || letraDigitada.equals("U") || letraDigitada.equals("u");
        if (vogal) {
            System.out.println("A letra " +"("+ letraDigitada +")" + " é uma vogal");
            System.out.println("_______________________________");
        } else {
            System.out.println("A letra " +"("+ letraDigitada +")" + " é uma consoante");
            System.out.println("_______________________________");
        }
        scanner.close();
    }
}