/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_objetos;

/**
 *
 * @author anelm
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CLASES Y OBJETOS, UNA CLASE ES UNA PLANTILLA PARA CREAR OBJETOS Y UNA PLANTILLA SIRVE PAA CREAR MULTIPLES OBJETOS SEMEJANTES/COMO TAL LA PLANTILLA NO ECISTE
        //SON codigos
        Persona persol = new Persona ();
        System.out.println(persol);
        persol.nombre= "Juan";
        persol.apellido= "Perez";
        persol.edad=10;
        imprimirPersonas
        
        Persona perso2 = new Persona ();
        System.out.println("perso2");
        perso2.nombre= "pedro";
        perso2.apellido="Páramo";
        perso2.edad= 70;
    }
    public static void imprimirPersonas (Persona perso);{
            System.out.println("direccion: "+perso);
            System.out.println("nombre completo:"+perso.nombre + " "+perso.apellido);
            System.out.println("edad:"+perso+edad);
    //se crea un nuevo tipo de dato
   class Persona {
       String nombre;
       String apellido;
       int edad;
       
   }
        
}
