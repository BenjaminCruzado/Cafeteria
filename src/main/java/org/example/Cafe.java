package org.example;

public class Cafe {
    private double gramosDeCafe;
    private double mililitrosDeAgua;
    private String tamaño;
    public Cafe(double gramosCafe, double mlAgua, String tamaño) {

        this.gramosDeCafe = gramosCafe;
        this.mililitrosDeAgua = mlAgua;
        this.tamaño = tamaño;
    }
    public double getGramosDeCafe() {
        return gramosDeCafe;
    }

    public void setGramosDeCafe(double gramosCafe) {
        this.gramosDeCafe = gramosCafe;
    }

    public double getMilimetrosDeAgua() {
        return mililitrosDeAgua;
    }

    public void setMlAgua(double mililitrosDeAgua) {
        this.mililitrosDeAgua = mililitrosDeAgua;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String toString() {
        return "Café{" +
                "gramosCafe=" + gramosDeCafe +
                ", mlAgua=" + mililitrosDeAgua +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }

}
