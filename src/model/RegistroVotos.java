package model;

import java.util.ArrayList;

public class RegistroVotos {
    private ArrayList<Candidato> candidatos;
    private CrudException crudException;
    private Candidato candidato;
    private String resultado;
    public int index = 0;

    public RegistroVotos() {
        this.candidatos = new ArrayList<Candidato>();
    }

    public CrudException getCrudException() {
        return crudException;
    }

    public void setCrudException(CrudException crudException) {
        this.crudException = crudException;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public boolean estaCandidato(String busqueda) {
        if (busqueda.equals(""))
            return false;

        for (Candidato candidato : candidatos) {
            if (candidato.getNombre().equals(busqueda)) {
                return true;
            }
        }

        return false;
    }

    public void insertarCandidato(Candidato candidato) {
        if (!candidato.getNombre().equals("") && !candidato.getCedula().equals("") && candidato.getIdeologia() != null
                && !candidato.getPromesas().equals("")) {
            if (estaCandidato(candidato.getNombre())) {
                resultado = "El candidato ya fue ingresado anteriormente";
            } else {
                candidatos.add(candidato);
                resultado = "El candidato fue ingresado exitosamente";
            }
        } else {
            resultado = "Debe llenar todos los campos correctamente";
            crudException = new CrudException(resultado);
        }
    }

    public void actualizarCandidato(Candidato candidato, String busqueda) {
        if (!candidato.getNombre().equals("") && !candidato.getCedula().equals("") && candidato.getIdeologia() != null
                && !candidato.getPromesas().equals("")) {
            buscarCandidato(busqueda);
            candidatos.set(candidatos.indexOf(this.candidato), candidato);
            resultado = "El candidato fue actualizado correctamente";
        } else {
            resultado = "Debe llenar todos los campos correctamente";
            crudException = new CrudException(resultado);
        }
    }

    public Candidato buscarCandidato(String busqueda) {
        this.candidato = null;

        for (Candidato candidato : candidatos) {
            if (candidato.getNombre().equals(busqueda)) {
                this.candidato = candidato;
                return this.candidato;
            }
        }

        if (this.candidato == null) {
            resultado = "El candidato no fue encontrado";
            crudException = new CrudException(resultado);
        }

        return this.candidato;
    }

    public void eliminarCandidato(String busqueda) {
        if (estaCandidato(busqueda)) {
            buscarCandidato(busqueda);
            candidatos.remove(candidato);
            resultado = "El candidato fue eliminado exitosamente";
        } else {
            resultado = "El candidato no fue encontrado";
            crudException = new CrudException(resultado);
        }
    }

    public void listarCandidatos() {
        if (candidatos.size() > 0) {
            for (Candidato candidato : candidatos) {
                resultado += "Nombre: " + candidato.getNombre() + "\n";
                resultado += "Cedula: " + candidato.getCedula() + "\n";
                resultado += "Ciudad: " + candidato.getCiudad().toString().replace("_", " ") + "\n";
                resultado += "Ideologia: " + candidato.getIdeologia() + "\n";
                resultado += "Partido: " + candidato.getPartido().toString().replace("_", " ") + "\n";
                resultado += "Promesas: " + candidato.getPromesas() + "\n";

                if (candidatos.indexOf(candidato) != candidatos.size() - 1)
                    resultado += "\n";
            }
        } else {
            resultado = "Aun no hay ningun candidato\n";
            crudException = new CrudException(resultado);
        }
    }

    public String getVotante() {
        try {
            return candidatos.get(index).getNombre();
        } catch (IndexOutOfBoundsException e) {
            resultado = "Debes ingresar almenos un candidato para votar";
            crudException = new CrudException(resultado);
            return "";
        }
    }

    public void addVotos(String votos) {
        try {
            if (candidatos.isEmpty()) {
                resultado = "Inscriba almenos un candidato para votar";
                crudException = new CrudException(resultado);
                return;
            }

            int voto = Integer.parseInt(votos);
            candidatos.get(index).setVotos(voto);
            index++;
            
            if (index < candidatos.size()) {
                resultado = candidatos.get(index).getNombre();
            } else {
                resultado = "Se han digitado correctamente todos los candidatos, continua con los resultados";
                crudException = new CrudException(resultado);
                return;
            }
        } catch (NumberFormatException e) {
            resultado = "Digita un valor numerico en la caja de texto";
            crudException = new CrudException(resultado);
            return;
        }
    }

    public Candidato encontrarGanador() {
        if (candidatos.isEmpty()) {
            resultado = "No hay candidatos, debes ingresarlos y realizar la votación";
            crudException = new CrudException(resultado);
            return null;
        }

        Candidato ganador = candidatos.get(0);

        for(Candidato candidato : candidatos) {
            if(candidato.getVotos() > ganador.getVotos()) {
                ganador = candidato;
            }
        }

        return ganador;
    }

    public String encontrarPartido() {
        if (candidatos.isEmpty()) {
            resultado = "No hay candidatos, debes ingresarlos y realizar la votación";
            crudException = new CrudException(resultado);
            return null;
        }

        ArrayList<Short> numPartidos = new ArrayList<Short>();
        ArrayList<Partidos> partidoCandidatos = new ArrayList<Partidos>();
        Partidos partidosRepetidos[] = new Partidos[candidatos.size()];
        short contadorPartidos = 0;

        for(Candidato candidato : candidatos) {
            partidosRepetidos[candidatos.indexOf(candidato)] = candidato.getPartido();
        }
        
        for(Partidos partido : Partidos.values()) {
            contadorPartidos = 0;

            for(Partidos partidoRepetido : partidosRepetidos) {
                if(partido.equals(partidoRepetido)) contadorPartidos++;
            }

            if(contadorPartidos > 0) {
                numPartidos.add(contadorPartidos);
                partidoCandidatos.add(partido);
            }
        }

        short maxPartido = numPartidos.get(0);
        int indicePartido = 0;

        for(short i = 0; i < numPartidos.size(); i++) {
            if(maxPartido < numPartidos.get(i)) {
                maxPartido = numPartidos.get(i);
                indicePartido = numPartidos.indexOf(numPartidos.get(i));
            }
        }

        return partidoCandidatos.get(indicePartido).toString().replace("_", " ");
    }

    public String encontrarTopCiudades() {
        if (candidatos.isEmpty()) {
            resultado = "No hay candidatos, debes ingresarlos y realizar la votación";
            crudException = new CrudException(resultado);
            return null;
        }

        ArrayList<Short> numCiudades = new ArrayList<Short>();
        ArrayList<Ciudades> ciudadCandidatos = new ArrayList<Ciudades>();
        Ciudades ciudadRepetidas[] = new Ciudades[candidatos.size()];
        short contadorCiudades = 0;

        for (Candidato candidato : candidatos) {
            ciudadRepetidas[candidatos.indexOf(candidato)] = candidato.getCiudad();
        }
        for (Ciudades ciudad : Ciudades.values()) {
            contadorCiudades = 0;

            for (Ciudades ciudadRepetida : ciudadRepetidas) {
                if (ciudad.equals(ciudadRepetida)) {
                    contadorCiudades++;
                }
            }

            if (contadorCiudades > 0) {
                numCiudades.add(contadorCiudades);
                ciudadCandidatos.add(ciudad);
            }
        }

        short menorNumCiudades[] = new short[3];
        String topCiudades[] = new String[3];
        int indiceCiudades;

        if (numCiudades.size() == 1) {
            topCiudades[0] = ciudadCandidatos.get(0).toString();
            topCiudades[1] = "";
            topCiudades[2] = "";
        } else if (numCiudades.size() == 2) {
            menorNumCiudades[0] = numCiudades.get(0);

            if (menorNumCiudades[0] > numCiudades.get(1)) {
                topCiudades[0] = ciudadCandidatos.get(1).toString();
                topCiudades[1] = ciudadCandidatos.get(0).toString();
            } else {
                topCiudades[0] = ciudadCandidatos.get(0).toString();
                topCiudades[1] = ciudadCandidatos.get(1).toString();
            }

            topCiudades[2] = "";
        } else {
            for (short i = 0; i < menorNumCiudades.length; i++) {
                indiceCiudades = 0;
                menorNumCiudades[i] = numCiudades.get(0);

                for (short j = 0; j < numCiudades.size(); j++) {
                    if (menorNumCiudades[i] > numCiudades.get(j)) {
                        menorNumCiudades[i] = numCiudades.get(j);
                        indiceCiudades = numCiudades.indexOf(numCiudades.get(j));
                    }
                }

                topCiudades[i] = ciudadCandidatos.get(indiceCiudades).toString();
                if (numCiudades.size() > 1 && ciudadCandidatos.size() > 1) {
                    numCiudades.remove(indiceCiudades);
                    ciudadCandidatos.remove(indiceCiudades);
                }
            }
        }

        return String.join("\n", topCiudades);
    }
}
