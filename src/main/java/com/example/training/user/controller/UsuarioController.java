package com.example.training.user.controller;

import com.example.training.user.UsuarioDTO;
import com.example.training.user.repository.Usuario;
import com.example.training.user.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

	private UsuarioService usuarioService;

	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostMapping("/guardar") // http://localhost:8080/guardar
	public ResponseEntity<Usuario> guardarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		return ResponseEntity.ok(usuarioService.guardarUsuario(usuarioDTO));
	}

	@GetMapping("/saludar") // http://localhost:8080/saludar
	public String saludar() {
		return "Hola mundo";
	}
}
