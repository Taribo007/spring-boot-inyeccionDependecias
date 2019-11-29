package com.bolsadeideas.springboot.di.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	//Metodos
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	@Primary
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony",100);
		Producto producto2 = new Producto("Bicicleta montaña",200);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		
		ArrayList al=new ArrayList();
		
		al.add(linea1);
		al.add(linea2);
		
		return al;
		
		//return Arrays.asList(linea1,linea2);
		
	}
	
	@Bean("itemsFacturaOficina")
	
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("MOnitor LG",150);
		Producto producto2 = new Producto("NOtebook asus",500);
		Producto producto3 = new Producto("Impresora",250);
		Producto producto4 = new Producto("Escritorio",300);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		ItemFactura linea3 = new ItemFactura(producto3,2);
		ItemFactura linea4 = new ItemFactura(producto4,4);
		
		
		/*ArrayList al=new ArrayList();
		
		al.add(linea1);
		al.add(linea2);
		
		return al;*/
		
		return Arrays.asList(linea1,linea2,linea3,linea4);
		
	}
	
}
