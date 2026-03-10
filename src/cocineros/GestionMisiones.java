package cocineros;

import platosComidaDos.Mision;

import java.util.ArrayList;

public class GestionMisiones {
    private ArrayList<Mision> misiones;

    public GestionMisiones() {
        this.misiones = new ArrayList<>();
    }


    /**
     * Devuelve el id de la nueva mision creada
     * @param id identificador de la mision
     * @param nombre nombre de la mision
     * @param dificultad dificultad de la mision
     * @param nivelRecomendado nivel que se recomienda de la mision
     * @param recompensaExperiencia recompensa de experiencia al superar la mision
     * @param completada si esta o no esta completada la mision
     * @return devuelve el id de la mision creada
     */
    public int crearMision(int id, String nombre, String dificultad, int nivelRecomendado, int recompensaExperiencia, boolean completada) {
        int idMisionCreada;

        //Creamos la mision
        Mision mision = new Mision(1, nombre, dificultad, nivelRecomendado, recompensaExperiencia, completada);

        //Agregamos la mision
        idMisionCreada = agregarMision(mision);

        //Devolvemos la mision
        return idMisionCreada;
    }

    /**
     *
     * @param mision
     * @return
     */
    public int agregarMision(Mision mision) {
        this.misiones.add(mision);

        return mision.getId();
    }
}
