
package com.sinfloo.ejemplo01.repositorio;


import java.util.List;
import org.springframework.data.repository.Repository;

import com.sinfloo.ejemplo01.modelo.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
    List<Persona>findAll();
    Persona findOne(int id);
    Persona save(Persona p);
    void delete(Persona p);
}
