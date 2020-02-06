package com.sinfloo.ejemplo01.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rolesusuarios")
public class Rol {

	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int idRol;
	@Column
	private String rol;
	@ManyToOne
	@JoinColumn(name="id_usuario", nullable  = false)
	private Usuario idUsuario;
	
	
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdRol() {
		return idRol;
	}


	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public Usuario getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	

}
