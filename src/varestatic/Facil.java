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
public class Facil {

    private int y;
    private static int x = 5;

    Facil(int y) {
        this.y = y;
    }

    public void calcular() {
        int x = 1;
        for (int i = y; i > 0; i--) {
            x*=i; // x = 1 * 4 // 4 = 4 * 3 12 = 12 * 2  24 = 24 * 1  x = 24
        }
        x--;// x = 24 -1 x = 23
        System.out.println("y= " + y-- + " x= " + x);
    }

    public void mostra() {
        System.out.println("y= " + y-- + " x= " + x--);
    }
}
