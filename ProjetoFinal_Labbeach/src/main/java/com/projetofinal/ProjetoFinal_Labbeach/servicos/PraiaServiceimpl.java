package com.projetofinal.ProjetoFinal_Labbeach.servicos;


import com.projetofinal.ProjetoFinal_Labbeach.entidades.Bairro;
import com.projetofinal.ProjetoFinal_Labbeach.entidades.Praia;
import com.projetofinal.ProjetoFinal_Labbeach.repositorio.PraiaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PraiaServiceimpl implements PraiaService {
    @Autowired
    public PraiaRepositorio praiaRepositorio;
    @Autowired
    public BairroService bairroService;

    @Override
    public Boolean save(Long bairroId, String nome, Boolean acessibilidade, String status) {
        Praia praia = new Praia();
        Optional<Bairro> bairro = bairroService.findById(bairroId);
        if (bairro.isPresent()) {
            praia.setBairro(bairro.get());
            praia.setNome(nome);
            praia.setAcessibilidade(acessibilidade);
            praia.setStatus(status);
            praiaRepositorio.save(praia);
            return true;
        }
        return false;
    }

    @Override
    public List<Praia> findAll() {
        return praiaRepositorio.findAll();
    }

    @Override
    public Praia update(Praia praia) {
        return praiaRepositorio.save(praia);
    }

    @Override
    public void deleteById(Long id) {
        praiaRepositorio.deleteById(id);
    }

    @Override
    public List<Praia> findByNome(String nome) {
        return praiaRepositorio.findByNome(nome);
    }

    @Override
    public List<Praia> findByAcessibilidade(Boolean acessibilidade) {
        List<Praia> listaPraias = new ArrayList<>();
        if (acessibilidade) {
            listaPraias = praiaRepositorio.findByAcessibilidade(true);
        }
        if (acessibilidade.equals(false)) {
            listaPraias = praiaRepositorio.findByAcessibilidade(false);
        }
        return listaPraias;
    }

    @Override
    public List<Praia> findByStatus(String status) {
        List<Praia> listaPraias = new ArrayList<>();
        if (status.equals("Própria")) {
            listaPraias = praiaRepositorio.findByStatus("Própria");
        }
        if (status.equals("Imprópria")) {
            listaPraias = praiaRepositorio.findByStatus("Imprópria");
        }
        return listaPraias;
    }
    @Override
    public List<Praia> findByPopulacao(Integer populacao) {
        return praiaRepositorio.findByPopulacao(populacao);
    }
}
