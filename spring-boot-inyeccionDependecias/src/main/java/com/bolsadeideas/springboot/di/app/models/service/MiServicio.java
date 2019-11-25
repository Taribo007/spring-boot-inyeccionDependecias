package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

//@Component("miServicioSimple")
//@Primary
//@Service //Generalmente esta anotacion se usa para trabajar con componentes de acceso a datos
public class MiServicio implements IServicio{

	//Metodos
	@Override
	public String operacion() {
		
		return "ejecuntando algun proceso simple..";
	}
	
	
}
