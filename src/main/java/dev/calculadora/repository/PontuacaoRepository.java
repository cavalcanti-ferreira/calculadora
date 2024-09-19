package dev.calculadora.repository;

import dev.calculadora.dtos.PontuacaoDTO;
import dev.calculadora.models.Pontuacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PontuacaoRepository extends JpaRepository<Pontuacao, Long> {
    List<Pontuacao> findAllById(Long enteFederativoId);
}
