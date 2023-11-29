package util;

public class Calculator {
    private static final short C_CONST = 2;

    public static double calculate(short[] indices) {
        short a = indices[0];
        short b = indices[1];

        short n = indices[2];
        short m = indices[3];

        double result = 0;

        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                result += ((double)i / j) / (i - C_CONST);
            }
        }

        return result;
    }
}
