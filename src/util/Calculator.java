package util;

public class Calculator {
    public static float calculate(short[] indices) {
        short a = indices[0];
        short b = indices[1];

        short n = indices[2];
        short m = indices[3];

        short c = 2;

        int iExc = 2;
        int jExc = 0;

        float result = 0;

        for (int i = a; i <= n; i++) {
            if (i == iExc) continue;

            for (int j = b; j <= m; j++) {
                if (j == jExc) continue;
                result += ((float)i / j) / (i - c);
            }
        }

        return result;
    }
}
