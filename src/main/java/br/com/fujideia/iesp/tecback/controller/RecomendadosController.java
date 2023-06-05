package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Recomendados;
import br.com.fujideia.iesp.tecback.service.RecomendadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recomendados")
public class RecomendadosController {

    @Autowired
    private RecomendadosService service;

    @PostMapping
    public ResponseEntity<Recomendados> salvar(@RequestBody Recomendados recomendados){
        recomendados = service.salvar(recomendados);
        return ResponseEntity.ok(recomendados);
    }

    @PutMapping
    public ResponseEntity<Recomendados> alterar(@RequestBody Recomendados recomendados){
        recomendados = service.alterar(recomendados);
        return ResponseEntity.ok(recomendados);
    }

    @GetMapping
    public ResponseEntity<List<Recomendados>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recomendados> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }


}
