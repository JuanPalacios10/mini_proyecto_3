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
}
