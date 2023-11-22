package view;

import java.util.Scanner;
import controller.Controlador;
import controller.Operacion;
import model.Candidato;
import model.Ciudades;
import model.CrudException;
import model.Ideologia;
import model.Partidos;

public class VistaConsola implements VistaGeneral{
    private Scanner scanner = new Scanner(System.in);
    private String nombre, cedula, promesas, busqueda;
    private Ciudades ciudad;
    private Ideologia ideologia;
    private Partidos partido;
    private int opcion;

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

    private void actualizarCandidato(Candidato candidato) throws CrudException {
        nombre = candidato.getNombre();
        cedula = candidato.getCedula();
        ciudad = candidato.getCiudad();
        ideologia = candidato.getIdeologia();
        partido = candidato.getPartido();
        promesas = candidato.getPromesas();

        System.out.println("1. Cambiar el nombre del candidato");
        System.out.println("2. Cambiar la cedula del candidato");
        System.out.println("3. Cambiar la ciudad del candidato");
        System.out.println("4. Cambiar la ideologia del candidato");
        System.out.println("5. Cambiar el partido del candidato");
        System.out.println("6. Cambiar las promesas del candidato");
        System.out.println("7. Cancelar");
        System.out.println("Seleccione una opcion: ");
        int opcionActualizar = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch(opcionActualizar) {
            case 1: {
                System.out.println("\nIngrese el nombre del candidato: ");
                nombre = scanner.nextLine();
                break;
            }
            case 2: {
                System.out.println("\nIngrese el número de cédula del candidato: ");
                cedula = scanner.nextLine();
                break;
            }
            case 3: {
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

                break;
            }
            case 4: {
                System.out.println("\nIngrese la idelogia politica del candidato (Izquierda - Derecha): ");
                String ideologiaIn = scanner.nextLine();

                try {
                    ideologia = Ideologia.valueOf(ideologiaIn);
                } catch(IllegalArgumentException e) {
                    throw new CrudException("\nLa ideologia es incorrecta. Intente de nuevo\n");
                }

                break;
            }
            case 5: {
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

                break;
            }
            case 6: {
                System.out.println("\nIngrese las promesas del candidato: ");
                promesas = scanner.nextLine();
                break;
            }
            case 7: {
                opcion = 8; 
                System.out.println("");
                return;
            }
            default: {
                opcion = 8; 
                System.out.println("");
                return;
            }
        }
    }

    @Override
    public String getNombre(Operacion operacion) {
        if(operacion.equals(Operacion.Buscar)) return busqueda;
        else if(operacion.equals(Operacion.Actualizar)) return nombre;
        else return nombre;
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

    @Override
    public void buscarCandidato(Candidato candidato, Operacion operacion) {
        if(candidato != null) {
            if(operacion.equals(Operacion.Buscar) && opcion == 3) {
                System.out.println("");
                System.out.println("Nombre: " + candidato.getNombre());
                System.out.println("Cedula: " + candidato.getCedula());
                System.out.println("Ciudad: " + candidato.getCiudad().toString().replace("_", " "));
                System.out.println("Ideologia: " + candidato.getIdeologia());
                System.out.println("Partido: " + candidato.getPartido().toString().replace("_", " "));
                System.out.println("Promesas: " + candidato.getPromesas() + "\n");
            } else if(operacion.equals(Operacion.Buscar) && opcion == 2) {
                System.out.println("");
                System.out.println("Nombre: " + candidato.getNombre());
                System.out.println("Cedula: " + candidato.getCedula());
                System.out.println("Ciudad: " + candidato.getCiudad().toString().replace("_", " "));
                System.out.println("Ideologia: " + candidato.getIdeologia());
                System.out.println("Partido: " + candidato.getPartido().toString().replace("_", " "));
                System.out.println("Promesas: " + candidato.getPromesas() + "\n");

                try {
                    actualizarCandidato(candidato);
                } catch(CrudException e) {
                    System.out.println(e.getMessage());
                    opcion = 8;
                    return;
                }
            }
        } else if(opcion == 2) opcion = 8;
    }

    @Override
    public void setResultado(String resultado, Operacion operacion, CrudException crudException) {
        switch(operacion) {
            case Insertar: {
                System.out.println("");
                System.out.println(resultado + "\n");
                break;
            }
            case Actualizar: {
                System.out.println("");
                System.out.println(resultado + "\n");
                break;
            }
            case Buscar: {
                if(crudException != null) {
                    System.out.println("");
                    System.out.println(resultado + "\n");
                }

                break;
            }
            case Eliminar: {
                System.out.println("");
                System.out.println(resultado + "\n");
                break;
            }
            case Listar: {
                if(crudException == null) System.out.println("\nListado de Candidatos");

                System.out.println("\n" + resultado);
                break;
            }
        }
    }

    @Override
    public void iniciar(Controlador controlador) {
        do {
            System.out.println("MENU");
            System.out.println("1. Insertar candidato");
            System.out.println("2. Actualizar candidato");
            System.out.println("3. Buscar candidato por nombre");
            System.out.println("4. Eliminar candidato");
            System.out.println("5. Listar todos los candidatos");
            System.out.println("6. Continuar con el conteo de votos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch(opcion) {
                case 1: {
                    controlador.setOperacion(Operacion.Insertar);
                    try {
                        insertarCandidato();
                    } catch(CrudException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }

                    break;
                }
                case 2: {
                    controlador.setOperacion(Operacion.Buscar);
                    System.out.println("\nIngrese el nombre del candidato a actualizar: ");
                    busqueda = scanner.nextLine();
                    controlador.crudActionPerformed(null);
                    controlador.setOperacion(Operacion.Actualizar);
                    break;
                }
                case 3: {
                    controlador.setOperacion(Operacion.Buscar);
                    System.out.println("\nIngrese el nombre del candidato a buscar: ");
                    busqueda = scanner.nextLine();
                    break;
                }
                case 4: {
                    controlador.setOperacion(Operacion.Eliminar);
                    System.out.println("\nIngrese el nombre del candidato a eliminar: ");
                    nombre = scanner.nextLine();
                    break;
                }
                case 5: controlador.setOperacion(Operacion.Listar); break;
                case 7: opcion = 7; break;
                default: System.out.println("\nOpcion no valida\n");
            }

            if(opcion < 7) controlador.crudActionPerformed(null); 
        } while(opcion != 7);
    }
}
