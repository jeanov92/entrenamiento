package com.example.training.user.repository;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

	// CrudRepository es una interfaz que provee Spring Data, esta contiene algunos
	// métodos que nos sirven para hacer operaciones en la base de datos
}
