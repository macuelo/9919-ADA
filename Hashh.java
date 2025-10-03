
package hashh;
import java.util.List;
import java.util.Arrays;
public class Hashh {

    private static final int tamanoBloque = 3;

    public static String buscarPorBloques(List<String> archivo, String clave) {
        int totalRegistros = archivo.size();
        int numBloques = (int) Math.ceil((double) totalRegistros / tamanoBloque);

        for (int i = 0; i < numBloques; i++) {
            int inicio = i * tamanoBloque;
            int fin = Math.min(inicio + tamanoBloque, totalRegistros);

            System.out.println("Leyendo bloque " + i + " (registros " + inicio + " a " + (fin - 1) + ")");
            
            for (int j = inicio; j < fin; j++) {
                String registro = archivo.get(j);
                if (registro.equals(clave)) {
                    return "Encontrado en bloque " + i + ", posición " + j;
                }
            }
        }
        return "No encontrado";
    }
    
    public static void main(String[] args) {

            List<String> archivo = Arrays.asList("Dota", "CS2", "DOOM", "AOE", "Elden Ring", "Resident Evil", "Muck");
        System.out.println(buscarPorBloques(archivo, "CSCCSCS"));
    }
}
        
        
            
        
    
    

