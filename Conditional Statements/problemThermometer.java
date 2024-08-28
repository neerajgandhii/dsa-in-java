import java.util.*;

public class problemThermometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature");
        double temp = sc.nextDouble();

        if (temp > 100){
            System.out.println("You have a fever.");
        }
        else if (temp >= 99){
            System.out.println("You are developing a mild fever.");
        }
        else if (temp < 94){
            System.out.println("You have the anti-fever.");
        }
        else{
            System.out.println("You don't have a fever :))");
        }
    }
}
