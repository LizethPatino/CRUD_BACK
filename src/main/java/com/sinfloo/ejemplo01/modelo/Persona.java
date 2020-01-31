
package com.sinfloo.ejemplo01.modelo;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "personas")
public class Persona {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_persona;
    @Column
    private String nombre;
    @Column 
    private String apellidos;


   
	public Persona() {
		super();
	}


	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
