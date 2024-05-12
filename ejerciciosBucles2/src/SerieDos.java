public class SerieDos {
    public static void main(String[] args){
        // Serie 2: 1, 99, 2, 98, 3, 97, 4, 96, 5, 95

        int i = 0;
        int j = 0;

        System.out.println("Ciclo for");
        j = 99;

        for(i = 1; i <= 5; i++){
            if (j > 95){ // (i < 5)
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            j -= 1;
        }

        System.out.println("\nCiclo While");
        i = 1;
        j = 99;
        while (i <= 5){
            if (j > 95){
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            i += 1;
            j -= 1;
        }

        System.out.println("\nCiclo do-while");
        i = 1;
        j = 99;
        do {
            if (j > 95){
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            j -= 1;
            i += 1;
        } while (i <= 5);
    }
}
