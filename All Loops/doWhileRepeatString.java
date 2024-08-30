import java.util.*;

public class doWhileRepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String repeat = sc.nextLine();
        int counter = 0;

        do{
            System.out.println(repeat);
            counter++;
        }
        while (counter < 10);
    }
}
