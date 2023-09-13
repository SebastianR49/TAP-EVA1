/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Heap {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Persona pers = new Persona();
    Persona pers2 = new Persona("clerk","maxwell",1831);
    Persona copia = new Persona();
    
    //System.out.println(1);
    //System.out.println(2);
    
    //pers = null;   //borra direccion de objeto
    
    //Persona copia = pers2;    //no es una copia, solo copia la direccion de memoria al mismo objeto
    
    copia.setNombre(pers2.getNombre());
    copia.setApellido(pers2.getApellido());
    copia.setEdad(pers2.getEdad());
    
    
    
            System.out.println(pers2.getNombre());
            System.out.println(pers2.getApellido());
            System.out.println(pers2.getEdad());
            System.out.println(pers2);
            System.out.println(copia);
            
            System.out.println(copia.getNombre());
            System.out.println(copia.getApellido());
            System.out.println(copia.getEdad());      
    
    
    /*
    if(1 == 2)
      System.out.println("objetos iguales");
    else
      System.out.println("objetos distintos");
    */
    // TODO code application logic here
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

