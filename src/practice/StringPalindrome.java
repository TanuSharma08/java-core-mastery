package practice;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isReverse = true;

        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Original: " + str + " " + "Reversed: " + rev);

        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                isReverse = false;
                break;
            }
        }

        System.out.println(isReverse ? "True" : "False");
    }
}

