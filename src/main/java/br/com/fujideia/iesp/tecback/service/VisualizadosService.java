package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Visualizados;
import br.com.fujideia.iesp.tecback.repository.VisualizadosRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class VisualizadosService {
    @Autowired
    private VisualizadosRepository repository;

    public Visualizados salvar(Visualizados visualizados){
        visualizados = repository.save(visualizados);
        return visualizados;
    }

    public Visualizados alterar(Visualizados visualizados){
        if(Objects.nonNull(visualizados.getId())){
            visualizados = repository.save(visualizados);
        }else{
            throw new NotFoundException();
        }
        return visualizados;
    }

    public List<Visualizados> listar(){
        return repository.findAll();
    }

    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }

    public Visualizados consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

    public Object IdConsulta(Integer id){
        return null;
    }
}
