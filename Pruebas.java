
package pruebas;

import javax.swing.JOptionPane;

public class Pruebas {

    public static void main(String[] args) {
  
        int arreglo[] = {4,3,6,2,8,6,7,8,1};
        int dato;
        boolean b= false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("INGRESE VALOR A BUSCAR:"));
        
        int i=0;
        while(i<arreglo.length && b == false){
        
            if(arreglo[i] == dato){
                b=true;}
        i++;
        }
        if (b == false){
            JOptionPane.showMessageDialog(null,"numero no se encuentra en el arreglo");
            }
        else {
            JOptionPane.showMessageDialog(null,"numero encontrado posicion : "+ (i-1));
            }
            
        }
    
}
