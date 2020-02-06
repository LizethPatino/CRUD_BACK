package com.sinfloo.ejemplo01.repositorio;

import org.springframework.data.repository.Repository;

import com.sinfloo.ejemplo01.modelo.Rol;



public interface RolRepositorio extends Repository<Rol, Integer> {
	
	Rol findOne(int idRol);
}
