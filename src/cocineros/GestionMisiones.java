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
     * Agrega las misiones
     * @param mision
     * @return devuelve el id de la mision
     */
    public int agregarMision(Mision mision) {
        this.misiones.add(mision);

        return mision.getId();
    }

    /**
     * Lista todas las misiones creadas
     * @return la información de las misiones
     */
    public String listarMisiones() {
        StringBuilder sb = new StringBuilder("Misiones: {");

        for (Mision misionesActuales : this.misiones) {
            sb.append(misionesActuales);
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * Busca la mision solicitada por el id
     * @param id identificador de la mision
     * @return devuelve el id de la mision y si no la encuentra devuelve null
     */
    public int buscarMision(int id) {
        Mision misionEncontrada = null;
        boolean seguirBuscando = true;
        int posicion = -1;

        while (!misiones.isEmpty() && seguirBuscando) {
            if (misiones.get(posicion).getId() == id) {
                seguirBuscando = false;
            }
            posicion++;
        }
        return posicion;
    }
}
