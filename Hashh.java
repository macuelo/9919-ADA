
package hashh;
import java.util.List;
import java.util.ArrayList;

public class Hashh {
    
private static final int NUM_BUCKETS = 5;
    private List<String>[] buckets;

    @SuppressWarnings("unchecked")
    public Hashh() {
        buckets = new List[NUM_BUCKETS];
        for (int i = 0; i < NUM_BUCKETS; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    
    private int hash(String clave) {
        return Math.abs(clave.hashCode()) % NUM_BUCKETS;
    }

    public void insertar(String clave) {
        int bucketId = hash(clave);
        buckets[bucketId].add(clave);
        System.out.println("Insertado '" + clave + "' en bucket " + bucketId);
    }

    public boolean buscar(String clave) {
        int bucketId = hash(clave);
        System.out.println("Buscando en bucket " + bucketId);
        return buckets[bucketId].contains(clave);
    }
    
    
    
    public static void main(String[] args)  {
        Hashh hashTable = new Hashh();
        
        // Insertar datos
        hashTable.insertar("Dota");
        hashTable.insertar("CS2");
        hashTable.insertar("AOE");
        hashTable.insertar("Sekiro");

        // Buscar
        System.out.println("¿'Dota' esta? " + hashTable.buscar("Dota"));
        System.out.println("¿'DOOM' esta? " + hashTable.buscar("Doom"));
    }
}
        
        
         

