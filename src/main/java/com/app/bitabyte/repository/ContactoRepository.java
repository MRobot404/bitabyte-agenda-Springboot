package com.app.bitabyte.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bitabyte.entity.Contacto;
import com.app.bitabyte.entity.Usuario;

@Repository("contactoRepository")
public interface ContactoRepository extends JpaRepository<Contacto, Serializable> {

	public  List<Contacto> findByUsuarioCorreo(String usuarioCorreo);
}
