package util;

import java.util.Scanner;

public class Inquirer {
    private static final int AB_BOTTOM = -32768;
    private static final int AB_TOP = 32767;
    private static final int NM_TOP = 32767;

    public static short[] inquire() {
        Scanner scanner = new Scanner(System.in);
        short[] result = new short[4];

        result[0] = (short) ask(scanner, "a", AB_BOTTOM, AB_TOP);
        result[1] = (short) ask(scanner, "b", AB_BOTTOM, AB_TOP);

        result[2] = (short) ask(scanner, "n", result[0], NM_TOP);   
        result[3] = (short) ask(scanner, "m", result[1], NM_TOP);                     

        scanner.close();
        return result;
    }

    private static int ask(Scanner scanner, String name, int bottom, int top) {
        do {
            System.out.print("Enter " + name + " from " + bottom + " to " + top + ": ");
            int data = scanner.nextInt();

            if (data >= bottom && data <= top) {
                return data;
            }
        } while (true);
    }
}
