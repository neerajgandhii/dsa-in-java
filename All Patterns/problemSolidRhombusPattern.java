import java.util.*;

public class problemSolidRhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the size for your rhombus");
        int size = sc.nextInt();

        for (int layer = 1; layer <= size; layer++){
            for (int blank = size - layer; blank > 0; blank--){
                System.out.print(" ");
            }
            for (int star = 1; star <= size; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
