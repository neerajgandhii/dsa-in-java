import java.util.*;

public class extraProblemPerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the Triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.println("Perimeter: " + (side1+ side2+ side3));
    }
}