package cocineros;

import platosComidaDos.Mision;

import java.util.ArrayList;

/**
 * Clase encargada de gestionar la colección de misiones.
 * Proporciona métodos para crear, agregar, listar, buscar y eliminar misiones.
 */
public class GestionMisiones {

    /** * Lista dinámica que almacena todas las misiones del sistema.
     */
    private ArrayList<Mision> misiones;

    /**
     * Constructor por defecto de GestionMisiones.
     * Inicializa la lista de misiones como un ArrayList vacío.
     */
    public GestionMisiones() {
        this.misiones = new ArrayList<>();
    }

    /**
     * Crea una nueva misión, la añade a la lista y devuelve su identificador.
     * @param id identificador de la mision
     * @param nombre nombre de la mision
     * @param dificultad dificultad de la mision
     * @param nivelRecomendado nivel que se recomienda de la mision
     * @param recompensaExperiencia recompensa de experiencia al superar la mision
     * @param completada si esta o no esta completada la mision
     * @return devuelve el id de la mision recién creada
     */
    public int crearMision(int id, String nombre, String dificultad, int nivelRecomendado, int recompensaExperiencia, boolean completada) {
        int idMisionCreada;

        // Creamos la mision (Corregido: antes estaba hardcodeado a 1)
        Mision mision = new Mision(id, nombre, dificultad, nivelRecomendado, recompensaExperiencia, completada);

        // Agregamos la mision
        idMisionCreada = agregarMision(mision);

        // Devolvemos el id de la mision
        return idMisionCreada;
    }

    /**
     * Agrega una misión ya instanciada a la lista de misiones.
     * @param mision el objeto Mision que se desea añadir a la lista
     * @return devuelve el id de la mision agregada
     */
    public int agregarMision(Mision mision) {
        this.misiones.add(mision);
        return mision.getId();
    }

    /**
     * Lista todas las misiones creadas en formato de texto.
     * @return una cadena de texto (String) con la información de todas las misiones
     */
    public String listarMisiones() {
        StringBuilder sb = new StringBuilder("Misiones: {\n");

        for (Mision misionesActuales : this.misiones) {
            sb.append(misionesActuales.toString());
            sb.append("\n");
        }
        sb.append("}");

        return sb.toString();
    }

    /**
     * Busca la misión solicitada coincidiendo con el id proporcionado.
     *
     * @param id identificador de la mision a buscar
     * @return devuelve el objeto Mision si lo encuentra, o null si no existe ninguna con ese id
     */
    public Mision buscarMisionPorId(int id) {
        // Corregido: Uso de un bucle for-each para evitar el IndexOutOfBoundsException
        for (Mision mision : misiones) {
            if (mision.getId() == id) {
                return mision; // Si la encuentra, la devuelve inmediatamente
            }
        }
        return null; // Si termina el bucle y no la ha encontrado, devuelve null
    }

    /**
     * Elimina una misión de la lista buscando por su identificador numérico.
     * * @param id identificador de la misión que se desea eliminar
     * @return la misión eliminada si la operación tuvo éxito, o null si no se encontró
     */
    public Mision eliminarMision(int id) {
        Mision misionAEliminar = buscarMisionPorId(id);

        if (misionAEliminar != null) {
            this.misiones.remove(misionAEliminar);
        }
        return misionAEliminar;
    }

    /**
     * Elimina una misión recibiendo directamente el objeto Mision (Ejemplo de Polimorfismo).
     * <p>
     * POLIMORFISMO:
     * - dos o mas metodos
     * - tienen el mismo nombre
     * - que hacen lo mismo, pero de distinta forma dependiendo de...
     * - Reciben distintos tipos de parametros
     * </p>
     * * @param mision el objeto de tipo Mision que se desea eliminar
     * @return un mensaje en formato String indicando el resultado de la operación
     */
    public String eliminarMision(Mision mision){
        String respuesta = "No se ha podido eliminar la mision: " + mision;

        if (mision != null && this.misiones.contains(mision)){
            this.misiones.remove(mision);
            respuesta = "Eliminando la mision: " + mision.toString();
        }

        return respuesta;
    }

    /**
     * Cuenta las misiones que hay
     * @return devuelve la cantidad de misiones
     */
    public int contarMision(){
        return this.misiones.size();

    }


}