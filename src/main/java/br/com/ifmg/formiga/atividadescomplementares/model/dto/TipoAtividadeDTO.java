package br.com.ifmg.formiga.atividadescomplementares.model.dto;

import br.com.ifmg.formiga.atividadescomplementares.model.TipoAtividade;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.List;
import java.util.stream.Collectors;

public class TipoAtividadeDTO {

    @NotBlank
    private String nome;

    private String descricao;

    @Positive
    private Long limiteHoras;

    public TipoAtividadeDTO(TipoAtividade tipoAtividade) {
        this.nome = tipoAtividade.getNome();
        this.descricao = tipoAtividade.getDescricao();
        this.limiteHoras = tipoAtividade.getLimiteHoras();
    }

    @Deprecated
    public TipoAtividadeDTO() {
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getLimiteHoras() {
        return limiteHoras;
    }

    public static List<TipoAtividadeDTO> toDto(List<TipoAtividade> tipoAtividadeList) {
        return tipoAtividadeList.stream().map(TipoAtividadeDTO::new).collect(Collectors.toList());
    }
}
