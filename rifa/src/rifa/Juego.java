/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa;

import java.util.Arrays;

/**
 *
 * @author FP
 */
public class Juego {

    int[] carton = new int[5];
    int[] cartonNumGana = new int[5];
    int jugadores;
    int boteJ;
    String num1Ale;
    String num2Ale;
    String num3Ale;
    String num4Ale;
    String num5Ale;

    public String cartonAleatorio1() {
        carton[0] = (int) (Math.random() * (101));
        num1Ale = String.valueOf(carton[0]);
        return num1Ale;

    }

    public String cartonAleatorio2() {
        carton[1] = (int) (Math.random() * (101));
        num2Ale = String.valueOf(carton[1]);
        return num2Ale;
    }

    public String cartonAleatorio3() {
        carton[2] = (int) (Math.random() * (101));
        num3Ale = String.valueOf(carton[2]);
        return num3Ale;
    }

    public String cartonAleatorio4() {
        carton[3] = (int) (Math.random() * (101));
        num4Ale = String.valueOf(carton[3]);
        return num4Ale;
    }

    public String cartonAleatorio5() {
        carton[4] = (int) (Math.random() * (101));
        num5Ale = String.valueOf(carton[4]);
        return num5Ale;
    }

    public String numJugadores() {

        jugadores = (int) (5 + Math.random() * 11);

        String numJugadores = String.valueOf(jugadores);

        return numJugadores;
    }

    public String bote() {

        boteJ = jugadores * 10;
        String boteTotal = String.valueOf(boteJ);
        return boteTotal;
    }

    public int[] cartonGanador() {

        for (int i = 0; i < cartonNumGana.length; i++) {
            cartonNumGana[i] = (int) (Math.random() * 101);

        }
        return cartonNumGana;
    }

}
