package conditionals;
import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        switch (day) {
            case "Monday" -> System.out.println("Variables and Data Types");
            case "Tuesday" -> System.out.println("Loops");
            case "Wednesday" -> System.out.println("Conditionals");
            case "Thursday" -> System.out.println("Collections");
            case "Friday" -> System.out.println("Streams");
            case "Saturday" -> System.out.println("Threads");
            case "Sunday" -> System.out.println("Database");
            default -> System.out.println("Enjoy!");
        }
    }
}
