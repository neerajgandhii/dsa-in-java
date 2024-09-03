import java.util.*;

public class profanityDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.nextLine().trim().toLowerCase();

        if (text.contains("funk") || text.contains("trash") || text.contains("putt") || text.contains("lit")){
            System.out.println("Profanity Detected");
        }
        else {
            System.out.println("Your text passed the profanity test.");
        }
    }
}