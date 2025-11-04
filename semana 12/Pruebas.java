package pruebas;

    public static int binarySearch(int[] arr, int target) {
    int izquierda = 0;
    int derecha = arr.length - 1;

    while (izquierda <= derecha) {
        int medio = izquierda + (derecha - izquierda) / 2;  

        if (arr[medio] == target) {
            return medio;  
        } else if (arr[medio] < target) {
            izquierda = medio + 1;   
        } else {
            derecha = medio - 1;    
        }
    }

    return -1;  
}
public class Pruebas {
    public static void main(String[] args) {
        
        
        
        int[] datos = {62, 83, 18, 53, 7, 17, 95, 86, 47, 69, 25, 28};

        

       
        int indice = binarySearch(datos, 47);
        if (indice != -1) {
            System.out.println("Encontrado en índice: " + indice);
        } else {
            System.out.println("No encontrado");
        }
    }
}