package model;


/**
 * Representa a un proveedor del sistema.
 * Hereda los datos personales de la clase Personas
 * y agrega información relacionada con la empresa
 * y el servicio que ofrece.
 */
public class Proveedores extends Personas {

    private String empresa;
    private String tipoDeServicio;

/**
 * Constructor que inicializa los datos heredados
 * de Personas y los atributos propios del proveedor.
 */
    public Proveedores(String nombre, String apellido, Direccion direccion, Rut rut, String email, String telefono, String empresa, String tipoDeServicio) {
        super(nombre, apellido, direccion, rut, email, telefono);
        this.empresa = empresa;
        this.tipoDeServicio = tipoDeServicio;
    }


    /**
     * Obtiene el nombre de la empresa.
     *
     * @return empresa del proveedor.
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Actualiza el nombre de la empresa.
     *
     * @param empresa nueva empresa.
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Obtiene el tipo de servicio ofrecido.
     *
     * @return tipo de servicio.
     */
    public String getTipoDeServicio() {
        return tipoDeServicio;
    }

    /**
     * Actualiza el tipo de servicio ofrecido.
     *
     * @param tipoDeServicio nuevo tipo de servicio.
     */
    public void setTipoDeServicio(String tipoDeServicio) {
        this.tipoDeServicio = tipoDeServicio;
    }

    /**
     * Devuelve una representación en texto del proveedor.
     *
     * @return datos principales del proveedor.
     */
    @Override
    public String toString() {
        return "Proveedores{" +
                "empresa='" + empresa + '\'' +
                ", tipoDeServicio='" + tipoDeServicio + '\'' +
                '}';
    }
}
