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

            System.out.println(ct.yellow("a") + " = " + ct.yellow(Integer.toString(a)) + " & " + ct.blue("b") + " = " + ct.blue(Integer.toString(b)));

            int step = 1;
            while (a != b) {
                System.out.print(ct.purple("[STEP " + step + "] "));
                if (a > b) {
                    a -= b;
                    System.out.println("{" + ct.yellow("a") + " > " + ct.blue("b") + "} -> {" + ct.yellow("a") + " -= " + ct.blue("b") + "}  -> {" + ct.yellow("a") + " = " + ct.yellow(Integer.toString(a)) + " & " + ct.blue("b") + " = " + ct.blue(Integer.toString(b)) + "}");
                } else {
                    b -= a;
                    System.out.println("{" + ct.yellow("a") + " < " + ct.blue("b") + "} -> {" + ct.blue("b") + " -= " + ct.yellow("a") + "} -> {" + ct.yellow("a") + " = " + ct.yellow(Integer.toString(a)) + " & " + ct.blue("b") + " = " + ct.blue(Integer.toString(b)) + "}");
                }
                step++;
            }
        }
        System.out.println(ct.green("Result ::: " + a));
    }
}
