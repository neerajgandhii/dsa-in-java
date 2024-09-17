import java.util.*;

public class payDebtWithOrders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1500;
        System.out.println("You owe her " + num + " rupees");

        while (num != 0){
            System.out.println("Enter the order cost");
            int cost = sc.nextInt();
            int negativeCheck = num - cost;
            if (negativeCheck < 0){
                System.out.println("Order value too big, exceeds the debt amount!");
            }
            else {
                num -= cost;
                System.out.println("You now owe her " + num + " rupees");
            }
        }
        System.out.println("Debt has been paid up!");
    }
}
