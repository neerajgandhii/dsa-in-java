public class lettersHalfPyramidPatternOptimized {
    public static void main(String[] args) {
        char character = 'A';
        for (int lines = 1; lines <= 5; lines++){
            for (int chars = 1; chars <= lines; chars++){
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
    }
}