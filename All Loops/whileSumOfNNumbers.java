import java.util.*;

public class whileSumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int range = sc.nextInt();
        int sum = 0, counter = 0;

        while(counter <= range){
            sum = sum + counter; 
            counter++;
        }
        System.out.println("The sum of all natural numbers upto and including " + range + " is " + sum );
    }    
}
