
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Menu extends javax.swing.JFrame {

  /**
   * Creates new form Menu
   */
  public Menu() {

    
    initComponents();
    ActionListener listener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mnua)
          System.out.println("evento action listener");
        else if(e.getSource() == exit)
          System.exit(0);
        else
          System.out.println("menu 2");
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
    };
    
    exit.addActionListener(listener);
    mnua.addActionListener(listener);
    mnub.addActionListener(listener);
    
    
    
    
    exit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
    });    
    
    
    
    jMenu4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("funcionaxdxdxdxdxdxdxd");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
    });
    
    
    
    
    /*jMenu4.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println("funciona");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
    });
    */
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jMenu1 = new javax.swing.JMenu();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu2 = new javax.swing.JMenu();
    jMenuItem13 = new javax.swing.JMenuItem();
    jMenuItem14 = new javax.swing.JMenuItem();
    jMenuItem15 = new javax.swing.JMenuItem();
    jMenu5 = new javax.swing.JMenu();
    jMenuItem21 = new javax.swing.JMenuItem();
    jMenuItem22 = new javax.swing.JMenuItem();
    jMenuItem23 = new javax.swing.JMenuItem();
    jMenuItem24 = new javax.swing.JMenuItem();
    jMenuItem16 = new javax.swing.JMenuItem();
    jMenuItem17 = new javax.swing.JMenuItem();
    jMenuItem18 = new javax.swing.JMenuItem();
    jMenuItem19 = new javax.swing.JMenuItem();
    jMenuItem20 = new javax.swing.JMenuItem();
    jMenu3 = new javax.swing.JMenu();
    jMenuItem10 = new javax.swing.JMenuItem();
    jMenuItem11 = new javax.swing.JMenuItem();
    jMenuItem12 = new javax.swing.JMenuItem();
    jMenu4 = new javax.swing.JMenu();
    mnua = new javax.swing.JMenuItem();
    mnub = new javax.swing.JMenuItem();
    jMenuItem3 = new javax.swing.JMenuItem();
    jMenuItem4 = new javax.swing.JMenuItem();
    jMenuItem5 = new javax.swing.JMenuItem();
    jMenuItem6 = new javax.swing.JMenuItem();
    jMenuItem7 = new javax.swing.JMenuItem();
    jMenuItem8 = new javax.swing.JMenuItem();
    exit = new javax.swing.JMenuItem();

    jMenu1.setText("jMenu1");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jMenu2.setText("File");

    jMenuItem13.setText("fa");
    jMenu2.add(jMenuItem13);

    jMenuItem14.setText("fb");
    jMenu2.add(jMenuItem14);

    jMenuItem15.setText("fc");
    jMenu2.add(jMenuItem15);

    jMenu5.setText("fd");

    jMenuItem21.setText("da");
    jMenu5.add(jMenuItem21);

    jMenuItem22.setText("db");
    jMenu5.add(jMenuItem22);

    jMenuItem23.setText("dc");
    jMenu5.add(jMenuItem23);

    jMenuItem24.setText("dd");
    jMenu5.add(jMenuItem24);

    jMenu2.add(jMenu5);

    jMenuItem16.setText("fe");
    jMenu2.add(jMenuItem16);

    jMenuItem17.setText("ff");
    jMenu2.add(jMenuItem17);

    jMenuItem18.setText("fg");
    jMenu2.add(jMenuItem18);

    jMenuItem19.setText("fh");
    jMenu2.add(jMenuItem19);

    jMenuItem20.setText("fi");
    jMenu2.add(jMenuItem20);

    jMenuBar1.add(jMenu2);

    jMenu3.setText("Edit");

    jMenuItem10.setText("ea");
    jMenu3.add(jMenuItem10);

    jMenuItem11.setText("eb");
    jMenu3.add(jMenuItem11);

    jMenuItem12.setText("ec");
    jMenu3.add(jMenuItem12);

    jMenuBar1.add(jMenu3);

    jMenu4.setText("jMenu4");

    mnua.setText("ma");
    jMenu4.add(mnua);

    mnub.setText("mb");
    jMenu4.add(mnub);

    jMenuItem3.setText("mc");
    jMenu4.add(jMenuItem3);

    jMenuItem4.setText("md");
    jMenu4.add(jMenuItem4);

    jMenuItem5.setText("me");
    jMenu4.add(jMenuItem5);

    jMenuItem6.setText("jMenuItem6");
    jMenu4.add(jMenuItem6);

    jMenuItem7.setText("jMenuItem7");
    jMenu4.add(jMenuItem7);

    jMenuItem8.setText("jMenuItem8");
    jMenu4.add(jMenuItem8);

    exit.setText("exit");
    jMenu4.add(exit);

    jMenuBar1.add(jMenu4);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 277, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

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
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Menu().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem exit;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenu jMenu5;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem10;
  private javax.swing.JMenuItem jMenuItem11;
  private javax.swing.JMenuItem jMenuItem12;
  private javax.swing.JMenuItem jMenuItem13;
  private javax.swing.JMenuItem jMenuItem14;
  private javax.swing.JMenuItem jMenuItem15;
  private javax.swing.JMenuItem jMenuItem16;
  private javax.swing.JMenuItem jMenuItem17;
  private javax.swing.JMenuItem jMenuItem18;
  private javax.swing.JMenuItem jMenuItem19;
  private javax.swing.JMenuItem jMenuItem20;
  private javax.swing.JMenuItem jMenuItem21;
  private javax.swing.JMenuItem jMenuItem22;
  private javax.swing.JMenuItem jMenuItem23;
  private javax.swing.JMenuItem jMenuItem24;
  private javax.swing.JMenuItem jMenuItem3;
  private javax.swing.JMenuItem jMenuItem4;
  private javax.swing.JMenuItem jMenuItem5;
  private javax.swing.JMenuItem jMenuItem6;
  private javax.swing.JMenuItem jMenuItem7;
  private javax.swing.JMenuItem jMenuItem8;
  private javax.swing.JMenuItem mnua;
  private javax.swing.JMenuItem mnub;
  // End of variables declaration//GEN-END:variables
}
