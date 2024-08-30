import java.util.*;

public class forSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the side length \n");
        int side = sc.nextInt();

        for (int lines = 0; lines < side; lines++){
            System.out.println();
            for (int stars = 0; stars < side; stars++){
                System.out.print("*");
            }
        }
    }
}
