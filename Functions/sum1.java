import java.util.*;

public class sum1{

  public static int calculateSum(int a, int b){
    int sum = a + b;
    return sum;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int sum = calculateSum(num1, num2);
    System.out.println(sum);
  }
}