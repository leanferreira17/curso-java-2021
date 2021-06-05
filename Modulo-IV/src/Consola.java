import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        System.out.print("Ingrese valor:");

        Scanner scanner = new Scanner(System.in);
        String valorIngresado = scanner.nextLine();

        System.out.println("El valor ingresado es: " + valorIngresado);
    }
}
