/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1.pkg5.maschungo;

import java.io.File;

/**
 *
 * @author Juan
 */
public class UsaAccesoBooksXMLSAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("books.xml");
        //primer apartado de la practica
        AccesoBooksXMLSAX a = new AccesoBooksXMLSAX();
        //a.parsearXMLconLibrosSAXhandler(f);
        
        //segunda parte de la practica 
        a.parsearXMLconTituloSAXhandler(f);
    }
}
