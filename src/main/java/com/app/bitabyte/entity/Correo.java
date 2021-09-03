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
public class Correo implements Serializable{
	private static final long serialVersionUID=5L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name = "idcorreo")
	private Integer idcorreo;

	@Column(name = "correo")
	private String correo;

	@Column(name = "contacto_idcontacto")
	private Integer contactoIdcontacto;

	public Integer getIdcorreo() {
		return idcorreo;
	}

	public void setIdcorreo(Integer idcorreo) {
		this.idcorreo = idcorreo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getConntactoIdcontacto() {
		return contactoIdcontacto;
	}

	public void setConntactoIdcontacto(Integer conntactoIdcontacto) {
		this.contactoIdcontacto = conntactoIdcontacto;
	}
	
	
}
