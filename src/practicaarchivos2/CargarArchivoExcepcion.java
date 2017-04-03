/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarchivos2;

import java.io.BufferedReader;
import java.io.File;

/**
 *
 * @author INTEL-COREi7
 */
public class CargarArchivoExcepcion extends Exception{

    public CargarArchivoExcepcion(String mensaje) {
        super(mensaje);
    }
}
