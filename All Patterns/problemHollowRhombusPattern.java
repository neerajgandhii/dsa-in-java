import java.util.*;

public class problemHollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Choose a size for your Rhombus :))");
        int size = sc.nextInt();

        for (int layer = 1; layer <= size; layer++){
            for (int blank = size - layer; blank > 0; blank--){
                System.out.print(" ");
            }
            if (layer == 1 || layer == size){
                for (int stars = 1; stars <= size; stars++){
                    System.err.print("*");
                }
                System.out.println();
                continue;
            }
            else {
                System.out.print("*");
                for (int innerBlank = 1; innerBlank <= size - 2; innerBlank++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
