import java.util.*;

public class problemHollowRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int breadth = sc.nextInt();
        for (int top = 1; top <= breadth; top++){
            System.out.print("*");
        }
        for (int sides = 1; sides <= length - 2; sides++){
            System.out.println();
            System.out.print("*");
            for (int blanks = 1; blanks <= breadth - 2; blanks++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
        for (int bottom = 1; bottom <= breadth; bottom++){
            System.out.print("*");
        }
    }
}