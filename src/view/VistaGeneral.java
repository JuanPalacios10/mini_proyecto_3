package view;

import controller.Controlador;
import controller.Operacion;
import model.Ciudades;
import model.Ideologia;
import model.Partidos;

public interface VistaGeneral {
    public String getNombre(Operacion operacion);
    public String getCedula(Operacion operacion);
    public Ciudades getCiudad(Operacion operacion);
    public Ideologia getIdeologia(Operacion operacion);
    public Partidos getPartido(Operacion operacion);
    public String getPromesas(Operacion operacion);
    public void setResultado(String resultado);
    public void iniciar(Controlador controlador);
}
