package util;

import java.util.Scanner;

public class Inquirer {
    public static short[] inquire() {
        Scanner scanner = new Scanner(System.in);
        short[] result = new short[4];

        int abBot = -32768;
        int abTop = 32767;

        int nmTop = 32767;

        result[0] = (short) ask(scanner, "a", abBot, abTop);
        result[1] = (short) ask(scanner, "b", abBot, abTop);

        result[2] = (short) ask(scanner, "n", result[0], nmTop);   
        result[3] = (short) ask(scanner, "m", result[1], nmTop);                     

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
