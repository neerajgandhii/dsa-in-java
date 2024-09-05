public class invertedStarPatternAlt {
    public static void main(String[] args) {
        for (int lines = 1; lines <=4; lines++){
            for (int stars = 1; stars <= 4 - lines + 1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
