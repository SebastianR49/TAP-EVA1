
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Multitarea extends javax.swing.JFrame {

  /**
   * Creates new form Multitarea
   */
  private boolean close;
  public Multitarea() {
    initComponents();
    close = false;
    
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btn_crash = new javax.swing.JButton();
    btn_generic = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    btn_crash.setText("trabar");
    btn_crash.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btn_crashMouseClicked(evt);
      }
    });

    btn_generic.setText("generico");
    btn_generic.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btn_genericMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(61, 61, 61)
        .addComponent(btn_crash)
        .addGap(61, 61, 61)
        .addComponent(btn_generic)
        .addContainerGap(130, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(46, 46, 46)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_crash)
          .addComponent(btn_generic))
        .addContainerGap(232, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_crashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crashMouseClicked
    // TODO add your handling code here:
    Runnable runnable = new Runnable() {
      @Override
      public void run() {//aqui va la tarea que se ejecuta en un hilo
      
    while(true){
      try {
        Thread.sleep(100);
      } catch (InterruptedException ex) {
        Logger.getLogger(Multitarea.class.getName()).log(Level.SEVERE, null, ex);
      }
      if(close){
        System.out.println("hilo terminado");
        break;
      }
      
      
      System.out.println("jsjsjs");
    }
    
      }
    };
    //runnable.run();//esto no funciona
    Thread hilo = new Thread(runnable);
    hilo.start();
    
    
  }//GEN-LAST:event_btn_crashMouseClicked

  private void btn_genericMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_genericMouseClicked
    // TODO add your handling code here:
    
    System.out.println("aun funciona");
    
    dispose();
    
  }//GEN-LAST:event_btn_genericMouseClicked

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    // TODO add your handling code here:
    close = true;
    System.out.println("closing");
    dispose();
    
  }//GEN-LAST:event_formWindowClosing

  private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    // TODO add your handling code here:
    
    close = true;
    System.out.println("no");
    System.exit(0);
    
    
  }//GEN-LAST:event_formWindowClosed

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
      java.util.logging.Logger.getLogger(Multitarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Multitarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Multitarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Multitarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Multitarea().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_crash;
  private javax.swing.JButton btn_generic;
  // End of variables declaration//GEN-END:variables


}
