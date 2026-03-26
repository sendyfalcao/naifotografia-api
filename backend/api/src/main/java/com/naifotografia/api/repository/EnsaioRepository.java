package com.naifotografia.api.repository;

import com.naifotografia.api.model.Ensaio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface de acesso a dados utilizando Spring Data JPA.
 * Abstrai a comunicação com o banco de dados MySQL para a entidade Ensaio.
 */
@Repository
public interface EnsaioRepository extends JpaRepository<Ensaio, Long> {
}