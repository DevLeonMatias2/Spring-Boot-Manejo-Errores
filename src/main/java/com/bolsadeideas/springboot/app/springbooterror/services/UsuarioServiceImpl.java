package com.bolsadeideas.springboot.app.springbooterror.services;

import com.bolsadeideas.springboot.app.springbooterror.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UsuarioServiceImpl implements UsuarioService{

    private List<Usuario> lista;

    public UsuarioServiceImpl() {
        this.lista = new ArrayList<>();
        this.lista.add(new Usuario(1,"Rusbel","leon"));
        this.lista.add(new Usuario(2,"pepa","garcia"));
        this.lista.add(new Usuario(3,"Andres","Guzman"));
        this.lista.add(new Usuario(4,"Cristian","matias"));
        this.lista.add(new Usuario(5,"Javier","Gutirrez"));
        this.lista.add(new Usuario(6,"Alberto","Rodriguez"));
        this.lista.add(new Usuario(7,"Jose","Miguel"));
    }

    @Override
    public List<Usuario> listar() {
        return this.lista;
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        Usuario resultado= null;
        for(Usuario u: this.lista){
            if(u.getId().equals(id)){
                resultado=u;
                break;
            }
        }

        return resultado;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id) {
        Usuario usuario = this.obtenerPorId(id);
        return Optional.empty().ofNullable(usuario);
    }
}
