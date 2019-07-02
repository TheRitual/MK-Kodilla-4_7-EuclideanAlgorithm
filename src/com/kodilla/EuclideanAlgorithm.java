package com.kodilla;

public class EuclideanAlgorithm {
    public static void calculate(int a, int b, boolean colorize) {
        ColorizeText ct = new ColorizeText(colorize);
        if(a == 0 || b == 0) {
            System.out.println("Numbers can't be equal to 0");
        } else {
            if (a < 0) {
                a *= -1;
                System.out.println(ct.red("Numbers can't be negative! Changing a to " + a));
            }

            if (b < 0) {
                b *= -1;
                System.out.println(ct.red("Numbers can't be negative! Changing b to " + b));
            }

            System.out.println(ct.yellow("a[" + a + "]") + " & " + ct.blue("b[" + b + "]"));

            int step = 1;
            while (a != b) {
                System.out.println(ct.purple("[STEP " + step + "] "));
                if (a > b) {
                    System.out.println("\t" + ct.yellow("a[" + a + "]") + " > " + ct.blue("b[" + b + "]") + " \u27A4 " + ct.yellow("a = a - ") + ct.blue("b"));
                    a -= b;
                    System.out.println("\t" + ct.yellow("a[" + a + "]") + " & " + ct.blue("b[" + b + "]"));
                } else {
                    System.out.println("\t" + ct.yellow("a[" + a + "]") + " < " + ct.blue("b[" + b + "]") + " \u27A4 " + ct.blue("b = b - ") + ct.yellow("a"));
                    b -= a;
                    System.out.println("\t" + ct.yellow("a[" + a + "]") + " & " + ct.blue("b[" + b + "]"));
                }
                step++;
            }
        }
        System.out.println(ct.cyan("Result ::: " + a));
    }



    public static void moduloGcd(int a, int b, boolean colorize) {
        ColorizeText ct = new ColorizeText(colorize);
        int mod = a;
        if(a == 0 || b == 0) {
            System.out.println(ct.red("Numbers can't be equal to 0"));
            mod = 0;
        }

        if(a < b) {
            System.out.println(ct.cyan("Switching positions.\na is bigger number now"));
            int c = a;
            a = b;
            b = c;
        }

        System.out.println(ct.yellow("a = " + a) + " & " + ct.blue("b = " + b));
        int step = 1;
        while(mod != 0) {
            System.out.println(ct.purple("[STEP " + step + "]"));
            mod = a % b;
            System.out.println(ct.yellow("a[" + Integer.toString(a) + "]") + " % " + ct.blue("b[" + Integer.toString(b) + "]") + " = " + ct.green(Integer.toString(mod)));
            if (mod != 0) {
                a = b;
                System.out.println("\t" + ct.yellow("a[" + Integer.toString(a) + "]") + " = " + ct.blue("b[" + Integer.toString(b) + "]"));
                b = mod;
                System.out.println("\t" + ct.yellow("b[" + Integer.toString(b) + "]") + " = " + ct.green("mod[" + Integer.toString(mod) + "]"));
                step++;
            }
        }

        System.out.println(ct.cyan("\nResult ::: " + b));
    }
}
