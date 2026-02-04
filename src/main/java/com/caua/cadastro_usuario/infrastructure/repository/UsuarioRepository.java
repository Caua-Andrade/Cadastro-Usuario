package com.caua.cadastro_usuario.infrastructure.repository;

import com.caua.cadastro_usuario.infrastructure.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
// Coloco o tipo que seria usuário e o tipo do meu id
