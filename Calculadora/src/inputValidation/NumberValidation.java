package inputValidation;

public class NumberValidation extends Validation {
    @Override
    protected void validate(String input) {
        Double number = Double.parseDouble(input);

        if (number.getClass().getSimpleName() != "Double"){
                setValid(false);
                erros.add("digite um número valido");
        }
    }
}
