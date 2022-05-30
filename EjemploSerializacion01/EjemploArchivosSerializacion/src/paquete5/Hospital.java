/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{

    public Hospital(String a, int b, double c) {
        nombre = a;
        numeroCamas = b;
        presupuesto = c;
    }
    String nombre;
    int numeroCamas;
    double presupuesto;

    public String establecerNombre() {
        return nombre;
    }

    public void obtenerNombre(String a) {
        nombre = a;
    }

    public int establecerNumeroCamas() {
        return numeroCamas;
    }

    public void obtenerNumeroCamas(int a) {
        numeroCamas = a;
    }

    public double establecerPresupuesto() {
        return presupuesto;
    }

    public void obtenerPresupuesto(double a) {
        presupuesto = a;
    }
}