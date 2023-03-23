package operacoes;

import Program.Calc;

public class Soma extends Calc {
    public Soma(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    public double calcular() {
        return getNumber1() + getNumber2();
    }
}
