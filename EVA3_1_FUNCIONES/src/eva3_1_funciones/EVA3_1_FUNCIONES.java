
package eva3_1_funciones;


public class EVA3_1_FUNCIONES {

  
    public static void main(String[] args) {
         imprimirMensaje ("HOLA MUNDO",5);
        imprimirMensaje ("ADIOS MUNDO",6);
        imprimirMensaje ("ÉPICO",7);
              
        
    }
    public static void imprimirMensaje(String mensaje, int cant){
        
        
        for (int i = 0; i < cant; i++) {
            System.out.print(mensaje+" ");
        }
    } 
}
