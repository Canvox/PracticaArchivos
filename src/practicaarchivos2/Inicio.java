/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarchivos2;

/**
 *
 * @author INTEL-COREi7
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Universidad u = new Universidad();
        u.carga();
        u.mostrarLista();
        u.mostrarListaGPA();
        u.mostrarListaAnio();/*
        
        */
        //Interfaz interfaz = new Interfaz();
        Universidad u = new Universidad();
        try{
            u.gestion();
        }catch(CargarArchivoExcepcion e){
            System.out.println(e.getMessage());
        }
        
    
    }
    
}
