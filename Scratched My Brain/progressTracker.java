import java.util.*;

public class progressTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a subject");
        String sub = sc.next().trim();
        System.out.println("How many hours does it need?");
        float hour = sc.nextFloat();
        int mins = (int) (hour * 60);
        int studyMins;

        while (mins > 0){
            System.out.println("How much time did you study for? Choose hr/min");
            String hourOrMin = sc.next().trim().toLowerCase();
            if (hourOrMin.equals("hr")){
                System.out.println("Enter the hours you studied for!");
                float studyHour = sc.nextFloat();
                studyMins = (int) (studyHour*60);
            }
            else if (hourOrMin.equals("min")){
                System.out.println("Enter the minutes you studied for!");
                studyMins = sc.nextInt();
            }
            else {
                System.out.println("Invalid choice");
                continue;
            }

            mins -= studyMins;

            if (mins > 0){
                System.out.println(mins + " mins/" + (float) mins/60 + " hrs to go!");
            }
        }
        System.out.println("ARGHHH " + sub + " done!!");
    }
}