package com.app.bitabyte.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bitabyte.entity.Correo;

@Repository("correoRepository")
public interface CorreoRepository extends JpaRepository<Correo,Serializable> {

}
