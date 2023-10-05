
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class HiloJr extends Thread {  

  @Override
  public void run() {
    super.run(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    //aqui va el codigo que quieren ejecutar simultaneamente (multitarea)
    for (int i = 0; i < 10; i++){
      try {
        Thread.sleep(1000);
        System.out.println("clase thread " + i);
      } catch (InterruptedException ex) {
        Logger.getLogger(HiloJr.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    }
    
  }
  
  
  
  
  
}
