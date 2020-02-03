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
@Table(name = "mascotas")
public class Mascota {

		@Id
	    @Column
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int idPerro;
	    @Column
	    private String nombrePerro;
	    @Column 
	    private String razaPerro;
	    
	    @ManyToOne
	    @JoinColumn(name="id_persona", nullable  = false)
	    private Persona persona; 

	    
	    public Mascota() {
			super();
		}

		public int getIdPerro() {
			return idPerro;
		}

		public void setIdPerro(int idPerro) {
			this.idPerro = idPerro;
		}

		public String getNombrePerro() {
			return nombrePerro;
		}

		public void setNombrePerro(String nombrePerro) {
			this.nombrePerro = nombrePerro;
		}

		public String getRazaPerro() {
			return razaPerro;
		}

		public void setRazaPerro(String razaPerro) {
			this.razaPerro = razaPerro;
		}

	    public Persona getPersona() {
			return persona;
		}

		public void setPersona(Persona persona) {
			this.persona = persona;
		} 
	    
	    
}
