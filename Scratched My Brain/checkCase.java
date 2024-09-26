import java.util.*;

public class checkCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the word");
        String word = sc.next().trim();

        String lowerWord = word.toLowerCase();
        String upperWord = word.toUpperCase();

        if (word == lowerWord){
            System.out.println(word + " is lowercase");
        }
        else if (word == upperWord){
            System.out.println(word + " is uppercase");
        }
        else {
            System.out.println(word + " is a mix of lowercase & uppercase");
        }
    }
}
