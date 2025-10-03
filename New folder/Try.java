
package pkgtry;
import java.util.HashMap;

public class Try {

  
    public static void main(String[] args) {
    HashMap<Integer, Juego> juegosMap = new HashMap<>();


juegosMap.put(570, new JuegoDePago("Dota 2", 0.0, "MOBA"));
juegosMap.put(730, new JuegoDePago("CS:GO", 14.99, "FPS"));


Juego j = juegosMap.get(570);
System.out.println("Juego encontrado: " + j.getNombre());
    }
    
}
