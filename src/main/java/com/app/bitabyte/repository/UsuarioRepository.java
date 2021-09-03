package com.app.bitabyte.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bitabyte.entity.Rol;
import com.app.bitabyte.entity.Usuario;
import java.util.List;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>  {

	
	public  List<Usuario> findByCorreoAndPassword(String correo, String  password);
	
}
