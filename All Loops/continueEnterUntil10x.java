import java.util.*;

public class continueEnterUntil10x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter 0 to terminate.");
        int num;

        do{
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num % 10 == 0){
                continue;
            }
            System.out.println("The number was: " + num);
        }
        while (num != 0);
        System.out.println("Terminated.");
    }
}
