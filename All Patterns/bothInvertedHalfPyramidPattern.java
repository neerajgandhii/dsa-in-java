public class bothInvertedHalfPyramidPattern {
    public static void main(String[] args) {
        for (int lines = 4; lines > 0; lines--){
            for (int nums = 4; nums > 4 - lines; nums--){
                System.out.print(nums);
            }
            System.out.println();
        }
    }
}
