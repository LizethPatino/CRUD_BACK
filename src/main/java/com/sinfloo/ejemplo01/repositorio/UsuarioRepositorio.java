package com.sinfloo.ejemplo01.repositorio;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.sinfloo.ejemplo01.modelo.Usuario;



public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer>{
	@Query(value = "SELECT * FROM usuarios where usuario = ?1", nativeQuery = true)
	Usuario findByUsername(String usuario);

}
