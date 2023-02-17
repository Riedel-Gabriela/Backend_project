package com.projetofinal.ProjetoFinal_Labbeach.repositorio;

import com.projetofinal.ProjetoFinal_Labbeach.entidades.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BairrosRepositorio extends JpaRepository<Bairro, Long> {
    List<Bairro> findByNome(String nome);

}
