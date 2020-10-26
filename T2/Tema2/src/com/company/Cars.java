package com.company;

import javax.swing.*;

public class Cars {

    private int gears;
    private String fuel;
    private String engineType;
    private float price;
    public void getGears() {
        JOptionPane.showMessageDialog(null, "Masina are " + this.gears + " viteze. ");
    }
    public void setGears() {
        String gears = JOptionPane.showInputDialog(null, "Cate viteze are cutia masinii? ");
        this.gears = Integer.parseInt(gears);
    }
    public void getFuel() {
        JOptionPane.showMessageDialog(null, "Foloseste " + this.fuel + " pe post de carburant. ");
    }
    public void setFuel() {
        fuel = JOptionPane.showInputDialog(null, "Ce fel de carburant foloseste? ");
    }
    public void getEngineType(){
        JOptionPane.showMessageDialog(null, "Este un motor " + this.engineType+".");
    }
    public void setEngineType() {
        engineType = JOptionPane.showInputDialog(null, "Ce fel de motor este?");
    }
    public void getPrice() {
        JOptionPane.showMessageDialog(null,"Pretul masinii este "+this.price+" euro.");

    }
    public void setPrice() {
        this.price =Float.parseFloat(JOptionPane.showInputDialog(null, "Care este pretul masinii?"));
    }

    @Override
    public String toString() {
        return "{"+ "gears=" + gears + ", fuel=" + fuel + '\'' + ", engineType='" + engineType + '\'' + ", price=" + price + '}';

    }


}
