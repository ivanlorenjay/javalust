public class Main {
    public static void main(String[] args) {
        int i = 1;

        // No se puede declarar una variable y no se pueden hacer incrementos entre los paréntesis
        while (i < 10){
            System.out.println(i);
            i+=2; // Siempre debe haber un incremento o decremento para que se cumpla la condición
        }
    }
}