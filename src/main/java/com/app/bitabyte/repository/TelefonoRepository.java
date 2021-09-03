package com.app.bitabyte.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bitabyte.entity.Direccion;
import com.app.bitabyte.entity.Telefono;

@Repository("telefonoRepository")
public interface TelefonoRepository extends JpaRepository<Telefono ,Serializable> {

}
