import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String nombre = "";
        int clave;
        int antiguedad;

        System.out.println("Bienvenido al sistema de vacaciones");
        System.out.print("Escribe tu nombre: ");
        nombre = entry.nextLine();

        System.out.print("\nEscribe tu clave: ");
        clave = entry.nextInt();

        System.out.print("\nEscribe tu angiguedad: ");
        antiguedad = entry.nextInt();

        if(clave == 1){
            if(antiguedad == 1){
                System.out.println("6 días de vacaciones");
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("14 días de vacaiones");
            } else if(antiguedad >= 7){
                System.out.println("20 días de vacaciones");
            } else {
                System.out.println("Digite un número válido");
            }
        } else if(clave == 2){
            if(antiguedad == 1){
                System.out.println("7 días de vacaciones");
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("15 días de vacaiones");
            } else if(antiguedad >= 7){
                System.out.println("22 días de vacaciones");
            } else {
                System.out.println("Digite un número válido");
            }
        } else if(clave == 3){
            if(antiguedad == 1){
                System.out.println("10 días de vacaciones");
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("20 días de vacaiones");
            } else if(antiguedad >= 7){
                System.out.println("30 días de vacaciones");
            } else {
                System.out.println("Digite un número válido");
            }
        } else {
            System.out.println("Ingrese una clave válida!");
        }

        // Objeto scanner cerrado
        entry.close();
    }
}