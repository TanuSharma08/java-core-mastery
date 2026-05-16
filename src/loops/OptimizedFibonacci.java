package loops;
import java.util.Scanner;

// Optimized Fibonacci using While loop
public class OptimizedFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;

        while(count < n){
            System.out.println(a);
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
    }
}
