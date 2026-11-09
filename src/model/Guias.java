package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la información profesional de un guía turístico.
 * Almacena los idiomas que domina, sus años de experiencia
 * y las áreas en las que se especializa.
 */
public class Guias extends Personas{

    private List<String> idiomas = new ArrayList<>();
    private int aniosExperiencia;
    private List<String> especialidades = new ArrayList<>();


    public Guias(){

    }
    /**
     * Constructor que inicializa todos los datos
     * asociados al guía.
     *
     * @param idiomas Idiomas que domina el guía.
     * @param aniosExperiencia Años de experiencia profesional.
     * @param especialidades Áreas de especialización.
     */


    public Guias(String nombre, String apellido, Direccion direccion, Rut rut, String email, String telefono, List<String> idiomas, int aniosExperiencia, List<String> especialidades) {
        super(nombre, apellido, direccion, rut, email, telefono);
        this.idiomas = idiomas;
        this.aniosExperiencia = aniosExperiencia;
        this.especialidades = especialidades;
    }

    /**
     * Obtiene la lista de idiomas del guía.
     *
     * @return lista de idiomas.
     */
    public List<String> getIdiomas() {
        return idiomas;
    }

    /**
     * Actualiza los idiomas que domina el guía.
     *
     * @param idiomas nueva lista de idiomas.
     */
    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }


    /**
     * Obtiene los años de experiencia del guía.
     *
     * @return años de experiencia.
     */
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }


    /**
     * Actualiza los años de experiencia.
     *
     * @param aniosExperiencia nueva cantidad de años.
     */
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    /**
     * Obtiene las especialidades del guía.
     *
     * @return lista de especialidades.
     */
    public List<String> getEspecialidades() {
        return especialidades;
    }

    /**
     * Actualiza las especialidades del guía.
     *
     * @param especialidades nueva lista de especialidades.
     */
    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }


    /**
     * Devuelve una representación en texto del objeto.
     * Muestra los idiomas, años de experiencia y especialidades.
     *
     * @return información del guía.
     */

    @Override
    public String toString() {
        return """
            ========== GUÍA ==========
            %s
            Idiomas          : %s
            Años experiencia : %d
            Especialidades   : %s
            ==========================
            """.formatted(
                super.toString(),
                String.join(", ", idiomas),
                aniosExperiencia,
                String.join(", ", especialidades)
        );
    }
}
