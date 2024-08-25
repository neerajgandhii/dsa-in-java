import java.util.*;

public class problemBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of the pencil");
        float pencilPrice = sc.nextFloat();
        System.out.println("Enter price of the pen");
        float penPrice = sc.nextFloat();
        System.out.println("Enter price of the eraser");
        float eraserPrice = sc.nextFloat();
        System.out.println("Your total is "+ (pencilPrice + penPrice + eraserPrice));
        System.out.println("GST: 18%");
        System.out.println("You need to pay " + ((pencilPrice + penPrice + eraserPrice)*1.18));
    }
}