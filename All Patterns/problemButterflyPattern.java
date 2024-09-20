import java.util.*;

public class problemButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a size for your butterfly!");
        int size = sc.nextInt();

        for (int upperLayers = 1; upperLayers <= (size / 2); upperLayers++){
            System.out.print("*");
            for (int upperBlanks = (size / 2); upperBlanks >= 0; upperBlanks--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
