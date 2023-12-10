/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_paso_parametross;

/**
 *
 * @author anelm
 */
public class EVA3_6_PASO_PARAMETROSs {

    
    public static void main(String[] args) {
       
          int x=5;
        System.out.println("El valor de x en el main() es de:"+x );
        pasoPorValor(x);
        System.out.println("El valor modificado despues de la llamada es de: "+x);
        
    }
    
    
    public static void pasoPorValor(int valor){
        System.out.println("El valor que recibo en el método es de: "+valor);
        valor++;
        System.out.println("El valor modificado en el método es de: "+valor);
    }
    
}
