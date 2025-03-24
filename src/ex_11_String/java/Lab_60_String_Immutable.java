package ex_11_String.java;

public class Lab_60_String_Immutable {
    public static void main(String[] args) {
        String name = "DJ";
        name.toUpperCase();
        System.out.println(name);

        String s1 = "Hello";
        s1 = s1.concat("World"); // concat add the values , merge the values
        System.out.println(s1);
    }
}
