package com.app.bitabyte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bitabyte.repository.ContactoRepository;
import com.app.bitabyte.repository.CorreoRepository;
import com.app.bitabyte.repository.DireccionRepository;
import com.app.bitabyte.repository.TelefonoRepository;

@RestController
@RequestMapping("/contacto")
@CrossOrigin
public class ContactoService {

	
	@Autowired
	CorreoRepository correoRepository;
	
	@Autowired
	TelefonoRepository telefonoRepository;
	
	@Autowired
	DireccionRepository direccionRepository;
	
	@Autowired
	ContactoRepository contactoRepository;
}
