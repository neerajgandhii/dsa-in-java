import java.util.*;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");

        float radius = sc.nextFloat();
        float area = (float) 3.14 * radius * radius;
        System.out.println(area);
    }
    
}
