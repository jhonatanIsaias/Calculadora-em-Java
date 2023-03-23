package Program;


import Program.Calc;
import Program.Menu;
import java.io.PrintStream;
import inputValidation.NumberValidation;
import operacoes.*;

import java.util.Scanner;
public class App {

    public static void main(String[] args){
        Menu menu = new Menu();
        Scanner ler = new Scanner(System.in);

        int opcao = 0;
        double number1 = 0;
        double number2 = 0;

        System.out.println(menu.toString());
        opcao = ler.nextInt();

    while (opcao != 0) {
        switch (opcao) {
            case 1:
                System.out.println("Digite o primeiro numero:");
                number1 = ler.nextDouble();
                System.out.println("Digite o segundo numero:");
                number2 = ler.nextDouble();
                Soma soma = new Soma(number1, number2);
                System.out.println("o resultado é " + soma.calcular());
                break;
            case 2:
                System.out.println("Digite o primeiro numero:");
                number1 = ler.nextDouble();
                System.out.println("Digite o segundo numero:");
                number2 = ler.nextDouble();
                Subtracao subtracao = new Subtracao(number1, number2);
                System.out.println("o resultado é " + subtracao.calcular());
                break;
            case 3:
                System.out.println("Digite o primeiro numero:");
                number1 = ler.nextDouble();
                System.out.println("Digite o segundo numero:");
                number2 = ler.nextDouble();
                Multplicacao multplicacao = new Multplicacao(number1, number2);
                System.out.println("o resultado é " + multplicacao.calcular());
                break;
            case 4:
                System.out.println("Digite o primeiro numero:");
                number1 = ler.nextDouble();
                System.out.println("Digite o segundo numero:");
                number2 = ler.nextDouble();
                Divisao divisao = new Divisao(number1, number2);
                System.out.println("o resultado é " + divisao.calcular());
                break;
            case 5:

                System.out.println("digite o numero que deseja calcular a raiz:");
                number1 = ler.nextDouble();
                RaizQuadrada raizQuadrada = new RaizQuadrada(number1);
                System.out.println("o resultado é " + raizQuadrada.calcular());
                break;
            default:
                System.out.println("digte uma opção valida");
         }
        System.out.println(menu.toString());
        opcao = ler.nextInt();
        }
        System.out.println("você saiu da calculadora");
    }

}
