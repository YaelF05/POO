import java.util.Scanner;

public class promedioPonderadoV2 {

    public static double promedio(int cantidad) {

        Scanner scan = new Scanner(System.in);
        int[] listaCalificaciones = new int[cantidad];
        int[] listaCreditos = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduzca los creditos de la materia " + i + ": ");
            listaCreditos[i] = scan.nextInt();
            System.out.print("Introduzca la calificación " + i + ": ");
            listaCalificaciones[i] = scan.nextInt();;
        }

        return calculo(listaCalificaciones, listaCreditos);
    }

    public static double calculo(int[] califs, int[] creds) {
        double total = 0;
        int sumaCreditos = 0;
        int[] arrCreditos = creds;
        int[] arrCalificaciones = califs;

        for (int i = 0; i < arrCreditos.length; i++) {
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

        double promedio = promedio(cantiad);

        System.out.printf("El promedio es: %.2f", promedio);

    }
}