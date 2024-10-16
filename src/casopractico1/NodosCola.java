package casopractico1;
public class NodosCola { 
    public double nota; 
    public String nombre;
    public NodosCola siguiente; //Creamos atributos 

    public NodosCola(double nota, String nombre) { //Creamos constructor 
        this.nota = nota;
        this.nombre = nombre;
    }
 //Creamos sets and gets 
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//hacemos un to string 
    @Override
    public String toString() {
        return "NodosCola{" + "nota=" + nota + ", nombre=" + nombre + '}';
    }
}
