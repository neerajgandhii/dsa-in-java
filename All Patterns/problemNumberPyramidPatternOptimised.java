import java.util.*;

public class problemNumberPyramidPatternOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How large do you want the pyramid to be?");
        int size = sc.nextInt();

        for (int layers = 1; layers <= size; layers++){
            for (int firstBlank = 1; firstBlank <= (size - layers) * 2; firstBlank++){
                System.out.print(" ");
            }
            for (int nums = 1; nums <= layers; nums++){
                System.out.printf("%- 4d", layers);
            }
            System.out.println();
        }
    }
}
