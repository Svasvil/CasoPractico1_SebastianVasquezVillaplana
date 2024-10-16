package casopractico1;

public class Cola {

    private NodosCola frente;  //Creamos para que vaya al frente de la cola , como primero 
    private NodosCola finalCola; // Creamsos para que vaya al final  de la cola , como ultimo 

    public Cola() {
        this.frente = null; // Ihacemos que la coasl no tenga nada 
        this.finalCola = null; // hacemos q la cola no tenga nada 
    }

    //Creamos un metodo para agregar datos a lca cola 
    public void encolar(double nota, String nombre) { // Con los parametros de nota y nombre 
        NodosCola nuevoNodo = new NodosCola(nota, nombre); // Crear nuevo nodo 
        if (finalCola == null) { // validamos que la cola este vacia 
            frente = nuevoNodo; // Creamos un nuevo nodo q va a ser el primero de la lusta 
            finalCola = nuevoNodo; // el nuevo nodo creado tmb sera el ultimo debido a que esta vacia 
        } else { // validamos que la cola no este vacia 
            finalCola.siguiente = nuevoNodo; // ponemos q el nuevo nodo sera el ultimo 
            finalCola = nuevoNodo; // Actualizamos
        }
    }

    // Hacemos metodo pa que se vean todas las notas 
    public void imprimir() {
        NodosCola actual = frente; //Hacemos q todos los nodos vayan al frente 
        while (actual != null) { // validamos que el nodo no este vaccido
            System.out.print(actual + " "); // Imprimir datos
            actual = actual.siguiente; // pasadsmos al siguiente nodos
        }
  }
    // Creamos el metodo q se pidio 
    public Cola imprimirIntermedios() {
        Cola resultados = new Cola(); // Nueva cola para resultados
        NodosCola aux = frente; // Iniciamos el aux en el principio de la cola 

        // recorremos la cola origina
        while (aux != null) { //validamos q si hayan datos en este caso notas 
            if (aux.getNota() > 80 && aux.getNota() < 95) { //validamos q las notas esten entre 80 y 95
                resultados.encolar(aux.getNota(), aux.getNombre()); // agregamos los datos (nombre y notas )a la cola 
            }
            aux = aux.siguiente; // pasamos al siguiente nodo 
        }

        return resultados; // devoldemos la cola 
    }
}