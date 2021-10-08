package dominio;

public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    /**
     * Creamos un constructor que siempre se llamara igual que el nombre de nuestra
     * clase
     * 
     * --> this <-- El operador this es para acceder a los atributos de la clase
     */
    public Persona(String nombre, double sueldo, boolean eliminado) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    /**
     * Definimos los metodos de acceso para los atributos de la clase 
     * METODOS -> get y set
     */

    // Metodo : get = "RECORDAR" Que es para 'obtener recuperar la informacion'
    public String getNombre() {
        // Solo retornara el atributo que estamos analizando, utulizando
        // En este caso 'nombre'
        return this.nombre;
    }

    // Metodo : set = "RECORDAR" Que es para 'modificar el atributo'
    // Recibimos por parametro el dato a modificar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Se hace lo mismo pero para cada atributo
    // ATRIBUTO : sueldo
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // ATRIBUTO : eliminado
    /**
     * Cuando tenemos un atributo "boolean" NO utilizaremos el "get"
     * 
     * Se utilizara "is"
     */
    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

}
