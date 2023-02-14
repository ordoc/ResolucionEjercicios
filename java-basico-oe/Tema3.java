/**
 * Crear un bucle que permita concatenar textos e imprima el resultado final por consola
 * concatenar nombres
 * los textos pueden venir de un array String
 * String[] nombres = { "", "", "", "", "", ""};
 */
public class ConcatenarTextos {

    public static void main(String[] args) {

        String[] nombres = {"Pepe", "Juan", "Luis", "Orlando", "Marce"};
        String nombresConcatenados = "";
        for (String nombre : nombres) {
            nombresConcatenados = nombresConcatenados + nombre + ", ";
        }
        System.out.println("Los nombres concatendados son: " + nombresConcatenados);
    }
}
