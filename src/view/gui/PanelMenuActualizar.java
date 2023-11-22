package view.gui;

import model.Ciudades;
import model.Partidos;

public class PanelMenuActualizar extends javax.swing.JPanel {
    private javax.swing.DefaultComboBoxModel<String> ciudadesModel;
    private javax.swing.DefaultComboBoxModel<String> partidosModel;
    public javax.swing.JButton botonActualizar;
    public javax.swing.JButton botonBusqueda;
    public javax.swing.JTextField campoBusqueda;
    public javax.swing.JTextField campoCedulaInsertar;
    public javax.swing.JComboBox<String> campoCiudadInsertar;
    public javax.swing.JTextField campoNombreInsertar;
    public javax.swing.JComboBox<String> campoPartidoInsertar;
    public javax.swing.JTextArea campoPromesaInsertar;
    private javax.swing.JLabel cedulaInsertar;
    private javax.swing.JLabel ciudadInsertar;
    private javax.swing.ButtonGroup grupoIdeologia;
    private javax.swing.JLabel ideologiaInsertar;
    private javax.swing.JLabel nombreBusqueda;
    private javax.swing.JLabel nombreInsertar;
    private javax.swing.JPanel panelCampoBuscar;
    private javax.swing.JPanel panelCampoInsertar1;
    private javax.swing.JPanel panelCampoInsertar2;
    private javax.swing.JPanel panelCampoInsertar3;
    private javax.swing.JPanel panelCampoInsertar4;
    private javax.swing.JPanel panelCampoInsertar5;
    private javax.swing.JPanel panelCampoInsertar6;
    public javax.swing.JPanel panelInsertar;
    private javax.swing.JLabel partidoInsertar;
    private javax.swing.JLabel promesaInsertar;
    public javax.swing.JRadioButton radioDerechaInsertar;
    public javax.swing.JRadioButton radioIzquierdaInsertar;
    private javax.swing.JScrollPane scrollPromesaInsertar;
    
    public PanelMenuActualizar() {
        generarCiudadesPartidos();
        initComponents();
        panelInsertar.setVisible(false);
    }
    
    private void generarCiudadesPartidos() {
        String[] ciudades = new String[Ciudades.values().length];
        String[] partidos = new String[Partidos.values().length];
        
        for(int i = 0; i < ciudades.length; i++) {
            ciudades[i] = Ciudades.values()[i].toString().replace("_", " ");
        }
     
        for(int i = 0; i < partidos.length; i++) {
            partidos[i] = Partidos.values()[i].toString().replace("_", " ");
        }
        
        ciudadesModel = new javax.swing.DefaultComboBoxModel<>(ciudades);
        partidosModel = new javax.swing.DefaultComboBoxModel<>(partidos);
    }

    private void initComponents() {
        grupoIdeologia = new javax.swing.ButtonGroup();
        panelCampoBuscar = new javax.swing.JPanel();
        nombreBusqueda = new javax.swing.JLabel();
        campoBusqueda = new javax.swing.JTextField();
        botonBusqueda = new javax.swing.JButton();
        panelInsertar = new javax.swing.JPanel();
        panelCampoInsertar1 = new javax.swing.JPanel();
        nombreInsertar = new javax.swing.JLabel();
        campoNombreInsertar = new javax.swing.JTextField();
        panelCampoInsertar2 = new javax.swing.JPanel();
        cedulaInsertar = new javax.swing.JLabel();
        campoCedulaInsertar = new javax.swing.JTextField();
        panelCampoInsertar3 = new javax.swing.JPanel();
        ciudadInsertar = new javax.swing.JLabel();
        campoCiudadInsertar = new javax.swing.JComboBox<>();
        panelCampoInsertar4 = new javax.swing.JPanel();
        ideologiaInsertar = new javax.swing.JLabel();
        radioIzquierdaInsertar = new javax.swing.JRadioButton();
        radioDerechaInsertar = new javax.swing.JRadioButton();
        panelCampoInsertar5 = new javax.swing.JPanel();
        partidoInsertar = new javax.swing.JLabel();
        campoPartidoInsertar = new javax.swing.JComboBox<>();
        panelCampoInsertar6 = new javax.swing.JPanel();
        promesaInsertar = new javax.swing.JLabel();
        scrollPromesaInsertar = new javax.swing.JScrollPane();
        campoPromesaInsertar = new javax.swing.JTextArea();
        botonActualizar = new javax.swing.JButton();

        nombreBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreBusqueda.setText("Ingrese el nombre a buscar:");

        campoBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        botonBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonBusqueda.setText("Buscar");

        javax.swing.GroupLayout panelCampoBuscarLayout = new javax.swing.GroupLayout(panelCampoBuscar);
        panelCampoBuscar.setLayout(panelCampoBuscarLayout);
        panelCampoBuscarLayout.setHorizontalGroup(
            panelCampoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoBuscarLayout.createSequentialGroup()
                .addComponent(nombreBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(botonBusqueda))
        );
        panelCampoBuscarLayout.setVerticalGroup(
            panelCampoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoBuscarLayout.createSequentialGroup()
                .addGroup(panelCampoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBusqueda)
                    .addComponent(botonBusqueda)
                    .addComponent(nombreBusqueda))
                .addContainerGap())
        );

        panelCampoInsertar1.setPreferredSize(new java.awt.Dimension(247, 33));

        nombreInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreInsertar.setText("Nombre:");

        campoNombreInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelCampoInsertar1Layout = new javax.swing.GroupLayout(panelCampoInsertar1);
        panelCampoInsertar1.setLayout(panelCampoInsertar1Layout);
        panelCampoInsertar1Layout.setHorizontalGroup(
            panelCampoInsertar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar1Layout.createSequentialGroup()
                .addComponent(nombreInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNombreInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );
        panelCampoInsertar1Layout.setVerticalGroup(
            panelCampoInsertar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar1Layout.createSequentialGroup()
                .addGroup(panelCampoInsertar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreInsertar)
                    .addComponent(campoNombreInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cedulaInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cedulaInsertar.setText("Cedula:");

        campoCedulaInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelCampoInsertar2Layout = new javax.swing.GroupLayout(panelCampoInsertar2);
        panelCampoInsertar2.setLayout(panelCampoInsertar2Layout);
        panelCampoInsertar2Layout.setHorizontalGroup(
            panelCampoInsertar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar2Layout.createSequentialGroup()
                .addComponent(cedulaInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCedulaInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCampoInsertar2Layout.setVerticalGroup(
            panelCampoInsertar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar2Layout.createSequentialGroup()
                .addGroup(panelCampoInsertar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaInsertar)
                    .addComponent(campoCedulaInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCampoInsertar3.setPreferredSize(new java.awt.Dimension(247, 38));

        ciudadInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ciudadInsertar.setText("Ciudad:");

        campoCiudadInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoCiudadInsertar.setModel(ciudadesModel);

        javax.swing.GroupLayout panelCampoInsertar3Layout = new javax.swing.GroupLayout(panelCampoInsertar3);
        panelCampoInsertar3.setLayout(panelCampoInsertar3Layout);
        panelCampoInsertar3Layout.setHorizontalGroup(
            panelCampoInsertar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar3Layout.createSequentialGroup()
                .addComponent(ciudadInsertar)
                .addGap(18, 18, 18)
                .addComponent(campoCiudadInsertar, 0, 191, Short.MAX_VALUE))
        );
        panelCampoInsertar3Layout.setVerticalGroup(
            panelCampoInsertar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar3Layout.createSequentialGroup()
                .addGroup(panelCampoInsertar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciudadInsertar)
                    .addComponent(campoCiudadInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        ideologiaInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ideologiaInsertar.setText("Ideologia:");

        radioIzquierdaInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioIzquierdaInsertar.setText("Izquierda");
        grupoIdeologia.add(radioIzquierdaInsertar);

        radioDerechaInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioDerechaInsertar.setText("Derecha");
        grupoIdeologia.add(radioDerechaInsertar);

        javax.swing.GroupLayout panelCampoInsertar4Layout = new javax.swing.GroupLayout(panelCampoInsertar4);
        panelCampoInsertar4.setLayout(panelCampoInsertar4Layout);
        panelCampoInsertar4Layout.setHorizontalGroup(
            panelCampoInsertar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar4Layout.createSequentialGroup()
                .addComponent(ideologiaInsertar)
                .addGap(18, 18, 18)
                .addComponent(radioIzquierdaInsertar)
                .addGap(18, 18, 18)
                .addComponent(radioDerechaInsertar))
        );
        panelCampoInsertar4Layout.setVerticalGroup(
            panelCampoInsertar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar4Layout.createSequentialGroup()
                .addGroup(panelCampoInsertar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ideologiaInsertar)
                    .addComponent(radioIzquierdaInsertar)
                    .addComponent(radioDerechaInsertar))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        partidoInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        partidoInsertar.setText("Partido:");

        campoPartidoInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoPartidoInsertar.setModel(partidosModel);

        javax.swing.GroupLayout panelCampoInsertar5Layout = new javax.swing.GroupLayout(panelCampoInsertar5);
        panelCampoInsertar5.setLayout(panelCampoInsertar5Layout);
        panelCampoInsertar5Layout.setHorizontalGroup(
            panelCampoInsertar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar5Layout.createSequentialGroup()
                .addComponent(partidoInsertar)
                .addGap(18, 18, 18)
                .addComponent(campoPartidoInsertar, 0, 188, Short.MAX_VALUE))
        );
        panelCampoInsertar5Layout.setVerticalGroup(
            panelCampoInsertar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar5Layout.createSequentialGroup()
                .addGroup(panelCampoInsertar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partidoInsertar)
                    .addComponent(campoPartidoInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        promesaInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        promesaInsertar.setText("Promesas:");

        campoPromesaInsertar.setColumns(20);
        campoPromesaInsertar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoPromesaInsertar.setRows(5);
        scrollPromesaInsertar.setViewportView(campoPromesaInsertar);

        javax.swing.GroupLayout panelCampoInsertar6Layout = new javax.swing.GroupLayout(panelCampoInsertar6);
        panelCampoInsertar6.setLayout(panelCampoInsertar6Layout);
        panelCampoInsertar6Layout.setHorizontalGroup(
            panelCampoInsertar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPromesaInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
            .addGroup(panelCampoInsertar6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(promesaInsertar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCampoInsertar6Layout.setVerticalGroup(
            panelCampoInsertar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInsertar6Layout.createSequentialGroup()
                .addComponent(promesaInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPromesaInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonActualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonActualizar.setText("Actualizar");

        javax.swing.GroupLayout panelInsertarLayout = new javax.swing.GroupLayout(panelInsertar);
        panelInsertar.setLayout(panelInsertarLayout);
        panelInsertarLayout.setHorizontalGroup(
            panelInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInsertarLayout.createSequentialGroup()
                .addComponent(panelCampoInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCampoInsertar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelInsertarLayout.createSequentialGroup()
                .addGroup(panelInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCampoInsertar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCampoInsertar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCampoInsertar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(panelCampoInsertar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInsertarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonActualizar)
                .addGap(228, 228, 228))
        );
        panelInsertarLayout.setVerticalGroup(
            panelInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInsertarLayout.createSequentialGroup()
                .addGroup(panelInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCampoInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCampoInsertar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInsertarLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(panelCampoInsertar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCampoInsertar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCampoInsertar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCampoInsertar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(panelCampoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCampoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }

    // private void botonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedaActionPerformed
    //     if(Crud.estaCandidato(App.candidatos, campoBusqueda.getText())) {
    //         panelInsertar.setVisible(true);
    //         Candidato candidatoSeleccionado = Crud.buscarCandidato(App.candidatos, campoBusqueda.getText());

    //         campoNombreInsertar.setText(candidatoSeleccionado.getNombre());
    //         campoCedulaInsertar.setText(candidatoSeleccionado.getCedula());
    //         campoCiudadInsertar.setSelectedItem(candidatoSeleccionado.getCiudad().toString().replace("_", " "));

    //         if(candidatoSeleccionado.getIdeologia().equals(Ideologia.Izquierda)) radioIzquierdaInsertar.setSelected(true);
    //         else if(candidatoSeleccionado.getIdeologia().equals(Ideologia.Derecha)) radioDerechaInsertar.setSelected(true);

    //         campoPartidoInsertar.setSelectedItem(candidatoSeleccionado.getPartido().toString().replace("_", " "));
    //         campoPromesaInsertar.setText(candidatoSeleccionado.getPromesas());
    //     } else {
    //         JOptionPane.showMessageDialog(this.getRootPane(), "El candidato no fue encontrado", "Actualizar Candidato", JOptionPane.WARNING_MESSAGE);
    //     }
    // }

    // private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
    //     Ideologia ideologia = Ideologia.Izquierda;
    //     Ciudades ciudad = Ciudades.valueOf(campoCiudadInsertar.getSelectedItem().toString().replace(" ", "_"));
    //     Partidos partido = Partidos.valueOf(campoPartidoInsertar.getSelectedItem().toString().replace(" ", "_"));

    //     if(radioIzquierdaInsertar.isSelected()) ideologia = Ideologia.Izquierda;
    //     else if(radioDerechaInsertar.isSelected()) ideologia = Ideologia.Derecha;

    //     Candidato candidato = new Candidato(campoNombreInsertar.getText(), campoCedulaInsertar.getText(), ciudad, ideologia, partido, campoPromesaInsertar.getText());
        
    //     if(Crud.actualizarCandidato(App.candidatos, campoBusqueda.getText(), candidato)) {
    //         JOptionPane.showMessageDialog(this.getRootPane(), "El candidato fue actualizado con exito", "Actualizar Candidato", JOptionPane.INFORMATION_MESSAGE);
    //     } else {
    //         JOptionPane.showMessageDialog(this.getRootPane(), "Debe llenar todos los campos", "Actualizar Candidato", JOptionPane.WARNING_MESSAGE);
    //     }

    //     campoBusqueda.setText("");
    //     panelInsertar.setVisible(false);
    // }
}
