package Vista;

import java.awt.Toolkit;

/**
 *
 * @author Gonzalo
 */
public class DialogofuncionNoDisponible extends javax.swing.JFrame implements Runnable {

    /**
     *Cosntructor para el cuadro de dialogo de alerta
     */
    public DialogofuncionNoDisponible() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\calculator.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        imgWarning = new javax.swing.JLabel();
        textoAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(java.awt.Color.black);

        imgWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alert.png"))); // NOI18N

        textoAviso.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        textoAviso.setForeground(new java.awt.Color(248, 156, 4));
        textoAviso.setText("FUNCIÓN NO DISPONIBLE");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(imgWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoAviso)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(imgWarning))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(textoAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgWarning;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel textoAviso;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
      setVisible(true);
    }
}
