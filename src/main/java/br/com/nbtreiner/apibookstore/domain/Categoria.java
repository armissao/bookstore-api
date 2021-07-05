package br.com.nbtreiner.apibookstore.domain;

import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    
    private Integer id;
    private String nome;
    private String descricao;
    private List<Livro> livros;
}
