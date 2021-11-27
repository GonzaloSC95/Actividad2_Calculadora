package Vista;

import Respuestas.RespuestaBienvenidaUser;
import Respuestas.RespuestaFuncionNodisponible;
import Respuestas.RespuestaPasswdAdvicce;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Gonzalo
 */
public class Calculadora_Main extends javax.swing.JFrame {

    /**
     * Constructor Vista Calculadora
     */
    public Calculadora_Main() {
        try {
            initComponents();
            setLocationRelativeTo(null);
            setTitle("CALCULATOR");
            setIconImage(Toolkit.getDefaultToolkit().getImage("img\\calculator.png"));
        } catch (Exception e) {
            System.err.println(e.getMessage() + " - " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        dividir = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        raizCubica = new javax.swing.JButton();
        raizCuadrada = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        panelPantallas = new javax.swing.JPanel();
        displayText = new javax.swing.JLabel();
        display1 = new javax.swing.JLabel();
        display2 = new javax.swing.JLabel();
        PanelNumeros = new javax.swing.JPanel();
        num3 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        coma = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(425, 728));
        setMinimumSize(new java.awt.Dimension(425, 728));
        setResizable(false);
        setSize(getPreferredSize());

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setMaximumSize(getMaximumSize());
        panel.setMinimumSize(getMinimumSize());

        dividir.setBackground(new java.awt.Color(245, 153, 6));
        dividir.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        dividir.setForeground(new java.awt.Color(250, 250, 250));
        dividir.setText("÷");
        dividir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dividir.setBorderPainted(false);
        dividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dividir.setFocusPainted(false);
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        multiplicar.setBackground(new java.awt.Color(245, 153, 6));
        multiplicar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        multiplicar.setForeground(new java.awt.Color(250, 250, 250));
        multiplicar.setText("x");
        multiplicar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multiplicar.setBorderPainted(false);
        multiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplicar.setFocusPainted(false);
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        restar.setBackground(new java.awt.Color(245, 153, 6));
        restar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        restar.setForeground(new java.awt.Color(250, 250, 250));
        restar.setText("-");
        restar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        restar.setBorderPainted(false);
        restar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restar.setFocusPainted(false);
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });

        sumar.setBackground(new java.awt.Color(245, 153, 6));
        sumar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        sumar.setForeground(new java.awt.Color(250, 250, 250));
        sumar.setText("+");
        sumar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sumar.setBorderPainted(false);
        sumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumar.setFocusPainted(false);
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });

        raizCubica.setBackground(multiplicar.getBackground());
        raizCubica.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        raizCubica.setForeground(new java.awt.Color(250, 250, 250));
        raizCubica.setText("√3");
        raizCubica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raizCubica.setBorderPainted(false);
        raizCubica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raizCubica.setFocusPainted(false);
        raizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizCubicaActionPerformed(evt);
            }
        });

        raizCuadrada.setBackground(multiplicar.getBackground());
        raizCuadrada.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        raizCuadrada.setForeground(new java.awt.Color(250, 250, 250));
        raizCuadrada.setText("√2");
        raizCuadrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raizCuadrada.setBorderPainted(false);
        raizCuadrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raizCuadrada.setFocusPainted(false);
        raizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizCuadradaActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(49, 49, 49));
        borrar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        borrar.setForeground(new java.awt.Color(250, 250, 250));
        borrar.setText("C");
        borrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrar.setBorderPainted(false);
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.setFocusPainted(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(49, 49, 49));
        salir.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(250, 250, 250));
        salir.setText("OFF");
        salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.setBorderPainted(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(49, 49, 49));
        igual.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(250, 250, 250));
        igual.setText("=");
        igual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        igual.setBorderPainted(false);
        igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        igual.setFocusPainted(false);
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        minusButton.setBackground(new java.awt.Color(49, 49, 49));
        minusButton.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        minusButton.setForeground(new java.awt.Color(250, 250, 250));
        minusButton.setText("+/-");
        minusButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minusButton.setBorderPainted(false);
        minusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minusButton.setFocusPainted(false);
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        panelPantallas.setBackground(panel.getBackground());
        panelPantallas.setLayout(null);

        displayText.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        displayText.setForeground(java.awt.Color.lightGray);
        displayText.setText("........");
        displayText.setAlignmentX(0.5F);
        panelPantallas.add(displayText);
        displayText.setBounds(0, 0, 380, 30);

        display1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        display1.setForeground(java.awt.Color.white);
        display1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        display1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelPantallas.add(display1);
        display1.setBounds(20, 20, 350, 140);

        display2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        display2.setForeground(java.awt.Color.white);
        display2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        display2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelPantallas.add(display2);
        display2.setBounds(20, 20, 350, 140);

        PanelNumeros.setBackground(panel.getBackground());

        num3.setBackground(new java.awt.Color(49, 49, 49));
        num3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num3.setForeground(new java.awt.Color(250, 250, 250));
        num3.setText("3");
        num3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num3.setBorderPainted(false);
        num3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num3.setFocusPainted(false);
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num8.setBackground(new java.awt.Color(49, 49, 49));
        num8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num8.setForeground(new java.awt.Color(250, 250, 250));
        num8.setText("8");
        num8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num8.setBorderPainted(false);
        num8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num8.setFocusPainted(false);
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num2.setBackground(new java.awt.Color(49, 49, 49));
        num2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num2.setForeground(new java.awt.Color(250, 250, 250));
        num2.setText("2");
        num2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num2.setBorderPainted(false);
        num2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num2.setFocusPainted(false);
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num7.setBackground(new java.awt.Color(49, 49, 49));
        num7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num7.setForeground(new java.awt.Color(250, 250, 250));
        num7.setText("7");
        num7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num7.setBorderPainted(false);
        num7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num7.setFocusPainted(false);
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        coma.setBackground(new java.awt.Color(49, 49, 49));
        coma.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        coma.setForeground(new java.awt.Color(250, 250, 250));
        coma.setText(",");
        coma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coma.setBorderPainted(false);
        coma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coma.setFocusPainted(false);
        coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaActionPerformed(evt);
            }
        });

        num1.setBackground(new java.awt.Color(49, 49, 49));
        num1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num1.setForeground(new java.awt.Color(250, 250, 250));
        num1.setText("1");
        num1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num1.setBorderPainted(false);
        num1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num1.setFocusPainted(false);
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num0.setBackground(new java.awt.Color(49, 49, 49));
        num0.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num0.setForeground(new java.awt.Color(250, 250, 250));
        num0.setText("0");
        num0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num0.setBorderPainted(false);
        num0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num0.setFocusPainted(false);
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        num4.setBackground(new java.awt.Color(49, 49, 49));
        num4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num4.setForeground(new java.awt.Color(250, 250, 250));
        num4.setText("4");
        num4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num4.setBorderPainted(false);
        num4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num4.setFocusPainted(false);
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setBackground(new java.awt.Color(49, 49, 49));
        num5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num5.setForeground(new java.awt.Color(250, 250, 250));
        num5.setText("5");
        num5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num5.setBorderPainted(false);
        num5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num5.setFocusPainted(false);
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setBackground(new java.awt.Color(49, 49, 49));
        num6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num6.setForeground(new java.awt.Color(250, 250, 250));
        num6.setText("6");
        num6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num6.setBorderPainted(false);
        num6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num6.setFocusPainted(false);
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num9.setBackground(new java.awt.Color(49, 49, 49));
        num9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        num9.setForeground(new java.awt.Color(250, 250, 250));
        num9.setText("9");
        num9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num9.setBorderPainted(false);
        num9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num9.setFocusPainted(false);
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelNumerosLayout = new javax.swing.GroupLayout(PanelNumeros);
        PanelNumeros.setLayout(PanelNumerosLayout);
        PanelNumerosLayout.setHorizontalGroup(
            PanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNumerosLayout.createSequentialGroup()
                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNumerosLayout.createSequentialGroup()
                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNumerosLayout.createSequentialGroup()
                        .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(coma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNumerosLayout.createSequentialGroup()
                        .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelNumerosLayout.setVerticalGroup(
            PanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PanelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(raizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(raizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(PanelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(restar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(PanelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(restar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ///////////////////////////////////////////////////ACCIONES/////////////////////////////////////////////////////////////////////
    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        //la operación Dividir se activa
        div = true;
        //La coma se vuelve a habilitar
        hayComa = false;
        //////////////////////////////////////////////////

        try {
            if (divClicks == 0 && numerosClick == true) {
                numero1 = Double.parseDouble(display1.getText().replace(",", "."));
                //Click +1
                divClicks++;
            }
            ///////////////////////////////////////
            ///////////////////////////////////////
        } catch (NumberFormatException e) {
            System.err.println(e.getLocalizedMessage());
        }
        display1.setText("");
        //------------DEBUG--------------------
        System.out.println("---BOTON DIVIDIR----------Mult Clicks " + divClicks + " ---Numeros Clicks--->" + (numerosClick = false) + "---------------------");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
        System.out.println("Resultado: " + resultado);
        System.out.println("Memoria: " + memoria);
    }//GEN-LAST:event_dividirActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        //la operación Multiplicar se activa
        mult = true;
        //La coma se vuelve a habilitar
        hayComa = false;
        //////////////////////////////////////////////////

        try {
            if (multClicks == 0 && numerosClick == true) {
                numero1 = Double.parseDouble(display1.getText().replace(",", "."));
                //Click +1
                multClicks++;
            }
            ///////////////////////////////////////
            ///////////////////////////////////////
        } catch (NumberFormatException e) {
            System.err.println(e.getLocalizedMessage());
        }
        display1.setText("");
        //------------DEBUG--------------------
        System.out.println("---BOTON MULTIPLICAR----------Mult Clicks " + multClicks + " ---Numeros Clicks--->" + (numerosClick = false) + "---------------------");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
        System.out.println("Resultado: " + resultado);
        System.out.println("Memoria: " + memoria);
    }//GEN-LAST:event_multiplicarActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        //la operación resta se activa
        rest = true;
        //La coma se vuelve a habilitar
        hayComa = false;
        //////////////////////////////////////////////////

        try {
            if (restClicks == 0 && numerosClick == true) {
                numero1 = Double.parseDouble(display1.getText().replace(",", "."));
                //Click +1
                restClicks++;
            }
            ///////////////////////////////////////
            ///////////////////////////////////////
        } catch (NumberFormatException e) {
            System.err.println(e.getLocalizedMessage());
        }
        display1.setText("");
        //------------DEBUG--------------------
        System.out.println("---BOTON RESTA----------Resta Clicks " + restClicks + " ---Numeros Clicks--->" + (numerosClick = false) + "---------------------");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
        System.out.println("Resultado: " + resultado);
        System.out.println("Memoria: " + memoria);
    }//GEN-LAST:event_restarActionPerformed

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
        //la operación suma se activa
        sum = true;
        //La coma se vuelve a habilitar
        hayComa = false;
        //////////////////////////////////////////////////

        try {
            if (sumClicks == 0 && numerosClick == true) {
                numero1 = Double.parseDouble(display1.getText().replace(",", "."));
                //Click +1
                sumClicks++;
            }
            ///////////////////////////////////////
            ///////////////////////////////////////
        } catch (NumberFormatException e) {
            System.err.println(e.getLocalizedMessage());
        }
        display1.setText("");
        //------------DEBUG--------------------
        System.out.println("---BOTON SUMAR----------Suma Clicks " + sumClicks + " ---Numeros Clicks--->" + (numerosClick = false) + "---------------------");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
        System.out.println("Resultado: " + resultado);
        System.out.println("Memoria: " + memoria);
    }//GEN-LAST:event_sumarActionPerformed

    private void raizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizCubicaActionPerformed
        try {

            double num = 0;
            if (display1.getText().isEmpty()) {
                num = Double.parseDouble(display2.getText());
            } else if (display2.getText().isEmpty()) {
                num = Double.parseDouble(display1.getText());
            }
            if (correctPassword == false) {
                //////////////////////AUDIO/////////////////////////////////////////
                new Thread(new RespuestaPasswdAdvicce()).start();
                /////////////////////////////////////////////
                /////////////////////////////////////////////////////
                ////////////////////////////////////////////
                new Thread(new DialogoContrasenia()).start();
            }
            ///////////////////////////////////////
            if (correctPassword == true) {
                double resultado = Math.cbrt(num);
                display2.setText(String.valueOf(resultado));
                displayText.setText("Raiz 3 de " + num + " = " + resultado);
                memoria = resultado;
                openMemoria = true;
                display1.setText("");
                ////////////////////////////
                correctPassword = false;
                password = "contraseña";
                ////////////////////////////
                System.out.println("Raiz 3 de " + num + " = " + resultado);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage() + " - " + e.getLocalizedMessage());
            if (e.getMessage().equalsIgnoreCase("empty string")) {
                Player rep;
                try {
                    rep = new Player(new FileInputStream("mp3\\numVacio.mp3"));
                    rep.play();
                } catch (FileNotFoundException | JavaLayerException ex) {

                }

            }
        }

    }//GEN-LAST:event_raizCubicaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        borrarContenidoCaja();
    }//GEN-LAST:event_borrarActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        pulsarTeclaNumero(num1.getText());
        delResultado();
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        pulsarTeclaNumero(num2.getText());
        delResultado();
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        pulsarTeclaNumero(num3.getText());
        delResultado();
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        pulsarTeclaNumero(num4.getText());
        delResultado();
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        pulsarTeclaNumero(num5.getText());
        delResultado();
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        pulsarTeclaNumero(num6.getText());
        delResultado();
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        pulsarTeclaNumero(num7.getText());
        delResultado();
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        pulsarTeclaNumero(num8.getText());
        delResultado();
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        pulsarTeclaNumero(num9.getText());
        delResultado();
    }//GEN-LAST:event_num9ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        pulsarTeclaNumero(num0.getText());
        delResultado();
    }//GEN-LAST:event_num0ActionPerformed

    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
        delResultado();
        if (!hayComa) {
            pulsarTeclaNumero(".");
        }

    }//GEN-LAST:event_comaActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        try {
            hayComa = false;
            ///////////////////////////////////SI SUMA = TRUE //////////////////////////////////////////////
            if (sum) {
                if (sumClicks == 1 && memoria == 0 && numerosClick == true) {
                    numero2 = Double.parseDouble(display1.getText().replace(",", "."));
                    resultado = numero1 + numero2;
                    memoria = resultado;
                    /////////////////////////
                    displayText.setText(numero1 + " + " + numero2 + " = " + resultado);///Operacion texto
                    display2.setText(String.valueOf(resultado));
                    display1.setText("");
                    numero2 = 0;
                    resultado = 0;
                    /////////////////////////
                    sumClicks = 0;
                    openMemoria = true;
                    System.out.println("Boton = -->Suma Clicks " + sumClicks + "---Numeros Clicks--->" + numerosClick);
                } else if (memoria > 0 && numerosClick == false || memoria < 0) {
                    double auxMemoria = memoria;
                    memoria = memoria + numero1;
                    displayText.setText(auxMemoria + " + " + numero1 + " = " + memoria);///Operacion texto
                    display2.setText(String.valueOf(memoria));
                    display1.setText("");
                    sumClicks = 0;
                    System.out.println("Boton = -->Suma Clicks " + sumClicks + "---Numeros Clicks--->" + numerosClick);
                } else if (sumClicks == 1 && memoria > 0 && numerosClick == true) {
                    numero2 = Double.parseDouble(display1.getText().replace(",", "."));
                    resultado = numero1 + numero2;
                    memoria = resultado;
                    /////////////////////////
                    displayText.setText(numero1 + " + " + numero2 + " = " + resultado);///Operacion texto
                    display2.setText(String.valueOf(resultado));
                    display1.setText("");
                    numero2 = 0;
                    resultado = 0;
                    /////////////////////////
                    sumClicks = 0;
                    System.out.println("Boton = -->Suma Clicks " + sumClicks + "---Numeros Clicks--->" + numerosClick);
                }
                sum = false;
            }
            /////////////////////////////////////SI RESTA = TRUE////////////////////////////////
            if (rest) {
                if (restClicks == 1 && openMemoria == false && numerosClick == true) {
                    numero2 = Double.parseDouble(display1.getText().replace(",", "."));
                    resultado = numero1 - numero2;
                    memoria = resultado;
                    /////////////////////////
                    displayText.setText(numero1 + " - " + numero2 + " = " + resultado);///Operacion texto
                    display2.setText(String.valueOf(resultado));
                    display1.setText("");
                    numero2 = 0;
                    resultado = 0;
                    openMemoria = true;
                    /////////////////////////
                    restClicks = 0;
                    System.out.println("Boton = -->Resta Clicks " + restClicks + "---Numeros Clicks--->" + numerosClick);
                } else if (openMemoria == true && numerosClick == false) {
                    double auxMemoria = memoria;
                    memoria = memoria - numero1;
                    displayText.setText(auxMemoria + " - " + numero1 + " = " + memoria);///Operacion texto
                    display2.setText(String.valueOf(memoria));
                    display1.setText("");
                    restClicks = 0;
                    System.out.println("Boton = -->Resta Clicks " + restClicks + "---Numeros Clicks--->" + numerosClick);
                } else if (restClicks == 1 && openMemoria == true && numerosClick == true) {
                    numero2 = Double.parseDouble(display1.getText().replace(",", "."));
                    resultado = numero1 - numero2;
                    memoria = resultado;
                    /////////////////////////
                    displayText.setText(numero1 + " - " + numero2 + " = " + resultado);///Operacion texto
                    display2.setText(String.valueOf(resultado));
                    display1.setText("");
                    numero2 = 0;
                    resultado = 0;
                    /////////////////////////
                    restClicks = 0;
                    System.out.println("Boton = -->Resta Clicks " + restClicks + "---Numeros Clicks--->" + numerosClick);
                }
                rest = false;
            }
            /////////////////////////////////////SI MULTIPLICAR = TRUE////////////////////////////////
            if (mult) {
                if (multClicks == 1 && openMemoria == false && numerosClick == true) {
                    numero2 = Double.parseDouble(display1.getText().replace(",", "."));
                    resultado = numero1 * numero2;
                    memoria = resultado;
                    /////////////////////////
                    displayText.setText(numero1 + " * " + numero2 + " = " + resultado);///Operacion texto
                    display2.setText(String.valueOf(resultado));
                    display1.setText("");
                    numero2 = 0;
                    resultado = 0;
                    openMemoria = true;
                    /////////////////////////
                    multClicks = 0;
                    System.out.println("Boton = -->Multiplicar Clicks " + multClicks + "---Numeros Clicks--->" + numerosClick);
                } else if (openMemoria == true && numerosClick == false) {
                    double auxMemoria = memoria;
                    memoria = memoria * numero1;
                    displayText.setText(auxMemoria + " * " + numero1 + " = " + memoria);///Operacion texto
                    display2.setText(String.valueOf(memoria));
                    display1.setText("");
                    multClicks = 0;
                    System.out.println("Boton = -->Multiplicar Clicks " + multClicks + "---Numeros Clicks--->" + numerosClick);
                } else if (multClicks == 1 && openMemoria == true && numerosClick == true) {
                    numero2 = Double.parseDouble(display1.getText().replace(",", "."));
                    resultado = numero1 * numero2;
                    memoria = resultado;
                    /////////////////////////
                    displayText.setText(numero1 + " * " + numero2 + " = " + resultado);///Operacion texto
                    display2.setText(String.valueOf(resultado));
                    display1.setText("");
                    numero2 = 0;
                    resultado = 0;
                    /////////////////////////
                    multClicks = 0;
                    System.out.println("Boton = -->Multiplicar Clicks " + multClicks + "---Numeros Clicks--->" + numerosClick);
                }
                mult = false;
            }

            /////////////////////////////////////SI DIVIDIR = TRUE////////////////////////////////
            if (div) {
                if (divClicks == 1 && openMemoria == false && numerosClick == true) {
                    numero2 = Double.parseDouble(display1.getText().replace(",", "."));
                    resultado = numero1 / numero2;
                    memoria = resultado;
                    /////////////////////////
                    displayText.setText(numero1 + " / " + numero2 + " = " + resultado);///Operacion texto
                    display2.setText(String.valueOf(resultado));
                    display1.setText("");
                    numero2 = 0;
                    resultado = 0;
                    openMemoria = true;
                    /////////////////////////
                    divClicks = 0;
                    System.out.println("Boton = -->Dividir Clicks " + divClicks + "---Numeros Clicks--->" + numerosClick);
                } else if (openMemoria == true && numerosClick == false) {
                    double auxMemoria = memoria;
                    memoria = memoria / numero1;
                    displayText.setText(auxMemoria + " / " + numero1 + " = " + memoria);///Operacion texto
                    display2.setText(String.valueOf(memoria));
                    display1.setText("");
                    divClicks = 0;
                    System.out.println("Boton = -->Dividir Clicks " + divClicks + "---Numeros Clicks--->" + numerosClick);
                } else if (divClicks == 1 && openMemoria == true && numerosClick == true) {
                    numero2 = Double.parseDouble(display1.getText().replace(",", "."));
                    resultado = numero1 / numero2;
                    memoria = resultado;
                    /////////////////////////
                    displayText.setText(numero1 + " / " + numero2 + " = " + resultado);///Operacion texto
                    display2.setText(String.valueOf(resultado));
                    display1.setText("");
                    numero2 = 0;
                    resultado = 0;
                    /////////////////////////
                    divClicks = 0;
                    System.out.println("Boton = -->Dividir Clicks " + divClicks + "---Numeros Clicks--->" + numerosClick);
                }
                div = false;
            }

        } catch (NumberFormatException e) {
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
            display2.setText("0");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("------------- BOTON =  ---------------------------");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
        System.out.println("Resultado: " + resultado);
        System.out.println("Memoria: " + memoria);
    }//GEN-LAST:event_igualActionPerformed

    private void raizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizCuadradaActionPerformed
        try {
            new Thread(new DialogofuncionNoDisponible()).start();
            ///////////////////////////////////
            new Thread(new RespuestaFuncionNodisponible()).start();
            ///////////////////////////////////////
            display2.setText("");
            display1.setText("");
            displayText.setText("");
            /////////////////////////////////////
        } catch (Exception e) {
        }

    }//GEN-LAST:event_raizCuadradaActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        ///////////////SI LAS CAJA DE TEXTO 1 NO ESTA VACIA/////////////////
        if (!display1.getText().isEmpty()) {
            ///////////////SI LAS CAJA DE TEXTO 1 NO CONTIENE YA UN  - /////////////////
            if (!display1.getText().contains("-")) {
                display1.setText("-" + display1.getText());
            } else {
                display1.setText(display1.getText().replace("-", ""));
            }
            ///////////////SI LAS CAJA DE TEXTO 2 NO ESTA VACIA/////////////////
        } else if (!display2.getText().isEmpty()) {
            ///////////////SI LAS CAJA DE TEXTO 2 NO CONTIENE YA UN  - /////////////////
            if (!display2.getText().contains("-")) {
                display2.setText("-" + display2.getText());
            } else {
                display2.setText(display2.getText().replace("-", ""));
            }
        }
    }//GEN-LAST:event_minusButtonActionPerformed

    ///////////////////METODOS////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Método para borrar el contenido de las cajas
     */
    public void borrarContenidoCaja() {
        resultado = 0;
        memoria = 0;
        numero1 = 0;
        numero2 = 0;
        //////////////////
        display1.setText("");
        display2.setText("");
        displayText.setText("");
        /////////////////////
        hayComa = false;
        numerosClick = false;
        openMemoria = false;
        ////////////////
        divClicks = 0;
        sumClicks = 0;
        restClicks = 0;
        divClicks = 0;
    }

    //--------------------------------
    /**
     * Método que detecta cuando haces click en un numero y le aigna el numero o
     * carácter correspondiente
     *
     * @param i
     */
    public void pulsarTeclaNumero(String i) {
        if (i.equalsIgnoreCase(",")) {
            hayComa = true;
            display1.setText(display1.getText() + i);
        } else {
            display1.setText(display1.getText() + i);
        }
        display2.setText("");
        //Clicks en tecla número
        numerosClick = true;
        System.out.println("---------------Numeros Click " + numerosClick + "---------------------");
    }

    //--------------------------------------
    /**
     * Método para borrar el resultado final
     */
    public void delResultado() {
        display2.setText("");
    }

    //////////////////////MAIN//////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Método main
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Calculadora_Main c = new Calculadora_Main();
            //-----------------------------
            ///////////////////////////MOSTRAMOS DIALOGO DE REGISTRO/////////////////////////////////////
            /////////////////////////CHEQUEAMOS SI EL USUARIO ESTA REGISTRADO///////////////////////////////////////
            Thread hiloAccesoUser = new Thread(new DialogoAccesoUsuario());
            hiloAccesoUser.start();
            while (hiloAccesoUser.isAlive()) {

            }
            new Thread(new RespuestaBienvenidaUser()).start();
            /////////////////////////////////////////////////////////////
            c.setVisible(true);
            //////////////////////////////////////////////////////////////////////////////////////////////////
            c.displayText.setText("Bienvenid@ " + userName);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

    ////////////////ATRIBUTOS/////////////////////////////////////////////////////////////////////////////////////////////////////////
    private boolean hayComa;
    //--------------------------
    private boolean div = false;
    private boolean mult = false;
    private boolean sum = false;
    private boolean rest = false;
    /////////////////////
    private double resultado;
    private double memoria;
    private double numero1;
    private double numero2;
    ////////////////////////
    private int sumClicks = 0;
    private int restClicks = 0;
    private int multClicks = 0;
    private int divClicks = 0;
    //////////////////////////////////////
    private boolean numerosClick = false;
    private boolean openMemoria = false;
    /////////////////////////////////////
    private DialogoAccesoUsuario acceso;
    private DialogoContrasenia contrasenia;
    private DialogofuncionNoDisponible mensajeError;
    ////////////////////////////////////////

    /**
     * Atributo estático que recoge el nombre del usuario logeado
     */
    public static String userName = "nombre";
    ///////////////////////////////////////////////

    /**
     * Atributo estático que recoge la contraseña del usuario logeado
     */
    public static String password = "contrasenia";

    /**
     * Atributo estático que comprueba si la contraseña introducida por el
     * usuario logeado, es correcta
     */
    public static boolean correctPassword = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelNumeros;
    private javax.swing.JButton borrar;
    private javax.swing.JButton coma;
    private javax.swing.JLabel display1;
    private javax.swing.JLabel display2;
    private javax.swing.JLabel displayText;
    private javax.swing.JButton dividir;
    private javax.swing.JButton igual;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelPantallas;
    private javax.swing.JButton raizCuadrada;
    private javax.swing.JButton raizCubica;
    private javax.swing.JButton restar;
    private javax.swing.JButton salir;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
