/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.CongruenciaLineal;
import logica.CongruenciaMultiplicativa;
import logica.Distribucion;
import logica.Prueba;

/**
 *
 * @author Julian
 */
public class Test {

    public static void main(String[] args) {
        CongruenciaLineal cl = new CongruenciaLineal(1, 2, 7, 5);
        CongruenciaMultiplicativa cm = new CongruenciaMultiplicativa(3, 5, 7);
        try {
            System.out.println(Prueba.ejecutarPruebaVarianza(Distribucion.obtenerNiUniformes(cl.obtenerRi(32), 2, 10), 0.05));
//            System.out.println(Distribucion.obtenerNiNormales(cl.obtenerRi(32), 2, 10));
            ArrayList<Double> listaNi = cm.obtenerNumerosAleatorios(20);
//            for (int i = 0; i < 100; i++) {
//                listaNi.add(Math.random());
//            }
            System.out.println(listaNi);
            System.out.println(Prueba.ejecutarPruebaChi2(listaNi, 10));
            System.out.println(Prueba.ejecutarPruebaKS(listaNi));
            System.out.println(Prueba.ejecutarPruebaMedias(listaNi, 0.05));
            System.out.println(Prueba.ejecutarPruebaVarianza(listaNi, 0.05));
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
//        System.out.println(Distribucion.obtenerNiUniformes(cm.obtenerNumerosAleatorios(31), 9, 20));

    }
}
