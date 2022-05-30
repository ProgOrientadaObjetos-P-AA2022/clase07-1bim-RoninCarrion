/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author ronni
 */
public class Ejecutor {
    public static void main(String[] args) {
                String nombre = "Hospitales.data";

        Hospital c1 = new Hospital("Hospital del día",10,200);
        Hospital c2 = new Hospital("San Juan de Dios", 20, 1000);
        Hospital c3 = new Hospital("Hospital Militar", 30, 2000);


        Hospital[] lista = {c1, c2, c3};

        EscrituraArchivoSecuencial archivo = new
         EscrituraArchivoSecuencial(nombre);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombre);
        lectura.establecerListaHospital();
        System.out.println(lectura);
    }
    }

