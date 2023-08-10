
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SetPassword extends javax.swing.JFrame {

    public static Map<JLabel, String> map;

    public static Stack<String> s;

    public static String pass, blocklist, imagelist, layerlist, task;

    public static boolean layer1flag, layer2flag, layer3flag;

    public SetPassword() {
        initComponents();

        map = new HashMap<>();
        s = new Stack<>();
        pass = "";
        blocklist = "";
        imagelist = "";
        layerlist = "";

        utils.setImages();

        layer1flag = true;
        layer2flag = true;
        layer3flag = true;

        Layer1.setVisible(true);
        Layer2.setVisible(false);
        Layer3.setVisible(false);

        L1next.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        centralPane = new javax.swing.JLayeredPane();
        Layer1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        L1next = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Layer2 = new javax.swing.JPanel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        L2next = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Layer3 = new javax.swing.JPanel();
        l25 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();
        l30 = new javax.swing.JLabel();
        l31 = new javax.swing.JLabel();
        l32 = new javax.swing.JLabel();
        l33 = new javax.swing.JLabel();
        l34 = new javax.swing.JLabel();
        l35 = new javax.swing.JLabel();
        l36 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        L3finish = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Set Password");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.CardLayout());

        centralPane.setBackground(new java.awt.Color(255, 255, 255));
        centralPane.setLayout(new java.awt.CardLayout());

        Layer1.setBackground(new java.awt.Color(255, 255, 255));
        Layer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 176, 0), 4));
        Layer1.setPreferredSize(new java.awt.Dimension(829, 675));

        l1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });

        l2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });

        l4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });

        l5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
        });

        l6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });

        l7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });

        l8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });

        l9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l9MouseClicked(evt);
            }
        });

        l10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l10MouseClicked(evt);
            }
        });

        l11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l11MouseClicked(evt);
            }
        });

        l12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l12MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(56, 176, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Canncel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        L1next.setBackground(new java.awt.Color(176, 82, 240));
        L1next.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        L1next.setText("Next");
        L1next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1nextActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(56, 176, 0));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setText("Select Image");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/select_icon.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Layer1Layout = new javax.swing.GroupLayout(Layer1);
        Layer1.setLayout(Layer1Layout);
        Layer1Layout.setHorizontalGroup(
            Layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Layer1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(Layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Layer1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L1next, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Layer1Layout.createSequentialGroup()
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Layer1Layout.createSequentialGroup()
                            .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Layer1Layout.createSequentialGroup()
                            .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        Layer1Layout.setVerticalGroup(
            Layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layer1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(Layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1next, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        centralPane.add(Layer1, "card2");

        Layer2.setBackground(new java.awt.Color(255, 255, 255));
        Layer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 176, 0), 4));

        l13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l13MouseClicked(evt);
            }
        });

        l14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l14MouseClicked(evt);
            }
        });

        l15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l15MouseClicked(evt);
            }
        });

        l16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l16MouseClicked(evt);
            }
        });

        l17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l17MouseClicked(evt);
            }
        });

        l18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l18MouseClicked(evt);
            }
        });

        l19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l19MouseClicked(evt);
            }
        });

        l20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l20MouseClicked(evt);
            }
        });

        l21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l21MouseClicked(evt);
            }
        });

        l22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l22MouseClicked(evt);
            }
        });

        l23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l23MouseClicked(evt);
            }
        });

        l24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l24MouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(56, 176, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        L2next.setBackground(new java.awt.Color(176, 82, 240));
        L2next.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        L2next.setText("Next");
        L2next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L2nextActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(56, 176, 0));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel2.setText("Select Image");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/select_icon.png"))); // NOI18N
        jLabel5.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Layer2Layout = new javax.swing.GroupLayout(Layer2);
        Layer2.setLayout(Layer2Layout);
        Layer2Layout.setHorizontalGroup(
            Layer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Layer2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(Layer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Layer2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L2next, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Layer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Layer2Layout.createSequentialGroup()
                            .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Layer2Layout.createSequentialGroup()
                            .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Layer2Layout.createSequentialGroup()
                            .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        Layer2Layout.setVerticalGroup(
            Layer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layer2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(Layer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L2next, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Layer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Layer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Layer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        centralPane.add(Layer2, "card2");

        Layer3.setBackground(new java.awt.Color(255, 255, 255));
        Layer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 176, 0), 4));
        Layer3.setPreferredSize(new java.awt.Dimension(829, 675));

        l25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l25MouseClicked(evt);
            }
        });

        l26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l26MouseClicked(evt);
            }
        });

        l27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l27MouseClicked(evt);
            }
        });

        l28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l28MouseClicked(evt);
            }
        });

        l29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l29MouseClicked(evt);
            }
        });

        l30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l30MouseClicked(evt);
            }
        });

        l31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l31MouseClicked(evt);
            }
        });

        l32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l32MouseClicked(evt);
            }
        });

        l33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l33MouseClicked(evt);
            }
        });

        l34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l34MouseClicked(evt);
            }
        });

        l35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l35MouseClicked(evt);
            }
        });

        l36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l36MouseClicked(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(56, 176, 0));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        L3finish.setBackground(new java.awt.Color(176, 82, 240));
        L3finish.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        L3finish.setText("Submit");
        L3finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L3finishActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(56, 176, 0));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel3.setText("Select Image");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/select_icon.png"))); // NOI18N
        jLabel6.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Layer3Layout = new javax.swing.GroupLayout(Layer3);
        Layer3.setLayout(Layer3Layout);
        Layer3Layout.setHorizontalGroup(
            Layer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Layer3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(Layer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Layer3Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L3finish, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Layer3Layout.createSequentialGroup()
                        .addComponent(l25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Layer3Layout.createSequentialGroup()
                        .addComponent(l29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Layer3Layout.createSequentialGroup()
                        .addComponent(l33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        Layer3Layout.setVerticalGroup(
            Layer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Layer3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(Layer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L3finish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Layer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Layer3Layout.createSequentialGroup()
                        .addGroup(Layer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Layer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Layer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(l26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        centralPane.add(Layer3, "card2");

        getContentPane().add(centralPane, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:

        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l1)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l1).replaceFirst(".jpg", "") + "_";

    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l2)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l2).replaceFirst(".jpg", "") + "_";

    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l3)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l3).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l4)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l4).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l4MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l5)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l5).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l5MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l6)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l6).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l6MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l7)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l7).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l7MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l8)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l8).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l8MouseClicked

    private void l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l9MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l9)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l9).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l9MouseClicked

    private void l10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l10MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l10)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l10).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l10MouseClicked

    private void l11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l11MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l11)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l11).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l11MouseClicked

    private void l12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l12MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l12)))));
        new show().setFocusable(true);
        if (layer1flag) {
            layerlist += "Layer_1 : ";
            layer1flag = false;
        }
        imagelist += map.get(l12).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l12MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        s.clear();
        blocklist = "";
        imagelist = "";
        layerlist = "";
        pass = "";

        if (task.equals("login")) {
            new login().setVisible(true);
        } else if (task.equals("register")) {
            new register().setVisible(true);
        } else {
            new login().setVisible(true);
        }

        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void L1nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1nextActionPerformed
        Layer2.setVisible(true);
        Layer1.setVisible(false);
        layer2flag = true;
        L2next.setEnabled(false);

    }//GEN-LAST:event_L1nextActionPerformed

    public static void getpass(Stack<String> k) {
        if (k.empty()) {
            return;
        }
        String p = k.peek();
        k.pop();
        getpass(k);
        pass += p;
        k.add(p);
    }
    private void l13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l13MouseClicked
        // TODO add your handling code here:

        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l13)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l13).replaceFirst(".jpg", "") + "_";

    }//GEN-LAST:event_l13MouseClicked

    private void l14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l14MouseClicked
        // TODO add your handling code here:

        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l14)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l14).replaceFirst(".jpg", "") + "_";

    }//GEN-LAST:event_l14MouseClicked

    private void l15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l15MouseClicked
        // TODO add your handling code here: new show().setVisible(true);

        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l15)))));
        new show().setFocusable(true);

        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l15).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l15MouseClicked

    private void l16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l16MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l16)))));
        new show().setFocusable(true);

        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l16).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l16MouseClicked

    private void l17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l17MouseClicked
        // TODO add your handling code here:

        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l17)))));
        new show().setFocusable(true);

        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l17).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l17MouseClicked

    private void l18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l18MouseClicked
        // TODO add your handling code here:        

        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l18)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l18).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l18MouseClicked

    private void l19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l19MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l19)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l19).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l19MouseClicked

    private void l20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l20MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l20)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l20).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l20MouseClicked

    private void l21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l21MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l21)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l21).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l21MouseClicked

    private void l22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l22MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l22)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l22).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l22MouseClicked

    private void l23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l23MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l23)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l23).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l23MouseClicked

    private void l24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l24MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l24)))));
        new show().setFocusable(true);
        if (layer2flag) {
            layerlist += "Layer_2 : ";
            layer2flag = false;
        }
        imagelist += map.get(l24).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l24MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Layer1.setVisible(true);
        Layer2.setVisible(false);
        s.clear();
        blocklist = "";
        imagelist = "";
        layerlist = "";
        pass = "";
        L1next.setEnabled(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void L2nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L2nextActionPerformed
        Layer3.setVisible(true);
        Layer2.setVisible(false);
        layer3flag = true;
        L3finish.setEnabled(false);

    }//GEN-LAST:event_L2nextActionPerformed

    private void l25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l25MouseClicked
        // TODO add your handling code here:'
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l25)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l25).replaceFirst(".jpg", "") + "_";

    }//GEN-LAST:event_l25MouseClicked

    private void l26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l26MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l26)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l26).replaceFirst(".jpg", "") + "_";

    }//GEN-LAST:event_l26MouseClicked

    private void l27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l27MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l27)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l27).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l27MouseClicked

    private void l28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l28MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l28)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l28).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l28MouseClicked

    private void l29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l29MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l29)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l29).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l29MouseClicked

    private void l30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l30MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l30)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l30).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l30MouseClicked

    private void l31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l31MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l31)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l31).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l31MouseClicked

    private void l32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l32MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l32)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l32).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l32MouseClicked

    private void l33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l33MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l33)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l33).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l33MouseClicked

    private void l34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l34MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l34)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l34).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l34MouseClicked

    private void l35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l35MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l35)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l35).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l35MouseClicked

    private void l36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l36MouseClicked
        // TODO add your handling code here:
        new show().setVisible(true);
        show.l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/%s".formatted(map.get(l36)))));
        new show().setFocusable(true);
        if (layer3flag) {
            layerlist += "Layer_3 : ";
            layer3flag = false;
        }
        imagelist += map.get(l36).replaceFirst(".jpg", "") + "_";
    }//GEN-LAST:event_l36MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Layer1.setVisible(true);
        Layer3.setVisible(false);
        s.clear();
        blocklist = "";
        imagelist = "";
        layerlist = "";
        pass = "";
        layer1flag = true;
        layer2flag = true;
        layer3flag = true;

        L1next.setEnabled(false);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void L3finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L3finishActionPerformed
        switch (task) {
            case "register" -> {
                try {
                    getpass(s);

                    String hashpass = hashing.gethash(pass);
                    String gender = "";
                    if (register.maleRadioButton.isSelected()) {
                        gender = "Male";
                    } else if (register.femaleRadioButton.isSelected()) {
                        gender = "Female";
                    } else if (register.otherRadioButton.isSelected()) {
                        gender = "Other";
                    }

                    Connection con = database.db();

                    String sqlUsers = "insert into users values(?,?,?,?,?,?,?);";
                    PreparedStatement pst1 = con.prepareStatement(sqlUsers);
                    pst1.setString(1, register.firstnameTextField.getText());
                    pst1.setString(2, register.lastnameTextField.getText());
                    pst1.setString(3, register.emailTextField.getText());
                    pst1.setString(4, register.phoneTextField.getText());
                    pst1.setInt(5, Integer.parseInt(register.ageTextField.getText()));
                    pst1.setString(6, gender);
                    pst1.setString(7, hashpass);
                    pst1.execute();

                    
                    String sqlcheck = "select * from hashmap where hashcode = '"+hashpass+"';";
                    Statement stm = con.createStatement();
                    ResultSet rs = stm.executeQuery(sqlcheck);
                    
                    if(!rs.next()){
                        String sqlhash = "insert into hashmap values(?,?);";
                    PreparedStatement pst2 = con.prepareStatement(sqlhash);
                    pst2.setString(1, hashpass);
                    pst2.setString(2, hashing.encrypt(pass));
                    pst2.execute();
                    }

//                    String sqlhashuser = "insert into keymap values(?,?);";
//                    PreparedStatement pst3 = con.prepareStatement(sqlhashuser);
//                    pst3.setString(1, register.emailTextField.getText());
//                    pst3.setString(2, hashpass);
//                    pst3.execute();
//                    JOptionPane.showMessageDialog(null, pass, "password", JOptionPane.INFORMATION_MESSAGE);
                    new login().setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

                }

            }
            case "login" -> {
//                JOptionPane.showMessageDialog(null, "Login page", "Login", JOptionPane.INFORMATION_MESSAGE);
                try {
                    Connection con = database.db();
                    Statement stm = con.createStatement();

                    getpass(s);
                    String hashpass = hashing.gethash(pass);
                    String sql = "select * from users where email = '" + login.LoginEmail + "' and hashcode = '" + hashpass + "';";
//                    JOptionPane.showMessageDialog(null, pass, "password", JOptionPane.INFORMATION_MESSAGE);

                    ResultSet rs = stm.executeQuery(sql);

                    if (rs.next()) {
                        new profile().setVisible(true);
                        this.setVisible(false);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Signin fail", "Login", JOptionPane.INFORMATION_MESSAGE);
                        new login().setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

                }
            }
            case "update" -> {
                try {
                    getpass(s);

                    String hashpass = hashing.gethash(pass);

                    Connection con = database.db();

                    String sqlhash = "insert into hashmap values(?,?);";
                    PreparedStatement pst2 = con.prepareStatement(sqlhash);
                    pst2.setString(1, hashpass);
                    pst2.setString(2, hashing.encrypt(pass));
                    pst2.execute();

                    String sqlhashuser = "update users set hashcode = ? where Email =?;";
                    PreparedStatement pst3 = con.prepareStatement(sqlhashuser);
                    pst3.setString(1, hashpass);
                    pst3.setString(2, login.LoginEmail);
                    pst3.execute();

                    JOptionPane.showMessageDialog(null, "Password Update please Sign in again ", "Message", JOptionPane.INFORMATION_MESSAGE);

                    new login().setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

                }
            }
            default -> {

            }
        }

    }//GEN-LAST:event_L3finishActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SetPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton L1next;
    public static javax.swing.JButton L2next;
    public static javax.swing.JButton L3finish;
    private javax.swing.JPanel Layer1;
    private javax.swing.JPanel Layer2;
    private javax.swing.JPanel Layer3;
    private javax.swing.JLayeredPane centralPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel l1;
    public static javax.swing.JLabel l10;
    public static javax.swing.JLabel l11;
    public static javax.swing.JLabel l12;
    public static javax.swing.JLabel l13;
    public static javax.swing.JLabel l14;
    public static javax.swing.JLabel l15;
    public static javax.swing.JLabel l16;
    public static javax.swing.JLabel l17;
    public static javax.swing.JLabel l18;
    public static javax.swing.JLabel l19;
    public static javax.swing.JLabel l2;
    public static javax.swing.JLabel l20;
    public static javax.swing.JLabel l21;
    public static javax.swing.JLabel l22;
    public static javax.swing.JLabel l23;
    public static javax.swing.JLabel l24;
    public static javax.swing.JLabel l25;
    public static javax.swing.JLabel l26;
    public static javax.swing.JLabel l27;
    public static javax.swing.JLabel l28;
    public static javax.swing.JLabel l29;
    public static javax.swing.JLabel l3;
    public static javax.swing.JLabel l30;
    public static javax.swing.JLabel l31;
    public static javax.swing.JLabel l32;
    public static javax.swing.JLabel l33;
    public static javax.swing.JLabel l34;
    public static javax.swing.JLabel l35;
    public static javax.swing.JLabel l36;
    public static javax.swing.JLabel l4;
    public static javax.swing.JLabel l5;
    public static javax.swing.JLabel l6;
    public static javax.swing.JLabel l7;
    public static javax.swing.JLabel l8;
    public static javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
