package util;

import java.util.Scanner;

public class Inquirer {
    private static final int AB_BOTTOM = -32768;
    private static final int AB_TOP = 32767;
    private static final int NM_TOP = 32767;

    private static final int A_EXCEPT = 2;
    private static final int B_EXCEPT = 0;

    public static short[] inquire() {
        Scanner scanner = new Scanner(System.in);
        short[] result = new short[4];

        result[0] = (short) askAB(scanner, "a", AB_BOTTOM, AB_TOP, A_EXCEPT);
        result[1] = (short) askAB(scanner, "b", AB_BOTTOM, AB_TOP, B_EXCEPT);

        result[2] = (short) askNM(scanner, "n", result[0], NM_TOP, A_EXCEPT);   
        result[3] = (short) askNM(scanner, "m", result[1], NM_TOP, B_EXCEPT);                     

        scanner.close();
        return result;
    }

    private static int askAB(Scanner scanner, String name, int bottom, int top, int except) {
        do {
            System.out.print("Enter " + name + " from " + bottom + " to " + top + " except " + except + ": ");
            if( scanner.hasNextInt()) {
                int data = scanner.nextInt();
                
                if (data >= bottom && data <= top && data != except) {
                    return data;
                }
            } else {
                scanner.next();
            }            
        } while (true);
    }

    private static int askNM(Scanner scanner, String name, int bottom, int top, int except) {
        int rTop = (except < top)? (except - 1) : top;

        do {
            System.out.print("Enter " + name + " from " + bottom + " to " + rTop + ": ");
            
            if( scanner.hasNextInt()) {
                int data = scanner.nextInt();
                
                if (data >= bottom && data <= top) {
                    if (!belongToRange(except, bottom, data)) {
                        return data;
                    }
                }
            } else {
                scanner.next();
            }            
        } while (true);
    }

    private static boolean belongToRange(int value, int bottom, int top) {
        if (value < bottom || value > top) {
            return false;
        } else {
            return true;
        }
    }
}

