/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class AlumnoController {
     LibroModel[] tablaAlumno;
    int indiceArray;
    
    public AlumnoController(){
        this.tablaAlumno = new  LibroModel[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno( LibroModel cliente){
        this.tablaAlumno[this.indiceArray]=cliente;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public  LibroModel[] getAlumnos(){
        return this.tablaAlumno;
    }
}
