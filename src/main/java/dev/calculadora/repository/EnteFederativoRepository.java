package dev.calculadora.repository;

import dev.calculadora.models.EnteFederativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnteFederativoRepository extends JpaRepository<EnteFederativo, Long> { }
