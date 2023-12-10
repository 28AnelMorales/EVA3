/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_objetoss;

/**
 *
 * @author anelm
 */
public class EVA3_7_OBJETOSs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
        Persona person1 = new Persona();
        System.out.println(person1);
        person1.nombre = "Jose";
        person1.apellido = "Tompson";
        person1.edad =18;
        imprimirPersonas(person1);
        
        Persona person2 = new Persona();
        System.out.println(person2);
        person2.nombre = "Juan";
        person2.apellido = "Mcdugly";
        person2.edad =47;
        imprimirPersonas(person2);
    }
    
    
    
    
     public static void imprimirPersonas(Persona person){
            System.out.println("Dirreccion:"+ person);
            System.out.println("Nombre completo: "+person.nombre+ " "+ person.apellido);
            System.out.println("Edad: "+ person.edad);
           
            }
    
}
class Persona{
        String nombre;
        String apellido;
        int edad;
        
}