package operacoes;

import Program.Calc;
import inputValidation.NumberValidation;
public class RaizQuadrada extends Calc {
    public RaizQuadrada(double number1){
       super(number1);
       NumberValidation numberValidation = new NumberValidation();
       numberValidation.validarNegativo(number1);
    }
    @Override
    public double calcular() {
        return Math.sqrt(getNumber1());
    }
}
