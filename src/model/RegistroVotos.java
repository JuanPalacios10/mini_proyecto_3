package model;

import java.util.ArrayList;

public class RegistroVotos {
    private ArrayList<Candidato> candidatos;
    private CrudException crudException;
    private Candidato candidato;
    private String resultado;

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
        if(busqueda.equals("")) return false;

        for(Candidato candidato : candidatos) {
            if(candidato.getNombre().equals(busqueda)) {
                return true;
            }
        }

        return false;
    }

    public void insertarCandidato(Candidato candidato) {
        if(!candidato.getNombre().equals("") && !candidato.getCedula().equals("") && candidato.getIdeologia() != null && !candidato.getPromesas().equals("")) {
            if(estaCandidato(candidato.getNombre())) {
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
        if(!candidato.getNombre().equals("") && !candidato.getCedula().equals("") && candidato.getIdeologia() != null && !candidato.getPromesas().equals("")) {
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

        for(Candidato candidato : candidatos) {
            if(candidato.getNombre().equals(busqueda)) {
                this.candidato = candidato;
                return this.candidato;
            }
        }

        if(this.candidato == null) {
            resultado = "El candidato no fue encontrado";
            crudException = new CrudException(resultado);
        }

        return this.candidato;
    }

    public void eliminarCandidato(String busqueda) {
        if(estaCandidato(busqueda)) {
            buscarCandidato(busqueda);
            candidatos.remove(candidato);
            resultado = "El candidato fue eliminado exitosamente";
        } else {
            resultado = "El candidato no fue encontrado";
            crudException = new CrudException(resultado);
        }
    }

    public void listarCandidatos() {
        if(candidatos.size() > 0) {
            for(Candidato candidato : candidatos) {
                resultado += "Nombre: " + candidato.getNombre() + "\n";
                resultado += "Cedula: " + candidato.getCedula() + "\n";
                resultado += "Ciudad: " + candidato.getCiudad().toString().replace("_", " ") + "\n";
                resultado += "Ideologia: " + candidato.getIdeologia() + "\n";
                resultado += "Partido: " + candidato.getPartido().toString().replace("_", " ") + "\n";
                resultado += "Promesas: " + candidato.getPromesas() + "\n";

                if(candidatos.indexOf(candidato) != candidatos.size() - 1) resultado += "\n";
            }
        } else {
            resultado = "Aun no hay ningun candidato\n";
            crudException = new CrudException(resultado);
        }
    }
}
