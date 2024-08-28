import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the simple equation");
        float num1 = sc.nextFloat();
        char operand = sc.next().charAt(0);
        float num2 = sc.nextFloat();

        switch(operand){
            case '+': System.out.println(num1 + num2);
            break;
            case '-': System.out.println(num1 - num2);
            break;
            case '*': System.out.println(num1 * num2);
            break;
            case '/': System.out.println(num1 / num2);
            break;
            case '%': System.out.println(num1 % num2);
            break;
            default: System.out.println("Invalid equation");
        }
    }
}
