public class fibonacci {
    public static void main(String[] args){
        int i = 0, j = 1, k = 0;

        System.out.println("Fibonacci con for");

        System.out.print(k + ", ");
        for (i = 1; i <= 5; i++){
            j += k;
            System.out.print(j + ", ");
            k+=j;
            System.out.print(k + ", ");
        }

        System.out.println("\nFibonacci con while");
        i = 1; j = 1; k = 0;
        System.out.print(k + ", ");
        while (i <= 5){
            j += k;
            System.out.print(j + ", ");
            k+=j;
            System.out.print(k + ", ");
            i++;
        }

        System.out.println("\nFibonacci con do-while");
        i = 1; j = 1; k = 0;
        System.out.print(k + ", ");
        do {
            j += k;
            System.out.print(j + ", ");
            k+=j;
            System.out.print(k + ", ");
            i++;
        }while(i <= 5); // siempre vas a tener el doble de numeros que el límite, en este caso tiene uno más por la primera línea de print()

        // Soluciona la serie pero no de la mejor manera
    }
}
