package ar.org.centro8.entities;

import java.text.DecimalFormat;

public class Vehiculo implements Comparable<Vehiculo> {

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public int compareTo(Vehiculo para) {
   
    DecimalFormat df = new DecimalFormat("$#,###,##0.00");
        String thisVehiculo = this.getMarca() + ", " + this.getModelo() + ", " + df.format(this.getPrecio());
        String paraVehiculo = para.getMarca() + ", " + para.getModelo() + ", " + df.format(para.getPrecio());
        return thisVehiculo.compareTo(paraVehiculo);
    }
   
    @Override
    public String toString() {
        
        return "marca=" + marca + ", modelo=" + modelo + ", Precio: $" + precio ;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public String getPrecioMod() {
        DecimalFormat df = new DecimalFormat("$#,###,##0.00");
        return df.format(precio);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}