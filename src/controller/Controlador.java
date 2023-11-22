package controller;

import model.RegistroVotos;
import model.Candidato;
import view.VistaGeneral;
import view.gui.VistaGui;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

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

    public void menuActionPerformed(ActionEvent evt) {
        if(evt != null) {
            VistaGui vistaGui = (VistaGui)vistaGeneral;

            if(evt.getSource() == vistaGui.menuInsertar) vistaGui.crearPanelMenuInsertar(this);
            else if(evt.getSource() == vistaGui.menuActualizar) vistaGui.crearPanelMenuActualizar(this);
            else if(evt.getSource() == vistaGui.menuBuscar) vistaGui.crearPanelMenuBuscar(this);
            else if(evt.getSource() == vistaGui.menuEliminar) vistaGui.crearPanelMenuEliminar(this);
            else if(evt.getSource() == vistaGui.menuListar) vistaGui.crearPanelMenuListar(this);
        }
    }

    public void crudActionPerformed(ActionEvent evt) {
        if(evt != null) {
            JButton botonSeleccionado = (JButton)evt.getSource();

            if(botonSeleccionado.getText().equals("Insertar")) setOperacion(Operacion.Insertar);
            else if(botonSeleccionado.getText().equals("Actualizar")) setOperacion(Operacion.Actualizar);
            else if(botonSeleccionado.getText().equals("Buscar")) setOperacion(Operacion.Buscar);
            else if(botonSeleccionado.getText().equals("Eliminar")) setOperacion(Operacion.Eliminar);
            else if(botonSeleccionado.getText().equals("Listar")) setOperacion(Operacion.Listar);
        }

        registroVotos.setResultado("");

        switch(operacion) {
            case Insertar: {
                registroVotos.insertarCandidato(new Candidato(vistaGeneral.getNombre(getOperacion()), vistaGeneral.getCedula(getOperacion()), vistaGeneral.getCiudad(getOperacion()), vistaGeneral.getIdeologia(getOperacion()), vistaGeneral.getPartido(getOperacion()), vistaGeneral.getPromesas(getOperacion())));
                break;
            }
            case Actualizar: {
                registroVotos.actualizarCandidato(new Candidato(vistaGeneral.getNombre(getOperacion()), vistaGeneral.getCedula(getOperacion()), vistaGeneral.getCiudad(getOperacion()), vistaGeneral.getIdeologia(getOperacion()), vistaGeneral.getPartido(getOperacion()), vistaGeneral.getPromesas(getOperacion())), vistaGeneral.getNombre(Operacion.Buscar));
                break;
            }
            case Buscar: {
                vistaGeneral.buscarCandidato(registroVotos.buscarCandidato(vistaGeneral.getNombre(getOperacion())), operacion);
                break;
            }
            case Eliminar: {
                registroVotos.eliminarCandidato(vistaGeneral.getNombre(operacion));
                break;
            }
            case Listar: {
                registroVotos.listarCandidatos();
                break;
            }
        }

        vistaGeneral.setResultado(registroVotos.getResultado(), getOperacion());
    }

    public void iniciarAplicacion() {
        vistaGeneral.iniciar(this);
    }
}
