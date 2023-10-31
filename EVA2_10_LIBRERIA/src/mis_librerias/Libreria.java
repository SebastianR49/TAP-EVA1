/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_librerias;

/**
 *
 * @author sebas
 */
public class Libreria {
  
  public static int calcularfactorial(int valor){
    
    int factorial = 1;
    for (int i = 1; i <= valor; i++) {
      
      //
      factorial*=i;
      
    }
    return factorial;
  }
  
}
