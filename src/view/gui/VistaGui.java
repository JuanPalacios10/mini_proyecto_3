package view.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.plaf.metal.MetalLookAndFeel;
import controller.Controlador;
import controller.Operacion;
import model.Ciudades;
import model.Ideologia;
import model.Partidos;
import view.VistaGeneral;

public class VistaGui extends JFrame implements VistaGeneral{
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuBuscar;
    public javax.swing.JMenu menuCandidatos;
    public javax.swing.JMenuItem menuConteo;
    private javax.swing.JMenuItem menuEliminar;
    public javax.swing.JMenuItem menuInsertar;
    public javax.swing.JMenuItem menuListar;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem menuResultado;
    private javax.swing.JMenu menuVotos;
    private javax.swing.JPanel panelMenus;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSeparador;
    private javax.swing.JLabel tituloPrincipal;
    private PanelMenuInsertar panelMenuInsertar;
    private PanelMenuListar panelMenuListar;

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
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelSeparadorLayout.setVerticalGroup(
            panelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tituloPrincipal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloPrincipal.setText("Bienvenido, Ve al Menu de Candidatos para Iniciar La Aplicacion");

        javax.swing.GroupLayout panelMenusLayout = new javax.swing.GroupLayout(panelMenus);
        panelMenus.setLayout(panelMenusLayout);
        panelMenusLayout.setHorizontalGroup(
            panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMenusLayout.setVerticalGroup(
            panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(tituloPrincipal)
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addComponent(panelMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addComponent(panelSeparador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuCandidatos.setText("Candidatos");

        menuInsertar.setText("Insertar Candidatos");
        menuCandidatos.add(menuInsertar);

        menuActualizar.setText("Actualizar Candidatos");
        // menuActualizar.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         menuActualizarActionPerformed(evt);
        //     }
        // });
        menuCandidatos.add(menuActualizar);

        menuBuscar.setText("Buscar Candidatos");
        // menuBuscar.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         menuBuscarActionPerformed(evt);
        //     }
        // });
        menuCandidatos.add(menuBuscar);

        menuEliminar.setText("Eliminar Candidatos");
        // menuEliminar.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         menuEliminarActionPerformed(evt);
        //     }
        // });
        menuCandidatos.add(menuEliminar);

        menuListar.setText("Listar Candidatos");
        // menuListar.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         menuListarActionPerformed(evt);
        //     }
        // });
        menuCandidatos.add(menuListar);

        menuPrincipal.add(menuCandidatos);

        menuVotos.setText("Votos");

        menuConteo.setText("Conteo");
        // menuConteo.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         menuConteoActionPerformed(evt);
        //     }
        // });
        menuVotos.add(menuConteo);

        menuResultado.setText("Resultados");
        // menuResultado.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         menuResultadoActionPerformed(evt);
        //     }
        // });
        menuVotos.add(menuResultado);

        menuPrincipal.add(menuVotos);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void ajustesVentana() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Proyecto 3");
        setPreferredSize(new java.awt.Dimension(700, 400));

        try {
            javax.swing.UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch(Exception e) {
            System.out.println(e);
        }

        setVisible(true);
    }

    public void crearPanelInsertar(Controlador controlador) {
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

    public void crearPanelListar(Controlador controlador) {
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

    public void borrarCampos(Operacion operacion) {
        switch(operacion) {
            case Insertar: {
                panelMenuInsertar.campoNombreInsertar.setText("");
                panelMenuInsertar.campoCedulaInsertar.setText("");
                panelMenuInsertar.campoPromesaInsertar.setText("");
                break;
            }
            default: return;
        }
    }

    @Override
    public String getNombre(Operacion operacion) {
        switch(operacion) {
            case Insertar: return panelMenuInsertar.campoNombreInsertar.getText();
            default: return "";
        }

    }

    @Override
    public String getCedula(Operacion operacion) {
        switch(operacion) {
            case Insertar: return panelMenuInsertar.campoCedulaInsertar.getText();
            default: return "";
        }
    }

    @Override
    public Ciudades getCiudad(Operacion operacion) {
        Ciudades ciudad = null;

        switch(operacion) {
            case Insertar: {
                ciudad = Ciudades.valueOf(panelMenuInsertar.campoCiudadInsertar.getSelectedItem().toString().replace(" ", "_"));
                break;
            }
            default: ciudad = null;
        }

        return ciudad;
    }

    @Override
    public Ideologia getIdeologia(Operacion operacion) {
        Ideologia ideologia = null;

        switch(operacion) {
            case Insertar: {
                if(panelMenuInsertar.radioIzquierdaInsertar.isSelected()) ideologia = Ideologia.Izquierda;
                else if(panelMenuInsertar.radioDerechaInsertar.isSelected()) ideologia = Ideologia.Derecha;
                break;
            }
            default: ideologia = null;
        }

        return ideologia;
    }

    @Override
    public Partidos getPartido(Operacion operacion) {
        Partidos partido = null;

        switch(operacion) {
            case Insertar: {
                partido = Partidos.valueOf(panelMenuInsertar.campoPartidoInsertar.getSelectedItem().toString().replace(" ", "_"));
                break;
            }
            default: partido = null;
        }

        return partido;
    }

    @Override
    public String getPromesas(Operacion operacion) {
        switch(operacion) {
            case Insertar: return panelMenuInsertar.campoPromesaInsertar.getText();
            default: return "";
        }
    }

    @Override
    public void setResultado(String resultado, Operacion operacion) {
        switch(operacion) {
            case Insertar: {
                JOptionPane.showMessageDialog(this.getContentPane(), resultado, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case Listar: {
                panelMenuListar.campoListar.setText("");
                panelMenuListar.campoListar.setText(resultado);
                break;
            }
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

        menuListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.menuActionPerformed(evt);
            }
        });

        ajustesVentana();
    }
}