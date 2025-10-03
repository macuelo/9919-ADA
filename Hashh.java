
package hashh;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Hashh {

    public static void main(String[] args) {

        List<String> datos = Arrays.asList(
            "CS2", "Dota", "AOE", "DOOM", "Portal"
        );
        
        Map<String, Integer> indice = new HashMap<>();
        for (int i = 0; i < datos.size(); i++) {
            indice.put(datos.get(i), i);}
        
        String clave = "cs";
        if (indice.containsKey(clave)) {
            int posicion = indice.get(clave);
            System.out.println("Encontrado: " + datos.get(posicion) + 
                               " en posicion " + posicion);
        } else {
            System.out.println("No encontrado");
        }
        
    }
}
        
        
         

