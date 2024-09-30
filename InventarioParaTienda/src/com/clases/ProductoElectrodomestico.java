package com.clases;

public class ProductoElectrodomestico {
	//Atributos
	private String nombre;
    private double precio;
    private int cantidadDisponible;
    
    //Constructores
    public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    //Sobrecarga del constructor
    public ProductoElectrodomestico(String nombre, double precio) {
        this(nombre, precio, 0);
    }
    
    
    //Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
    
	
	// Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Cantidad Disponible: " + cantidadDisponible);
    }

}
