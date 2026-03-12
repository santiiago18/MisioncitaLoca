import camareros.InterfazConsola;
import cocineros.GestionMisiones;
import platosComidaDos.Mision;

public class Main {
    public static void main(String[] args) {
        GestionMisiones gestor;
        InterfazConsola interfaz;

        gestor = new  GestionMisiones();
        interfaz = new InterfazConsola(gestor);

        interfaz.mostrarMenu();

    }
}