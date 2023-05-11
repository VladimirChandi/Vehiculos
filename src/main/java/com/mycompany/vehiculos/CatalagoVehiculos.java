
package com.mycompany.vehiculos;
import static com.mycompany.vehiculos.catalogar.catalogar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CatalagoVehiculos {

    
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("Toyota", "Prado", "Rojo", "Automóvil", 4));
        vehiculos.add(new Vehiculo("Honda", "BWM", "Negro", "Motocicleta", 2));
        vehiculos.add(new Vehiculo("Chevrolet", "Camaro", "Amarillo", "Automóvil", 4));
        vehiculos.add(new Vehiculo("Suzuki", "Corsa", "Azul", "Motocicleta", 2));
        vehiculos.add(new Vehiculo("Ford", "Nisan", "Blanco", "Camioneta", 4));
        vehiculos.add(new Vehiculo("Kawasaki", "Road Glide", "Verde", "Motocicleta", 2));
        vehiculos.add(new Vehiculo("Nissan", "Sentra", "Gris", "Automóvil", 4));
    
        catalogar(vehiculos);
    }
}
   
    

