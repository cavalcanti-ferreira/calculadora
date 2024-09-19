package dev.calculadora.service;

import dev.calculadora.dtos.EnteFederativoDTO;
import dev.calculadora.models.EnteFederativo;
import dev.calculadora.repository.EnteFederativoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnteFederativoService {
  private final EnteFederativoRepository enteFederativoRepository;

  @Lazy
  public List<EnteFederativo> findAllEnteFederativo() {
    return enteFederativoRepository.findAll();
  }
}
