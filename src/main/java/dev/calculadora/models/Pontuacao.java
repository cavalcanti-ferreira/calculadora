package dev.calculadora.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pontuacao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String titulo;

  private Float valorUnitario;

  private Float valorMaximo;

  @JoinColumn(name = "ente_federativo", referencedColumnName = "id")
  @ManyToOne
  @ToString.Exclude
  private EnteFederativo enteFederativoId;
}
