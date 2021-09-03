package com.app.bitabyte.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bitabyte.entity.Direccion;

@Repository("direccionRepository")
public interface DireccionRepository extends JpaRepository<Direccion ,Serializable> {

}
