/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_tuttifruti;

/**
 *
 * @author anelm
 */
public class EVA3_8_TUTTIFRUTI {
    final static String USUARIO= "TUTTI";
    final static String PASSWORD= "FRUTTI";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static boolean validarUsuario (String usuario, String pdw){
        if(usuario.equals (USUARIO) && pdw.equials (PASSWORD))
            return true;
        else
            return false;
        
    }
}
