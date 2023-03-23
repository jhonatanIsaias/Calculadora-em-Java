package inputValidation;

import java.util.ArrayList;

public abstract class Validation {
    protected boolean valid = true;
    protected ArrayList<String> erros = new ArrayList<String>();

    protected abstract void validate(String input);

    public boolean isValid(String input){
        validate(input);
        return this.valid;
    }
    public ArrayList<String> getErros() {
        return this.erros;
    }
    public void setValid(boolean valid){
         this.valid = valid;
    }

}
