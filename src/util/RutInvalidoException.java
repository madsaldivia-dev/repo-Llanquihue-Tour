package util;

/**
 * Excepción personalizada utilizada para indicar
 * que un RUT ingresado no cumple con las validaciones
 * definidas por el sistema.
 */
public class RutInvalidoException extends Exception{


    /**
     * Crea una nueva excepción con un mensaje
     * descriptivo del error ocurrido.
     *
     * @param mensaje Detalle del motivo por el cual el RUT es inválido.
     */
    public RutInvalidoException(String mensaje){
        super(mensaje);
    }

}
