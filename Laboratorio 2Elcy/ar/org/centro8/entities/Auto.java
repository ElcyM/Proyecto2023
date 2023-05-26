package ar.org.centro8.entities;

public class Auto extends Vehiculo {

    private int puertas;

    public Auto(String marca, String modelo, int puertas ,double precio ) {
        super(marca, modelo, precio);
        this.puertas=puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + puertas
        + " // Precio: " + getPrecioMod();
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}