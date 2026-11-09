package model;

/**
 * Representa una dirección dentro del sistema.
 * Contiene la información básica de ubicación
 * de una persona, como calle, comuna, región y número.
 */
public class Direccion {

    private String calle;
    private String comuna;
    private String region;
    private  int numero;

/**
 * Constructor que inicializa todos los datos
 * de una dirección.
 */
    public Direccion(String comuna, String calle, String region, int numero) {
        this.comuna = comuna;
        this.calle = calle;
        this.region = region;
        this.numero = numero;
    }

    /**
     * Obtiene la comuna de la dirección.
     *
     * @return comuna.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Actualiza la comuna validando que no sea nula ni vacía.
     *
     * @param comuna Nueva comuna.
     * @throws IllegalArgumentException si la comuna está vacía.
     */
    public void setComuna(String comuna) {

        if (comuna == null || comuna.isEmpty()) {
            throw new IllegalArgumentException("La comuna no puede estar vacía");
        }
        this.comuna = comuna;
    }

    /**
     * Obtiene el nombre de la calle.
     *
     * @return calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Actualiza el nombre de la calle.
     *
     * @param calle Nueva calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene la región de la dirección.
     *
     * @return región.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Actualiza la región de la dirección.
     *
     * @param region Nueva región.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Obtiene el número de la dirección.
     *
     * @return número de la dirección.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Actualiza el número de la dirección.
     * Solo se permiten valores positivos.
     *
     * @param numero Nuevo número.
     * @throws IllegalArgumentException si el número es negativo.
     */
    public void setNumero(int numero) {
        if (numero <0) {
            throw new IllegalArgumentException("El número debe contener solo números positivos");
        }
        this.numero = numero;
    }

    /**
     * Devuelve una representación en texto
     * de la dirección completa.
     *
     * @return datos de la dirección.
     */
    @Override
    public String toString() {
        return "%s %s, %s, Región %s".formatted(calle, numero, comuna, region);
    }
}
