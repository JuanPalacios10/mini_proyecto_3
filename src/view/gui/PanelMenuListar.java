package view.gui;

public class PanelMenuListar extends javax.swing.JPanel {
    public javax.swing.JButton botonListar;
    public javax.swing.JTextArea campoListar;
    private javax.swing.JPanel panelListar;
    private javax.swing.JScrollPane scrollListar;

    public PanelMenuListar() {
        initComponents();
    }

    private void initComponents() {
        panelListar = new javax.swing.JPanel();
        botonListar = new javax.swing.JButton();
        scrollListar = new javax.swing.JScrollPane();
        campoListar = new javax.swing.JTextArea();

        botonListar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonListar.setText("Listar");

        campoListar.setColumns(20);
        campoListar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoListar.setRows(5);
        campoListar.setEditable(false);
        scrollListar.setViewportView(campoListar);

        javax.swing.GroupLayout panelListarLayout = new javax.swing.GroupLayout(panelListar);
        panelListar.setLayout(panelListarLayout);
        panelListarLayout.setHorizontalGroup(
            panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollListar, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addGroup(panelListarLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(botonListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelListarLayout.setVerticalGroup(
            panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarLayout.createSequentialGroup()
                .addComponent(botonListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollListar, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );
    }
}
