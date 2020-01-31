
package com.sinfloo.ejemplo01.servicio;

import java.util.List;

import com.sinfloo.ejemplo01.modelo.Persona;

public interface PersonaService {
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
}
