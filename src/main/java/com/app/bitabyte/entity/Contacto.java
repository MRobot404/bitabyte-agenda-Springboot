package com.app.bitabyte.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
@Table(name = "contacto")
public class Contacto implements Serializable {

	private static final long serialVersionUID = 3L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Basic(optional=false)
	 @Column(name = "idcontacto")
	 private Integer idcontacto;
	 
	 @Column(name = "nombre")
		private String nombre;
		
		@Column(name = "apellido")
		private String apellido;
		
		@Lob
		@Column(name = "fotografia")
		private String fotografia;
		
		@Column(name = "usuario_correo")
		private String usuarioCorreo;
		
		
		@OneToMany(mappedBy = "contactoIdcontacto")
		 private List<Correo> correoList;
		
		@OneToMany(mappedBy = "contactoIdcontacto")
		 private List<Telefono> telefonoList;
		
		@OneToMany(mappedBy = "contactoIdcontacto")
		 private List<Direccion> direccionList;

		public Integer getIdcontacto() {
			return idcontacto;
		}

		public void setIdcontacto(Integer idcontacto) {
			this.idcontacto = idcontacto;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getFotografia() {
			return fotografia;
		}

		public void setFotografia(String fotografia) {
			this.fotografia = fotografia;
		}

		public String getUsuarioCorreo() {
			return usuarioCorreo;
		}

		public void setUsuarioCorreo(String usuarioCorreo) {
			this.usuarioCorreo = usuarioCorreo;
		}

		public List<Correo> getCorreoList() {
			return correoList;
		}

		public void setCorreoList(List<Correo> correoList) {
			this.correoList = correoList;
		}

		public List<Telefono> getTelefonoList() {
			return telefonoList;
		}

		public void setTelefonoList(List<Telefono> telefonoList) {
			this.telefonoList = telefonoList;
		}

		public List<Direccion> getDireccionList() {
			return direccionList;
		}

		public void setDireccionList(List<Direccion> direccionList) {
			this.direccionList = direccionList;
		}
		
		
	 
}
