import java.util.*;

public class adultifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Adult: Drive, Vote");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}