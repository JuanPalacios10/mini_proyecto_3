package model;

import java.util.ArrayList;

public class RegistroVotos {
    ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
    String resultado;

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
        }
    }
}
