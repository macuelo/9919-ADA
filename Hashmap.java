
package pkgtry;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Crear una tabla hash (HashMap)
        HashMap<String, Integer> key = new HashMap<>();

        // Insertar pares clave-valor
        key.put("persona1", 25);
        key.put("persona2", 30);
        key.put("persona3", 22);

        // Buscar un valor
        System.out.println("key: " + key.get("persona1")); 

        
        if (key.containsKey("persona3")) {
            System.out.println("encontrado.");
        }

        
        key.remove("persona2");

        
        for (String nombre : key.keySet()) {
            System.out.println(nombre + " tiene " + key.get(nombre) + " .");
        }
    }
}