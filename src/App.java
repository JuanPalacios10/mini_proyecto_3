import controller.Controlador;
import model.RegistroVotos;
import view.VistaConsola;

public class App {
    public static void main(String[] args) throws Exception {
        VistaConsola vistaConsola = new VistaConsola();
        RegistroVotos registroVotos = new RegistroVotos();
        Controlador controlador = new Controlador(registroVotos, vistaConsola);
        controlador.iniciarAplicacion();
    }
}
