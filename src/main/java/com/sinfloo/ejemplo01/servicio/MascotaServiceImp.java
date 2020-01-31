package com.sinfloo.ejemplo01.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.ejemplo01.modelo.Mascota;
import com.sinfloo.ejemplo01.repositorio.MascotaRepositorio;

@Service
public class MascotaServiceImp implements MascotaService {
	
	@Autowired
	private MascotaRepositorio repositorio;

	@Override
	public List<Mascota> listar() {
		
		return repositorio.findAll();
	}

}
