public class Main {
    public static void main(String[] args) {

// Демонстрация работы калькулятора (без адаптера)
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(2)
                        .addOperand(2)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
        System.out.println(
                calc.newFormula()
                        .addOperand(10)
                        .addOperand(22)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );
        System.out.println(
                calc.newFormula()
                        .addOperand(2)
                        .addOperand(10)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );

// Демонстрация работы адаптера

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.mult(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}
