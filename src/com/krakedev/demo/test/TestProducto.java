package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {

		Producto productoA = new Producto(171820, "Ambientador");
		
		productoA.setDescripcion("Ambientador con olor a rosas");
		productoA.setPeso(107.23);
		
		System.out.println("------- Valores del Producto -------");
		System.out.println("Codigo:" + productoA.getCodigo());
		System.out.println("Nombre:" + productoA.getNombre());
		System.out.println("Descripcion:" + productoA.getDescripcion());
		System.out.println("Peso:" + productoA.getPeso());
	}

}
