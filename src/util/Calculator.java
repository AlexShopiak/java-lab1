package util;

public class Calculator {
    private static final short C_CONST = 2;
    private static final int I_EXCEPT = C_CONST;
    private static final int J_EXCEPT = 0;

    public static double calculate(short[] indices) {
        short a = indices[0];
        short b = indices[1];

        short n = indices[2];
        short m = indices[3];

        double result = 0;

        for (int i = a; i <= n; i++) {
            if (i == I_EXCEPT) continue;

            for (int j = b; j <= m; j++) {
                if (j == J_EXCEPT) continue;
                result += ((double)i / j) / (i - C_CONST);
            }
        }

        return result;
    }
}
