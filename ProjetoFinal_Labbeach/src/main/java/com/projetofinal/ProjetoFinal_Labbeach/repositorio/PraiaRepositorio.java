package com.projetofinal.ProjetoFinal_Labbeach.repositorio;

import com.projetofinal.ProjetoFinal_Labbeach.entidades.Praia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PraiaRepositorio extends JpaRepository<Praia, Long> {
    List<Praia> findByNome(String nome);
    List<Praia> findByAcessibilidade(Boolean acessibilidade);
    List<Praia> findByStatus(String status);

    @Query("SELECT p FROM Praia p " +
            "LEFT JOIN Bairro b on ( p.bairro = b ) " +
            "WHERE b.populacao <= :num")
    List<Praia> findByPopulacao(@Param("num")Integer populacao);

}
