package view;

import java.util.Scanner;
import controller.Controlador;
import controller.Operacion;
import model.Ciudades;
import model.CrudException;
import model.Ideologia;
import model.Partidos;

public class VistaConsola implements VistaGeneral{
    private Scanner scanner = new Scanner(System.in);
    private String nombre, cedula, promesas;
    private Ciudades ciudad;
    private Ideologia ideologia;
    private Partidos partido;

    @Override
    public String getNombre(Operacion operacion) {
        return nombre;
    }

    @Override
    public String getCedula(Operacion operacion) {
        return cedula;
    }

    @Override
    public Ciudades getCiudad(Operacion operacion) {
        return ciudad;
    }

    @Override
    public Ideologia getIdeologia(Operacion operacion) {
        return ideologia;
    }

    @Override
    public Partidos getPartido(Operacion operacion) {
        return partido;
    }

    @Override
    public String getPromesas(Operacion operacion) {
        return promesas;
    }

    public void insertarCandidato() throws CrudException{
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

        try {
            ciudad = Ciudades.valueOf(ciudadIn.replace(" ", "_"));
        } catch(IllegalArgumentException e) {
            throw new CrudException("\nLa ciudad es incorrecta. Intente de nuevo\n");
        }

        System.out.println("\nIngrese la idelogia politica del candidato (Izquierda - Derecha): ");
        String ideologiaIn = scanner.nextLine();

        try {
            ideologia = Ideologia.valueOf(ideologiaIn);
        } catch(IllegalArgumentException e) {
            throw new CrudException("\nLa ideologia es incorrecta. Intente de nuevo\n");
        }

        System.out.println("\nLista de partidos politicos\n");
        for(Partidos partido : Partidos.values()) {
            System.out.println("- " + partido.toString().replace("_", " "));
        }
        System.out.println("\nIngrese el partido politico del candidato: ");
        String partidoIn = scanner.nextLine();

        try {
            partido = Partidos.valueOf(partidoIn.replace(" ", "_"));
        } catch(IllegalArgumentException e) {
            throw new CrudException("\nEl partido es incorrecto. Intente de nuevo\n");
        }

        System.out.println("\nIngrese las promesas del candidato: ");
        promesas = scanner.nextLine();
    }

    @Override
    public void setResultado(String resultado) {
        System.out.println("");
        System.out.println(resultado + "\n");
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
                case 1: {
                    controlador.setOperacion(Operacion.Insertar);
                    try {
                        insertarCandidato();
                        break;
                    } catch(CrudException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                }
                case 7: opcion = 7; break;
                default: System.out.println("\nOpcion no valida\n");
            }

            if(opcion < 7) controlador.crudActionPerformed(null); 
        } while(opcion != 7);
    }
}
