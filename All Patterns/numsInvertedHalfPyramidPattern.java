public class numsInvertedHalfPyramidPattern {
    public static void main(String[] args) {
        for (int lines = 4; lines > 0; lines--){
            for (int nums = 4; nums >= lines; nums--){
                System.out.print(nums);
            }
            System.out.println();
        }
    }
}