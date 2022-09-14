import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    private static int square(int input) {
        return input * input;
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        System.out.print("Number to square: ");
        int input = new Scanner(System.in).nextInt();

        // Modify the below call to assign the result of the method call to a variable.
        int output = square(input);

        // Put the result System.out code here.
        System.out.println(output);

    }
}

