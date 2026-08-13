package practice;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isReverse = true;
        int left = 0;
        int right = str.length() - 1;

        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Original: " + str + " " + "Reversed: " + rev);

//        Using For Loop
//        for (int i = 0; i < str.length() / 2; i++) {
//            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
//                isReverse = false;
//                break;
//            }
//        }
//        Using While Loop
          while(left < right) {

              if (str.charAt(left) != str.charAt(right)) {
                  isReverse = false;
                  break;
              }
              left++;
              right--;
          }

        System.out.println(isReverse ? "True" : "False");
    }
}

