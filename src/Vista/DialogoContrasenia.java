package Vista;

import java.awt.Toolkit;

/**
 *
 * @author Gonzalo
 */
public class DialogoContrasenia extends javax.swing.JFrame implements Runnable {

    /**
     *Constructor para el cuadro de dialogo que pide una contraseña al usuario
     */
    public DialogoContrasenia() {
        initComponents();
        setTitle("PASSWORD");
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/calculator.png")));
        contrasenia.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        imgPasswd = new javax.swing.JLabel();
        contrasenia = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(java.awt.Color.black);

        imgPasswd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPasswd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paswCandado.png"))); // NOI18N

        contrasenia.setBackground(java.awt.Color.black);
        contrasenia.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        contrasenia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 156, 4), 3, true));
        contrasenia.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.background"));

        login.setBackground(new java.awt.Color(49, 49, 49));
        login.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(250, 250, 250));
        login.setText("Login");
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        login.setBorderPainted(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setFocusPainted(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(imgPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(162, 162, 162))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgPasswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login
        Calculadora_Main.password = String.copyValueOf(contrasenia.getPassword());
        System.out.println("Contraseña introducida: " + Calculadora_Main.password);
        contrasenia.setText("");
        contrasenia.requestFocus();
    }//GEN-LAST:event_login

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenia;
    private javax.swing.JLabel imgPasswd;
    private javax.swing.JButton login;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        setVisible(true);
        /////////////////////////////
        String passWord = "calculator1234";
        System.out.println("------------------------------------------------------");
        System.out.println("Contraseña: " + passWord);
        ////////////////////////////////////////////
        while (isVisible()) {
            Calculadora_Main.password = Calculadora_Main.password;
            if (passWord.equals(Calculadora_Main.password)) {
                dispose();
                System.out.println("Contraseña correcta!");
                Calculadora_Main.correctPassword = true;
                break;
            }
        }
        /////////////////////////MENSAJE PARA COMPROBAR QUE EL HILO TERMINA///////////////////////////
        System.out.println("-------------------------------------------------------------------");
        System.out.println("////////////////////////////////////////////////////////////////////");
        System.out.println("-------------------------------------------------------------------");
    }
}
