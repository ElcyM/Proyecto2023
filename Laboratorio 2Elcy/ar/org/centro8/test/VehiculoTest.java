package ar.org.centro8.test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ar.org.centro8.entities.Moto;
import ar.org.centro8.entities.Auto;
import ar.org.centro8.entities.Vehiculo;

public class VehiculoTest {

        // Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
        // Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
        // Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
        // Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50

        public static void main(String[] args) {
                List<Vehiculo> list = new ArrayList();
                list.add(new Auto("Peugeot", "206", 4, 200000.00));
                list.add(new Moto("Honda", "Titan", "125c", 60000.00));
                list.add(new Auto("Peugeot", "208", 5, 250000.00));
                list.add(new Moto("Yamaha", "YBR", "160c", 80500.50));
                list.stream().forEach(System.out::println);

                System.out.println();
                System.out.println("=============================");

                // Vehículo más caro: Peugeot 208
                Vehiculo precioMaximo = list
                                .stream()
                                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                                .get();

                System.out.println("Vehículo más caro: " + precioMaximo.getMarca() + " " + precioMaximo.getModelo());

                System.out.println();

                // Vehículo más barato: Honda Titan
                Vehiculo precioMinimo = list
                                .stream()
                                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                                .get();
                System.out.println("Vehículo más barato: " + precioMinimo.getMarca() + " "
                                + precioMinimo.getModelo());

                System.out.println();

                list
                                .stream()
                                .filter(p -> p.getModelo().toLowerCase().startsWith("y".toLowerCase()))

                                .forEach(v -> System.out.println(
                                                "Vehiculo que contiene en el modelo la letra 'Y': " + v.getMarca()
                                                                + " " + v.getModelo() + " " + "$" + v.getPrecioMod()));

                System.out.println();
                System.out.println("============================");

                // Vehículos ordenados por precio de mayor a menor:
                // Peugeot 208, Peugeot 206,
                // Yamaha YBR, Honda Titan.
                System.out.println("Vehículos ordenados por precio de mayor a menor:");
                list
                                .stream()
                                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                                .forEach(r -> System.out.println(r.getMarca() + " " + r.getModelo()));

                System.out.println();
                System.out.println("****************************************************************");

                // Vehículos ordenados por orden natural (marca, modelo, precio):
                // Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
                // Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
                // Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
                // Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50

                System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
                list
                                .stream()
                                .sorted(Comparator.comparing(Vehiculo::getMarca))
                                .forEach(System.out::println);

                System.out.println();
                System.out.println("-----FIN-----");
                System.out.println();
        }

}
