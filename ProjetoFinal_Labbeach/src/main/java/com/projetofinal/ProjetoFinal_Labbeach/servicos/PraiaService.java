package com.projetofinal.ProjetoFinal_Labbeach.servicos;

import com.projetofinal.ProjetoFinal_Labbeach.entidades.Praia;

import java.util.List;

public interface PraiaService {
    Boolean save(Long bairroId, String nome, Boolean acessibilidade, String status);
    List<Praia> findAll();
    Praia update(Praia praia);
    void deleteById(Long id);
    List<Praia> findByNome(String nome);
    List<Praia> findByAcessibilidade(Boolean acessibilidade);
    List<Praia> findByStatus(String status);
    List<Praia> findByPopulacao(Integer populacao);
}
