package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	private int Id ; 
	private String Nombre;
    private String categoria ; 
    private double precio; 
    private int Stock;
    
    
    
	public Producto() {
		super();
	}



	public Producto(int id, String nombre, String categoria, double precio, int stock) {
		super();
		Id = id;
		Nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		Stock = stock;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getStock() {
		return Stock;
	}



	public void setStock(int stock) {
		Stock = stock;
	}
    
    

}
