import controller.Controlador;
import model.RegistroVotos;
import view.VistaConsola;
import view.gui.VistaGui;

public class App {
    public static void main(String[] args) throws Exception {
        //VistaConsola vistaConsola = new VistaConsola();
        VistaGui vistaGui = new VistaGui();
        RegistroVotos registroVotos = new RegistroVotos();
        Controlador controlador = new Controlador(registroVotos, vistaGui);
        controlador.iniciarAplicacion();
    }
}
