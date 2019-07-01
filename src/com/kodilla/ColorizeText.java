package com.kodilla;

public class ColorizeText {
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";

    public static String blue(String txt) {
        return BLUE + txt + RESET;
    }

    public static String black(String txt) {
        return BLACK + txt + RESET;
    }

    public static String red(String txt) {
        return RED + txt + RESET;
    }

    public static String green(String txt) {
        return GREEN + txt + RESET;
    }

    public static String yellow(String txt) {
        return YELLOW + txt + RESET;
    }

    public static String purple(String txt) {
        return PURPLE + txt + RESET;
    }

    public static String cyan(String txt) {
        return CYAN + txt + RESET;
    }

    public static String white(String txt) {
        return WHITE + txt + RESET;
    }
}
