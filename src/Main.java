import util.Inquirer;
import util.Calculator;

public class Main {
    public static void main(String[] args) {
        short[] indices = Inquirer.inquire();

        float result = Calculator.calculate(indices);

        System.out.println("Result: " + result);
    }
}
