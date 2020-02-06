package com.sinfloo.ejemplo01.modelo;

import java.io.Serializable;


public class JwtRequest implements Serializable{
	
	private static final long serialVersionUID = 5926468583005150707L;
	
	private int idUsuario;
	
	private String usuario;
	
	private String contrasena;
	
	

	public JwtRequest() {
		super();
	}

	public JwtRequest(int idUsuario, String usuario, String contrasena) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
	
	
	

}
