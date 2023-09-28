package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.Producto;

public interface IProductoService {
	
	public List<Producto>Listar();
	public Optional<Producto>Buscar(Integer Id);
	public int Grabar(Producto ObjC);
	public void Suprimir(Integer Id);
	
	
}
