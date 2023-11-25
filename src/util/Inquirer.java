package util;

import java.util.Scanner;

public class Inquirer {
    public static short[] inquire() {
        Scanner scanner = new Scanner(System.in);
        short[] result = new short[4];

        int aBot = 0;
        int bBot = 1;
        int aExc = 2;
        int abTop = 10;
        int nmTop = 100;

        //ask for a
        do {
            System.out.print("Enter a from " + aBot + " to " + abTop + " except " + aExc + ": ");
            int a = scanner.nextInt();

            if (a >= aBot && a <= abTop && a != aExc ) {
                result[0] = (short) a;
                break;
            }
        } while (true);

        //ask for b
        do {
            System.out.print("Enter b from " + bBot + " to " + abTop + ": ");
            int b = scanner.nextInt();

            if (b >= bBot && b <= abTop && b != 2 ) {
                result[1] = (short) b;
                break;
            }
        } while (true); 
        
        //ask for n
        do {
            int a = result[0];
            System.out.print("Enter n from " + a + " to " + nmTop + ": ");
            int n = scanner.nextInt();

            if (n >= a && n <= nmTop) {
                result[2] = (short) n;
                break;
            }
        } while (true);    
        

        //ask for m
        do {
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
