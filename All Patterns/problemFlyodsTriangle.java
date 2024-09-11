import java.util.*;
    
public class problemFlyodsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many levels do you want?");
        int size = sc.nextInt();
        int num = 1;
        System.out.println("Here's the triangle:");

        for (int level = 1; level <= size; level++){
            for (int digit = 1; digit <= level; digit++){
                System.out.printf("%- 3d", num);
                num++;
            }
            System.out.println();
        }
    }
}
