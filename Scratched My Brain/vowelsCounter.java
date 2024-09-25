import java.util.*;

public class vowelsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String word = sc.next();

        char[] vowels = {'a','e','i','o','u'};
        int counter = 0;

        int limit = word.length();

        for (int index = 0; index < limit; index++){
            char currentChar = word.charAt(index);
            for (char vowel : vowels){
                if (currentChar == vowel){
                    counter++;
                    break;
                }
            }
        }
        System.out.println("The word has " + counter + " vowels");
    }
}
