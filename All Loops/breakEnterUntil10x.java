import java.util.*;

public class breakEnterUntil10x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num % 10 == 0 ){
                break;
            }
            System.out.println("The number was: " + num);
        }
        while(true);
        System.out.println("Shouldn't have pressed that.");
    }
}
