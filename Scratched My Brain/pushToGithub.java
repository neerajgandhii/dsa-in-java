import java.util.*;

public class pushToGithub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        String reinitialise = sc.nextLine().trim();
        if (reinitialise.equalsIgnoreCase("git init")){
            System.out.print(">");
            String add_files = sc.nextLine().trim();
            if (add_files.equalsIgnoreCase("git add .")){
                System.out.print(">");
                String commit = sc.nextLine().trim();
                if (commit.equalsIgnoreCase("git commit -m \"day8\"")){
                    System.out.print(">");
                    String push = sc.nextLine().trim();
                    if (push.equalsIgnoreCase("git push origin main")){
                        System.out.println("Files have been pushed to your repo");
                    }
                    else {
                        System.out.println("Invalid Command");
                    }
                }
                else {
                    System.out.println("Invalid Command");
                }
            }
            else {
                System.out.println("Invalid Command");
            }
        }
        else {
            System.out.println("Invalid Command");
        }
    }
}
