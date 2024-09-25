import java.util.*;

public class VIPPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String checker = sc.nextLine().trim();
        String ID = "Blank";
        if (checker.equalsIgnoreCase("active")){
            while (true) {
                System.out.println("Show your ID");
                ID = sc.nextLine().trim();
                if (ID.equalsIgnoreCase("VIP Pass")){
                    continue;
                }
                if (ID.equalsIgnoreCase("Anomaly Detected")){
                    break;
                }
                if (ID.equalsIgnoreCase("shut down")){
                    break;
                }
                System.out.println("Please wait in the Lobby.");
            }
            System.out.println("Entry closed for now.");
        }
        else {
            System.out.println("Please enter a valid command.");
        }
    }
}