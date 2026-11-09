package model;


/**
 * Representa a un cliente del sistema.
 * Hereda los datos personales de la clase Personas
 * y agrega información relacionada con su categoría
 * y posible reserva realizada a futuro.
 */
public class Clientes extends Personas {

    private String tipoCliente; //clasificación de tipo de cliente puede ser una abstracción
    private String reserva; // clasificación de tipo de reserva puede ser una abstracción

    public Clientes(){

    }
/**
 * Constructor que inicializa los datos heredados
 * de Personas y los atributos propios del cliente.
 */
    public Clientes(String nombre, String apellido, Direccion direccion, Rut rut, String email, String telefono, String tipoCliente, String reserva) {
        super(nombre, apellido, direccion, rut, email, telefono);
        this.tipoCliente = tipoCliente;
        this.reserva = reserva;
    }

    /**
     * Obtiene la categoría del cliente.
     *
     * @return tipo de cliente.
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Actualiza la categoría del cliente.
     *
     * @param tipoCliente nuevo tipo de cliente.
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * Obtiene la reserva asociada al cliente.
     *
     * @return información de la reserva.
     */
    public String getReserva() {
        return reserva;
    }

    /**
     * Actualiza la reserva del cliente.
     *
     * @param reserva nueva reserva.
     */
    public void setReserva(String reserva) {
        this.reserva = reserva;
    }


    /**
     * Devuelve una representación en texto del objeto.
     * Útil para mostrar información del cliente y realizar depuración.
     *
     * @return datos principales del cliente.
     */


    @Override
    public String toString() {
        return """
            ======== CLIENTE =========
            %s
            Tipo             : %s
            Reserva          : %s
            ==========================
            """.formatted(
                super.toString(),
                tipoCliente,
                reserva
        );
    }

}
