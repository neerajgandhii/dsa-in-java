import java.util.*;

public class forSquarePatternPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern style");
        char pattern = sc.next().charAt(0);
        System.out.println("Choose the side length");
        int side = sc.nextInt();

        for (int lines = 0; lines < side; lines++){
            System.out.println();
            for (int stars = 0; stars < side; stars++){
                System.out.print(pattern);
            }
        }
    }
}
