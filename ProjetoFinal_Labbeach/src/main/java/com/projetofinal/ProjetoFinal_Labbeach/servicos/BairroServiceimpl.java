package com.projetofinal.ProjetoFinal_Labbeach.servicos;

import com.projetofinal.ProjetoFinal_Labbeach.entidades.Bairro;
import com.projetofinal.ProjetoFinal_Labbeach.repositorio.BairrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BairroServiceimpl implements BairroService {
    @Autowired
    private BairrosRepositorio bairrosRepositorio;

    @Override
    public Bairro save(String nome, String descricao, Integer populacao) {
        Bairro bairro = new Bairro();
        bairro.setNome(nome);
        bairro.setDescricao(descricao);
        bairro.setPopulacao(populacao);
        return bairrosRepositorio.save(bairro);
    }

    @Override
    public List<Bairro> findAll() {
        return bairrosRepositorio.findAll();
    }

    @Override
    public Bairro update(Bairro bairro) {
        return bairrosRepositorio.save(bairro);
    }

    @Override
    public void deleteById(Long id) {
        bairrosRepositorio.deleteById(id);
    }

    @Override
    public List<Bairro> findByNome(String nome) {
        return bairrosRepositorio.findByNome(nome);
    }

    @Override
    public Optional<Bairro> findById(Long id) {
        return bairrosRepositorio.findById(id);
    }
}
