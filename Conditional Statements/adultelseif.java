import java.util.*;

public class adultelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Adult: Drive, Vote, Drink");
        }
        else if (age>=13){
            System.out.println("Teenager: Cool part of the life");
        }
        else{
            System.out.println("Child: Lame");
        }
     }
}

