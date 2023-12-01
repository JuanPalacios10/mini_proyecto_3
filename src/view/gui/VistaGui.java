package view.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.plaf.metal.MetalLookAndFeel;
import controller.Controlador;
import controller.Operacion;
import model.Candidato;
import model.Ciudades;
import model.CrudException;
import model.Ideologia;
import model.Partidos;
import view.VistaGeneral;

public class VistaGui extends JFrame implements VistaGeneral {
    public javax.swing.JMenuItem menuActualizar;
    public javax.swing.JMenuItem menuBuscar;
    public javax.swing.JMenu menuCandidatos;
    public javax.swing.JMenuItem menuConteo;
    public javax.swing.JMenuItem menuEliminar;
    public javax.swing.JMenuItem menuInsertar;
    public javax.swing.JMenuItem menuListar;
    private javax.swing.JMenuBar menuPrincipal;
    public javax.swing.JMenuItem menuResultado;
    private javax.swing.JMenu menuVotos;
    private javax.swing.JPanel panelMenus;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSeparador;
    private javax.swing.JLabel tituloPrincipal;
    private PanelMenuInsertar panelMenuInsertar;
    private PanelMenuActualizar panelMenuActualizar;
    private PanelMenuBuscar panelMenuBuscar;
    private PanelMenuEliminar panelMenuEliminar;
    private PanelMenuListar panelMenuListar;
    private PanelMenuConteo panelMenuConteo;
    private PanelMenuResultado panelMenuResultado;

    public VistaGui() {
        initComponents();
    }

    private void initComponents() {
        panelPrincipal = new javax.swing.JPanel();
        panelSeparador = new javax.swing.JPanel();
        tituloPrincipal = new javax.swing.JLabel();
        panelMenus = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCandidatos = new javax.swing.JMenu();
        menuInsertar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenuItem();
        menuVotos = new javax.swing.JMenu();
        menuConteo = new javax.swing.JMenuItem();
        menuResultado = new javax.swing.JMenuItem();

        panelSeparador.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout panelSeparadorLayout = new javax.swing.GroupLayout(panelSeparador);
        panelSeparador.setLayout(panelSeparadorLayout);
        panelSeparadorLayout.setHorizontalGroup(
                panelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        panelSeparadorLayout.setVerticalGroup(
                panelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        tituloPrincipal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloPrincipal.setText("Bienvenido, Ve al Menu de Candidatos para Iniciar La Aplicacion");

        javax.swing.GroupLayout panelMenusLayout = new javax.swing.GroupLayout(panelMenus);
        panelMenus.setLayout(panelMenusLayout);
        panelMenusLayout.setHorizontalGroup(
                panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        panelMenusLayout.setVerticalGroup(
                panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 318, Short.MAX_VALUE));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
                panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                panelPrincipalLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panelPrincipalLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                                        .addComponent(tituloPrincipal)
                                                        .addGap(0, 62, Short.MAX_VALUE))
                                                .addComponent(panelMenus, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(panelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
        panelPrincipalLayout.setVerticalGroup(
                panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloPrincipal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelMenus, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                        .addComponent(panelSeparador, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        menuCandidatos.setText("Candidatos");

        menuInsertar.setText("Insertar Candidatos");
        menuCandidatos.add(menuInsertar);

        menuActualizar.setText("Actualizar Candidatos");
        menuCandidatos.add(menuActualizar);

        menuBuscar.setText("Buscar Candidatos");
        menuCandidatos.add(menuBuscar);

        menuEliminar.setText("Eliminar Candidatos");
        menuCandidatos.add(menuEliminar);

        menuListar.setText("Listar Candidatos");
        menuCandidatos.add(menuListar);

        menuPrincipal.add(menuCandidatos);

        menuVotos.setText("Votos");

        menuConteo.setText("Conteo");
        menuVotos.add(menuConteo);

        menuResultado.setText("Resultados");
        menuVotos.add(menuResultado);

        menuPrincipal.add(menuVotos);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void ajustesVentana() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Proyecto 3");
        setPreferredSize(new java.awt.Dimension(700, 400));

        try {
            javax.swing.UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (Exception e) {
            System.out.println(e);
        }

        setVisible(true);
    }

    public void crearPanelMenuInsertar(Controlador controlador) {
        panelMenuInsertar = new PanelMenuInsertar();
        panelMenuInsertar.setSize(panelMenus.getSize());
        panelMenuInsertar.botonInsertar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.crudActionPerformed(evt);
            }
        });

        tituloPrincipal.setText("Insertar Candidato");
        panelMenus.removeAll();
        panelMenus.add(panelMenuInsertar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }

    public void crearPanelMenuActualizar(Controlador controlador) {
        panelMenuActualizar = new PanelMenuActualizar();
        panelMenuActualizar.setSize(panelMenus.getSize());
        panelMenuActualizar.botonBusqueda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.crudActionPerformed(evt);
            }
        });
        panelMenuActualizar.botonActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.crudActionPerformed(evt);
            }
        });

        tituloPrincipal.setText("Actualizar Candidato");
        panelMenus.removeAll();
        panelMenus.add(panelMenuActualizar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }

    public void crearPanelMenuBuscar(Controlador controlador) {
        panelMenuBuscar = new PanelMenuBuscar();
        panelMenuBuscar.setSize(panelMenus.getSize());
        panelMenuBuscar.botonBusqueda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.crudActionPerformed(evt);
            }
        });

        tituloPrincipal.setText("Buscar Candidato");
        panelMenus.removeAll();
        panelMenus.add(panelMenuBuscar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }

    public void crearPanelMenuEliminar(Controlador controlador) {
        panelMenuEliminar = new PanelMenuEliminar();
        panelMenuEliminar.setSize(panelMenus.getSize());
        panelMenuEliminar.botonEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.crudActionPerformed(evt);
            }
        });

        tituloPrincipal.setText("Eliminar Candidato");
        panelMenus.removeAll();
        panelMenus.add(panelMenuEliminar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }

    public void crearPanelMenuListar(Controlador controlador) {
        panelMenuListar = new PanelMenuListar();
        panelMenuListar.setSize(panelMenus.getSize());
        panelMenuListar.botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlador.crudActionPerformed(evt);
            }
        });

        tituloPrincipal.setText("Listado de Candidatos");
        panelMenus.removeAll();
        panelMenus.add(panelMenuListar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }

    public void crearPanelConteo(Controlador controlador, String nombre) {
        panelMenuConteo = new PanelMenuConteo();
        panelMenuConteo.setSize(panelMenus.getSize());
        panelMenuConteo.nombreVotos.setText("Digite los votos de: " + nombre);
        panelMenuConteo.botonVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlador.crudActionPerformed(evt);
            }
        });

        menuCandidatos.setVisible(false);
        tituloPrincipal.setText("Votacion:");
        panelMenus.removeAll();
        panelMenus.add(panelMenuConteo);
        panelMenus.revalidate();
        panelMenus.repaint();
    }

    public void crearPanelresultados(Controlador controlador) {
        panelMenuResultado = new PanelMenuResultado();
        panelMenuResultado.setSize(panelMenus.getSize());
        panelMenuResultado.botonGanador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlador.crudActionPerformed(evt);
            }
        });
        tituloPrincipal.setText("Resultados:");
        panelMenus.removeAll();
        panelMenus.add(panelMenuResultado);
        panelMenus.revalidate();
        panelMenus.repaint();
    }

    public void borrarCampos(Operacion operacion) {
        switch (operacion) {
            case Insertar: {
                panelMenuInsertar.campoNombreInsertar.setText("");
                panelMenuInsertar.campoCedulaInsertar.setText("");
                panelMenuInsertar.campoPromesaInsertar.setText("");
                break;
            }
            case Buscar: {
                if (panelMenus.isAncestorOf(panelMenuBuscar))
                    panelMenuBuscar.campoBusqueda.setText("");
                if (panelMenus.isAncestorOf(panelMenuActualizar) && !panelMenuActualizar.panelInsertar.isVisible())
                    panelMenuActualizar.campoBusqueda.setText("");
                break;
            }
            case Eliminar: {
                panelMenuEliminar.campoBusqueda.setText("");
                break;
            }
            case Votar: {
                panelMenuConteo.numVotos.setText("");
            }
            default:
                return;
        }
    }

    @Override
    public String getNombre(Operacion operacion) {
        switch (operacion) {
            case Insertar:
                return panelMenuInsertar.campoNombreInsertar.getText();
            case Actualizar:
                return panelMenuActualizar.campoNombreInsertar.getText();
            case Buscar: {
                if (panelMenus.isAncestorOf(panelMenuBuscar))
                    return panelMenuBuscar.campoBusqueda.getText();
                else if (panelMenus.isAncestorOf(panelMenuActualizar))
                    return panelMenuActualizar.campoBusqueda.getText();
            }
            case Eliminar:
                return panelMenuEliminar.campoBusqueda.getText();
            default:
                return "";
        }

    }

    @Override
    public String getCedula(Operacion operacion) {
        switch (operacion) {
            case Insertar:
                return panelMenuInsertar.campoCedulaInsertar.getText();
            case Actualizar:
                return panelMenuActualizar.campoCedulaInsertar.getText();
            default:
                return "";
        }
    }

    @Override
    public Ciudades getCiudad(Operacion operacion) {
        Ciudades ciudad = null;

        switch (operacion) {
            case Insertar: {
                ciudad = Ciudades
                        .valueOf(panelMenuInsertar.campoCiudadInsertar.getSelectedItem().toString().replace(" ", "_"));
                break;
            }
            case Actualizar: {
                ciudad = Ciudades.valueOf(
                        panelMenuActualizar.campoCiudadInsertar.getSelectedItem().toString().replace(" ", "_"));
                break;
            }
            default:
                ciudad = null;
        }

        return ciudad;
    }

    @Override
    public Ideologia getIdeologia(Operacion operacion) {
        Ideologia ideologia = null;

        switch (operacion) {
            case Insertar: {
                if (panelMenuInsertar.radioIzquierdaInsertar.isSelected())
                    ideologia = Ideologia.Izquierda;
                else if (panelMenuInsertar.radioDerechaInsertar.isSelected())
                    ideologia = Ideologia.Derecha;
                break;
            }
            case Actualizar: {
                if (panelMenuActualizar.radioIzquierdaInsertar.isSelected())
                    ideologia = Ideologia.Izquierda;
                else if (panelMenuActualizar.radioDerechaInsertar.isSelected())
                    ideologia = Ideologia.Derecha;
                break;
            }
            default:
                ideologia = null;
        }

        return ideologia;
    }

    @Override
    public Partidos getPartido(Operacion operacion) {
        Partidos partido = null;

        switch (operacion) {
            case Insertar: {
                partido = Partidos
                        .valueOf(panelMenuInsertar.campoPartidoInsertar.getSelectedItem().toString().replace(" ", "_"));
                break;
            }
            case Actualizar: {
                partido = Partidos.valueOf(
                        panelMenuActualizar.campoPartidoInsertar.getSelectedItem().toString().replace(" ", "_"));
                break;
            }
            default:
                partido = null;
        }

        return partido;
    }

    @Override
    public String getPromesas(Operacion operacion) {
        switch (operacion) {
            case Insertar:
                return panelMenuInsertar.campoPromesaInsertar.getText();
            case Actualizar:
                return panelMenuActualizar.campoPromesaInsertar.getText();
            default:
                return "";
        }
    }

    @Override
    public String getVotos() {
        return panelMenuConteo.numVotos.getText();
    }

    @Override
    public void setDatos(Candidato candidato, String topCiudades, String topPartido) {
        if (candidato != null) {
            panelMenuResultado.nombreGanador.setText("Nombre: " + candidato.getNombre());
            panelMenuResultado.cedulaGanador.setText("Cedula: " + candidato.getCedula());
            panelMenuResultado.campoPromesas.setText(candidato.getPromesas().toString());
            panelMenuResultado.campoPartido.setText(topPartido);
            panelMenuResultado.campoTop3.setText(topCiudades);
            panelMenuResultado.campoTop3.setEditable(false);
        }
    }

    @Override
    public void buscarCandidato(Candidato candidato, Operacion operacion) {
        if (candidato != null) {
            if (operacion.equals(Operacion.Buscar)) {
                if (panelMenus.isAncestorOf(panelMenuBuscar)) {
                    panelMenuBuscar.panelBuscar.setVisible(true);
                    panelMenuBuscar.nombreInfo.setText("Nombre: " + candidato.getNombre());
                    panelMenuBuscar.cedulaInfo.setText("Cedula: " + candidato.getCedula());
                    panelMenuBuscar.ciudadInfo.setText("Ciudad: " + candidato.getCiudad().toString().replace("_", " "));
                    panelMenuBuscar.ideologiaInfo.setText("Ideologia: " + candidato.getIdeologia());
                    panelMenuBuscar.partidoInfo
                            .setText("Partido: " + candidato.getPartido().toString().replace("_", " "));
                    panelMenuBuscar.campoPromesaInfo.setText(candidato.getPromesas());
                } else if (panelMenus.isAncestorOf(panelMenuActualizar)) {
                    panelMenuActualizar.panelInsertar.setVisible(true);
                    panelMenuActualizar.campoNombreInsertar.setText(candidato.getNombre());
                    panelMenuActualizar.campoCedulaInsertar.setText(candidato.getCedula());
                    panelMenuActualizar.campoCiudadInsertar
                            .setSelectedItem(candidato.getCiudad().toString().replace("_", " "));
                    if (candidato.getIdeologia().equals(Ideologia.Izquierda))
                        panelMenuActualizar.radioIzquierdaInsertar.setSelected(true);
                    else if (candidato.getIdeologia().equals(Ideologia.Derecha))
                        panelMenuActualizar.radioDerechaInsertar.setSelected(true);
                    panelMenuActualizar.campoPartidoInsertar
                            .setSelectedItem(candidato.getPartido().toString().replace("_", " "));
                    panelMenuActualizar.campoPromesaInsertar.setText(candidato.getPromesas());
                }
            }
        }
    }

    @Override
    public void setResultado(String resultado, Operacion operacion, CrudException crudException) {
        switch (operacion) {
            case Insertar: {
                if (crudException == null)
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Información",
                            JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                break;
            }
            case Actualizar: {
                if (crudException == null) {
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Información",
                            JOptionPane.INFORMATION_MESSAGE);
                    panelMenuActualizar.campoBusqueda.setText("");
                    panelMenuActualizar.panelInsertar.setVisible(false);
                } else
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                break;
            }
            case Buscar: {
                if (crudException != null)
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Información",
                            JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case Eliminar: {
                if (crudException == null)
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Información",
                            JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                break;
            }
            case Listar: {
                if (crudException == null) {
                    panelMenuListar.campoListar.setText("");
                    panelMenuListar.campoListar.setText(resultado);
                } else {
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Información",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            }
            case Votar: {
                panelMenuConteo.numVotos.setVisible(true);
                if (crudException == null) {
                    panelMenuConteo.nombreVotos.setText("Digite los votos de: " + resultado);
                    panelMenuConteo.numVotos.setText("");
                }

                if (crudException != null) {
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                }
                break;
            }
            case Resultados:
                if (crudException != null)
                    JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                break;

        }

        borrarCampos(operacion);
    }

    @Override
    public void iniciar(Controlador controlador) {

        menuInsertar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.menuActionPerformed(evt);
            }
        });

        menuActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.menuActionPerformed(evt);
            }
        });

        menuBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.menuActionPerformed(evt);
            }
        });

        menuEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.menuActionPerformed(evt);
            }
        });

        menuListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.menuActionPerformed(evt);
            }
        });

        menuConteo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.menuActionPerformed(evt);

            }
        });

        menuResultado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.menuActionPerformed(evt);
            }
        });

        ajustesVentana();
    }
}
