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
public class Varestatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facil c1 = new Facil(4);
        c1.calcular();
        c1.mostra();
        Facil c2 = new Facil(2);
        c2.mostra();

    }
}
