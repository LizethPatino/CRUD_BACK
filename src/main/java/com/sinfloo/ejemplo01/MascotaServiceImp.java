package com.sinfloo.ejemplo01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImp implements MascotaService {
	
	@Autowired
	private MascotaRepositorio repositorio;

	@Override
	public List<Mascota> listar() {
		
		return repositorio.findAll();
	}

}
