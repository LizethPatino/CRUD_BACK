package com.sinfloo.ejemplo01.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.sinfloo.ejemplo01.modelo.Mascota;

public interface MascotaRepositorio extends Repository<Mascota, Integer> {
	  List<Mascota>findAll();
}
