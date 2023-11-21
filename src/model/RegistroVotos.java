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

    public void insertarCandidato(Candidato candidato) {
        candidatos.add(candidato);
        resultado = "\nEl candidato fue insertado exitosamente\n";
    }
}
