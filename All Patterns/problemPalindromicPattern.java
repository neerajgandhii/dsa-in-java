import java.util.*;

public class problemPalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a size for your pattern");
        int size = sc.nextInt();

        for (int layer = 1; layer <= size; layer++){
            for (int blanks = 1; blanks <= size - layer; blanks++){
                System.out.print(" ");
            }
            for (int firstPattern = layer; firstPattern >= 1; firstPattern--){
                System.out.print(firstPattern);
            }
            for (int secondPattern = 2; secondPattern <= layer; secondPattern++){
                System.out.print(secondPattern);
            }
            System.out.println();
        }
    }
}
