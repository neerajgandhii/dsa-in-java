import java.util.*;

public class whileSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the desired side length");
        int side = sc.nextInt();

        int lines = 0;
        int stars = 0;
        while (lines < side){
            System.out.println();
            while (stars < side){
                System.out.print("*");
                stars++;
            }
            stars = 0;
            lines++;
        }      
    }
}
