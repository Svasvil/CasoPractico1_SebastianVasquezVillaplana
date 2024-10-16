package casopractico1;
public class nodoP {

    private datos dato; //Creamos los atributos 
    private nodoP siguiente; //Creamos los atributos 

    // Creamos el constructor 
    public nodoP(datos dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // hacemos los sets n gets
    public datos getDato() {
        return dato;
    }

    public nodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoP siguiente) {
        this.siguiente = siguiente;
    }
}

    

