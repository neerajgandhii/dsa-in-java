public class fibonacci {
    public static void main(String[] args) {
        int first, second, third;
        first = 0;
        second = 1;
        third = 0;
        System.out.println(first);
        System.out.println(second);
        for (int i=0; i<=10; i++){
            third = first + second;
            first = second;
            second = third;
            System.out.println(third);
        }
    }
}
