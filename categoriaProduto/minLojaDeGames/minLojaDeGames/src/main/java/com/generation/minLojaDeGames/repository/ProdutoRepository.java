package com.generation.minLojaDeGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.minLojaDeGames.model.Produto;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByTituloContainingIgnoreCase (String titulo);
}
