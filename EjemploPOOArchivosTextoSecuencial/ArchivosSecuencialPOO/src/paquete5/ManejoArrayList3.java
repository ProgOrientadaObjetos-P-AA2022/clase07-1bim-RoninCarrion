/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {

    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");

        Calificacion c1 = new Calificacion(10, "Matemáticas");

        Calificacion c2 = new Calificacion(8, "Álgebra");

        System.out.println("-----------------------------");

        // ArrayList
        ArrayList<Profesor> profesores2 = new ArrayList<>();

        ArrayList<Calificacion> calificacion = new ArrayList<>();
        profesores2.add(prof1);
        profesores2.add(prof2);

        calificacion.add(c1);
        calificacion.add(c2);
        c1.establecerProfesor(prof2);
        c2.establecerProfesor(prof1);

        // c1.establecerProfesor(prof2);
        for (int i = 0; i < calificacion.size(); i++) {
            System.out.printf("Nombre del profesor: %s\n"
                    + "Nombre de la materia: %s\n"
                    + "Nota: %.2f\n", calificacion.get(i).obtenerProfesor().obtenerNombre(),
                    calificacion.get(i).obtenerNombreMateria(),
                    calificacion.get(i).obtenerNota());
            System.out.println("------------------------------------------------");
//            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
//                    profesores2.get(i).obtenerTipo());
        }

    }
}
