package com.sinfloo.ejemplo01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/mascotas"})
public class ControladorMascotas {

	 @Autowired
	  MascotaService service;
	 
	 @GetMapping
	    public List<Mascota>listar(){
	        return service.listar();
	    }
}
