
package Prueba;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;//io entrada y salida de datos
import java.util.logging.Level;
import java.util.logging.Logger;


public class EscribirArchivo {

  
    public static void main(String[] args) {
       //METODO QUE ESCRIBE UN ARCHIVO
        FileWriter archivo=null;
       // una clase que sirve para crear y escribir archivos en java
        PrintWriter escribir=null;
        
        //crear una excepción
        try {
            archivo=new FileWriter("D:/protestas.txt");
            //intanciar el printWriter
            //modificar el archivo o agregar datos
            escribir=new PrintWriter(archivo);
            escribir.println("VIVA EL PARO NACIONAL");
            escribir.println("A parar, para avanzar");
            //se puede imprimir un ciclo
            for (int i = 1; i <= 10; i++) {
                escribir.println("Numero:"+i);
                
            }
        } catch (IOException ex) {
            System.out.println("NO SE PUDO GUARDAR EL ARCHIVO");
        }
        // para asegurarse que se cierre el fichero
        
        finally{
            try{
             archivo.close();
            }catch(Exception e2){
                System.out.println("NO SE PUDO CERRAR EL ARCHIVO");
            }
        }
    
    }
    
}
