import java.util.*;

public class problemAvgOfThreeNos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float avg = (num1 + num2 + num3)/3;
        System.out.println(avg);
    }
}
