package org.cibertec.edu.pe.controllador;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IProductoService;

import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductoController {

	@Autowired
	private IProductoService servicio; 
	
	//Metodo para listar 
	@GetMapping("/listado")
	public String Listado(Model m) {
		List<Producto> lista = servicio.Listar();
		m.addAttribute("Productos",lista);
		return "listar";
	}
}
