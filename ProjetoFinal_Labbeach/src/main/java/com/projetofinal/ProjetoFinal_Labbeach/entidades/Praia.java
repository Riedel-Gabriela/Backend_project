package com.projetofinal.ProjetoFinal_Labbeach.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
@Table(name = "tabela_praias")
public class Praia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nome;
    public Boolean acessibilidade;
    public String status;
    @ManyToOne
    @JoinColumn(name = "bairro_id")
    public Bairro bairro;

}
