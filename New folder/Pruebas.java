
package pruebas;

import java.util.Scanner;
public class Pruebas {
   public static int buscar(int numeros [], int valor) {
        int izquierda = 0;
        int derecha = numeros.length - 1;
        
        while( izquierda <= derecha){
             int medio = (izquierda+derecha)/2;
            
            if (numeros[medio] == valor){
            return numeros[medio];
            }else{
                if (numeros[medio] < valor){
                    izquierda = medio+1;
                }else{
                    derecha = medio-1;}
                }
        }
            return -1;
        }
   
    public static void main(String[] args) {
  
        int numeros[] = {2,4,8,23,45,48,52,53,61,68,69,75,79,100};
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el número a buscar: ");
        int valor = teclado.nextInt();
        
        int resultado = buscar(numeros, valor);
        
        if (resultado != -1) {
            System.out.println(" Posición: " + resultado);
        } else {
            System.out.println("No encontrado.");
        }
    }

}
        
   
