import java.util.Scanner;
import controller.Controlador;
import model.RegistroVotos;
import view.VistaConsola;
import view.gui.VistaGui;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        RegistroVotos registroVotos = new RegistroVotos();
        Controlador controlador = null;
        
        System.out.println("1. Consola");
        System.out.println("2. GUI");
        System.out.println("Seleccione una opcion: ");
        int opcion = scanner.nextInt();

        if(opcion == 1) {
            VistaConsola vistaConsola = new VistaConsola();
            controlador = new Controlador(registroVotos, vistaConsola);
            System.out.println();
        } else if(opcion == 2) {
            VistaGui vistaGui = new VistaGui();
            controlador = new Controlador(registroVotos, vistaGui);
        } else {
            System.out.println("\nOpcion no valida");
        }

        if(controlador != null) controlador.iniciarAplicacion();
    }
}
