import java.io.PrintStream;
import java.util.Scanner;

class Test {
    static PrintStream output = System.out;
    static java.util.Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a = input.nextInt();
        int b = input.nextInt();
        output.println(a * b);
    }
}