/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarchivos2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author INTEL-COREi7
 */
public class Universidad {

    ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    static Scanner scan = new Scanner(System.in);
    
    Interfaz interfaz;

    public void carga() throws CargarArchivoExcepcion {
        try {

            BufferedReader in = new BufferedReader(new FileReader("alumnos.txt"));
            //BufferedWriter bw = new BufferedWriter(new FileWriter("alumnos.txt"));

            String inputLine;

            while ((inputLine = in.readLine()) != null) {

                if (inputLine.isEmpty()) {
                    continue;
                }

                Alumno alumno = new Alumno();

                String[] contactVars = inputLine.split(",");
                alumno.setId(contactVars[0]);
                alumno.setMatricula(contactVars[1]);
                alumno.setNombre(contactVars[2]);
                alumno.setApellido(contactVars[3]);
                alumno.setTelefono(contactVars[4]);
                alumno.setDireccion(contactVars[5]);
                alumno.setGPA(contactVars[6]);
                alumno.setFacultad(contactVars[7]);
                alumno.setCarrera(contactVars[8]);
                alumno.setNumcAprobados(contactVars[9]);

                listaAlumnos.add(alumno);

            }
            
            

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error de E/S");
        }
        
        throw new CargarArchivoExcepcion("Archivo vacio");
    }
    
    public void mostrarLista() {
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
                System.out.println(listaAlumnos.get(i).toString());
                //interfaz.listaAlumnos.get(i).toString();
           
        }
    }

    public void mostrarListaGPA() {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            int result = Integer.parseInt(listaAlumnos.get(i).getGPA());
            if (result > 80) {
                System.out.println(listaAlumnos.get(i).toString());
            }
        }
    }
    
    public void mostrarListaAnio() {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            int result = Integer.parseInt(listaAlumnos.get(i).getMatricula());
            if (result >= 2011) {
                System.out.println(listaAlumnos.get(i).toString());
            }
        }
    }
    
    public ArrayList getList() {
       try{
           carga();
       }catch(CargarArchivoExcepcion e){
           e.getMessage();
       }
       return listaAlumnos;
   }
    
    public void clonar(ArrayList lista){
        listaAlumnos = (ArrayList)lista.clone();
    }
    
    public void gestion() throws CargarArchivoExcepcion {
            int op = 0;
            int contador = 0;

            while (op != 6) {

                System.out.println("\n---Universidad---");
                System.out.println("1. Cargar Archivo de Alumnos");
                System.out.println("2. Consultar todos los alumnos");
                System.out.println("3. Consultar los alumnos con GPA mayor a 80");
                System.out.println("4. Consultar alumnos que entraron a partir del 2011");
                System.out.println("5. Agregar alumno (Interfaz)");
                System.out.println("6. Salir");
                System.out.print("Elija una opcion: ");

                op = scan.nextInt();

                switch (op) {
                    case 1:
                        try{
                            carga();                          
                        }catch(CargarArchivoExcepcion e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        mostrarLista();
                        break;
                    case 3:
                        mostrarListaGPA();
                        break;
                    case 4:
                        mostrarListaAnio();
                        break;
                    case 5:
                        Interfaz interfaz  = new Interfaz();
                        break;
                    case 6:
                        System.out.println("Good choice ...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        }
}

