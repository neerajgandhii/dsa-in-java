public class reverseOriginalNumber {
    public static void main(String[] args) {
        int num = 10899;
        int reverse = 0;
        
        while (num > 0){
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }
        num = reverse;
        System.out.println(num);
    }
}
