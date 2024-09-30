package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica() {
        listaDeProductos = new ArrayList<>();
    }

    //Método para agregar producto
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
    }

    //Método para mostrar productos disponibles
    public void mostrarProductos() {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            producto.mostrarInformacion();
            System.out.println("-------------------");
        }
    }

    //Método para buscar producto por nombre
    public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null; // No encontrado
    }

    // Método para realizar una venta
    public void realizarVenta(String nombre) { //void no devuelve ningún valor.
        ProductoElectrodomestico producto = buscarProducto(nombre);
        
        if (producto != null) { //Si producto no es null, significa que se encontró un producto con el nombre dado.
            if (producto.getCantidadDisponible() > 0) {//Si la cantidad es mayor que cero, significa que hay stock disponible para vender.
                producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);//Si hay cantidad disponible, se reduce la cantidad en uno.
                System.out.println("Venta realizada de: " + producto.getNombre());
            } else {
                System.out.println("Producto agotado: " + producto.getNombre());
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}