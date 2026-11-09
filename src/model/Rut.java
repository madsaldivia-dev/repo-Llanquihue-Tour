package model;

import util.RutInvalidoException;

/**
 * Representa un RUT válido dentro del sistema.
 * La validación se realiza al crear o modificar el objeto,
 * asegurando que siempre tenga un formato correcto.
 */
public class Rut {

    // Almacena el número de RUT validado.
    private String numero;

    /**
     * Constructor privado que crea un objeto Rut
     * validando previamente el valor recibido.
     *
     * @param numero RUT a validar.
     * @throws RutInvalidoException si el formato del RUT es incorrecto.
     */
    public Rut (String numero)throws RutInvalidoException {

     // Valida y normaliza el RUT antes de almacenarlo.
        this.numero = validar(numero);

    }

    /**
     * Obtiene el número de RUT almacenado.
     *
     * @return RUT validado.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Actualiza el RUT realizando una nueva validación.
     *
     * @param numero Nuevo RUT.
     * @throws RutInvalidoException si el RUT es inválido.
     */
    public void setNumero(String numero) throws RutInvalidoException {
        this.numero = validar(numero);
    }


    /**
     * Valida el formato del RUT.
     * Elimina puntos, espacios innecesarios y convierte
     *
     * la letra verificadora a mayúscula.
     * Formato esperado: XXXXXXXX-Y
     *
     * @param texto RUT ingresado por el usuario.
     * @return RUT normalizado.
     * @throws RutInvalidoException si el formato no es válido.
     */
    private static String validar(String texto) throws RutInvalidoException {
        String rut = (texto == null) ? "" : texto.replace(".", "").trim().toUpperCase();

        if (!rut.matches("[0-9]{7,8}-[0-9K]")) {
            throw new RutInvalidoException("Formato de RUT inválido: '" + texto + "'. Se esperaba XXXXXXXX-Y.");
        }
        return rut;
    }

    /**
     * Devuelve una representación en texto del objeto Rut.
     *
     * @return información del RUT.
     */
    @Override
    public String toString() {
        return numero;
    }
}

