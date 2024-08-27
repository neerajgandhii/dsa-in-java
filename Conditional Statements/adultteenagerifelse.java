import java.util.*;

public class adultteenagerifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Adult: Drive, Vote, Drink");
        }
        if (13<=age && age<=19){
            System.out.println("Teenager: Cool part of your life");
        }
        else{
            System.out.println("Child: Lame");
        }
    }
}
