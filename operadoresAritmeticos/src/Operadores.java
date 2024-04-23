public class Operadores {
    public static void main(String[] args) {
        System.out.println("OPERADORES ARITMÉTICOS Y JERAQUÍA\n");
        System.out.println("Suma + \n Resta - \n Multiplicación * \n División / \n Potencia ^ \n Paréntesis () ");
        System.out.println("\nPrioridades: \n () -> ^ -> * y / -> + y -");

        System.out.println("Demostrando prioridad");
        int numUno = 4;
        int numDos = 4;
        int resultado = 0;

        resultado = numUno + numDos / 2;
        System.out.println("Resultado: " + resultado);

        // Modificamos la jerarquía de las operaciones
        resultado = (numUno + numDos) / 2;
        System.out.println("Resultado con paréntesis: " + resultado);
    }
}