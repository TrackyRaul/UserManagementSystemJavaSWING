/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Raul Farkas
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
        welcomeLabel.setText("Welcome, guest!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 70));
        credentialsPanel = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 50));
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 0), new java.awt.Dimension(200, 70));
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 20));
        buttonsPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        mainPanel.setBackground(new java.awt.Color(63, 81, 181));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setDoubleBuffered(false);
        mainPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
        mainPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.Y_AXIS));

        topPanel.setBackground(new java.awt.Color(63, 81, 181));
        topPanel.setAlignmentY(0.0F);
        topPanel.setMaximumSize(new java.awt.Dimension(1330, 100));

        welcomeLabel.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome");
        welcomeLabel.setAlignmentY(0.0F);

        homeButton.setBackground(new java.awt.Color(0, 59, 142));
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setAlignmentX(0.5F);
        homeButton.setBorder(null);
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeButton.setMargin(null);
        homeButton.setMaximumSize(new java.awt.Dimension(180, 30));
        homeButton.setMinimumSize(new java.awt.Dimension(180, 30));
        homeButton.setPreferredSize(new java.awt.Dimension(180, 30));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToHome(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 947, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        mainPanel.add(topPanel);
        mainPanel.add(filler1);

        credentialsPanel.setBackground(new java.awt.Color(63, 81, 181));
        credentialsPanel.setBorder(null
        );
        credentialsPanel.setMaximumSize(new java.awt.Dimension(600, 300));
        credentialsPanel.setLayout(new javax.swing.BoxLayout(credentialsPanel, javax.swing.BoxLayout.Y_AXIS));
        credentialsPanel.add(filler4);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jLabel2.setAlignmentX(0.5F);
        credentialsPanel.add(jLabel2);

        usernameField.setBackground(new java.awt.Color(117, 125, 232));
        usernameField.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameField.setToolTipText("Username");
        usernameField.setBorder(null);
        usernameField.setMaximumSize(new java.awt.Dimension(250, 40));
        usernameField.setMinimumSize(new java.awt.Dimension(250, 40));
        usernameField.setName("Username"); // NOI18N
        usernameField.setPreferredSize(new java.awt.Dimension(250, 40));
        credentialsPanel.add(usernameField);
        credentialsPanel.add(filler3);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jLabel1.setAlignmentX(0.5F);
        credentialsPanel.add(jLabel1);

        passwordField.setBackground(new java.awt.Color(117, 125, 232));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setBorder(null);
        passwordField.setMaximumSize(new java.awt.Dimension(250, 40));
        passwordField.setMinimumSize(new java.awt.Dimension(250, 40));
        passwordField.setPreferredSize(new java.awt.Dimension(250, 40));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        credentialsPanel.add(passwordField);

        mainPanel.add(credentialsPanel);
        mainPanel.add(filler2);

        buttonsPanel.setBackground(new java.awt.Color(63, 81, 181));
        buttonsPanel.setAlignmentY(0.0F);
        buttonsPanel.setMaximumSize(new java.awt.Dimension(1280, 100));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(1280, 100));
        buttonsPanel.setLayout(new javax.swing.BoxLayout(buttonsPanel, javax.swing.BoxLayout.Y_AXIS));

        loginButton.setBackground(new java.awt.Color(0, 59, 142));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setAlignmentX(0.5F);
        loginButton.setBorder(null);
        loginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginButton.setMargin(null);
        loginButton.setMaximumSize(new java.awt.Dimension(200, 50));
        loginButton.setMinimumSize(new java.awt.Dimension(200, 50));
        loginButton.setPreferredSize(new java.awt.Dimension(200, 50));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(loginButton);

        mainPanel.add(buttonsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void goToHome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToHome

        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.getContentPane().removeAll();
        topFrame.getContentPane().add(new MainPanel());
        topFrame.pack();
    }//GEN-LAST:event_goToHome

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        //Login
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        //Hash password
        password = Tools.getSHA(password);

        
        try {
            MainWindow.session.setUser(MainWindow.usersList.login(username, password));
        } catch (UserDoesNotExistException ex) {
            JOptionPane.showMessageDialog(null,
                    "User does not exist!",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } catch (IOException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        JOptionPane.showMessageDialog(null,
                "Welcome " + username);
        
        //Go to home
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.getContentPane().removeAll();
        topFrame.getContentPane().add(new HomePanelLoggedIn());
        topFrame.pack();
    }//GEN-LAST:event_loginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel credentialsPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
