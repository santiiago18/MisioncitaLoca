package platosComidaDos;

public class Mision {

    private int id;
    private String nombre;
    private String dificultad;
    private int nivelRecomendado;
    private int recompensaExperiencia;
    private boolean completada;

    /**
     *  Constructor platosComidaDos.Mision
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
     * Id de la mision
     * @return id de la mision
     */
    public int getId() {
        return id;
    }

    /**
     * Nombre de la mision
     * @return nombre de la mision
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Dificultad de la mision
     * @return dificultad de la mision
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     * Nivel que se recomienda de la mision
     * @return novel recomendado de la mision
     */
    public int getNivelRecomendado() {
        return nivelRecomendado;
    }

    /**
     * Recompensa de la experiencia de la mision
     * @return recompensa de la experiencia de la mision
     */
    public int getRecompensaExperiencia() {
        return recompensaExperiencia;
    }

    /**
     * Si esta o no está completada la mision
     * @return devuelve si se completa o no la mision
     */
    public boolean isCompletada() {
        return completada;
    }


    /**
     * Texto de todos los atributos de la clase platosComidaDos.Mision
     * @return texto con todos los atributos de la clase platosComidaDos.Mision
     */
    public String toString(){
        String resultado;

        resultado = String.format(new String("platosComidaDos.Mision: id: %d, nombre: %s, dificultas: %d, nivel recomendad: %d,            recompensa experiencia: %d, completada: %b"),
            id, nombre, dificultad, nivelRecomendado, recompensaExperiencia, completada);

        return resultado;
    }




}
