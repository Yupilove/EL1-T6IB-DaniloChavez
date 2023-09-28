package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.interfaz.IProducto;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> Listar() {
		
		return data.findAll();
		
	}

	@Override
	public Optional<Producto> Buscar(Integer Id) {
		
		return data.findById(Id);
	}

	@Override
	public int Grabar(Producto ObjC) {
		
		int rpta = 0;
		Producto Obj = data.save(ObjC);
		if(!Obj.equals(null)) rpta = 1;
		return rpta;
	}

	@Override
	public void Suprimir(Integer Id) {

		data.deleteById(Id);
		
	}

	
	
}
