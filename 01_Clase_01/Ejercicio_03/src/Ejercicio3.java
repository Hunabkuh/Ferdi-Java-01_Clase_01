import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, ¿cuál es el nombre de tu padre?");
        String nombrePadre = teclado.nextLine();
        System.out.println("¿y qué edad tiene?");
        byte edadPadre = teclado.nextByte();
        teclado.nextLine();
        System.out.println("¿y cuál es el nombre de tu madre?");
        String nombreMadre = teclado.nextLine();
        System.out.println("¿y qué edad tiene?");
        byte edadMadre = teclado.nextByte();

        teclado.close();
        float mediaEdad = (edadMadre + edadPadre) / 2;

        System.out.println("Ok, entonces tu madre se llama " + nombreMadre + " y tiene " + edadMadre
                + " años, y tu padre se llama " + nombrePadre + " y tiene " + edadPadre
                + " años, y la media de sus edades es: " + mediaEdad);

    }
}
