package com.projetofinal.ProjetoFinal_Labbeach.servicos;

import com.projetofinal.ProjetoFinal_Labbeach.entidades.Bairro;

import java.util.List;
import java.util.Optional;

public interface BairroService {
    Bairro save(String nome, String descricao, Integer populacao);
    List<Bairro> findAll();
    Bairro update(Bairro bairro);
    void deleteById(Long id);
    List<Bairro> findByNome(String nome);

    Optional<Bairro> findById(Long Id);
}
