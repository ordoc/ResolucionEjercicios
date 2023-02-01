public class Main {
    public static void main(String[] args) {
        suma(50, 20, 30);

        // Crear un objeto miCoche en el main y añadirle una puerta.

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();

        //Mostrar el número de puertas que tiene el objeto.
        System.out.println("El numero de puertas es:" + miCoche.numeroDePuertas);
    }

    /* Crear una función con tres parámetros que sean números que se suman entre sí.
       Llamar a la función en el main y darle valores.*/
    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println("El resultado de la suma es " + resultado);
    }
}

/*Crear una clase coche.
  Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
  Una función que incremente el número de puertas que tiene el coche. */
class Coche {
    public int numeroDePuertas = 5;

    public void sumarPuertas() {
        this.numeroDePuertas++;
    }
}





