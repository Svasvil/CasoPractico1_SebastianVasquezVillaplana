package casopractico1;

public class Recursividad {

    private String nombreEstudiante; // creamos n atributo 
//Creamos los constructores 
    public Recursividad(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
//Creamos los sets n gets 
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void imprimeAlReves() {
        imprimeRecursivo(nombreEstudiante, nombreEstudiante.length() - 1);
    }

    private void imprimeRecursivo(String nombreEstudiante, int x) { //Creamos el metodo 
        if (x < 0) { //Valiamos una condicion para que se ejecute 
            return;
        }
        System.out.print(nombreEstudiante.charAt(x)); //lo q hace  es invertir el orden 
        imprimeRecursivo(nombreEstudiante, x - 1); // imprime el metodo ya al revez 
    }
}
