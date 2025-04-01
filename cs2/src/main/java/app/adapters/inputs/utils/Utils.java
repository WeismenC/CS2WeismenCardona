package app.adapters.inputs.utils;

import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getReader() {
        return scanner;
    }
}