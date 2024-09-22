import java.util.*;

public class problemButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a size for your butterfly!");
        int size = sc.nextInt();

        if (size % 2 == 0){
            for (int layers = 1; layers <= (size / 2) - 1; layers++){
                for (int frontStars = 1; frontStars <= layers; frontStars++){
                    System.out.print("*");
                }
                for (int blanks = (size - (layers * 2)); blanks >= 1; blanks--){
                    System.out.print(" ");
                }
                for (int backStars = 1; backStars <= layers; backStars++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int middleLayers = 1; middleLayers <= size; middleLayers++){
                System.out.print("*");
            }
            System.out.println();
            for (int middleLayers = 1; middleLayers <= size; middleLayers++){
                System.out.print("*");
            }
            System.out.println();
            for (int layers = (size / 2) - 1; layers >= 1; layers--){
                for (int frontStars = 1; frontStars <= layers; frontStars++){
                    System.out.print("*");
                }
                for (int blanks = (size - (layers * 2)); blanks >= 1; blanks--){
                    System.out.print(" ");
                }
                for (int backStars = 1; backStars <= layers; backStars++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            for (int layers = 1; layers <= (size / 2); layers++){
                for (int frontStars = 1; frontStars <= layers; frontStars++){
                    System.out.print("*");
                }
                for (int blanks = (size - (layers * 2)); blanks >= 1; blanks--){
                    System.out.print(" ");
                }
                for (int backStars = 1; backStars <= layers; backStars++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int middleLayers = 1; middleLayers <= size; middleLayers++){
                System.out.print("*");
            }
            System.out.println();
            for (int layers = (size / 2); layers >= 1; layers--){
                for (int frontStars = 1; frontStars <= layers; frontStars++){
                    System.out.print("*");
                }
                for (int blanks = (size - (layers * 2)); blanks >= 1; blanks--){
                    System.out.print(" ");
                }
                for (int backStars = 1; backStars <= layers; backStars++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}