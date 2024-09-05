public class lettersHalfPyramidPattern {
    public static void main(String[] args) {
        for (int lines = 1; lines <= 5; lines++){
            int counter = 'A';
            for (int chars = 1; chars <= lines; chars++){
                char character = (char) counter;
                System.out.print(character);
                counter++;
            }
            System.out.println();
        }
    }
}
