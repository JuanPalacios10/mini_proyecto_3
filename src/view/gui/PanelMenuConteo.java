package view.gui;


public class PanelMenuConteo extends javax.swing.JPanel {
    
    public javax.swing.JButton botonVotar;
    public javax.swing.JLabel nombreVotos;
    public javax.swing.JTextField numVotos;
    private javax.swing.JPanel panelConteo;
    private javax.swing.JScrollPane scrollMenuConteo;
    private javax.swing.JLabel tituloVotos;
    
    public PanelMenuConteo() {
        initComponents();
    }

    private void initComponents() {
        scrollMenuConteo = new javax.swing.JScrollPane();
        panelConteo = new javax.swing.JPanel();
        botonVotar = new javax.swing.JButton();
        numVotos = new javax.swing.JTextField();
        tituloVotos = new javax.swing.JLabel();
        nombreVotos = new javax.swing.JLabel();

        botonVotar.setText("Votar");

        tituloVotos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tituloVotos.setText("Menú de votación");

        javax.swing.GroupLayout panelConteoLayout = new javax.swing.GroupLayout(panelConteo);
        panelConteo.setLayout(panelConteoLayout);
        panelConteoLayout.setHorizontalGroup(
            panelConteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConteoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(panelConteoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(nombreVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(numVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(botonVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        panelConteoLayout.setVerticalGroup(
            panelConteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteoLayout.createSequentialGroup()
                .addComponent(tituloVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(panelConteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelConteoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelConteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVotar))))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        scrollMenuConteo.setViewportView(panelConteo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollMenuConteo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(scrollMenuConteo, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }
}
