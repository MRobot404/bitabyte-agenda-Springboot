package com.app.bitabyte.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefono")
public class Telefono implements Serializable{

	private static final long serialVersionUID=6L;
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Basic(optional=false)
	 @Column(name = "idtelefono")
	 private Integer idtelefono;
	
	 @Column(name = "numero")
	 private Integer numero;
	 
	 @Column(name = "contacto_idcontacto")
	 private Integer contactoIdcontacto;

	public Integer getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(Integer idtelefono) {
		this.idtelefono = idtelefono;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getContactoIdcontacto() {
		return contactoIdcontacto;
	}

	public void setContactoIdcontacto(Integer conntactoIdcontacto) {
		this.contactoIdcontacto = conntactoIdcontacto;
	}

	 
}
