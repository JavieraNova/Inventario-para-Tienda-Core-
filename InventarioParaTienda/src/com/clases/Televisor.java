package com.clases;

public class Televisor extends ProductoElectrodomestico {
	//Agrega atributos adicionales específicos para televisores, como tamañoPantalla y resolución.
    private double tamañoPantalla;
    private String resolución;

    // Constructor
    public Televisor(String nombre, double precio, int cantidadDisponible, double tamañoPantalla, String resolución) {
        super(nombre, precio, cantidadDisponible);
        this.tamañoPantalla = tamañoPantalla;
        this.resolución = resolución;
    }

    // Sobrescribir método mostrarInformacion
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño de Pantalla: " + tamañoPantalla + " pulgadas, Resolución: " + resolución);
    }
}