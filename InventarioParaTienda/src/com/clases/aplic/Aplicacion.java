package com.clases.aplic;

import com.clases.*;

public class Aplicacion {

   public static void main(String[] args) {

       TiendaElectronica tienda = new TiendaElectronica();

       //Crear productos
       Televisor televisor1 = new Televisor("Samsung 55\"", 800.00, 10, 55.0, "4K");
       ComputadoraPortatil laptop1 = new ComputadoraPortatil("HP Pavilion", 600.00, 5, "HP", 16, "12345XYZ");

       //Agregar productos al inventario
       tienda.agregarProducto(televisor1);
       tienda.agregarProducto(laptop1);

       //Mostrar productos disponibles
       System.out.println("Productos disponibles en la tienda:");
       tienda.mostrarProductos();

       //Realizar algunas ventas
       tienda.realizarVenta("Samsung 55\"");
       tienda.realizarVenta("HP Pavilion");
       tienda.realizarVenta("Samsung 55\""); //Intentar vender nuevamente

       //Mostrar productos después de las ventas
       System.out.println("\nEstado del inventario después de las ventas:");
       tienda.mostrarProductos();
   }
}