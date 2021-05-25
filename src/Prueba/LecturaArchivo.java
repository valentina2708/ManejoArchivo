package Prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturaArchivo {

    public static void main(String[] args) {

        File archivo = null;
        // metodos para leer archivos
        FileReader lectura = null;
        BufferedReader leer = null;
        //Apertura del fichero y creacion de bufferedaReader para hacer la lectura

        try {

            //intanciar las clases
            archivo = new File("d:/protestas.txt");
            lectura = new FileReader(archivo);
            leer = new BufferedReader(lectura);
            String linea;
            while ((linea = leer.readLine()) != null) {
                System.out.println("" + linea);
            }

        }catch (FileNotFoundException ex) {
            System.out.println("NO SE PUDO ENCONTRAR EL ARCHIVO");
        
        } catch (IOException ex) {
            System.out.println("NO SE PUDO LEER");
        }

    }
}
