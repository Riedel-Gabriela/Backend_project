package com.projetofinal.ProjetoFinal_Labbeach.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
@Table(name = "tabela_bairros")
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome, descricao;
    public Integer populacao;
}
