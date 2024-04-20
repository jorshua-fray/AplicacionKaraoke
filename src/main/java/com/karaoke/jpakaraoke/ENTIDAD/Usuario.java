package com.karaoke.jpakaraoke.ENTIDAD;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column
    private String nombre;
    @Column
    private String contrasena;



    @ManyToMany
    @JoinTable(name = "PlayList",
               joinColumns = @JoinColumn(name="idIusuario"),
               inverseJoinColumns = @JoinColumn(name = "musicaId")
              )
    private List<Musica> musicas;

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario == usuario.idUsuario && Objects.equals(nombre, usuario.nombre) && Objects.equals(contrasena, usuario.contrasena) && Objects.equals(musicas, usuario.musicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nombre, contrasena, musicas);
    }
}