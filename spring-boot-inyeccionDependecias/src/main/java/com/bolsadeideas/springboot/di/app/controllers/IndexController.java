package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	//sin utilizar inyecccion de dependencia
	//private MiServicio servicio=new MiServicio();
	
	//Usando inyeccion de dependencia (2 formas de hacerlo)
	//1: indicando en la clase MiServicio que es un compnonete de spring (@Component) encima de la declracion de la clase
	//Se pueden usar otras anotaciones mas especificas, pero que son un tipo de @Component. En este caso, la anotacion adecuada sera (@Service)
	
	//Con la anotacion @Autowired podemos inyectar el servicio. Ya no hace falta crear una instancia del objeto con new MiServicio
	
	@Autowired
	private IServicio servicio;

	//Metodos
	@GetMapping({"/","","/index"})
	//@GetMapping()
	public String index (Model model) {
		
		
		model.addAttribute("objeto", servicio.operacion());
		
		
		return "index";
	}
}
