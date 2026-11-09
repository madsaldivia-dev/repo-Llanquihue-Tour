package model;


/**
 * Clase que representa una persona dentro del sistema.
 * Contiene información personal y de contacto, además de
 * objetos compuestos como Direccion y Rut.
 */
public class Personas {

    private String nombre;
    private String apellido;
    private Direccion direccion;
    private String email;
    private Rut rut;
    private String telefono;

    public Personas(){

    }
/**Constructor que inicializa todos los atributos de la persona.
*/
    public Personas(String nombre, String apellido, Direccion direccion, Rut rut, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.rut = rut;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nuevo nombre a la persona.
     * Valida que el nombre no sea nulo ni esté vacío.
     *
     * @param nombre Nuevo nombre de la persona.
     * @throws IllegalArgumentException si el nombre es nulo o vacío.
     */
    public void setNombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Actualiza el apellido validando que no sea nulo ni vacío.
     *
     * @param apellido Nuevo apellido.
     * @throws IllegalArgumentException si el apellido es nulo o vacío.
     */
    public void setApellido(String apellido) {

        if (apellido == null || apellido.isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        this.apellido = apellido;
    }

    /**
     * Obtiene el direccion de la persona.
     *
     * @return direccion de la persona.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Asigna una nueva dirección a la persona.
     *
     * @param direccion Dirección válida.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el email de la persona.
     *
     * @return email de la persona.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Actualiza el correo electrónico verificando
     * que tenga un formato básico válido.
     *
     * @param email Nuevo correo electrónico.
     * @throws IllegalArgumentException si el correo es nulo o no contiene '@'.
     */
    public void setEmail(String email) {

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("El email no puede estar vacío");
        }

        this.email = email;
    }


    /**
     * Obtiene el rut de la persona.
     *
     * @return rut de la persona.
     */
    public Rut getRut() {
        return rut;
    }

    /**
     * Asigna un nuevo RUT a la persona.
     *
     * @param rut Objeto Rut válido.
     */
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /**
     * Obtiene el telefono de la persona.
     *
     * @return telefono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Actualiza el número telefónico de contacto.
     *
     * @param telefono Nuevo teléfono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    /**
     * Devuelve una representación en texto del objeto,
     * útil para depuración y visualización de datos.
     *
     * @return Cadena con los valores de los atributos.
     */
    @Override
    public String toString() {
        return """
            Nombre           : %s %s
            RUT              : %s
            Email            : %s
            Teléfono         : %s
            Dirección        : %s""".formatted(nombre, apellido, rut, email, telefono, direccion);
    }
}
