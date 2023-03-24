package operacoes;

import Program.Calc;
import inputValidation.NumberValidation;
public class Divisao extends Calc {

    public Divisao(double number1, double number2) {
        super(number1, number2);
        NumberValidation numberValidation = new NumberValidation();
        numberValidation.validarDivisão(number2);
    }

    @Override
    public double calcular() {
        return getNumber1() / getNumber2();
    }
}
