import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number:");
        int num = sc.nextInt();

        switch(num){
            case 1: System.out.println("Burger");
            case 2: System.out.println("Pizza");
            break;
            case 3: System.out.println("Momos");
            break;
            case 4: System.out.println("Cold Drink");
            break;
        }
        System.out.println("Choose a character: ");
        char letter = sc.next().charAt(0);

        switch(letter){
            case 'a': System.out.println("Cold Coffee");
            break;
            case 'b': System.out.println("Hot Coffee");
            break;
        }
    }
}
