package dev.calculadora.repository;

import dev.calculadora.models.EnteFederativo;
import dev.calculadora.models.Pontuacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PontuacaoRepository extends JpaRepository<Pontuacao, Long> {
    List<Pontuacao> findAllByEnteFederativoId(EnteFederativo enteFederativoId);
}
