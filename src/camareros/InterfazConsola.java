package camareros;

import cocineros.GestionMisiones;
import java.util.Scanner;

/**
 * Clase que gestiona la interfaz de usuario por consola para el sistema de misiones.
 * Permite al usuario interactuar con el gestor de misiones mediante menús de texto.
 */
public class InterfazConsola {
    private GestionMisiones gestor;


    /**
     * Constructor de la clase InterfazConsola.
     * * @param gestor Instancia de GestionMisiones que se utilizará para operar con los datos.
     */
    public InterfazConsola(GestionMisiones gestor) {
        this.gestor = gestor;
    }

    /**
     * Inicia el bucle principal de la consola, mostrando el menú y
     * procesando la opción seleccionada por el usuario.
     */
    public void iniciar(){
        int opcion;

        System.out.println("Iniciando consola...");

        mostrarMenu();

        opcion = leerOpcion();

        lanzarAccion(opcion);
    }

    /**
     * Ejecuta la acción correspondiente a la opción seleccionada en el menú.
     * * @param opcion Número entero que representa la opción elegida por el usuario.
     */
    private void lanzarAccion(int opcion) {
        switch (opcion) {
            case 0:
            case 9:
                System.out.println("Hasta la proxima");
                break;
            case 1:
                mostrarTexto(gestor.listarMisiones());
                break; // Añadido break para evitar que salte al caso 2
            case 2:
                this.accionCrearMision();
                break; // Añadido break por seguridad
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    /**
     * Solicita al usuario los datos necesarios por consola para crear
     * una nueva misión y debería enviarlos al gestor (funcionalidad pendiente).
     */
    private void accionCrearMision() {
        String nombre;
        String dificultad;
        int nivelRecomendado;
        int recompensaExperiencia;
        boolean completada;

        System.out.println("Dime los datos de la nueva mision: ");

        // Uso de los métodos auxiliares para limpiar el código
        nombre = pedirTexto("\tNombre: ");
        dificultad = pedirTexto("\tDificultad: ");
        nivelRecomendado = pedirEntero("\tNivel recomendado: ");
        recompensaExperiencia = pedirEntero("\tRecompensa de experiencia: ");
        completada = false;

        // TODO: Llamar a gestor.crearMision(nombre, dificultad, nivelRecomendado, recompensaExperiencia, completada);
    }

    /**
     * Muestra un mensaje por pantalla y lee un número entero introducido por el usuario.
     * * @param mensaje Texto que se mostrará al usuario antes de leer el dato.
     * @return El número entero introducido por el usuario.
     */
    private int pedirEntero(String mensaje){ // Cambiado de int mensaje a String mensaje
        int respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);
        respuesta = sc.nextInt();

        return respuesta;
    }

    /**
     * Muestra un mensaje por pantalla y lee una cadena de texto introducida por el usuario.
     * * @param mensaje Texto que se mostrará al usuario antes de leer el dato.
     * @return La cadena de texto introducida por el usuario.
     */
    private String pedirTexto(String mensaje){
        String respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);
        respuesta = sc.nextLine();

        return respuesta;
    }

    /**
     * Imprime un texto por la salida estándar de la consola.
     * * @param texto Cadena de caracteres que se desea mostrar.
     */
    private void mostrarTexto(String texto) {
        System.out.println(texto);
    }

    /**
     * Lee la opción numérica elegida por el usuario para interactuar con el menú principal.
     * * @return El número entero correspondiente a la opción del menú.
     */
    private int leerOpcion() {
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.print("Opción: ");
        opcion = sc.nextInt();

        return opcion;
    }



    /**
     * Muestra las opciones disponibles del menú principal del gestor de misiones.
     */
    public void mostrarMenu(){
        System.out.println("\n--- MISIONES ---");
        System.out.println("1. Listar Misiones");
        System.out.println("2. Crear Mision");
        System.out.println("3. Buscar Mision");
        System.out.println("9. Eliminar mision");
        System.out.println("0. Salir");
        System.out.println("¿Que desea hacer?");
    }
}