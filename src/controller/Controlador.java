package controller;

import model.RegistroVotos;
import model.Candidato;
import view.VistaGeneral;
import java.awt.event.ActionEvent;

public class Controlador {
    RegistroVotos registroVotos;
    VistaGeneral vistaGeneral;
    Operacion operacion;
    
    public Controlador(RegistroVotos registroVotos, VistaGeneral vistaGeneral) {
        this.registroVotos = registroVotos;
        this.vistaGeneral = vistaGeneral;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public void crudActionPerformed(ActionEvent evt) {
        switch(operacion) {
            case Insertar: {
                vistaGeneral.insertarCandidato();
                
                Candidato candidato = new Candidato(vistaGeneral.getNombre(), vistaGeneral.getCedula(), vistaGeneral.getCiudad(), vistaGeneral.getIdeologia(), vistaGeneral.getPartido(), vistaGeneral.getPromesas());
                registroVotos.insertarCandidato(candidato);
                break;
            }
        }

        vistaGeneral.setResultado(registroVotos.getResultado());
    }

    public void iniciarAplicacion() {
        vistaGeneral.iniciar(this);
    }
}
