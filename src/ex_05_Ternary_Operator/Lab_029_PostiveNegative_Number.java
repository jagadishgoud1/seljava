package ex_05_Ternary_Operator;

public class Lab_029_PostiveNegative_Number {
    public static void main(String[] args) {
        String num1 = args[0];
        int num = Integer.parseInt(num1);
        // result = condition ? expression1 : expression2;
        String number = (num > 0) ? "This is a Positive Number" : "This is a Negative Number";
        System.out.println(number);
    }
}
