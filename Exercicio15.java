package lista123;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_____________________________________________");

            System.out.print("Digite o número de horas trabalhadas por mês: ");
            Double numeroDeHorasTrabalhadas = scanner.nextDouble();

        System.out.println("_____________________________________________");

            System.out.print("Digite quanto você ganhar por hora: ");
            Double numeroQueGanhaPorHora = scanner.nextDouble();

        System.out.println("_____________________________________________");

            Double salarioBruto = (numeroDeHorasTrabalhadas * numeroQueGanhaPorHora);


            Double impostoDeRenda = 0.11;
            Double inss = 0.08;
            Double sindicato = 0.05;


            Double salarioBrutoImpostoDeRenda = salarioBruto * impostoDeRenda;
            Double salarioBrutoInss = salarioBruto * inss;
            Double salarioBrutoSindicato = salarioBruto * sindicato;

            Double somaDosImpostos = salarioBrutoImpostoDeRenda + salarioBrutoInss + salarioBrutoSindicato;


            Double salarioLiquido = salarioBruto - somaDosImpostos;

        System.out.println("\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("Seu salario bruto é: " + salarioBruto);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("O quanto você pagou para o inss é:" + salarioBrutoInss);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("O quanto você pagou ao sindicato é: " + salarioBrutoSindicato);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("O seu salario liquído é: " + salarioLiquido);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
