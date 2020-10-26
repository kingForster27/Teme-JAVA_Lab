package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int nr,i;
        String x = JOptionPane.showInputDialog(null, "Cate masini ai?");
        nr = Integer.parseInt(x);

        Cars[] car;
        car = new Cars[nr];

        for (i = 0; i < nr; i++) {
            car[i] = new Cars();
            car[i].setGears();
            car[i].setFuel();
            car[i].setEngineType();
            car[i].setPrice();

            car[i].getGears();
            car[i].getFuel();
            car[i].getEngineType();
            car[i].getPrice();

        }
        for (i=0; i < nr; i++)
            for(int j=1;j<=i+1;j++) {
                JOptionPane.showMessageDialog(null,"Masina "+j+car[i].toString());
            }
    }
}
