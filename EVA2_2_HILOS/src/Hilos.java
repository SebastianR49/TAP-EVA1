
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Hilos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    Runnable runable = new Runnable(){
      @Override
      public void run() {
        //cualquier tarea que se ejecuta simultaneamente
        for (int i = 0; i < 10; i++){
          System.out.println(i);
        try {
          Thread.sleep(500);
        } catch (InterruptedException ex) {
          Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
      }
      
    };
    //runnable no se ejecuta directamente
    //se debe ejecutar a traves de un thread
    Thread hilo = new Thread(runable);
    hilo.start();     //inicia hilo
    //--------------------------------------------------------------------------
    HiloJr jr = new HiloJr();
    jr.start();//inicia hilo
    
    
    
    
    
  }
  
}
