import java.util.*;

public class problem01TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a size for the triangle :))");
        int size = sc.nextInt();
        int num;

        for (int layer = 1; layer <= size; layer++){
            if (layer % 2 == 0){
                num = 0;
            }
            else {
                num = 1;
            }
            for (int digit = 1; digit <= layer; digit++){
                System.out.print(num);

                if (num == 1){
                    num = 0;
                }
                else {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}
