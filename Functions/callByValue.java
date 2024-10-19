public class callByValue {

  public static void changeA(int a){
    a = 10;
    System.out.println("In function, a = " + a);
  }
  public static void main(String[] args) {
    int a = 5;
    System.out.println("Original a = " + a);
    changeA(a);
    System.out.println("In main, a = " + a);
  }
}
