package util;

import java.util.Scanner;

public class Inquirer {
    public static short[] inquire() {
        Scanner scanner = new Scanner(System.in);
        short[] result = new short[4];

        int abBot = -32768;
        int abTop = 32767;

        int nmTop = 32767;

        do {  //ask for a
            System.out.print("Enter a from " + abBot + " to " + abTop + ": ");
            int a = scanner.nextInt();

            if (a >= abBot && a <= abTop) {
                result[0] = (short) a;
                break;
            }
        } while (true);

        do {  //ask for b
            System.out.print("Enter b from " + abBot + " to " + abTop + ": ");
            int b = scanner.nextInt();

            if (b >= abBot && b <= abTop) {
                result[1] = (short) b;
                break;
            }
        } while (true); 
        
        do {  //ask for n
            int a = result[0];
            System.out.print("Enter n from " + a + " to " + nmTop + ": ");
            int n = scanner.nextInt();

            if (n >= a && n <= nmTop) {
                result[2] = (short) n;
                break;
            }
        } while (true);    
        
        do {  //ask for m
            int b = result[1];
            System.out.print("Enter m from " + b + " to " + nmTop + ": ");
            int m = scanner.nextInt();

            if (m >= b && m <= nmTop) {
                result[3] = (short) m;
                break;
            }
        } while (true);                    

        scanner.close();
        return result;
    }
}
