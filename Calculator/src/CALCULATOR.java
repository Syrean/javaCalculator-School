
public class CALCULATOR extends javax.swing.JFrame {

    /**
     * Creates new form CALCULATOR
     */
    
    double num1;
    double num2;
    
    double result;
    
    String operators;
    
    
    
            
    public CALCULATOR() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(16, 3, 79));
        setMaximumSize(new java.awt.Dimension(565, 880));
        setMinimumSize(new java.awt.Dimension(565, 880));
        setPreferredSize(new java.awt.Dimension(565, 880));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(31, 40, 145));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 72)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 530, 140));

        jButton2.setBackground(new java.awt.Color(18, 23, 84));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("DEL");
        jButton2.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jButton3.setBackground(new java.awt.Color(18, 23, 84));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("AC");
        jButton3.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jButton4.setBackground(new java.awt.Color(18, 23, 84));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setText("+/-");
        jButton4.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jButton5.setBackground(new java.awt.Color(18, 23, 84));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setText("+");
        jButton5.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jButton6.setBackground(new java.awt.Color(77, 82, 165));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setText("FLR");
        jButton6.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jButton7.setBackground(new java.awt.Color(77, 82, 165));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setText("CEIL");
        jButton7.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jButton8.setBackground(new java.awt.Color(77, 82, 165));
        jButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton8.setText("INT");
        jButton8.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jButton9.setBackground(new java.awt.Color(47, 53, 135));
        jButton9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton9.setText("7");
        jButton9.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jButton10.setBackground(new java.awt.Color(47, 53, 135));
        jButton10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton10.setText("8");
        jButton10.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jButton11.setBackground(new java.awt.Color(47, 53, 135));
        jButton11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton11.setText("9");
        jButton11.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jButton12.setBackground(new java.awt.Color(18, 23, 84));
        jButton12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton12.setText("-");
        jButton12.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jButton13.setBackground(new java.awt.Color(77, 82, 165));
        jButton13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton13.setText("//");
        jButton13.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jButton14.setBackground(new java.awt.Color(77, 82, 165));
        jButton14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton14.setText("%");
        jButton14.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jButton15.setBackground(new java.awt.Color(77, 82, 165));
        jButton15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton15.setText("N!");
        jButton15.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jButton16.setBackground(new java.awt.Color(47, 53, 135));
        jButton16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton16.setText("4");
        jButton16.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jButton17.setBackground(new java.awt.Color(47, 53, 135));
        jButton17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton17.setText("5");
        jButton17.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jButton18.setBackground(new java.awt.Color(47, 53, 135));
        jButton18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton18.setText("6");
        jButton18.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jButton19.setBackground(new java.awt.Color(18, 23, 84));
        jButton19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton19.setText("x");
        jButton19.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jButton20.setBackground(new java.awt.Color(77, 82, 165));
        jButton20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton20.setText("√");
        jButton20.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jButton21.setBackground(new java.awt.Color(77, 82, 165));
        jButton21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton21.setText("3√");
        jButton21.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jButton22.setBackground(new java.awt.Color(77, 82, 165));
        jButton22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\sumation.png")); // NOI18N
        jButton22.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jButton23.setBackground(new java.awt.Color(47, 53, 135));
        jButton23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton23.setText("1");
        jButton23.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jButton24.setBackground(new java.awt.Color(47, 53, 135));
        jButton24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton24.setText("2");
        jButton24.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jButton25.setBackground(new java.awt.Color(47, 53, 135));
        jButton25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton25.setText("3");
        jButton25.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jButton26.setBackground(new java.awt.Color(18, 23, 84));
        jButton26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton26.setText("÷");
        jButton26.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jButton27.setBackground(new java.awt.Color(77, 82, 165));
        jButton27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\expo.png")); // NOI18N
        jButton27.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        jButton28.setBackground(new java.awt.Color(77, 82, 165));
        jButton28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\double expo.png")); // NOI18N
        jButton28.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jButton29.setBackground(new java.awt.Color(77, 82, 165));
        jButton29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\prod.png")); // NOI18N
        jButton29.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jButton30.setBackground(new java.awt.Color(47, 53, 135));
        jButton30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton30.setText("0");
        jButton30.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jButton31.setBackground(new java.awt.Color(18, 23, 84));
        jButton31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton31.setText(".");
        jButton31.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jButton32.setBackground(new java.awt.Color(31, 40, 145));
        jButton32.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton32.setText("=");
        jButton32.setPreferredSize(new java.awt.Dimension(140, 70));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        jButton33.setBackground(new java.awt.Color(77, 82, 165));
        jButton33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\double sumation.png")); // NOI18N
        jButton33.setPreferredSize(new java.awt.Dimension(110, 70));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, -1));

        jButton34.setBackground(new java.awt.Color(77, 82, 165));
        jButton34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\double prod.png")); // NOI18N
        jButton34.setPreferredSize(new java.awt.Dimension(110, 70));
        getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        jButton35.setBackground(new java.awt.Color(77, 82, 165));
        jButton35.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton35.setText("SET");
        jButton35.setPreferredSize(new java.awt.Dimension(280, 70));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jButton36.setBackground(new java.awt.Color(77, 82, 165));
        jButton36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton36.setText("log ₂ x");
        jButton36.setPreferredSize(new java.awt.Dimension(110, 70));
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, -1, -1));

        jButton37.setBackground(new java.awt.Color(77, 82, 165));
        jButton37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton37.setText("log x");
        jButton37.setPreferredSize(new java.awt.Dimension(110, 70));
        getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, -1));

        jButton38.setBackground(new java.awt.Color(77, 82, 165));
        jButton38.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton38.setText("A");
        jButton38.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, -1));

        jButton39.setBackground(new java.awt.Color(77, 82, 165));
        jButton39.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton39.setText("B");
        jButton39.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, -1, -1));

        jButton40.setBackground(new java.awt.Color(77, 82, 165));
        jButton40.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton40.setText("C");
        jButton40.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, -1, -1));

        jButton41.setBackground(new java.awt.Color(77, 82, 165));
        jButton41.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton41.setText("D");
        jButton41.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, -1, -1));

        jButton42.setBackground(new java.awt.Color(77, 82, 165));
        jButton42.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton42.setText("a! + b!");
        jButton42.setPreferredSize(new java.awt.Dimension(110, 70));
        getContentPane().add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 680, -1, -1));

        jButton43.setBackground(new java.awt.Color(77, 82, 165));
        jButton43.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton43.setText("a! / b!");
        jButton43.setPreferredSize(new java.awt.Dimension(110, 70));
        getContentPane().add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 680, -1, -1));

        jButton44.setBackground(new java.awt.Color(77, 82, 165));
        jButton44.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton44.setText("x y");
        jButton44.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, -1, -1));

        jButton45.setBackground(new java.awt.Color(77, 82, 165));
        jButton45.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton45.setText("x + y");
        jButton45.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, -1, -1));

        jButton46.setBackground(new java.awt.Color(77, 82, 165));
        jButton46.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton46.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\expo.png")); // NOI18N
        jButton46.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 760, -1, -1));

        jButton47.setBackground(new java.awt.Color(77, 82, 165));
        jButton47.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton47.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\sub.png")); // NOI18N
        jButton47.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, -1, -1));

        jButton48.setBackground(new java.awt.Color(77, 82, 165));
        jButton48.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton48.setText("x + C");
        jButton48.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 760, -1, -1));

        jButton49.setBackground(new java.awt.Color(77, 82, 165));
        jButton49.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton49.setIcon(new javax.swing.ImageIcon("C:\\Users\\gamer\\Desktop\\xc.png")); // NOI18N
        jButton49.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 760, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(555, 880));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textWindow(String text){
        String windowNumber = jTextField1.getText()+text;
        jTextField1.setText(windowNumber);
    } 
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //DEL
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Add
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operators = "+"; 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // Number 0
        textWindow("0");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // Number 1
        textWindow("1");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // Number 2
        textWindow("2");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // Number 3
        textWindow("3");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // Number 4
        textWindow("4");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // Number 5
        textWindow("5");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // Number 6
        textWindow("6");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Number 7
        textWindow("7");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Number 8
        textWindow("8");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // Number 9
        textWindow("9");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // Divide
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operators = "/"; 
        
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // Subtract
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operators = "-"; 
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // Multiply
        num1 = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operators = "*"; 
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // Equals
        num2 = Double.parseDouble(jTextField1.getText());
        
        if(operators == "+"){
            result = num1 + num2;
            jTextField1.setText(String.valueOf(result));
        }else if(operators == "-"){
            result = num1 - num2;
            jTextField1.setText(String.valueOf(result));
        }else if(operators == "*"){
            result = num1 * num2;
            jTextField1.setText(String.valueOf(result));
        }else if(operators == "/"){
            result = num1 / num2;
            jTextField1.setText(String.valueOf(result));
        }
        
        
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CALCULATOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
