package com.karaoke.jpakaraoke.CONTROLADOR;
import com.karaoke.jpakaraoke.ENTIDAD.Musica;
import com.karaoke.jpakaraoke.INTERFACE.MusicaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicaControlador {

    @Autowired
    private MusicaRep rep;


    @PostMapping("/guardarMusica")//guardaMusica
    public Musica addUsuario(@RequestBody Musica musica){
        return rep.save(musica);
    }

    @GetMapping(value = "/listaMusica")//lista de Musicas http://localhost:8081/listaMusica
    public ResponseEntity<List<Musica>> getCuentas() {
        List<Musica> musicas = rep.findAll();
        return new ResponseEntity<>(musicas, HttpStatus.OK);
    }

}
