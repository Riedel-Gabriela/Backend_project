package com.projetofinal.ProjetoFinal_Labbeach.controller;

import com.projetofinal.ProjetoFinal_Labbeach.entidades.Bairro;
import com.projetofinal.ProjetoFinal_Labbeach.servicos.BairroService;
import com.projetofinal.ProjetoFinal_Labbeach.servicos.PraiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lab_beach/bairros")
public class BairroController {
    @Autowired
    public BairroService bairroService;
    @Autowired
    public PraiaService praiaService;

    @GetMapping //Listar todos os bairros
    public ResponseEntity<List<Bairro>> findAll() {
        return ResponseEntity.ok().body(bairroService.findAll());
    }
    @PostMapping //Cadastrar novo bairro
    public ResponseEntity<String> create(@RequestParam("nome") String nome,
                                         @RequestParam("descricao") String descricao,
                                         @RequestParam("populacao") Integer populacao) {
        if (bairroService.findByNome(nome).isEmpty()) {
            bairroService.save(nome, descricao, populacao);
            return ResponseEntity.ok("Cadastrado com sucesso!");
        }
        return ResponseEntity.badRequest().body("Este bairro já foi cadastrado! Tente outra vez.");
    }
    @PutMapping //Atualizar cadastro do bairro
    public ResponseEntity<String> update(@RequestBody Bairro bairro) {
        bairroService.update(bairro);
        return ResponseEntity.ok("Cadastro do bairro atualizado com sucesso!");
    }

    @DeleteMapping("/{id}") //Deletar bairro através do ID
    public ResponseEntity<?> delete(@PathVariable Long id){
        bairroService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Bairro deletado com sucesso!");
    }
}
