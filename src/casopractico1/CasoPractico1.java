
package casopractico1;

import javax.swing.JOptionPane;

public class CasoPractico1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "caso pracitco #1 , Sebastian Vasquez  Villaplana ");
        //Ejercicio 1: 
        System.out.println("Primer ejercicio  :de recursividad \n  ");
        Recursividad recursividad = new Recursividad("Sebastian Vasquez "); //Creamos el objeto en la clase 
        recursividad.imprimeAlReves(); //Llamamos el metodo 
        System.out.println("\n " + recursividad.getNombreEstudiante() + "\n"); // de ejemplo para ver como se escribe 

//Ejericio 2
System.out.println("Segundo ejercicio :  pilas \n  ");
        Pila pila1 = new Pila(); //Creamos el objeto 
        //Llamamos todos los metodos con el objeto 
        pila1.AgregarPila(new datos("Lorena Villaplana " , 1975));
        pila1.AgregarPila(new datos("Ricardo Vasquez", 1972));
        pila1.AgregarPila(new datos("Sebastian Vasquez Villaplana ", 2006));
        pila1.AgregarPila(new datos("Ariel Vasquez Villaplana ", 1986));
        pila1.AgregarPila(new datos("Valeria Vasquez Villaplana  ", 1990));
        System.out.println("ellso son los q nacieron despues de 1980");
        pila1.imprimirDatos();
        System.out.println("\n");

        //Ejercicio 3: 
        System.out.println("Tercer ejercicio  : colas  \n");
        Cola NotasEstudiantes = new Cola(); // Creaamos el objeto 

        // LLamamos los metodos con el objeto 
        NotasEstudiantes.encolar(75, "Lorena");
        NotasEstudiantes.encolar(68, "Ricardo");
        NotasEstudiantes.encolar(55, "Luis Esteban ");
        NotasEstudiantes.encolar(79, "Valeria ");
        NotasEstudiantes.encolar(70, "Ariel");
        NotasEstudiantes.encolar(96, "Ana lucia ");
        NotasEstudiantes.encolar(98, "Yamileth ");
        NotasEstudiantes.encolar(100, "Noa");
        NotasEstudiantes.encolar(95, "Gustavo");
        NotasEstudiantes.encolar(97, "Aldo");
        NotasEstudiantes.encolar(82, "Ian ");
        NotasEstudiantes.encolar(90, "Jose Alberto ");
        NotasEstudiantes.encolar(88, "Maria Jose ");
        NotasEstudiantes.encolar(91, "Santiago ");
        NotasEstudiantes.encolar(85, "Mariano ");
         NotasEstudiantes.imprimir();
          NotasEstudiantes.imprimirIntermedios();
         
    }
}
