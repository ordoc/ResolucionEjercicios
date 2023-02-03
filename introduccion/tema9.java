/* Crea una clase Persona con las siguientes variables: La edad, El nombre, El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador. */

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Carlos";
        cliente.edad = 44;
        cliente.telefono = 555555;
        cliente.credito = 100;
        System.out.println("El cliente " + cliente.nombre + ",con edad " + cliente.edad + " y telefono " + cliente.telefono + ",tiene credito # " + cliente.credito);

        trabajador.nombre = "Pepe";
        trabajador.edad = 49;
        trabajador.telefono = 777777;
        trabajador.salario = 1000;
        System.out.println("El trabajador " + trabajador.nombre + ",con edad " + trabajador.edad + " y telefono " + trabajador.telefono + ",tiene un salario de " + trabajador.salario);
    }
}

class Persona {
    String nombre;
    int edad, telefono;

}
class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
