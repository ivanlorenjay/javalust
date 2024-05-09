public class doWhile {
    public static void main(String[] args){
        int i = 1000;

        do {
            System.out.print(i + ", ");
            i -= 200; // Los ciclos siempre deben tener un incremento o decremento para que puedan cambiar y terminar
        }while(i >= 0);
    }
}
