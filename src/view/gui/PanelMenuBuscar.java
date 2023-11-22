package view.gui;

public class PanelMenuBuscar extends javax.swing.JPanel {
    public javax.swing.JButton botonBusqueda;
    public javax.swing.JTextField campoBusqueda;
    public javax.swing.JTextArea campoPromesaInfo;
    public javax.swing.JLabel cedulaInfo;
    public javax.swing.JLabel ciudadInfo;
    public javax.swing.JLabel ideologiaInfo;
    private javax.swing.JLabel nombreBusqueda;
    public javax.swing.JLabel nombreInfo;
    public javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelCampoBuscar;
    private javax.swing.JPanel panelCampoInfo1;
    private javax.swing.JPanel panelCampoInfo2;
    private javax.swing.JPanel panelCampoInfo3;
    private javax.swing.JPanel panelCampoInfo4;
    private javax.swing.JPanel panelCampoInfo5;
    private javax.swing.JPanel panelCampoInfo6;
    public javax.swing.JLabel partidoInfo;
    private javax.swing.JLabel promesaInfo;
    private javax.swing.JScrollPane scrollPromesaInfo;

    public PanelMenuBuscar() {
        initComponents();
        panelBuscar.setVisible(false);
    }

    private void initComponents() {
        panelCampoBuscar = new javax.swing.JPanel();
        nombreBusqueda = new javax.swing.JLabel();
        campoBusqueda = new javax.swing.JTextField();
        botonBusqueda = new javax.swing.JButton();
        panelBuscar = new javax.swing.JPanel();
        panelCampoInfo1 = new javax.swing.JPanel();
        nombreInfo = new javax.swing.JLabel();
        panelCampoInfo2 = new javax.swing.JPanel();
        cedulaInfo = new javax.swing.JLabel();
        panelCampoInfo3 = new javax.swing.JPanel();
        ciudadInfo = new javax.swing.JLabel();
        panelCampoInfo4 = new javax.swing.JPanel();
        ideologiaInfo = new javax.swing.JLabel();
        panelCampoInfo5 = new javax.swing.JPanel();
        partidoInfo = new javax.swing.JLabel();
        panelCampoInfo6 = new javax.swing.JPanel();
        promesaInfo = new javax.swing.JLabel();
        scrollPromesaInfo = new javax.swing.JScrollPane();
        campoPromesaInfo = new javax.swing.JTextArea();

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

        nombreInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreInfo.setText("Nombre:");

        javax.swing.GroupLayout panelCampoInfo1Layout = new javax.swing.GroupLayout(panelCampoInfo1);
        panelCampoInfo1.setLayout(panelCampoInfo1Layout);
        panelCampoInfo1Layout.setHorizontalGroup(
            panelCampoInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );
        panelCampoInfo1Layout.setVerticalGroup(
            panelCampoInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInfo1Layout.createSequentialGroup()
                .addComponent(nombreInfo)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        cedulaInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cedulaInfo.setText("Cedula:");

        javax.swing.GroupLayout panelCampoInfo2Layout = new javax.swing.GroupLayout(panelCampoInfo2);
        panelCampoInfo2.setLayout(panelCampoInfo2Layout);
        panelCampoInfo2Layout.setHorizontalGroup(
            panelCampoInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInfo2Layout.createSequentialGroup()
                .addComponent(cedulaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCampoInfo2Layout.setVerticalGroup(
            panelCampoInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInfo2Layout.createSequentialGroup()
                .addComponent(cedulaInfo)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        ciudadInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ciudadInfo.setText("Ciudad:");

        javax.swing.GroupLayout panelCampoInfo3Layout = new javax.swing.GroupLayout(panelCampoInfo3);
        panelCampoInfo3.setLayout(panelCampoInfo3Layout);
        panelCampoInfo3Layout.setHorizontalGroup(
            panelCampoInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ciudadInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );
        panelCampoInfo3Layout.setVerticalGroup(
            panelCampoInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInfo3Layout.createSequentialGroup()
                .addComponent(ciudadInfo)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        ideologiaInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ideologiaInfo.setText("Ideologia:");

        javax.swing.GroupLayout panelCampoInfo4Layout = new javax.swing.GroupLayout(panelCampoInfo4);
        panelCampoInfo4.setLayout(panelCampoInfo4Layout);
        panelCampoInfo4Layout.setHorizontalGroup(
            panelCampoInfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ideologiaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );
        panelCampoInfo4Layout.setVerticalGroup(
            panelCampoInfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInfo4Layout.createSequentialGroup()
                .addComponent(ideologiaInfo)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        partidoInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        partidoInfo.setText("Partido:");

        javax.swing.GroupLayout panelCampoInfo5Layout = new javax.swing.GroupLayout(panelCampoInfo5);
        panelCampoInfo5.setLayout(panelCampoInfo5Layout);
        panelCampoInfo5Layout.setHorizontalGroup(
            panelCampoInfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(partidoInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );
        panelCampoInfo5Layout.setVerticalGroup(
            panelCampoInfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInfo5Layout.createSequentialGroup()
                .addComponent(partidoInfo)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        promesaInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        promesaInfo.setText("Promesas:");

        campoPromesaInfo.setColumns(20);
        campoPromesaInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoPromesaInfo.setRows(5);
        campoPromesaInfo.setEditable(false);
        scrollPromesaInfo.setViewportView(campoPromesaInfo);

        javax.swing.GroupLayout panelCampoInfo6Layout = new javax.swing.GroupLayout(panelCampoInfo6);
        panelCampoInfo6.setLayout(panelCampoInfo6Layout);
        panelCampoInfo6Layout.setHorizontalGroup(
            panelCampoInfo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPromesaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addGroup(panelCampoInfo6Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(promesaInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCampoInfo6Layout.setVerticalGroup(
            panelCampoInfo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoInfo6Layout.createSequentialGroup()
                .addComponent(promesaInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPromesaInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCampoInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCampoInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCampoInfo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(panelCampoInfo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addComponent(panelCampoInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCampoInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCampoInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCampoInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelCampoInfo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(panelCampoInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(panelCampoInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelCampoInfo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
    }
}
