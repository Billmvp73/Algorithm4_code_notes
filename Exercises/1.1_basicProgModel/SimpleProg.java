/******************************************************************************
 *  Compilation:  javac BinarySearch.java
 *  Execution:    java BinarySearch allowlist.txt < input.txt
 *  Dependencies: In.java StdIn.java StdOut.java
 *  Data files:   https://algs4.cs.princeton.edu/11model/tinyW.txt
 *                https://algs4.cs.princeton.edu/11model/tinyT.txt
 *                https://algs4.cs.princeton.edu/11model/largeW.txt
 *                https://algs4.cs.princeton.edu/11model/largeT.txt
 *
 *  % java BinarySearch tinyW.txt < tinyT.txt
 *  50
 *  99
 *  13
 *
 *  % java BinarySearch largeW.txt < largeT.txt | more
 *  499569
 *  984875
 *  295754
 *  207807
 *  140925
 *  161828
 *  [367,966 total values]
 *
 ******************************************************************************/

import algs4.StdOut;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 * The {@code BinarySearch} class provides a static method for binary
 * searching for an integer in a sorted array of integers.
 * <p>
 * The <em>indexOf</em> operations takes logarithmic time in the worst case.
 * <p>
 * For additional documentation, see <a href="https://algs4.cs.princeton.edu/11model">Section 1.1</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class SimpleProg {
    public static void ThreeEqual(String[] args) {
        int a = parseInt(args[1]);
        int b = parseInt(args[2]);
        int c = parseInt(args[3]);

        if (a == b && b == c) {
            StdOut.println(a);
            StdOut.println(b);
            StdOut.println(c);
        } else {
            StdOut.println("Not equal");
        }
    }

    public static void DoubleZeroOne(String[] args) {
        double x = parseDouble(args[1]);
        double y = parseDouble(args[2]);
        if (x > 0 && x < 1 && y < 1 && y > 0) {
            StdOut.print("True");
        } else {
            StdOut.print("False");
        }
    }

    public static void main(String[] args) {
        //the first argument is an int [1, ..., ]
        int funcToCall = parseInt(args[0]);
        if (funcToCall == 1) {
            //1.1.3
            // if three input integers are all equal, then print them out
            // Otherwise, print "not equal"
            //need four arguments in args
            ThreeEqual(args);
        } else if (funcToCall == 2) {
            /*
            1.1.4
             */
            int a = parseInt(args[1]);
            int b = parseInt(args[2]);
            int c = 1;
            //if (a > b) then c=0; no symbol 'then'
            //if a > b {c=0;} () expected
            if (a < b) c = 5; // no problem
            StdOut.print(c);
            if (a > b) c = 0;
            else b = 0;
            StdOut.print(b);
            StdOut.print(c);
        } else if (funcToCall == 3) {
            // 1.1.5
            DoubleZeroOne(args);
        } else if (funcToCall == 4) {
            //1.1.7
            double t = 9.0;
            while (Math.abs(t - 9.0 / t) > .001) {
                t = (9.0 / t + t) / 2.0;
            }
            StdOut.printf("%.5f\n", t);
            //3.00009

            //b
            int sum = 0;
            for (int i = 1; i < 1000; i++) {
                for (int j = 0; j < i; j++) {
                    sum++;
                }
            }
            StdOut.println(sum);
            //499500

            //c
            sum = 0;
            for (int i = 1; i < 1000; i *= 2) {
                for (int j = 0; j < 1000; j++) {
                    sum++;
                }
            }
            StdOut.println(sum);
            //10000
        } else if (funcToCall == 5) {
            System.out.println('b');
            System.out.println('b' + 'c');
            System.out.println((char) ('a' + 4));
            System.out.print('a' + 1);
            /*
            b
            197
            e
            98
             */
        } else if (funcToCall == 6) {
            //1.1.9
            String s = "";
            int N = parseInt(args[1]);
            for (int n = N; n > 0; n /= 2) {
                s = (n % 2) + s;
            }
            StdOut.println(s);
        }
    }
}
