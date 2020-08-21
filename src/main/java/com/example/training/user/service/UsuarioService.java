package com.example.training.user.service;

import com.example.training.user.UsuarioDTO;
import com.example.training.user.repository.Usuario;
import com.example.training.user.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario guardarUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setApellido(usuarioDTO.getApellido());
		usuario.setEdad(usuarioDTO.getEdad());
		return usuarioRepository.save(usuario); // El método save  es de la interfaz CrudRepository
	}
}
