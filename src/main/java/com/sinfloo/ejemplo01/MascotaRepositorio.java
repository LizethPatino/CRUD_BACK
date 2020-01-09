package com.sinfloo.ejemplo01;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface MascotaRepositorio extends Repository<Mascota, Integer> {
	  List<Mascota>findAll();
}
