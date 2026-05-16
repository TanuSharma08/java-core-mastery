package loops;

// Fibonacci Series
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);
        }
    }
}
