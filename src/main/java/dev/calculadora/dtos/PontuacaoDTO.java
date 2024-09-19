package dev.calculadora.dtos;

import dev.calculadora.models.Pontuacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PontuacaoDTO{
    private Long id;
    private String titulo;
    private Float valorUnitario;
    private Float valorMaximo;
    private Long enteFederativoId;

    public PontuacaoDTO(Pontuacao resultado) {
        this.id = resultado.getId();
        this.titulo = resultado.getTitulo();
        this.valorUnitario = resultado.getValorUnitario();
        this.valorMaximo = resultado.getValorMaximo();
        this.enteFederativoId = resultado.getEnteFederativoId().getId();
    }
}
