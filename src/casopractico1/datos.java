package casopractico1;
public class datos {
    public String nombre; //Creamos los atributos 
    public int  annioNacimiento; //Creamos los atributos 

    public datos() { //Creamos un constructor vacio 
        this.nombre="";
      
    }

    public datos(String nombre, int annioNacimiento) { //Creamos un constructor con los parametros 
        this.nombre = nombre;
        this.annioNacimiento = annioNacimiento;
    }
 //Sets and gets  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnnioNacimiento() {
        return annioNacimiento;
    }

    public void setAnnioNacimiento(int annioNacimiento) {
        this.annioNacimiento = annioNacimiento;
    }
    
    
    
    
}
