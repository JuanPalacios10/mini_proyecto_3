package view.gui;

public class PanelMenuEliminar extends javax.swing.JPanel {
    public javax.swing.JButton botonEliminar;
    public javax.swing.JTextField campoBusqueda;
    private javax.swing.JLabel nombreBusqueda;
    private javax.swing.JPanel panelCampoBuscar;

    public PanelMenuEliminar() {
        initComponents();
    }

    private void initComponents() {
        panelCampoBuscar = new javax.swing.JPanel();
        nombreBusqueda = new javax.swing.JLabel();
        campoBusqueda = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();

        nombreBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreBusqueda.setText("Ingrese el nombre a buscar:");

        campoBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        botonEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonEliminar.setText("Eliminar");

        javax.swing.GroupLayout panelCampoBuscarLayout = new javax.swing.GroupLayout(panelCampoBuscar);
        panelCampoBuscar.setLayout(panelCampoBuscarLayout);
        panelCampoBuscarLayout.setHorizontalGroup(
            panelCampoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoBuscarLayout.createSequentialGroup()
                .addComponent(nombreBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botonEliminar))
        );
        panelCampoBuscarLayout.setVerticalGroup(
            panelCampoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoBuscarLayout.createSequentialGroup()
                .addGroup(panelCampoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBusqueda)
                    .addComponent(nombreBusqueda)
                    .addComponent(botonEliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(panelCampoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCampoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }
}
