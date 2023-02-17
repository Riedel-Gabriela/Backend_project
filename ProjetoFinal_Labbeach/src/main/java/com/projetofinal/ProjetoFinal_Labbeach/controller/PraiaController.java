package com.projetofinal.ProjetoFinal_Labbeach.controller;

import com.projetofinal.ProjetoFinal_Labbeach.entidades.Praia;
import com.projetofinal.ProjetoFinal_Labbeach.servicos.PraiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/lab_beach/praias")
public class PraiaController {
    @Autowired
    public PraiaService praiaService;

    @GetMapping //Listar todas as praias
    public ResponseEntity<List<Praia>> findAll() {
        return ResponseEntity.ok().body(praiaService.findAll());
    }

    @PostMapping //Cadastrar nova praia
    public ResponseEntity<String> create(@RequestParam("bairroId")Long bairroId,
                                         @RequestParam("nome")String nome,
                                         @RequestParam("acessibilidade")Boolean acessibilidade,
                                         @RequestParam("status")String status) {
        if (praiaService.findByNome(nome).isEmpty()) {
            if (praiaService.save(bairroId, nome, acessibilidade, status)) {
                return ResponseEntity.ok("Cadastrado com sucesso!");
            }
            return ResponseEntity.badRequest().body("Este bairro não foi cadastrado! Tente novamente.");
        }
        return ResponseEntity.badRequest().body("Esta praia já foi cadastrada! Tente novamente.");
    }


    @PutMapping //Atualizar cadastro de praia
    public ResponseEntity<String> update(@RequestBody Praia praia) {
        praiaService.update(praia);
        return ResponseEntity.ok("Cadastro da praia atualizado com sucesso!");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        praiaService.deleteById(id);
        return ResponseEntity.ok("Praia deletada com sucesso!");
    }

    @GetMapping("/busca_por_acessibilidade")
    public ResponseEntity<List<Praia>> access(@RequestParam Boolean acessibilidade) {
        List<Praia> praias_acessibilidade = praiaService.findByAcessibilidade(acessibilidade);
        return ResponseEntity.ok().body(praias_acessibilidade);
    }
    @GetMapping("/busca_por_status")
    public ResponseEntity<List<Praia>> status(@RequestParam String status) {
        List<Praia> praias_status = praiaService.findByStatus(status);
        return ResponseEntity.ok().body(praias_status);
    }
    @GetMapping(value = "praia_por_populacao_bairro")
    public List<Praia> findByPopulacao(@RequestParam("num")Integer populacao) {
        List<Praia> praias_lista = praiaService.findByPopulacao(populacao);
        return ResponseEntity.ok().body(praias_lista).getBody();
    }

}
