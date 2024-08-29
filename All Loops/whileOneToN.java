import java.util.*;

public class whileOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int counter = 1;
        int limit = sc.nextInt();
        System.out.println("The Order is");

        while (counter <= limit){
            System.out.println(counter);
            counter++;
        }
    }
}
