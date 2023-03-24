package Program;
import operacoes.*;
import inputValidation.NumberValidation;
import java.util.Scanner;
public class App {

    public static void main(String[] args){
        Menu menu = new Menu();
        NumberValidation numberValidation = new NumberValidation();
        Scanner ler = new Scanner(System.in);

        int opcao = 9;
        String number1 ;
        String number2 ;

        while (opcao != 0) {
        try {

            System.out.println(menu.toString());
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o primeiro numero:");
                    number1 = ler.next();
                    System.out.println("Digite o segundo numero:");
                    number2 = ler.next();
                    numberValidation.validarNumero(number1,number2);
                    Soma soma = new Soma(Double.parseDouble(number1), Double.parseDouble(number2));
                    System.out.println("o resultado é " + soma.calcular());
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero:");
                    number1 = ler.next();
                    System.out.println("Digite o segundo numero:");
                    number2 = ler.next();
                    numberValidation.validarNumero(number1,number2);
                    Subtracao subtracao = new Subtracao(Double.parseDouble(number1), Double.parseDouble(number2));
                    System.out.println("o resultado é " + subtracao.calcular());
                    break;
                case 3:
                    System.out.println("Digite o primeiro numero:");
                    number1 = ler.next();
                    System.out.println("Digite o segundo numero:");
                    number2 = ler.next();
                    numberValidation.validarNumero(number1,number2);
                    Multplicacao multplicacao = new Multplicacao(Double.parseDouble(number1), Double.parseDouble(number2));
                    System.out.println("o resultado é " + multplicacao.calcular());
                    break;
                case 4:
                    System.out.println("Digite o primeiro numero:");
                    number1 = ler.next();
                    System.out.println("Digite o segundo numero:");
                    number2 = ler.next();
                    numberValidation.validarNumero(number1,number2);
                    Divisao divisao = new Divisao(Double.parseDouble(number1), Double.parseDouble(number2));
                    System.out.println("o resultado é " + divisao.calcular());
                    break;
                case 5:
                    System.out.println("digite o numero que deseja calcular a raiz:");
                    number1 = ler.next();
                    numberValidation.validarNumero(number1);
                    RaizQuadrada raizQuadrada = new RaizQuadrada(Double.parseDouble(number1));
                    System.out.println("o resultado é " + raizQuadrada.calcular());
                    break;
                default:
                    if(opcao == 0){
                        System.out.println("você saiu da calculadora");
                    }else {
                        System.out.println("digte uma opção valida");
                    }
            }
            }catch (RuntimeException e){
                    System.out.println(e.getMessage());
        }


        }

    }

}
