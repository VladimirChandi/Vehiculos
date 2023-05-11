
package com.mycompany.vehiculos;

import java.util.ArrayList;
import java.util.List;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private int numRuedas;

    public Vehiculo(String marca, String modelo, String color, String tipo, int numRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.numRuedas = numRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
}
    