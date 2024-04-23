public class Operaciones {
    public static void main(String[] args) {
        /*
        Realizar suma, resta, multiplicación o división dependiendo de la decisión del usuario
        de dos números enteros
        1 -> suma
        2 -> resta
        3 -> multiplicacion
        4 -> división
         */
        int operacion = 3;
        int numUno = 8;
        int numDos = 4;
        int resultado = 0;

        // Singo de asignación "="
        // Signo de comparación "=="

        if(operacion == 1) {
            resultado = numUno + numDos;
            System.out.println("El resultado de la suma es " + resultado);
        } else if(operacion == 2) {
            resultado = numUno - numDos;
            System.out.println("El resultado de la resta es " + resultado);
        } else if( operacion == 3){
            resultado = numUno * numDos;
            System.out.println("El resultado de la multiplicación es " + resultado);
        } else if (operacion == 4) {
            resultado = numUno / numDos;
            System.out.println("El resultado de la división es " + resultado);
        } else {
            System.out.println("La opción no existe, elige una opción correcta");
        }



    }
}