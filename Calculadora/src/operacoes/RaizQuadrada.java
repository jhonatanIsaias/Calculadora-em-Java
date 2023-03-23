package operacoes;

import Program.Calc;

public class RaizQuadrada extends Calc {
    public RaizQuadrada(double number1){
       super(number1);
    }
    @Override
    public double calcular() {
        return Math.sqrt(getNumber1());
    }
}
