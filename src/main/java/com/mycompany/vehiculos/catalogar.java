
package com.mycompany.vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class catalogar {
    public static void catalogar(List<Vehiculo> vehiculos) {
    // Mapa para almacenar el número de vehículos por subcategoría
    Map<String, Integer> subcategorias = new HashMap<>();
    subcategorias.put("Automóvil", 0);
    subcategorias.put("Motocicleta", 0);
    subcategorias.put("Camioneta", 0);

    // Mapa para almacenar el número de vehículos por número de ruedas
    Map<Integer, Integer> numRuedas = new HashMap<>();
    numRuedas.put(2, 0);
    numRuedas.put(4, 0);

    // Mapa para almacenar el número de vehículos por color
    Map<String, Integer> colores = new HashMap<>();

    // Recorrer la lista de vehículos y actualizar los mapas
    for (Vehiculo vehiculo : vehiculos) {
        // Actualizar el mapa de subcategorías
        String subcategoria = vehiculo.getTipo();
        subcategorias.put(subcategoria, subcategorias.get(subcategoria) + 1);

        // Actualizar el mapa de número de ruedas
        int numRuedasVehiculo = vehiculo.getNumRuedas();
        numRuedas.put(numRuedasVehiculo, numRuedas.get(numRuedasVehiculo) + 1);

        // Actualizar el mapa de colores
        String colorVehiculo = vehiculo.getColor();
        if (colores.containsKey(colorVehiculo)) {
            colores.put(colorVehiculo, colores.get(colorVehiculo) + 1);
        } else {
            colores.put(colorVehiculo, 1);
        }
    }

    // Calcular el color predominante
    String colorPredominante = null;
    int maxRepeticiones = 0;
    for (Map.Entry<String, Integer> entry : colores.entrySet()) {
        String color = entry.getKey();
        int repeticiones = entry.getValue();
        if (repeticiones > maxRepeticiones) {
            colorPredominante = color;
            maxRepeticiones = repeticiones;
        }
    }

    // Imprimir los resultados
    System.out.println("Subcategorías:");
    for (Map.Entry<String, Integer> entry : subcategorias.entrySet()) {
        String subcategoria = entry.getKey();
        int numVehiculos = entry.getValue();
        System.out.println("- " + subcategoria + ": " + numVehiculos);
    }

    System.out.println("Colores:");
    System.out.println("- Predominante: " + colorPredominante);
    for (Map.Entry<String, Integer> entry : colores.entrySet()) {
        String color = entry.getKey();
        int numVehiculos = entry.getValue();
        System.out.println("- " + color + ": " + numVehiculos);
    }

    System.out.println("Número ruedas de vehiculo:");
    System.out.println("- Dos ruedas: " + numRuedas.get(2));
    System.out.println("- Cuatro ruedas: " + numRuedas.get(4));

    // Imprimir la lista de vehículos de dos y cuatro ruedas
    System.out.println("Vehículos de dos ruedas:");
    for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getNumRuedas() == 2) {
                System.out.println("- " + vehiculo.getTipo() + " " + vehiculo.getColor());
            }
    }
            System.out.println("Vehículos de cuatro ruedas:");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getNumRuedas() == 4) {
                System.out.println("- " + vehiculo.getTipo() + " " + vehiculo.getColor());
            }
            
        }
    }
}





                    
    

    