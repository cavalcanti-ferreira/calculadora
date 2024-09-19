package dev.calculadora.controllers;

import dev.calculadora.models.EnteFederativo;
import dev.calculadora.service.EnteFederativoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ente-federativo")
@RequiredArgsConstructor
public class EnteFederativoController {
  private final EnteFederativoService enteFederativoService;

  @GetMapping
  public List<EnteFederativo> findAllEnteFederativo() {
    return enteFederativoService.findAllEnteFederativo();
  }
}
