import java.util.*;

public class problemInvertedHalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Choose a size for your pyramid");
        int size = sc.nextInt();

        for (int layer = size; layer > 0; layer--){
            for (int num = 1; num <= layer; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
