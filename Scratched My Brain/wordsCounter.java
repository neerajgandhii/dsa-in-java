import java.util.*;

public class wordsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a phrase!");
        String line = sc.nextLine().trim();
        
        int counter = 1;
        int index = 0;

        if (line.isEmpty()){
            System.out.println("0 words!");
            return;
        }

        while ((index = line.indexOf(" ", index)) != -1){
            counter++;
            index += 1;
        }

        System.out.println(counter + " words!");
    }
}