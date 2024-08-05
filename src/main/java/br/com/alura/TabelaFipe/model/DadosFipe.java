package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosFipe(@JsonAlias("Title") String titulo,
                         @JsonAlias("Pages") Integer totalPaginas,
                         @JsonAlias("Year") Integer anoLancamento) {
}
