package br.com.nbtreiner.apibookstore.domain;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    
    private Long id;
    private String titulo;
    private String nomeAutor;
    private String texto;

    private Categoria categoria;
}
