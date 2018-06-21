package loom.hola_mundo;

/**
 * Clase Hola Mundo en Java.
 */
public class HolaMundo {

    /**
     * Metodo saludar
     *
     * @param El parametro persona indica el nombre de la persona a la que quiero saludar
     * @return Se devuelve un String con el saludo 
     */
    public String saludar(final String persona) {
            return "¡Hola, " + persona + "!";
    }

    /**
     * Metodo saludar sin parametros
     *
     * @return Se devuelve un String con el saludo "Hola!"
     */
    public String saludar() {
        return "¡Hola!";
    }
}

