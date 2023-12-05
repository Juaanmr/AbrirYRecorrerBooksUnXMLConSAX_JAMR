/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg1.pkg5.maschungo;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Juan
 */
public class TitulosBooksSAXhandler extends DefaultHandler{
    
    private String etiqueta;
    
    public TitulosBooksSAXhandler(){
        etiqueta = "";//también se puede hacer con int etiqueta
    }
    
    /**
     * sobrescribimos el metodo para mostrar por pantalla el System.out.println
     */
    @Override
    public void startDocument() {
        System.out.println("LISTADO DE TITULOS");
        System.out.println("==================");
    }
    
    /**
     * sobrescribimos el metodo que se ejectado para que nos impirma por pantalla lo que deseamos
     * @param uri
     * @param localName
     * @param qName
     * @param atts
     * @throws SAXException error al leer el xml
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (qName.equals("book")) {
            etiqueta = "book";
        } else if (qName.equals("title")) {
            etiqueta = "title";
        } else if (qName.equals("author")) {
            etiqueta = "author";
        } else if (qName.equals("genre")) {
            etiqueta = "genre";
        } else if (qName.equals("price")) {
            etiqueta = "price";
        } else if (qName.equals("publish_date")) {
            etiqueta = "publish_date";
        } else if (qName.equals("description")) {
            etiqueta = "description";
        }
    }
    
    /**
     * metodo que elimina tabulaciones y saltos de linea 
     * @param ch
     * @param start
     * @param length
     * @throws SAXException 
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (etiqueta.equals("title") || etiqueta.equals("author")) {
            String car = new String(ch, start, length);
            car = car.replaceAll("\t", "");//quita todos los tabuladores
            car = car.replaceAll("\n", "");
            if(etiqueta.equals("Titulo")){
                System.out.print(car + ", ");
            }else if(etiqueta.equals("author")){
                System.out.println(car + "\n");
            }
        }
    }
}
