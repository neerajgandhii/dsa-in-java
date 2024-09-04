import java.util.*;

public class starPatternPro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern element");
        char patternElement = sc.next().charAt(0);
        System.out.println("How big do you want the pattern to be?");
        int limit = sc.nextInt();

        for (int lines = 1; lines <= limit; lines++){
            for (int stars = 1; stars <= lines; stars++){
                System.out.print(patternElement);
            }
            System.out.println();
        }
    }
}