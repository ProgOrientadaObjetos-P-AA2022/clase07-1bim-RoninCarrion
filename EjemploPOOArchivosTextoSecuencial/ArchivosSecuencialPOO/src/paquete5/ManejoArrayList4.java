/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {
        Empresa e1;
        Empresa e2;
        Empresa e3;

        e1 = new Empresa("Ile", "Loja");
        e2 = new Empresa("Toyota", "Quito");
        e3 = new Empresa("Inapesa", "Guayaquil");

        ArrayList<Empresa> empresa = new ArrayList<>();

        empresa.add(e1);
        empresa.add(e2);
        empresa.add(e3);

        for (int i = 0; i < empresa.size(); i++) {
            System.out.printf("%s - %s\n", empresa.get(i).obtenerNombre(),
                    empresa.get(i).obtenerCiudad());
        }
        System.out.println("--------------------------------");
        System.out.println("Ronin Carrión");
    }
}
