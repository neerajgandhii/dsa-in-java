public class lettersHalfPyramidPattern2 {
    public static void main(String[] args) {
        int initialCharacter = 'A';
        for (int lines = 1; lines <=5; lines++){
            for (int chars = 1; chars <=lines; chars++){
                char character = (char) initialCharacter;
                System.out.print(character);
                initialCharacter++;
            }
            System.out.println();
        }
    }
}
