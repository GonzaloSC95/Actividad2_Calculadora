package Vista;

import java.awt.Toolkit;
import java.util.Arrays;

/**
 *
 * @author Gonzalo
 */
public class DialogoAccesoUsuario extends javax.swing.JFrame implements Runnable {

    /**
     *Cosntructor para el cuadro de dialogo de acceso a la calculadora
     */
    public DialogoAccesoUsuario() {
        setTitle("LOGIN");
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img\\calculator.png"));
        userCheck.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        userCheck = new javax.swing.JTextField();
        imgUser = new javax.swing.JLabel();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(java.awt.Color.black);

        userCheck.setBackground(java.awt.Color.black);
        userCheck.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        userCheck.setForeground(java.awt.Color.white);
        userCheck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 153, 6), 2, true));
        userCheck.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        userCheck.setSelectedTextColor(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        userCheck.setSelectionColor(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        imgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N

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
                .addGap(29, 29, 29)
                .addComponent(imgUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(135, 135, 135))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgUser)
                    .addComponent(userCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login
        Calculadora_Main.userName = userCheck.getText();
        userCheck.setText("");
        userCheck.requestFocus();
    }//GEN-LAST:event_login

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgUser;
    private javax.swing.JButton login;
    private javax.swing.JPanel panel;
    public static javax.swing.JTextField userCheck;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        setVisible(true);
        /////////////////////////////////////////////////////////
        String[] usuariosRegistrados = {"Gonzalo", "Raquel"};
        /////////////////////USUARIOS EN BBDD//////////////////////////////////////////////////
        System.out.println("Usuarios registrados en la BBDD: " + Arrays.toString(usuariosRegistrados));
        /////////////////////////INICIALIZAMOS COMPONENTES//////////////////////////////////////////////
        while (true) {
            Calculadora_Main.userName = Calculadora_Main.userName;
            if (Calculadora_Main.userName.equals(usuariosRegistrados[0])
                    || Calculadora_Main.userName.equals(usuariosRegistrados[1])) {
                dispose();
                break;
            }
        }

        System.out.println("Usuario correcto: " + Calculadora_Main.userName);
        System.out.println("---------------------------------------------------");

    }

}
