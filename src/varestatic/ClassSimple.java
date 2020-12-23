/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varestatic;

/**
 *
 * @author Thiago
 */
public class ClassSimple {

    private final float y;
    private static float a = 3;

    ClassSimple(float y) {
        this.y = y;
    }

    public void calcular() {
        double x = Math.sqrt(a + y); //( 3 + 0 ) 
        a += 1; // a = a + 1; (3 + 1) a = 4
        System.out.println("\n x= " + x); // Raiz Quadrada de x (3 e depois 4)
    }
}
