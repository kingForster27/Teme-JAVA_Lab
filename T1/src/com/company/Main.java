package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int nrTotal, i, numar;
        float sum=0,average;
        nrTotal=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduceti nr de numere: "));
        JOptionPane.showMessageDialog(null, "Introduceti "+nrTotal+" numere.");
        for (i = 1; i <= nrTotal; i++) {
            numar = Integer.parseInt(JOptionPane.showInputDialog("Introduceti numarul "+i));
            sum += numar;
        }
        average = sum / nrTotal;
        JOptionPane.showMessageDialog(null,"Media aritmetica este egala cu " +average);
    }
}
