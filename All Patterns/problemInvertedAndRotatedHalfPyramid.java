import java.util.*;

public class problemInvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Choose a size for your pattern");
        int size = sc.nextInt();

        for (int pattern = 1; pattern <= size; pattern++){
            for (int blanks = 1; blanks <= size - pattern; blanks++){
                System.out.print(" ");
            }
            for (int stars = 1; stars <= pattern; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}