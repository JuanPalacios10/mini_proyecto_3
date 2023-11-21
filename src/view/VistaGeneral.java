package view;

import controller.Controlador;
import model.Ciudades;
import model.Ideologia;
import model.Partidos;

public interface VistaGeneral {
    public String getNombre();
    public String getCedula();
    public Ciudades getCiudad();
    public Ideologia getIdeologia();
    public Partidos getPartido();
    public String getPromesas();
    public void insertarCandidato();
    public void setResultado(String resultado);
    public void iniciar(Controlador controlador);
}
