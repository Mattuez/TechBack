package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Visualizados;
import br.com.fujideia.iesp.tecback.service.VisualizadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visualizados")
public class VisualizadosController {

    @Autowired
    private VisualizadosService service;

    @PostMapping
    public ResponseEntity<Visualizados> salvar(@RequestBody Visualizados visualizados){
        visualizados = service.salvar(visualizados);
        return ResponseEntity.ok(visualizados);
    }

    @PutMapping
    public ResponseEntity<Visualizados> alterar(@RequestBody Visualizados visualizados){
        visualizados = service.alterar(visualizados);
        return ResponseEntity.ok(visualizados);
    }

    @GetMapping
    public ResponseEntity<List<Visualizados>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Visualizados> consultar(@PathVariable("id") Integer id){
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
