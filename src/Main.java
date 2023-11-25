import util.Inquirer;
import util.Calculator;

public class Main {
    public static void main(String[] args) {
        short[] indices = Inquirer.inquire();

        int result = Calculator.calculate(indices);

        System.out.println("Result: " + result);
    }
}
