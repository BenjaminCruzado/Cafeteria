package org.example;

import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private ArrayList<String> redesSociales;
    private ArrayList<Cafe> listaDeCafes;
    public Cafeteria(String nombre, String direccion, ArrayList<String> redesSociales, ArrayList<Cafe> listaDeCafes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redesSociales = redesSociales;
        this.listaDeCafes = listaDeCafes;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getRedesSociales() {
        return redesSociales;
    }

    public void setRedesSociales(ArrayList<String> redesSociales) {
        this.redesSociales = redesSociales;
    }

    public ArrayList<Cafe> getListaDeCafes() {
        return listaDeCafes;
    }

    public void setListaDeCafes(ArrayList<Cafe> listaDeCafes) {
        this.listaDeCafes = listaDeCafes;
    }
    public void agregarCafe(Cafe cafe){
        this.listaDeCafes.add(cafe);
    }
    public void eliminarCafe(Cafe cafe){
        this.listaDeCafes.remove(cafe);
    }
    public Cafe buscarCafePorTamano(String tamaño) {
        for (Cafe cafe : listaDeCafes) {
            if (cafe.getTamaño() == tamaño) {
                return cafe;
            }
        }
        return null;
    }
}
