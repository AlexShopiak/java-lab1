package util;

public class Calculator {
    public static double calculate(short[] indices) {
        short a = indices[0];
        short b = indices[1];

        short n = indices[2];
        short m = indices[3];

        short c = 2;

        int iExc = c;
        int jExc = 0;

        double result = 0;

        for (int i = a; i <= n; i++) {
            if (i == iExc) continue;

            for (int j = b; j <= m; j++) {
                if (j == jExc) continue;
                result += ((double)i / j) / (i - c);
            }
        }

        return result;
    }
}
