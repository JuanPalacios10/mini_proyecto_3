package view.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PanelMenuConteo extends javax.swing.JPanel {
    public ArrayList<Candidato> candidatosLista= new ArrayList<>(App.candidatos);
    private javax.swing.JButton botonVotar;
    private javax.swing.JLabel nombreVotos;
    private javax.swing.JTextField numVotos;
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
        botonVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVotarActionPerformed(evt);
            }
        });

        tituloVotos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tituloVotos.setText("Menú de votación");

        nombreVotos.setText("<html> Ingrese el número de votos en el campo,<br>a continuación votar y aparecerá la<br>lista de candidatos a votar<html>");

        javax.swing.GroupLayout panelConteoLayout = new javax.swing.GroupLayout(panelConteo);
        panelConteo.setLayout(panelConteoLayout);
        panelConteoLayout.setHorizontalGroup(
            panelConteoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConteoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(panelConteoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(nombreVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void botonVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVotarActionPerformed
        try {
            // Obtener el número de votos desde el campo de texto
            int voto = Integer.parseInt(numVotos.getText());
            
            // Verificar que haya al menos un candidato disponible
            if (!candidatosLista.isEmpty()) {
                // Mostrar una ventana de selección para elegir el candidato
                String[] opciones = candidatosLista.stream().map(Candidato::getNombre).toArray(String[]::new);
                String candidatoSeleccionado = (String)JOptionPane.showInputDialog(null, "Seleccione un candidato:",
                        "Votar", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                // Verificar si se seleccionó un candidato
                if (candidatoSeleccionado != null) {
                    // Actualizar el Map de votos
                    Candidato candidato = obtenerCandidatoPorNombre(candidatoSeleccionado);
                    App.votosCandidatos.put(candidato, App.votosCandidatos.getOrDefault(candidato, 0) + voto);
                    candidatosLista.remove(candidato);
                    opciones = obtenerOpcionesDisponibles();

                    // Mostrar el nombre de la persona para la que se va a votar en el Label
                    nombreVotos.setText("Votando por: " + candidatoSeleccionado + " - Votos: " + voto);
                    JOptionPane.showMessageDialog(this.getRootPane(), "Voto registrado para " + candidatoSeleccionado);
                }
            } else {
                    JOptionPane.showMessageDialog(this.getRootPane(), "No hay candidatos disponibles para votar.");
            }
        } catch (NumberFormatException ex) {
            // Manejar el caso en el que el usuario ingrese algo que no sea un número válido
            JOptionPane.showMessageDialog(this.getRootPane(), "Por favor, ingresa un valor numérico válido.");
        }
        
    }
    
    private String[] obtenerOpcionesDisponibles() {
        return candidatosLista.stream().map(Candidato::getNombre).toArray(String[]::new);
    }

    private Candidato obtenerCandidatoPorNombre(String nombreCandidato) {
        return candidatosLista.stream()
                .filter(candidato -> candidato.getNombre().equals(nombreCandidato))
                .findFirst()
                .orElse(null);
    }
}
