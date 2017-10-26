package src;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Sample extends javax.swing.JFrame {

    static ResourceBundle rb = ResourceBundle.getBundle("MyResourceBundle");
    Locale [] allLocales = {new Locale("en", "IE"), new Locale("de", "DE"), new Locale("fr", "FR")};
    
    public Sample() {
        initComponents();
        updateLabels(allLocales[0]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataEntryPanel = new javax.swing.JPanel();
        dateLbl = new javax.swing.JLabel();
        dateOutputLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTField = new javax.swing.JTextField();
        addressLbl = new javax.swing.JLabel();
        addressTField = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        phoneTField = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTField = new javax.swing.JTextField();
        jobLbl = new javax.swing.JLabel();
        jobTField = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        irishButton = new javax.swing.JButton();
        germanyButton = new javax.swing.JButton();
        franceButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        selectAllMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal Details");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setMinimumSize(new java.awt.Dimension(380, 210));

        dataEntryPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        dataEntryPanel.setLayout(new java.awt.GridLayout(6, 2, 10, 10));
        dataEntryPanel.add(dateLbl);

        dateOutputLbl.setText("Date and Time Goes here in FULL format");
        dataEntryPanel.add(dateOutputLbl);
        dataEntryPanel.add(nameLbl);

        nameTField.setPreferredSize(new java.awt.Dimension(6, 45));
        dataEntryPanel.add(nameTField);
        dataEntryPanel.add(addressLbl);

        addressTField.setPreferredSize(new java.awt.Dimension(6, 45));
        dataEntryPanel.add(addressTField);
        dataEntryPanel.add(phoneLbl);

        phoneTField.setPreferredSize(new java.awt.Dimension(6, 45));
        dataEntryPanel.add(phoneTField);
        dataEntryPanel.add(emailLbl);

        emailTField.setPreferredSize(new java.awt.Dimension(6, 45));
        dataEntryPanel.add(emailTField);
        dataEntryPanel.add(jobLbl);

        jobTField.setPreferredSize(new java.awt.Dimension(6, 45));
        jobTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobTFieldActionPerformed(evt);
            }
        });
        dataEntryPanel.add(jobTField);

        getContentPane().add(dataEntryPanel, java.awt.BorderLayout.CENTER);

        irishButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/irish-flag.jpg"))); // NOI18N
        irishButton.setPreferredSize(new java.awt.Dimension(120, 60));
        irishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irishButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(irishButton);

        germanyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/germany-flag.jpg"))); // NOI18N
        germanyButton.setPreferredSize(new java.awt.Dimension(120, 60));
        germanyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                germanyButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(germanyButton);

        franceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/french-flag.jpg"))); // NOI18N
        franceButton.setPreferredSize(new java.awt.Dimension(120, 60));
        franceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                franceButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(franceButton);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_END);

        fileMenu.setText("File");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setText("Copy");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        selectAllMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectAllMenuItem.setText("Select All");
        editMenu.add(selectAllMenuItem);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jobTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobTFieldActionPerformed
        JOptionPane.showMessageDialog(this, "All the details from the textfields are displayed here");
    }//GEN-LAST:event_jobTFieldActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
       System.exit(0);
    }//GEN-LAST:event_quitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
       JFileChooser jfc = new JFileChooser();
       
       jfc.showDialog(this, "Open A File");
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void irishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irishButtonActionPerformed
        updateLabels(allLocales[0]);
    }//GEN-LAST:event_irishButtonActionPerformed

    private void germanyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_germanyButtonActionPerformed
        updateLabels(allLocales[1]);
    }//GEN-LAST:event_germanyButtonActionPerformed

    private void franceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_franceButtonActionPerformed
        updateLabels(allLocales[2]);
    }//GEN-LAST:event_franceButtonActionPerformed

    private void updateLabels(Locale myLocale) {
        rb = ResourceBundle.getBundle("MyResourceBundle", myLocale);

        dateLbl.setText(rb.getString("dateLbl"));
        nameLbl.setText(rb.getString("nameLbl"));
        addressLbl.setText(rb.getString("addressLbl"));
        phoneLbl.setText(rb.getString("phoneLbl"));
        emailLbl.setText(rb.getString("emailLbl"));
        jobLbl.setText(rb.getString("jobLbl"));
        fileMenu.setText(rb.getString("fileMenu"));
        
        GregorianCalendar cal = new GregorianCalendar();
        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM, myLocale);
        String date = formatter.format(cal.getTime());
        dateOutputLbl.setText(date);        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Sample().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JPanel dataEntryPanel;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dateOutputLbl;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTField;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton franceButton;
    private javax.swing.JButton germanyButton;
    private javax.swing.JButton irishButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jobLbl;
    private javax.swing.JTextField jobTField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTField;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTField;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenuItem selectAllMenuItem;
    // End of variables declaration//GEN-END:variables
}

