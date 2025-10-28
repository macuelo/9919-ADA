
package hashtale;

import java.util.LinkedList;


public class HashTable {
    
    public Hashtable (int tamaño){
        tabla = new LinkedList[tamaño];
        for(int i = 0; i<tamaño; i++){
        tabla[i] = new LinkedList<>();
        }
        }

    private int hash (String clave) {
    return clave.length() % tabla.length;
    }
    
    public void insertar (String clave) {
    int idx  = hash(clave);
    tabla[idx].add(clave);
    
    }    
    
    public void mostrar(){
    for (int i = 0 ; i< tabla.length; i++){
        System.out.println(i+"=="+ tabla[i]);
    }
    }
    
} 
