package com.teste.cadastrousuario.Service;

import com.teste.cadastrousuario.Model.UsuarioModel;
import com.teste.cadastrousuario.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioModel salvarUsuario(UsuarioModel usuario){
        usuarioRepository.save(usuario);
        return usuario;
    }

    public Optional<UsuarioModel> buscarPorId(@RequestParam Long id){
        return usuarioRepository.findById(id);
    }
}
