package inputValidation;

public class NumberValidation implements inputValidation.Validation{
    @Override
    public  void validarNumero(String number1, String number2) {
        boolean valida = number1.matches("-?\\d+(\\.\\d+)?") && number2.matches("-?\\d+(\\.\\d+)?") ? true:false;
         if(!valida){
             throw new RuntimeException("digite apenas números");
         }
    }

    @Override
    public void validarNumero(String number1) {
        boolean valida = number1.matches("-?\\d+(\\.\\d+)?") ? true:false;
        if(!valida){
            throw new RuntimeException("digite apenas números");
        }
    }

    @Override
    public  void validarDivisão(double number2) {
       boolean valida = number2 != 0 ? true:false;
       if(!valida){
           throw new RuntimeException("não é possivel fazer divisão por 0");
       }
    }

    @Override
    public  void validarNegativo(double number) {

        boolean valida = number >= 0 ? true:false;
        if(!valida){
            throw new RuntimeException("digite números positivos para o cálculo da raiz");
        }

    }
}
