/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package de.buw.se4de;
import java.time.LocalDate;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar; 	

/**
 * @author nikhi
 */
public class IssueBook extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public JButton issueBtn;
    public JButton closeBtn;
    public JLabel bookIDLabel;
    public JLabel studentIDLabel;
    public JLabel issueDateLabel;
    public JLabel dueDateLabel;
    public JTextField bookIDTextField;
    public JTextField studentIDTextField;
  //nayeem
    public JLabel issueDateField;
    public JLabel dueDateField;

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
    }

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        bookIDLabel = new JLabel();
        studentIDLabel = new JLabel();
        issueDateLabel = new JLabel();
        dueDateLabel = new JLabel();
        bookIDTextField = new JTextField();
        studentIDTextField = new JTextField();
      //nayeem
        issueDateField = new JLabel();
        dueDateField = new JLabel();
        issueBtn = new JButton();
        closeBtn = new JButton();

        bookIDLabel.setText("Book ID");

        studentIDLabel.setText("Student ID");

        issueDateLabel.setText("Issue Date");

        dueDateLabel.setText("Due Date");
        
        


        issueBtn.setText("Issue");
        issueBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                issueBtnActionPerformed(evt);
                //from here we should get the information from the text fields and issue book by it // nayeem
                Calendar c = Calendar.getInstance();
                issueDateField.setText(c.getTime().toString());
                
                c.add(Calendar.DATE, 15);
                dueDateField.setText(c.getTime().toString());
            }
        });

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                closeBtnActionPerformed(evt);
                
            }
        });

        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup().addGap(120, 120, 120)
        								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        										.addComponent(issueDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(studentIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        										.addComponent(bookIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(dueDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        								.addGap(140, 140, 140)
        								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        								.addComponent(bookIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        								.addComponent(studentIDTextField)
        								//nayeem
        								.addComponent(issueDateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(dueDateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        								.addGroup(layout.createSequentialGroup().addGap(183, 183, 183)
        								.addComponent(issueBtn).addGap(101, 101, 101)
        								.addComponent(closeBtn)))
        								.addContainerGap(142, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout
        		.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(layout
        				.createSequentialGroup()
        				.addGap(75, 75, 75)
        				.addGroup(layout
        						.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        						.addComponent(bookIDLabel)
        						.addComponent(bookIDTextField, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        				.addGap(23, 23, 23)
        				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        						.addComponent(studentIDLabel)
        						.addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        				.addGap(27, 27, 27)
        				//nayeem
        				.addComponent(issueDateLabel)
        				.addComponent(issueDateField,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        				.addGap(28, 28, 28)
        				//nayeem
        				.addComponent(dueDateLabel)
        				.addComponent(dueDateField,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        				.addGap(49, 49, 49)
						
        				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        						.addComponent(issueBtn).addComponent(closeBtn)).addContainerGap(147, Short.MAX_VALUE)));

        pack();

        this.setTitle("Issue Book");
        this.setSize(600,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getRootPane().setDefaultButton(issueBtn);


    }// </editor-fold>//GEN-END:initComponents

    private void issueBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //bookIDTextField.setText("");
        //studentIDTextField.setText("");
    	
    	//we should extract the information from here and then store it if we need //nayeem
    	
    	//it should store the book issued into the statistics interface
    	
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    // End of variables declaration//GEN-END:variables
}
