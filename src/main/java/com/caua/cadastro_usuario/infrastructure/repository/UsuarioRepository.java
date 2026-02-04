package com.caua.cadastro_usuario.infrastructure.repository;

import com.caua.cadastro_usuario.infrastructure.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);
}
// Coloco o tipo que seria usuário e o tipo do meu id
