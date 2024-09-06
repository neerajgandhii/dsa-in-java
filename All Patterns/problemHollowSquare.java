import java.util.*;

public class problemHollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Square");
        int side = sc.nextInt();
        for (int top = 1; top <= side; top++){
            System.out.print("*");
        }
        System.out.println();
        for (int mid = 1; mid <= side - 2; mid++){
            System.out.print("*");
            for (int blanks = 1; blanks <= side - 2; blanks++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int bottom = 1; bottom <= side; bottom++){
            System.out.print("*");
        }
    }
}
