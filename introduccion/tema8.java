/* Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola. */

public class Main {
    public static void main(String[] args) {
        Persona estudiante1 = new Persona();
        estudiante1.setNombre("Orlando");
        estudiante1.setEdad(43);
        estudiante1.setTelefono(7777777);

        Persona estudiante2 = new Persona();
        estudiante2.setNombre("Carlos");
        estudiante2.setEdad(30);
        estudiante2.setTelefono(555555);

        System.out.println("El nombre del estudiante1 es " + estudiante1.getNombre());
        System.out.println("Su edad es " + estudiante1.getEdad());
        System.out.println("y su telefono es " + estudiante1.getTelefono());

        System.out.println("El nombre del estudiante2 es " + estudiante2.getNombre());
        System.out.println("Su edad es " + estudiante2.getEdad());
        System.out.println("y su telefono es " + estudiante2.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad, telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public int getTelefono(){
        return this.telefono;
    }
}


