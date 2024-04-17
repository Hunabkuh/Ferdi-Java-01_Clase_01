import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, ¿cuál es tu nombre?");
        String nombre = teclado.nextLine();
        System.out.println("¿y qué edad tienes?");
        byte edad = teclado.nextByte();

        if (edad >= 6 && edad <= 12) {
            System.out.println(nombre + ", veo que estás en primaria.");
        } else if (edad > 12 && edad <= 16) {
            System.out.println(nombre + ", veo que estás en secundaria.");
        } else if (edad > 17 && edad <= 120) {
            System.out.println(nombre + ", veo que estás en la universidad.");
        } else {
            System.out.println(nombre + ", eres muy jóven o muy anciano para estudiar.");
        }

        teclado.close();
    }
}
