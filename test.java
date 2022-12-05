import java.io.PrintStream;
import java.util.Scanner;

import org.jcp.xml.dsig.internal.dom.Utils;

class Test {
    static PrintStream output = System.out;
    static java.util.Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String msg = input.nextLine(); 
        output.println(msg);
    }
}