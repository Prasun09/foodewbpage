// we are using package to take input from user
import java.util.Scanner;
public class OddEven {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        // Promptimg  the user for input
        System.out.print("Enter an integer: ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int bitMask = 1;
            }
        if((n & bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
