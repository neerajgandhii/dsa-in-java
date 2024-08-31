import java.util.*;

public class problemSumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you wanna test");
        int limit = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter the numbers");

        for (int i = 1; i <= limit; i++){
            int num = sc.nextInt();
            if (num % 2 == 0){
                evenSum += num;
            }
            else {
                oddSum +=num;
            }
        }
        System.out.println("The sum of even integers is " + evenSum);
        System.out.println("The sum of odd integers is " + oddSum);
    }
}
