import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double numeroDouble = scanner.nextDouble();

        System.out.println("La superficie es: " + superficie(numeroDouble));
        System.out.println("El volumen es: " + volumen(numeroDouble));

        System.out.print("Introduce el numero de numeros aleatorios: ");
        int num = scanner.nextInt();

        System.out.println("Los numeros aleatorios son: ");
        generarNumerosAleatorios(num);

        System.out.print("Introduce el numero para calcular Fibonacci: ");
        int numFib = scanner.nextInt();

        System.out.println("El término " + numFib + " de la serie de Fibonacci es: " + fibonacci(numFib));
    }



    public static double superficie(double numero){
        return 4 * Math.PI * Math.pow(numero, 2);
    }
    public static double volumen(double numero){
        return (4.0 /3.0) * Math.PI * Math.pow(numero, 3);
    }

    public static void generarNumerosAleatorios(int num) {
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            double numeroAleatorio = random.nextDouble();
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }
    }

    public static int fibonacci(int numFib) {
        if (numFib > 1) {
            return fibonacci(numFib - 1) + fibonacci(numFib - 2);
        } else {
            return numFib;
        }
    }
}
