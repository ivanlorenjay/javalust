public class Fibonacci {
    public static void main(String[] args){

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        int a = 0, b = 1, c = 0;

        System.out.println("Fibonacci For");
        for(int i = 1; i <= 10; i++){
            System.out.print(a + ", "); // 0, 1, 
            c = a + b; // 1 + 1 = 2
            a = b; // 1
            b = c; // 2
        }
    }
}
