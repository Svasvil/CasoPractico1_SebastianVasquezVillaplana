
package casopractico1;
public class Pila {
    private nodoP cima;

   //Creamos un constructor vacio 
    public Pila() {
        this.cima = null; 
    }

    //Creamos un metodo para meter un nuevo datos a la cola 
    public void AgregarPila(datos dato) {
        nodoP nuevoNodo = new nodoP(dato);
        nuevoNodo.setSiguiente(cima);
        cima = nuevoNodo;
    }

    // Creamos un metoodo para quitar un dato 
    public datos QuitarPilar() {
        if (cima != null) {
            datos dato = cima.getDato();
            cima = cima.getSiguiente();
            return dato;
        }
        return null;
    }

//Creamos metodo para ver quienes son mayores a 1980
    public void imprimirDatos() { //Creamos el metodso 
        nodoP nodo1 = cima; //Creamos una cima del nodo , como crear un aux 
        while (nodo1 != null) { //Validamos que el nodo no este vacio pq si no no funciona 
            if (nodo1.getDato().getAnnioNacimiento() > 1980) { // vemos cuales fechas son mayores a 1980
                System.out.println("Nombre: " +nodo1.getDato().getNombre() + " \n Annio de Nacimiento: " + nodo1.getDato().getAnnioNacimiento()); //imprimos los que tengan fecha de naciemiento mayor a 1980 
            }
            nodo1 = nodo1.getSiguiente();
        }
    }
}

