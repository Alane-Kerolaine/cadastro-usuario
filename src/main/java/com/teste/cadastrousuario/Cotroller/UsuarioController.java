package com.teste.cadastrousuario.Cotroller;

import com.teste.cadastrousuario.Model.UsuarioModel;
import com.teste.cadastrousuario.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/salvar-usuario")
    public UsuarioModel salvarUsuario(@RequestBody UsuarioModel usuario){
        usuarioService.salvarUsuario(usuario);
        return usuario;
    }

    @GetMapping("/buscar-usuario")
    public Optional<UsuarioModel> buscarUsuario(@RequestParam Long id){
        return usuarioService.buscarPorId(id);
    }
}
