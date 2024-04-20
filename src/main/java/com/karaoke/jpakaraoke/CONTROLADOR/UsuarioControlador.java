package com.karaoke.jpakaraoke.CONTROLADOR;
import com.karaoke.jpakaraoke.ENTIDAD.Musica;
import com.karaoke.jpakaraoke.ENTIDAD.Usuario;
import com.karaoke.jpakaraoke.INTERFACE.UsuarioRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioControlador {

    @Autowired
    private UsuarioRep rep;


    @PostMapping("/crearUsr")//crea usuarios
    public Usuario addUsuario(@RequestBody Usuario usuario){
        return rep.save(usuario);
    }

    @GetMapping(value = "/listaUsr")
    public ResponseEntity<List<Usuario>> getCuentas() {
        List<Usuario> usuarios = rep.findAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/{idUsuario}/musicas")//Play list
    public List<Musica> obtenerMusicasUsuario(@PathVariable int idUsuario) {
        Usuario usuario = rep.findById(idUsuario).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return usuario.getMusicas();
    }



}
