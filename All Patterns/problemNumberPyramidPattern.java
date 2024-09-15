import java.util.*;

public class problemNumberPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How large do you want the pyramid to be?");
        int size = sc.nextInt();

        for (int layers = 1; layers <= size; layers++){
            for (int firstBlank = 1; firstBlank <= size - layers; firstBlank++){
                System.out.print(" ");
            }
            for (int nums = 1; nums <= layers; nums++){
                System.out.print(layers);
                System.out.print(" ");
            }
            for (int lastBlank = 1; lastBlank <= size - layers - 1; lastBlank++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
