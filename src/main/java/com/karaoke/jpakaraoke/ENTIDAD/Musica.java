package com.karaoke.jpakaraoke.ENTIDAD;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "musica")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMusica;
    @Column
    private String nombreMusica;
    @Column
    private String artistaNombre;
    @Column
    private String generoMusica;

    @Column
    private String letraMusica;
    @Column
    private String instrumental;

    @ManyToMany(mappedBy = "musicas")
    private List<Usuario> usuario;




    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public String getNombreMusica() {
        return nombreMusica;
    }

    public void setNombreMusica(String nombreMusica) {
        this.nombreMusica = nombreMusica;
    }

    public String getArtistaNombre() {
        return artistaNombre;
    }

    public void setArtistaNombre(String artistaNombre) {
        this.artistaNombre = artistaNombre;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public String getLetraMusica() {
        return letraMusica;
    }

    public void setLetraMusica(String letraMusica) {
        this.letraMusica = letraMusica;
    }

    public String getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(String instrumental) {
        this.instrumental = instrumental;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return idMusica == musica.idMusica && Objects.equals(nombreMusica, musica.nombreMusica) && Objects.equals(artistaNombre, musica.artistaNombre) && Objects.equals(generoMusica, musica.generoMusica) && Objects.equals(letraMusica, musica.letraMusica) && Objects.equals(instrumental, musica.instrumental) && Objects.equals(usuario, musica.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMusica, nombreMusica, artistaNombre, generoMusica, letraMusica, instrumental, usuario);
    }
}