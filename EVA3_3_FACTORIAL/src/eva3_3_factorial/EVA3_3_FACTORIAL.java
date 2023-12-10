
package eva3_3_factorial;


public class EVA3_3_FACTORIAL {

 
    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Factorial de 5 es: " + calcularFactorial(valor));

        //CREAR MÉTODO calcularPotencia
        System.out.println(calcularPotencia(3, 2));
        
    }
    
    
    
     public static int calcularFactorial(int valor) {
        int guardar = 1;

        for (int i = 1; i <= valor; i++) {
            guardar *= i; //guardar = guardar * i
        }

        return guardar;
    }

    public static int calcularPotencia(int base, int potencia) {
        int resul = 1;
        for (int i = 1; i <= potencia; i++) {
            resul*=base;
        }
        return resul;
    }
}
