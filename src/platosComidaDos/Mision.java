package platosComidaDos;

public class Mision {

    private int id;
    private String nombre;
    private String dificultad;
    private int nivelRecomendado;
    private int recompensaExperiencia;
    private boolean completada;

    /**
     * Constructor de Mision
     * @param id identificador de la mision
     * @param nombre nombre de la mision
     * @param dificultad dificultad de la mision
     * @param nivelRecomendado nivel que se recomienda de la mision
     * @param recompensaExperiencia recompensa de experiencia al superar la mision
     * @param completada si esta o no esta completada la mision
     */
    public Mision (int id, String nombre, String dificultad, int nivelRecomendado,  int recompensaExperiencia,  boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.nivelRecomendado = nivelRecomendado;
        this.recompensaExperiencia = recompensaExperiencia;
        this.completada = completada;
    }

    /**
     * Obtiene el ID de la misión.
     * @return id de la mision
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre de la misión.
     * @return nombre de la mision
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la dificultad de la misión.
     * @return dificultad de la mision
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     * Obtiene el nivel que se recomienda para la misión.
     * @return nivel recomendado de la mision
     */
    public int getNivelRecomendado() {
        return nivelRecomendado;
    }

    /**
     * Obtiene la recompensa de experiencia de la misión.
     * @return recompensa de experiencia de la mision
     */
    public int getRecompensaExperiencia() {
        return recompensaExperiencia;
    }

    /**
     * Comprueba si la misión está completada.
     * @return true si la misión está completada, false en caso contrario
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     * Devuelve una representación en formato texto de todos los atributos de la clase Mision.
     * @return texto con todos los atributos de la clase Mision
     */
    @Override
    public String toString() {
        return String.format(
                "Mision: id: %d, nombre: %s, dificultad: %s, nivel recomendado: %d, recompensa experiencia: %d, completada: %b",
                id, nombre, dificultad, nivelRecomendado, recompensaExperiencia, completada
        );
    }




}
