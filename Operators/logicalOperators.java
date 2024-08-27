public class logicalOperators {
    public static void main(String[] args) {
        System.out.println((3>2)&&(10>0));
        System.out.println((3<2)&&(10>0));
        System.out.println((3<2)&&(10<0));
        System.out.println((3>2)&&(10<0));

        System.out.println((3>2)||(10>0));
        System.out.println((3>2)||(10<0));
        System.out.println((3<2)||(10>0));
        System.out.println((3<2)||(10<0));

        System.out.println(!(5>4));
        System.out.println(!(10<0));
    }
}
