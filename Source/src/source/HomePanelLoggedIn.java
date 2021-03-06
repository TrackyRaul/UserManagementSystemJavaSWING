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
public class HomePanelLoggedIn extends javax.swing.JPanel {

    private Quotes quotes;

    /**
     * Creates new form HomePanelLoggedIn
     */
    public HomePanelLoggedIn() {
        //If there is no user logged in go to MainPanel
        //Load session
        if (MainWindow.session.getUser() == null) {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.getContentPane().removeAll();
            topFrame.getContentPane().add(new MainPanel());
            topFrame.pack();
        }
        initComponents();
        welcomeLabel.setText("Welcome, " + MainWindow.session.getUser().getUsername());

        //Load quotes
        try {
            this.quotes = new Quotes();
            this.quoteTextArea.setText(quotes.random());
        } catch (IOException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        logOutButton = new javax.swing.JButton();
        goToProfileButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 70));
        quotePanel = new javax.swing.JPanel();
        quoteTopPanel = new javax.swing.JPanel();
        motivationalQuoteLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quoteTextArea = new javax.swing.JTextArea();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 50));
        buttonsPanel = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(540, 0), new java.awt.Dimension(540, 0), new java.awt.Dimension(540, 540));
        enterButton = new javax.swing.JButton();

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
                logOut(evt);
            }
        });

        goToProfileButton.setBackground(new java.awt.Color(0, 59, 142));
        goToProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        goToProfileButton.setText("Profile");
        goToProfileButton.setBorder(null);
        goToProfileButton.setBorderPainted(false);
        goToProfileButton.setMargin(null);
        goToProfileButton.setMaximumSize(new java.awt.Dimension(150, 30));
        goToProfileButton.setMinimumSize(new java.awt.Dimension(150, 30));
        goToProfileButton.setPreferredSize(new java.awt.Dimension(150, 30));
        goToProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToProfile(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 977, Short.MAX_VALUE)
                        .addComponent(goToProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(welcomeLabel)
                    .addComponent(goToProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(topPanel);
        mainPanel.add(filler1);

        quotePanel.setBackground(new java.awt.Color(117, 125, 232));
        quotePanel.setBorder(null
        );
        quotePanel.setMaximumSize(new java.awt.Dimension(600, 300));

        quoteTopPanel.setBackground(new java.awt.Color(0, 60, 143));

        motivationalQuoteLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        motivationalQuoteLabel.setForeground(new java.awt.Color(255, 255, 255));
        motivationalQuoteLabel.setText("Motivational quote:");
        motivationalQuoteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motivationalQuoteLabelrefreshRandom(evt);
            }
        });

        javax.swing.GroupLayout quoteTopPanelLayout = new javax.swing.GroupLayout(quoteTopPanel);
        quoteTopPanel.setLayout(quoteTopPanelLayout);
        quoteTopPanelLayout.setHorizontalGroup(
            quoteTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quoteTopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(motivationalQuoteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quoteTopPanelLayout.setVerticalGroup(
            quoteTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quoteTopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(motivationalQuoteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setEnabled(false);

        quoteTextArea.setEditable(false);
        quoteTextArea.setBackground(new java.awt.Color(117, 125, 232));
        quoteTextArea.setColumns(20);
        quoteTextArea.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        quoteTextArea.setForeground(new java.awt.Color(255, 255, 255));
        quoteTextArea.setLineWrap(true);
        quoteTextArea.setRows(4);
        quoteTextArea.setText("“Don't cry because it's over, smile because it happened.”  ― Dr. Seuss");
        quoteTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(quoteTextArea);

        javax.swing.GroupLayout quotePanelLayout = new javax.swing.GroupLayout(quotePanel);
        quotePanel.setLayout(quotePanelLayout);
        quotePanelLayout.setHorizontalGroup(
            quotePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quoteTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(quotePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        quotePanelLayout.setVerticalGroup(
            quotePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quotePanelLayout.createSequentialGroup()
                .addComponent(quoteTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(quotePanel);
        mainPanel.add(filler2);

        buttonsPanel.setBackground(new java.awt.Color(63, 81, 181));
        buttonsPanel.setMaximumSize(new java.awt.Dimension(1280, 100));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(1280, 100));
        buttonsPanel.setLayout(new javax.swing.BoxLayout(buttonsPanel, javax.swing.BoxLayout.X_AXIS));
        buttonsPanel.add(filler3);

        enterButton.setBackground(new java.awt.Color(0, 59, 142));
        enterButton.setForeground(new java.awt.Color(255, 255, 255));
        enterButton.setText("Enter");
        enterButton.setBorder(null);
        enterButton.setBorderPainted(false);
        enterButton.setMargin(null);
        enterButton.setMaximumSize(new java.awt.Dimension(200, 50));
        enterButton.setPreferredSize(new java.awt.Dimension(200, 50));
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToUserArea(evt);
            }
        });
        buttonsPanel.add(enterButton);

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

    private void motivationalQuoteLabelrefreshRandom(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motivationalQuoteLabelrefreshRandom
        //Choose a random quote
        this.quoteTextArea.setText(this.quotes.random());
    }//GEN-LAST:event_motivationalQuoteLabelrefreshRandom

    private void goToUserArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToUserArea

        if (MainWindow.session.getUser().getClass().getName().contains("Admin")) {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.getContentPane().removeAll();
            topFrame.getContentPane().add(new AdminUserSignPresencePanel());
            topFrame.pack();
        } else {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.getContentPane().removeAll();
            topFrame.getContentPane().add(new RegularUserSignPresencePanel());
            topFrame.pack();
        }

    }//GEN-LAST:event_goToUserArea

    private void logOut(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut
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
    }//GEN-LAST:event_logOut

    private void goToProfile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToProfile
        // TODO add your handling code here:
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.getContentPane().removeAll();
        topFrame.getContentPane().add(new Profile());
        topFrame.pack();
    }//GEN-LAST:event_goToProfile


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton enterButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton goToProfileButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel motivationalQuoteLabel;
    private javax.swing.JPanel quotePanel;
    private javax.swing.JTextArea quoteTextArea;
    private javax.swing.JPanel quoteTopPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
