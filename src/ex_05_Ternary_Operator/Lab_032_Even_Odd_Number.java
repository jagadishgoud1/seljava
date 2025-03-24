package ex_05_Ternary_Operator;

import org.jetbrains.annotations.NotNull;

public class Lab_032_Even_Odd_Number {
    private static String[] args;

    public static void main(String @NotNull [] args) {
        Lab_032_Even_Odd_Number.args = args;
        String s = args[0];
        int n = Integer.parseInt(s);
        String result = (n%2==0) ? "Even Number" : "Odd Number";
        System.out.println(result);
    }
}
