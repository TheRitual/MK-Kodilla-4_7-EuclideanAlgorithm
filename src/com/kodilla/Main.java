package com.kodilla;

public class Main {

    public static void main(String[] args) {
        int a = -123;
        int b = -321;
        int c = 1;
        int d = 1;

        if(args.length >= 2) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                if(args.length == 3) {
                    c = Integer.parseInt(args[2]);
                }
                if(args.length == 4) {
                    d = Integer.parseInt(args[3]);
                }
            }catch (NumberFormatException e) {
                System.out.println("use arguments: numberA numberB colorize (1=colorize) method (0=euclidian 1=modulo");
            }
        }

        boolean colorize = (c == 1) ? true : false;

        switch (d) {
            case 0 : EuclideanAlgorithm.calculate(a,b , colorize); break;
            case 1 : EuclideanAlgorithm.moduloGcd(a,b , colorize); break;
            default: EuclideanAlgorithm.calculate(a,b , colorize); break;
        }

    }
}
