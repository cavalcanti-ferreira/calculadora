package dev.calculadora.service;

import dev.calculadora.dtos.PontuacaoDTO;
import dev.calculadora.models.Pontuacao;
import dev.calculadora.repository.EnteFederativoRepository;
import dev.calculadora.repository.PontuacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PontuacaoService {
  private final PontuacaoRepository pontuacaoRepository;
  private final EnteFederativoRepository enteFederativoRepository;

  public List<PontuacaoDTO> findAll(Long enteFederativoId) {
    var resultados = pontuacaoRepository.findAllById(enteFederativoId);

    List<PontuacaoDTO> retrievedPontuacao = new ArrayList<>();

    resultados.forEach(resultado -> retrievedPontuacao.add(new PontuacaoDTO(resultado)));
    return retrievedPontuacao;
  }

  public void deletePontuacao(Long pontuacaoId) {
    pontuacaoRepository.deleteById(pontuacaoId);
  }

  public void updatePontuacao(PontuacaoDTO pontuacaoDTO) {
    var pontuacao = pontuacaoRepository.findById(pontuacaoDTO.getId()).orElseThrow();

    pontuacao.setTitulo(pontuacaoDTO.getTitulo());
    pontuacao.setValorUnitario(pontuacaoDTO.getValorUnitario());
    pontuacao.setValorMaximo(pontuacaoDTO.getValorMaximo());

    var ente = enteFederativoRepository.findById(pontuacaoDTO.getEnteFederativoId()).orElseThrow();

    pontuacao.setEnteFederativoId(ente);
    pontuacaoRepository.save(pontuacao);
  }

  public void savePontuacao(PontuacaoDTO pontuacaoDTO) {
    var ente = enteFederativoRepository.findById(pontuacaoDTO.getEnteFederativoId()).orElseThrow();

    pontuacaoRepository.save(
            Pontuacao.builder()
                    .titulo(pontuacaoDTO.getTitulo())
                    .valorUnitario(pontuacaoDTO.getValorUnitario())
                    .valorMaximo(pontuacaoDTO.getValorMaximo())
                    .enteFederativoId(ente)
                    .build()
    );
  }
}
