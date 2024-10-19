public class functionSwap {

  public static void swap(int a, int b){
    int temp = b;
    b = a;
    a = temp;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    swap(a, b);
    System.out.println("Here a = " + a);
    System.out.println("Here b = " + b);
  }
}
