public class whileUnreachableCode {
    public static void main(String[] args) {
        
        while(false){
            System.out.println("Unreachable Code");
        }
        
        while(true){
            System.out.println("Hello World");
        }

        System.out.println("Unreachable Code");
    }
}
