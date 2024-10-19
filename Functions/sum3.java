import java.util.Scanner;

public class sum3 {

  public static void calculateSum(int a, int b){
    int sum = a + b;
    System.out.println(sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    calculateSum(num1, num2);
  }
}
