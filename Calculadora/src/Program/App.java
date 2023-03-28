package Program;
import operacoes.*;
import inputValidation.NumberValidation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class App {

    public static void main(String[] args) {
        ArrayList<String> listaValores = new ArrayList<String>();
        Menu menu = new Menu();
        NumberValidation numberValidation = new NumberValidation();
        Scanner ler = new Scanner(System.in);

        String opcao = "9";
        String number1 = null;
        String number2 = null;
        String list = "";
        String resultadoList = null;
        int limitador1 = 0;
        int limitador2 = 0;
        System.out.println(menu.toString());
        while (!opcao.equals("0")) {
            try {
                list = ler.nextLine();

                limitador1 = list.indexOf(";");
                limitador2 = list.lastIndexOf(";");
                number1 = list.substring(0, limitador1);
                opcao = list.substring(limitador1 + 1, limitador2);
                number2 = list.substring(limitador2 + 1);


                switch (Integer.parseInt(opcao)) {

                    case 1:

                        numberValidation.validarNumero(number1, number2);
                        Soma soma = new Soma(Double.parseDouble(number1), Double.parseDouble(number2));
                       resultadoList +=  list +  " = " + soma.calcular() +"\n";
                        break;
                    case 2:

                        numberValidation.validarNumero(number1, number2);
                        Subtracao subtracao = new Subtracao(Double.parseDouble(number1), Double.parseDouble(number2));
                        resultadoList +=  list +  " = " + subtracao.calcular() +"\n";
                        break;
                    case 3:

                        numberValidation.validarNumero(number1, number2);
                        Multplicacao multplicacao = new Multplicacao(Double.parseDouble(number1), Double.parseDouble(number2));
                        resultadoList +=  list +  " = " + multplicacao.calcular() +"\n";
                        break;
                    case 4:

                        numberValidation.validarNumero(number1, number2);
                        Divisao divisao = new Divisao(Double.parseDouble(number1), Double.parseDouble(number2));
                        resultadoList +=  list +  " = " + divisao.calcular() +"\n";
                        break;
                    case 5:

                        numberValidation.validarNumero(number1);
                        RaizQuadrada raizQuadrada = new RaizQuadrada(Double.parseDouble(number1));
                        resultadoList +=  list +  " = " + raizQuadrada.calcular() +"\n";
                        break;
                    default:
                        if (Integer.parseInt(opcao) == 0) {
                            System.out.println("você saiu da calculadora");
                        } else {
                            System.out.println("digte uma opção valida");
                        }
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println(resultadoList.replace("null",""));
    }


}


