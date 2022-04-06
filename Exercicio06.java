package lista123;

import java.util.Scanner;

public class Exercicio06
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("_______________________________");
            System.out.print("insert side length(squared):");
            Double squareSide = Scanner.nextDouble();
        System.out.println("_______________________________");

        int numberTwo = 2;
        double squaredAreaDouble = (squareSide * squareSide) * numberTwo;
        System.out.println("Your area is:" + squaredAreaDouble);
        System.out.println("_______________________________");

    }
}
