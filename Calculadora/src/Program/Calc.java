package Program;


public abstract class Calc {
    private double number1;
    private double number2;
    public Calc(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;

    }
    public Calc(double number1){
        this.number1 = number1;
    }
    public double getNumber1() {
        return number1;
    }
    public double getNumber2() {
        return number2;
    }


    public abstract double calcular();



}
