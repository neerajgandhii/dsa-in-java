import java.util.*;

public class problemSumOfEvenOddpro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers, enter 0 to terminate");
        int num = 1;
        int evenSum = 0;
        int oddSum = 0;
        
        while (num!=0){
            num = sc.nextInt();
            if (num % 2 == 0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }
        }
        System.out.println("The sum of even integers is " + evenSum);
        System.out.println("The sum of odd integers is " + oddSum);
    }
}
