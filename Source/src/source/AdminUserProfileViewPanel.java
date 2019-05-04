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
 * @author raul
 */
public class AdminUserProfileViewPanel extends javax.swing.JPanel {

    private User refUser;

    /**
     * Creates new form AdminUserProfileViewPanel
     *
     * @param user
     */
    public AdminUserProfileViewPanel(User user) {
        refUser = user;
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

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        welcomeLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 30));
        credentialsPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 50));
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 0), new java.awt.Dimension(200, 30));
        jLabel3 = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 0), new java.awt.Dimension(200, 30));
        jLabel4 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 50));
        buttonsPanel = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 170), new java.awt.Dimension(0, 170), new java.awt.Dimension(350, 170));
        cancelButton = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 170), new java.awt.Dimension(0, 170), new java.awt.Dimension(50, 170));
        moreInfoButton = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 170), new java.awt.Dimension(0, 170), new java.awt.Dimension(50, 170));
        saveButton = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 170), new java.awt.Dimension(0, 170), new java.awt.Dimension(350, 170));
        backButton = new javax.swing.JButton();

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

        homeButton.setBackground(new java.awt.Color(0, 59, 142));
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setAlignmentX(0.5F);
        homeButton.setBorder(null);
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeButton.setMargin(null);
        homeButton.setMaximumSize(new java.awt.Dimension(150, 30));
        homeButton.setMinimumSize(new java.awt.Dimension(150, 30));
        homeButton.setPreferredSize(new java.awt.Dimension(150, 30));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtongoToHome(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(0, 59, 142));
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("LogOut");
        logOutButton.setBorder(null);
        logOutButton.setBorderPainted(false);
        logOutButton.setMargin(null);
        logOutButton.setMaximumSize(new java.awt.Dimension(150, 30));
        logOutButton.setMinimumSize(new java.awt.Dimension(150, 30));
        logOutButton.setPreferredSize(new java.awt.Dimension(150, 30));
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonlogOut(evt);
            }
        });

        welcomeLabel1.setBackground(new java.awt.Color(63, 81, 181));
        welcomeLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        welcomeLabel1.setForeground(new java.awt.Color(63, 81, 181));
        welcomeLabel1.setText("Welcome");
        welcomeLabel1.setAlignmentY(0.0F);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(welcomeLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 977, Short.MAX_VALUE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(topPanel);
        mainPanel.add(filler1);

        credentialsPanel.setBackground(new java.awt.Color(63, 81, 181));
        credentialsPanel.setBorder(null
        );
        credentialsPanel.setAlignmentY(0.3F);
        credentialsPanel.setMaximumSize(new java.awt.Dimension(600, 300));
        credentialsPanel.setLayout(new javax.swing.BoxLayout(credentialsPanel, javax.swing.BoxLayout.Y_AXIS));

        welcomeLabel.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("User: "+this.refUser.getUsername());
        welcomeLabel.setAlignmentX(0.5F);
        welcomeLabel.setAlignmentY(0.0F);
        credentialsPanel.add(welcomeLabel);
        credentialsPanel.add(filler4);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jLabel2.setAlignmentX(0.5F);
        credentialsPanel.add(jLabel2);

        nameField.setBackground(new java.awt.Color(117, 125, 232));
        nameField.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setText(this.refUser.getName());
        nameField.setToolTipText("Username");
        nameField.setBorder(null);
        nameField.setMaximumSize(new java.awt.Dimension(250, 40));
        nameField.setMinimumSize(new java.awt.Dimension(250, 40));
        nameField.setName("Username"); // NOI18N
        nameField.setPreferredSize(new java.awt.Dimension(250, 40));
        credentialsPanel.add(nameField);
        credentialsPanel.add(filler3);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Surname");
        jLabel3.setAlignmentX(0.5F);
        credentialsPanel.add(jLabel3);

        surnameField.setBackground(new java.awt.Color(117, 125, 232));
        surnameField.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        surnameField.setForeground(new java.awt.Color(255, 255, 255));
        surnameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        surnameField.setText(this.refUser.getSurname());
        surnameField.setToolTipText("Username");
        surnameField.setBorder(null);
        surnameField.setMaximumSize(new java.awt.Dimension(250, 40));
        surnameField.setMinimumSize(new java.awt.Dimension(250, 40));
        surnameField.setName("Username"); // NOI18N
        surnameField.setPreferredSize(new java.awt.Dimension(250, 40));
        credentialsPanel.add(surnameField);
        credentialsPanel.add(filler5);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jLabel4.setAlignmentX(0.5F);
        credentialsPanel.add(jLabel4);

        emailField.setBackground(new java.awt.Color(117, 125, 232));
        emailField.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        emailField.setForeground(new java.awt.Color(255, 255, 255));
        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailField.setText(this.refUser.getEmail());
        emailField.setToolTipText("Email");
        emailField.setBorder(null);
        emailField.setMaximumSize(new java.awt.Dimension(250, 40));
        emailField.setMinimumSize(new java.awt.Dimension(250, 40));
        emailField.setName("Username"); // NOI18N
        emailField.setPreferredSize(new java.awt.Dimension(250, 40));
        credentialsPanel.add(emailField);

        mainPanel.add(credentialsPanel);
        mainPanel.add(filler2);

        buttonsPanel.setBackground(new java.awt.Color(63, 81, 181));
        buttonsPanel.setAlignmentY(0.0F);
        buttonsPanel.setMaximumSize(new java.awt.Dimension(1280, 100));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(1280, 100));
        buttonsPanel.setLayout(new javax.swing.BoxLayout(buttonsPanel, javax.swing.BoxLayout.X_AXIS));
        buttonsPanel.add(filler6);

        cancelButton.setBackground(new java.awt.Color(0, 59, 142));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setAlignmentX(0.5F);
        cancelButton.setBorder(null);
        cancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelButton.setMargin(null);
        cancelButton.setMaximumSize(new java.awt.Dimension(200, 50));
        cancelButton.setMinimumSize(new java.awt.Dimension(200, 50));
        cancelButton.setPreferredSize(new java.awt.Dimension(200, 50));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtoncancelData(evt);
            }
        });
        buttonsPanel.add(cancelButton);
        buttonsPanel.add(filler9);

        moreInfoButton.setBackground(new java.awt.Color(0, 59, 142));
        moreInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        moreInfoButton.setText("More info");
        moreInfoButton.setAlignmentX(0.5F);
        moreInfoButton.setBorder(null);
        moreInfoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        moreInfoButton.setMargin(null);
        moreInfoButton.setMaximumSize(new java.awt.Dimension(200, 50));
        moreInfoButton.setMinimumSize(new java.awt.Dimension(200, 50));
        moreInfoButton.setPreferredSize(new java.awt.Dimension(200, 50));
        moreInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToMoreInfo(evt);
            }
        });
        buttonsPanel.add(moreInfoButton);
        buttonsPanel.add(filler8);

        saveButton.setBackground(new java.awt.Color(0, 59, 142));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setAlignmentX(0.5F);
        saveButton.setBorder(null);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveButton.setMargin(null);
        saveButton.setMaximumSize(new java.awt.Dimension(200, 50));
        saveButton.setMinimumSize(new java.awt.Dimension(200, 50));
        saveButton.setPreferredSize(new java.awt.Dimension(200, 50));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton(evt);
            }
        });
        buttonsPanel.add(saveButton);
        buttonsPanel.add(filler7);

        mainPanel.add(buttonsPanel);

        backButton.setBackground(new java.awt.Color(0, 59, 142));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setAlignmentX(0.5F);
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setMargin(null);
        backButton.setMaximumSize(new java.awt.Dimension(200, 50));
        backButton.setPreferredSize(new java.awt.Dimension(200, 50));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtongoToBack(evt);
            }
        });
        mainPanel.add(backButton);

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

    private void homeButtongoToHome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtongoToHome
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.getContentPane().removeAll();
        topFrame.getContentPane().add(new HomePanelLoggedIn());
        topFrame.pack();
    }//GEN-LAST:event_homeButtongoToHome

    private void logOutButtonlogOut(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonlogOut
        try {

            MainWindow.session.setUser(null);
        } catch (IOException ex) {
            Logger.getLogger(HomePanelLoggedIn.class.getName()).log(Level.SEVERE, null, ex);
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.getContentPane().removeAll();
            topFrame.getContentPane().add(new MainPanel());
            topFrame.pack();
            return;
        }

        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.getContentPane().removeAll();
        topFrame.getContentPane().add(new MainPanel());
        topFrame.pack();
        JOptionPane.showMessageDialog(null,
                "You logged out successfully!");
    }//GEN-LAST:event_logOutButtonlogOut

    private void cancelButtoncancelData(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtoncancelData
        // TODO add your handling code here:
        if (!nameField.getText().equals(refUser.getName()) || !surnameField.getText().equals(refUser.getSurname()) || !emailField.getText().equals(refUser.getEmail())) {
            nameField.setText(refUser.getName());
            surnameField.setText(refUser.getSurname());
            emailField.setText(refUser.getEmail());
            //Update user in usersList not only in session
            MainWindow.usersList.updateUser(refUser);
            JOptionPane.showMessageDialog(null,
                    "Modifications canceled!");
        }
    }//GEN-LAST:event_cancelButtoncancelData

    private void saveButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton
        refUser.setName(nameField.getText());
        refUser.setSurname(surnameField.getText());
        refUser.setEmail(emailField.getText());
        //Update user in usersList not only in session
        MainWindow.usersList.updateUser(refUser);
        JOptionPane.showMessageDialog(null,
                "Data saved!");
        if (MainWindow.session.getUser().getUsername().equals(refUser.getUsername())) {
            MainWindow.usersList.updateUser(refUser);
            try {
                MainWindow.session.updateUserSession();
            } catch (IOException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_saveButton

    private void backButtongoToBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtongoToBack
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.getContentPane().removeAll();
        topFrame.getContentPane().add(new AdminUsersAndSignaturesPanel());
        topFrame.pack();
    }//GEN-LAST:event_backButtongoToBack

    private void goToMoreInfo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToMoreInfo
        // TODO add your handling code here:
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.getContentPane().removeAll();
        topFrame.getContentPane().add(new AdminMoreInfoViewPanel(this.refUser));
        topFrame.pack();
    }//GEN-LAST:event_goToMoreInfo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel credentialsPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton moreInfoButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField surnameField;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeLabel1;
    // End of variables declaration//GEN-END:variables
}
