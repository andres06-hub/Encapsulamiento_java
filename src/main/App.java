package main;
/**
 * Para poder acceder a la clase persona tenemos que entrar
 * primero: al paquete y
 * luego a la clase que queremos
 */
import dominio.Persona;

public class App {
    public static void main(String[] args) {
 
        // Se crea el objeto de la clase "Persona"
        // Hay que pasar le por parametro nos datos que le dijimos 
        // String nombre, double saldo, boolean eliminado
        Persona miPersona = new Persona("vale", 10000, false);

        /**
         * Cuando vamos acceder ya al objeto nos apareceran
         * los "metodos de acceso"
         * Ya que son a los unicos que podemos acceder
         */
        // ASI modificariamos el 'atributo:"nombre"' del objeto
        miPersona.setNombre("Natalia");
        
        // Para obtener el valor que tiene el objeto ya seria :
        // Ya que la obtenemos el metodoi de acceso "get"
        // getNombre() = "obtener el atributo nombre"
        System.out.println("\nnombre persona: "+ miPersona.getNombre());

        // Para obtener el sueldo 
        System.out.println("\nSueldo: "+miPersona.getSueldo());
        // Modificamos el sueldo del objeto 
        miPersona.setSueldo(50000);
        // imprimimos el sueldo nuevo
        System.out.println("Sueldo nuevo: "+miPersona.getSueldo()+"\n");

        // Obtener la informacion de si esta eliminado o no
        boolean estadoEliminado = miPersona.isEliminado();
        System.out.println("Estado eliminado: "+estadoEliminado);

        /**
         * 
         * Esto ya no se podra hacer
         * miPersona.nombre="juan"; --> Ya que no es 'visible'
         * System.out.println("nombre persona: "+miPersona.nombre);
         * ERROR -> The field Persona.nombre is not visible
         *
         */

        /**
         * Imprimimos el metodo toString() para saber el estado
         * de los atributos del objeto  
         */
        // Llamamos el metodo toString
        String toString = miPersona.toString();
        System.out.println(toString);

        // Asi tambien se puede llamar el metodo toString 
        // Ya que se llama automatico por el 'print' ó 'println'
        System.out.println(miPersona);

    }
}
