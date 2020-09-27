package com.bolsadeideas.springboot.app.springbooterror.services;

import com.bolsadeideas.springboot.app.springbooterror.models.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    public List<Usuario> listar();
    public Usuario obtenerPorId(Integer id);
    public Optional<Usuario>obtenerPorIdOptional(Integer id);
}
