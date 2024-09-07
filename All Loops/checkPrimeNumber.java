import java.util.*;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int checkNum = sc.nextInt();
        boolean value = true;

        for (int i = 2; i <= Math.sqrt(checkNum); i++){
            if (checkNum % i == 0){
                value = false;
                break;
            }
        }
        if (value == true){
            System.out.println("Primary Number");
        }
        else {
            System.out.println("Composite Number");
        }
    }
}
