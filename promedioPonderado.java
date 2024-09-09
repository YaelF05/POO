import java.util.Scanner;

public class promedioPonderado {

    public static int[] creditos(int cantidad) {

        Scanner scan = new Scanner(System.in);
        int[] listaCreditos = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduzca los creditos de la materia " + i + ":");
            listaCreditos[i] = scan.nextInt();
        }

        return listaCreditos;
    }

    public static int[] calificaciones(int cantidad) {

        Scanner scan = new Scanner(System.in);
        int[] listaCalificaciones = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduzca la calificación " + i + ":");
            listaCalificaciones[i] = scan.nextInt();;
        }

        return listaCalificaciones;
    }

    public static double total(int cantidad) {
        double total = 0;
        int sumaCreditos = 0;
        int[] arrCreditos = creditos(cantidad);
        int[] arrCalificaciones = calificaciones(cantidad);

        for (int i = 0; i < cantidad; i++) {
            total += arrCalificaciones[i] * arrCreditos[i];
            sumaCreditos += arrCreditos[i];
        }
        total /= sumaCreditos;
        return total;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Escibre cuantas materias serán: ");
        int cantiad = scan.nextInt();

        double promedio = total(cantiad);

        System.out.printf("El promedio es: %.2f", promedio);

    }
}