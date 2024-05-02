public class Main {
    public static void main(String[] args) {
        int n1 = 4, n2 = 2, r = 0;
        int parametro = 5;
        String mensaje = "El resultado es ";

        // Switch solo permite dos tipos de parámetros char e int
        switch (parametro){
            case 1:
                r = n1 + n2;
                System.out.println(mensaje + r);
                break;
            case 2:
                r = n1 - n2;
                System.out.println(mensaje + r);
                break;
            case 3:
                r = n1 * n2;
                System.out.println(mensaje + r);
                break;
            case 4:
                r = n1 / n2;
                System.out.println(mensaje + r);
                break;
            default:
                break;
        }

    }
}