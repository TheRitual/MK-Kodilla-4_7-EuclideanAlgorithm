package com.kodilla;

public class EuclideanAlgorithm {

    public static void calculate(int a, int b) {
        if(a == 0 || b == 0) {
            System.out.println("Numbers can't be equal to 0");
        } else {
            if (a < 0) {
                a *= -1;
                System.out.println(ColorizeText.red("Numbers can't be negative! Changing a to " + a));
            }

            if (b < 0) {
                b *= -1;
                System.out.println(ColorizeText.red("Numbers can't be negative! Changing b to " + b));
            }

            System.out.println(ColorizeText.yellow("a") + " = " + ColorizeText.yellow(Integer.toString(a)) + " & " + ColorizeText.blue("b") + " = " + ColorizeText.blue(Integer.toString(b)));

            int step = 1;
            while (a != b) {
                System.out.print(ColorizeText.purple("[STEP " + step + "] "));
                if (a > b) {
                    a -= b;
                    System.out.println("{" + ColorizeText.yellow("a") + " > " + ColorizeText.blue("b") + "} -> {" + ColorizeText.yellow("a") + " -= " + ColorizeText.blue("b") + "}  -> {" + ColorizeText.yellow("a") + " = " + ColorizeText.yellow(Integer.toString(a)) + " & " + ColorizeText.blue("b") + " = " + ColorizeText.blue(Integer.toString(b)) + "}");
                } else {
                    b -= a;
                    System.out.println("{" + ColorizeText.yellow("a") + " < " + ColorizeText.blue("b") + "} -> {" + ColorizeText.blue("b") + " -= " + ColorizeText.yellow("a") + "} -> {" + ColorizeText.yellow("a") + " = " + ColorizeText.yellow(Integer.toString(a)) + " & " + ColorizeText.blue("b") + " = " + ColorizeText.blue(Integer.toString(b)) + "}");
                }
                step++;
            }
        }
        System.out.println(ColorizeText.green("Result ::: " + a));
    }
}