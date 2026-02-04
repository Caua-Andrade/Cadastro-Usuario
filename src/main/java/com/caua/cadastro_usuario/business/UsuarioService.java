package com.caua.cadastro_usuario.business;

import com.caua.cadastro_usuario.infrastructure.entities.Usuario;
import com.caua.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario);
        // Ele salva e fecha o banco
    }
}
