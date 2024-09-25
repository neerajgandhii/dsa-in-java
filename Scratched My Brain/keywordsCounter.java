
import java.util.*;

public class keywordsCounter {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your text");
    String text = sc.nextLine();

    System.out.println("Enter the keyword you wish to count");
    String keyword = sc.next();

    String lowerText = text.toLowerCase();
    String lowerKeyword = keyword.toLowerCase();

    int counter = 0;
    int index = 0;

    while ((index = lowerText.indexOf(keyword, index)) != -1) {
        counter++;
        index += lowerKeyword.length(); 
    }

    System.out.println(keyword + " was mentioned " + counter + " times.");
  }
}
