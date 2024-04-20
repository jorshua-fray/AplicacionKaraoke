package com.karaoke.jpakaraoke.INTERFACE;

import com.karaoke.jpakaraoke.ENTIDAD.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRep extends JpaRepository<Usuario,Integer> {
}