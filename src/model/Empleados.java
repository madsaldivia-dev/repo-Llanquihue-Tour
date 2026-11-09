package model;

/**
 * Representa a un empleado de la agencia de turismo.
 * Hereda los datos personales de la clase Personas
 * y agrega información relacionada con su cargo
 * y funciones dentro de la empresa.
 */
public class Empleados extends Personas{

    private String cargo;
    private double sueldo;
    private String area; //se puede abstraer a una nueva clase
    private int aniosServicio;

public Empleados(){}
/**
 * Constructor que inicializa los datos heredados
 * de Personas y los atributos propios del empleado.
 *
 */
    public Empleados(String nombre, String apellido,
                    Direccion direccion, Rut rut,
                    String email, String telefono,
                    String cargo, double sueldo,
                    String area, int aniosServicio) {

        super(nombre, apellido, direccion, rut, email, telefono);   // Inicializa los atributos heredados de la clase Personas.
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.area = area;
        this.aniosServicio = aniosServicio;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Actualiza el cargo del empleado.
     * El valor no puede ser nulo ni vacío.
     *
     * @param cargo nuevo cargo.
     * @throws IllegalArgumentException si el cargo está vacío.
     */
    public void setCargo(String cargo) {

        if (cargo == null || cargo.trim().isEmpty()) {
            throw new IllegalArgumentException("El cargo no puede estar vacío");
        }

        this.cargo = cargo;
    }

    /**
     * Obtiene el sueldo del empleado.
     *
     * @return sueldo actual.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Actualiza el sueldo del empleado.
     * El valor debe ser mayor que cero.
     *
     * @param sueldo nuevo sueldo.
     * @throws IllegalArgumentException si el sueldo es menor o igual a cero.
     */
    public void setSueldo(double sueldo) {

        if (sueldo <= 0) {
       throw new IllegalArgumentException("El sueldo debe ser mayor a 0");
        }
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el área de trabajo del empleado.
     *
     * @return área de trabajo.
     */
    public String getArea() {
        return area;
    }

    /**
     * Actualiza el área de trabajo.
     *
     * @param area nueva área.
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Obtiene los años de servicio del empleado.
     *
     * @return años de antigüedad.
     */
    public int getAniosServicio() {
        return aniosServicio;
    }

    /**
     * Actualiza los años de servicio del empleado.
     *
     * @param aniosServicio años de servicio.
     */
    public void setAniosServicio(int aniosServicio) {

        this.aniosServicio = aniosServicio;
    }

    /**
     * Devuelve una representación en texto del empleado.
     * Permite visualizar fácilmente los datos principales
     * del objeto durante pruebas o depuración.
     *
     * @return información del empleado.
     */
    @Override
    public String toString() {
        return """
            ======== EMPLEADO ========
            %s
            Cargo            : %s
            Área             : %s
            Sueldo           : $%.0f
            Años de servicio : %d
            ==========================
            """.formatted(
                super.toString(),
                cargo,
                area,
                sueldo,
                aniosServicio
        );
    }
}
