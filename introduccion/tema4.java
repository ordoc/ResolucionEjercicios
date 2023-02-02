public class Main {

    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

        int numeroIf = 9;

        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        int numeroWhile = 1;

    /*  Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute. */

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Ahora la variable numeroWhile es " + numeroWhile);
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez

        int numeroDoWhile = 1;

        do {
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile es " + numeroDoWhile);
        } while(numeroDoWhile < 1);

        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("La variable numeroFor es " + numeroFor);
        }

        //para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

        String estacion = "jueves";

        switch(estacion){
            case "verano":
                System.out.println("La estación actual es " + estacion);
                break;

            case "otoño":
                System.out.println("La estación actual es " + estacion);
                break;

            case "primavera":
                System.out.println("La estación actual es " + estacion);
                break;

            case "invierno":
                System.out.println("La estación actual es " + estacion);
                break;

            default:
                System.out.println(estacion + " no es una estación");
                
        }
    }
}
