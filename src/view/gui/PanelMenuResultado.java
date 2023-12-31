package view.gui;


public class PanelMenuResultado extends javax.swing.JPanel {
    public javax.swing.JTextArea campoPartido;
    public javax.swing.JTextArea campoPromesas;
    public javax.swing.JTextArea campoTop3;
    public java.awt.Label cedulaGanador;
    public java.awt.Label nombreGanador;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JScrollPane scrollCampoPartido;
    private javax.swing.JScrollPane scrollCampoPromesas;
    private javax.swing.JScrollPane scrollCampoTop3;
    public java.awt.Label tituloGanador;
    public java.awt.Label tituloPartido;
    public java.awt.Label tituloPromesas;
    public java.awt.Label tituloTop3;
    public javax.swing.JButton botonGanador;

    public PanelMenuResultado() {
        initComponents();
    }

    private void initComponents() {
        panelResultado = new javax.swing.JPanel();
        tituloGanador = new java.awt.Label();
        scrollCampoPromesas = new javax.swing.JScrollPane();
        campoPromesas = new javax.swing.JTextArea();
        tituloPromesas = new java.awt.Label();
        nombreGanador = new java.awt.Label();
        cedulaGanador = new java.awt.Label();
        tituloTop3 = new java.awt.Label();
        scrollCampoTop3 = new javax.swing.JScrollPane();
        campoTop3 = new javax.swing.JTextArea();
        tituloPartido = new java.awt.Label();
        scrollCampoPartido = new javax.swing.JScrollPane();
        campoPartido = new javax.swing.JTextArea();
        botonGanador = new javax.swing.JButton();

        tituloGanador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tituloGanador.setText("EL GANADOR ES:");

        campoPromesas.setColumns(20);
        campoPromesas.setRows(5);
        campoPromesas.setEditable(true);
        scrollCampoPromesas.setViewportView(campoPromesas);

        tituloPromesas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tituloPromesas.setText("Promesas:");

        nombreGanador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreGanador.setText("");

        cedulaGanador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cedulaGanador.setText("");

        tituloTop3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tituloTop3.setText("TOP 3 CIUDADES CON MENOS CANDIDATOS");

        campoTop3.setColumns(20);
        campoTop3.setRows(5);
        scrollCampoTop3.setViewportView(campoTop3);
        campoTop3.setEditable(false);

        tituloPartido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tituloPartido.setText("PARTIDO CON MÁS CANDIDATOS INSCRITOS");

        campoPartido.setColumns(20);
        campoPartido.setRows(5);
        campoPartido.setEditable(false);
        scrollCampoPartido.setViewportView(campoPartido);

        botonGanador.setText("Conocer Ganador");
        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCampoPromesas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloPromesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addComponent(tituloGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(botonGanador))
                    .addComponent(nombreGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollCampoPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollCampoTop3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloTop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(scrollCampoTop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCampoPartido, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addComponent(botonGanador)
                .addGap(8, 8, 8)
                .addComponent(nombreGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cedulaGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloPromesas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollCampoPromesas))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );              
    }
}
