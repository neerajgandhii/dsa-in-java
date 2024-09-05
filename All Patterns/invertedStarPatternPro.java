import java.util.*;

public class invertedStarPatternPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a pattern symbol");
        char patternElement = sc.next().charAt(0);
        System.out.println("How many layers do you want?");
        int limit = sc.nextInt();

        for (int lines = limit; lines > 0; lines--){
            for (int stars = 1; stars <= lines; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
