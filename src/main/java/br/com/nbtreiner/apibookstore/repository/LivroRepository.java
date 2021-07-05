package br.com.nbtreiner.apibookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nbtreiner.apibookstore.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}
