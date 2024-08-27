import java.util.*;

public class oddeventernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        String oddeven = ((num % 2) == 0) ? "even" : "odd";
        System.out.println(num + " is " + oddeven);
    }    
}
