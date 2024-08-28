import java.util.*;
public class problemPositiveOrNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        float num = sc.nextFloat();

        if (num > 0){
            System.out.println(num + " is positive.");
        }
        else if (num == 0){
            System.out.println("Number is zero: neither positive nor negative.");
        }
        else{
            System.out.println(num + " is negative.");
        }
    }
}