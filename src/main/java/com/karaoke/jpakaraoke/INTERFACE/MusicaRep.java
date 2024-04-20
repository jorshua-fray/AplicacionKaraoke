package com.karaoke.jpakaraoke.INTERFACE;

import com.karaoke.jpakaraoke.ENTIDAD.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRep extends JpaRepository<Musica,Integer> {
}