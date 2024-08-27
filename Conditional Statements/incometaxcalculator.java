import java.util.*;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your income in numbers");
        int income = sc.nextInt();

        if (income>=1000000){
            System.out.println("30% tax");
            System.out.println(income * 0.3);
        }
        else if (income>500000){
            System.out.println("20% tax");
            System.out.println(income * 0.2);
        }
        else{
            System.out.println("0% tax");
        }
    }
    
}
