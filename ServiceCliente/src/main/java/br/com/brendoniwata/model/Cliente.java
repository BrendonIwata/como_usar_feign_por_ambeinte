package br.com.brendoniwata.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
@Builder(setterPrefix = "com")
public class Cliente {

    private String nome;

    private String cumprimento;
}
