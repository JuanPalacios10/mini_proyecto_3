package view;

import java.util.Scanner;
import controller.Controlador;
import controller.Operacion;
import model.Ciudades;
import model.Ideologia;
import model.Partidos;

public class VistaConsola implements VistaGeneral{
    private Scanner scanner = new Scanner(System.in);
    private String nombre, cedula, promesas;
    private Ciudades ciudad;
    private Ideologia ideologia;
    private Partidos partido;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public Ciudades getCiudad() {
        return ciudad;
    }

    @Override
    public Ideologia getIdeologia() {
        return ideologia;
    }

    @Override
    public Partidos getPartido() {
        return partido;
    }

    @Override
    public String getPromesas() {
        return promesas;
    }

    @Override
    public void insertarCandidato() {
        System.out.println("\nIngrese el nombre del candidato: ");
        nombre = scanner.nextLine();

        System.out.println("\nIngrese el número de cédula del candidato: ");
        cedula = scanner.nextLine();

        System.out.println("\nLista de ciudades\n");
        for(Ciudades ciudad : Ciudades.values()) {
            System.out.println("- " + ciudad.toString().replace("_", " "));
        }

        System.out.println("\nIngrese la ciudad del candidato: ");
        String ciudadIn = scanner.nextLine();
        ciudad = Ciudades.valueOf(ciudadIn.replace(" ", "_"));

        System.out.println("\nIngrese la idelogia politica del candidato (Izquierda - Derecha): ");
        String ideologiaIn = scanner.nextLine();
        ideologia = Ideologia.valueOf(ideologiaIn);

        System.out.println("\nLista de partidos politicos\n");
        for(Partidos partido : Partidos.values()) {
            System.out.println("- " + partido.toString().replace("_", " "));
        }
        System.out.println("\nIngrese el partido politico del candidato: ");
        String partidoIn = scanner.nextLine();
        partido = Partidos.valueOf(partidoIn.replace(" ", "_"));

        System.out.println("\nIngrese las promesas del candidato: ");
        promesas = scanner.nextLine();
    }

    @Override
    public void setResultado(String resultado) {
        System.out.println(resultado);
    }

    @Override
    public void iniciar(Controlador controlador) {
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Insertar candidato");
            System.out.println("2. Actualizar candidato");
            System.out.println("3. Eliminar candidato");
            System.out.println("4. Buscar candidato por nombre");
            System.out.println("5. Listar todos los candidatos");
            System.out.println("6. Continuar con el conteo de votos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiamos el buffer

            switch(opcion) {
                case 1: controlador.setOperacion(Operacion.Insertar); break;
                case 7: opcion = 7; break;
                default: System.out.println("\nOpcion no valida");
            }

            controlador.crudActionPerformed(null);
        } while(opcion != 7);
    }
}
