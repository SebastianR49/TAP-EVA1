/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Poli {

  /**
   * @param args the command line arguments
   */
  
  static Persona pers;
  static Persona pers1;
  
  
  public static void main(String[] args) {
    // TODO code application logic here
    Persona pers = new Persona();
    Persona pers1 = new Persona("juan","maxwell",1984);
    Persona pers2 = new Persona();
    Persona pers3 = new Persona();
    
    System.out.println(pers);
    System.out.println(pers1);
    
    mensaje(pers);
    mensaje(pers1);
    
    
  }
  
  
  public static void mensaje(Object obj){
    System.out.println("metodo mensaje");
    System.out.println(obj);
    if(obj == pers)
      System.out.println("persona");
    else
      System.out.println("persona 1");
    
    Persona pers = (Persona)obj;
    
    System.out.println(pers.getNombre());
    System.out.println(pers.getApellido());
    System.out.println(pers.getEdad());
    
  }
        
          
  
  
}

class Persona{
    private String nombre,apellido;
    private int edad;
    
    public Persona(){
      
    }

    public Persona(String nombre, String apellido, int edad) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getApellido() {
      return apellido;
    }

    public void setApellido(String apellido) {
      this.apellido = apellido;
    }

    public int getEdad() {
      return edad;
    }

    public void setEdad(int edad) {
      this.edad = edad;
    }
        
  }
