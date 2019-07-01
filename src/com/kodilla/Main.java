package com.kodilla;

public class Main {

    public static void main(String[] args) {
        int a = 321;
        int b = 123;
        int c = 0;

        if(args.length >= 2) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                if(args.length == 3) {
                    c = Integer.parseInt(args[2]);
                }
            }catch (NumberFormatException e) {
                System.out.println("use arguments: numberA numberB colorize (1=colorize)");
            }
        }

        boolean colorize = (c == 1) ? true : false;

	EuclideanAlgorithm.calculate(a,b , colorize);
    }
}
