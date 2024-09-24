package dev.calculadora.controllers;

import dev.calculadora.dtos.PontuacaoDTO;
import dev.calculadora.service.PontuacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pontuacao")
@RequiredArgsConstructor
public class PontuacaoController {
  private final PontuacaoService pontuacaoService;

  @GetMapping
  public ResponseEntity<List<PontuacaoDTO>> findAllPontuacao(Long enteFederativoId) {
    return ResponseEntity.ok(pontuacaoService.findAll(enteFederativoId));
  }

  @PostMapping
  public void savePontuacao(@RequestBody PontuacaoDTO pontuacaoDTO) {
    pontuacaoService.savePontuacao(pontuacaoDTO);
  }

  @PutMapping
  public void updatePontuacao(@RequestBody PontuacaoDTO pontuacaoDTO) {
    pontuacaoService.updatePontuacao(pontuacaoDTO);
  }

  @DeleteMapping
  public void deletePontuacao(Long pontuacaoId) {
    pontuacaoService.deletePontuacao(pontuacaoId);
  }
}
